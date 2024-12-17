import org.apache.commons.net.ftp.FTPClient;
import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.hardware.common.AbstractGraphicsCard;
//processor
import oshi.hardware.CentralProcessor;
import oshi.hardware.CentralProcessor.ProcessorIdentifier;
//memory
import oshi.hardware.GlobalMemory;

import java.util.List;

public abstract class MetricsCollector{
    public static void main(String[] args){
        SystemInfo systemInfo = new SystemInfo();
        CentralProcessor processor = systemInfo.getHardware().getProcessor();

        //Display display = systemInfo.getHardware().getDisplays().get(0);

        //long[] logs = new long[8];
        String processorCount = graphicsCard.getName();

        System.out.println("Processor Count " + processorCount);
    }

    private StringBuilder getProcessor(){
        //Define Objects
        SystemInfo systemInfo = new SystemInfo();
        CentralProcessor processor = systemInfo.getHardware().getProcessor();
        StringBuilder stringBuilder = new StringBuilder();

        //System CPU load
        double CPU_Load = processor.getSystemCpuLoad(1000);
        stringBuilder.append("CPU LOAD: " + CPU_Load);

        //CPU Cores
        int CPU_Cores = processor.getPhysicalProcessorCount();
        stringBuilder.append("Number of Physical CPU cores available for processing: " + CPU_Cores);

        //CPU Package Count
        int CPU_Package = processor.getPhysicalPackageCount();
        stringBuilder.append("Number of packages/sockets in the system." + CPU_Package);

        //CPU processor Identifier
        CentralProcessor centralProcessor = systemInfo.getHardware().getProcessor();
        ProcessorIdentifier processorIdentifier = centralProcessor.getProcessorIdentifier();
            // name
        stringBuilder.append("Processor Name: " + processorIdentifier.getName());
            // vendor
        stringBuilder.append("Processor Vendor: " + processorIdentifier.getVendor());
            // frequency
        stringBuilder.append("Processor Frequency: " + processorIdentifier.getVendorFreq() / 1_000_000 + " MHz");
            // identifier
        stringBuilder.append("Processor Identifier: " + processorIdentifier.getIdentifier());
            // family
        stringBuilder.append("Processor Family: " + processorIdentifier.getFamily());
            // model
        stringBuilder.append("Processor Model: " + processorIdentifier.getModel());
            // stepping
        stringBuilder.append("Processor Stepping: " + processorIdentifier.getStepping());

        return stringBuilder;
    }

    private StringBuilder getMemory(){
        SystemInfo systemInfo = new SystemInfo();
        GlobalMemory memory = systemInfo.getHardware().getMemory();
        StringBuilder stringBuilder = new StringBuilder();

        //Total Available Memory
        long mem_Available = memory.getAvailable();
        stringBuilder.append("The amount of physical memory currently available, in bytes." + mem_Available);

    }

    private void getDisplay(){}

    private void getGraphics(){}

    private void getPowerSource(){}

    private void getSensors(){}

    private void getComponent(){}




}