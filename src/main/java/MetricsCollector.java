import org.apache.commons.net.ftp.FTPClient;
import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.hardware.common.AbstractGraphicsCard;

public abstract class MetricsCollector{
    public static void main(String[] args){
        SystemInfo systemInfo = new SystemInfo();
        CentralProcessor processor = systemInfo.getHardware().getProcessor();

        //Display display = systemInfo.getHardware().getDisplays().get(0);

        //long[] logs = new long[8];
        String processorCount = graphicsCard.getName();

        System.out.println("Processor Count " + processorCount);
    }

    private void getProcessorData(){}

    private void getMemoryData(){}

    private void getDisplayData(){}




}