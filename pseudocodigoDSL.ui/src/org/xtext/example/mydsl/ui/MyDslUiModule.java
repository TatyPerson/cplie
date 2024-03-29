/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;

import com.google.inject.Binder;
import com.google.inject.Singleton;

import es.uca.MyOutputConfigurationProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class MyDslUiModule extends org.xtext.example.mydsl.ui.AbstractMyDslUiModule {
	public MyDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public void configure(Binder binder) {
	    super.configure(binder);

	    binder.bind(IOutputConfigurationProvider.class).to(MyOutputConfigurationProvider.class).in(Singleton.class);
	}
}
