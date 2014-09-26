package es.uca;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class MyOutputConfigurationProvider implements IOutputConfigurationProvider {
	
	public final static String DEFAULT_OUTPUT_CPP = "DEFAULT_OUTPUT_CPP";

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		OutputConfiguration cOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
	    cOutput.setDescription("Output Folder C");
	    cOutput.setOutputDirectory("./c-gen");
	    cOutput.setOverrideExistingResources(true);
	    cOutput.setCreateOutputDirectory(true);
	    cOutput.setCleanUpDerivedResources(true);
	    cOutput.setSetDerivedProperty(true);

	    OutputConfiguration cppOutput = new OutputConfiguration(DEFAULT_OUTPUT_CPP);
	    cppOutput.setDescription("Output Folder Cpp");
	    cppOutput.setOutputDirectory("./cpp-gen");
	    cppOutput.setOverrideExistingResources(true);
	    cppOutput.setCreateOutputDirectory(true);
	    cppOutput.setCleanUpDerivedResources(true);
	    cppOutput.setSetDerivedProperty(true);
	    
	    HashSet<OutputConfiguration> configuraciones = new HashSet<OutputConfiguration>();
	    
	    configuraciones.add(cOutput);
	    configuraciones.add(cppOutput);
	    
	    return configuraciones;
	}

}
