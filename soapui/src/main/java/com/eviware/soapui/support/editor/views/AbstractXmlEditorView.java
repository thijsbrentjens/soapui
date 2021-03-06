/*
 * Copyright 2004-2014 SmartBear Software
 *
 * Licensed under the EUPL, Version 1.1 or - as soon as they will be approved by the European Commission - subsequent
 * versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is
 * distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the Licence for the specific language governing permissions and limitations
 * under the Licence.
*/

package com.eviware.soapui.support.editor.views;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashSet;
import java.util.Set;

import com.eviware.soapui.support.editor.EditorLocation;
import com.eviware.soapui.support.editor.EditorLocationListener;
import com.eviware.soapui.support.editor.xml.XmlDocument;
import com.eviware.soapui.support.editor.xml.XmlEditor;
import com.eviware.soapui.support.editor.xml.XmlEditorView;

/**
 * Abstract base-class to be extended by XmlViews
 * 
 * @author ole.matzura
 */

public abstract class AbstractXmlEditorView<T extends XmlDocument> implements XmlEditorView<T>, PropertyChangeListener
{
	private String title;
	private boolean isActive;
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport( this );
	private T xmlDocument;
	private boolean xmlChanged;
	private Set<EditorLocationListener<T>> listeners = new HashSet<EditorLocationListener<T>>();
	private XmlEditor<T> editor;
	private final String viewId;

	public AbstractXmlEditorView( String title, XmlEditor<T> xmlEditor, String viewId )
	{
		super();
		this.title = title;
		editor = xmlEditor;
		this.viewId = viewId;
		xmlChanged = false;
	}

	protected PropertyChangeSupport getPropertyChangeSupport()
	{
		return propertyChangeSupport;
	}

	public String getViewId()
	{
		return viewId;
	}

	public boolean activate( EditorLocation<T> location )
	{
		isActive = true;
		update();

		return true;
	}

	public void update()
	{
		if( xmlChanged )
		{
			setXml( xmlDocument == null ? null : xmlDocument.getXml() );
			xmlChanged = false;
		}
	}

	public boolean isXmlChanged()
	{
		return xmlChanged;
	}

	public boolean deactivate()
	{
		isActive = false;
		xmlChanged = false;

		return true;
	}

	public boolean isActive()
	{
		return isActive;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle( String title )
	{
		String oldTitle = this.title;
		this.title = title;

		propertyChangeSupport.firePropertyChange( TITLE_PROPERTY, oldTitle, title );
	}

	public void addPropertyChangeListener( String propertyName, PropertyChangeListener listener )
	{
		propertyChangeSupport.addPropertyChangeListener( propertyName, listener );
	}

	public void addPropertyChangeListener( PropertyChangeListener listener )
	{
		propertyChangeSupport.addPropertyChangeListener( listener );
	}

	public void removePropertyChangeListener( PropertyChangeListener listener )
	{
		propertyChangeSupport.removePropertyChangeListener( listener );
	}

	public void removePropertyChangeListener( String propertyName, PropertyChangeListener listener )
	{
		propertyChangeSupport.removePropertyChangeListener( propertyName, listener );
	}

	public T getDocument()
	{
		return xmlDocument;
	}

	public void setDocument( T xmlDocument )
	{
		if( this.xmlDocument != null )
		{
			this.xmlDocument.removePropertyChangeListener( XmlDocument.XML_PROPERTY, this );
		}

		this.xmlDocument = xmlDocument;
		xmlChanged = false;

		if( xmlDocument != null )
		{
			this.xmlDocument.addPropertyChangeListener( XmlDocument.XML_PROPERTY, this );
			if( isActive() )
				setXml( xmlDocument.getXml() );
			else
				xmlChanged = true;
		}
		else
		{
			if( isActive() )
				setXml( null );
			else
				xmlChanged = true;
		}
	}

	public void propertyChange( PropertyChangeEvent evt )
	{
		if( evt.getSource() == this.xmlDocument && evt.getPropertyName().equals( XmlDocument.XML_PROPERTY ) )
		{
			if( isActive() )
				setXml( ( String )evt.getNewValue() );
			else
				xmlChanged = true;
		}
	}

	public abstract void setXml( String xml );

	public void release()
	{
		if( this.xmlDocument != null )
		{
			this.xmlDocument.removePropertyChangeListener( XmlDocument.XML_PROPERTY, this );
			this.xmlDocument = null;
		}
	}

	public void addLocationListener( EditorLocationListener<T> listener )
	{
		listeners.add( listener );
	}

	public void removeLocationListener( EditorLocationListener<T> listener )
	{
		listeners.remove( listener );
	}

	public void fireLocationChanged( EditorLocation<T> location )
	{
		for( EditorLocationListener<T> listener : listeners )
			listener.locationChanged( location );
	}

	public EditorLocation<T> getEditorLocation()
	{
		return null;
	}

	public String getXml()
	{
		return xmlDocument == null ? null : xmlDocument.getXml();
	}

	public void setLocation( EditorLocation<T> location )
	{
	}

	public void locationChanged( EditorLocation<T> location )
	{
	}

	public void syncUpdates()
	{
		if( !isActive() && xmlChanged )
		{
			setXml( xmlDocument == null ? null : xmlDocument.getXml() );
			xmlChanged = false;
		}
	}

	public XmlEditor<T> getEditor()
	{
		return editor;
	}

	public void requestFocus()
	{
	}
}
