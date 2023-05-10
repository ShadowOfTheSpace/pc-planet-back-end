package com.pcplanet.pcplanetbackend.component.gpu;

import com.pcplanet.pcplanetbackend.component.Component;
import com.pcplanet.pcplanetbackend.component.gpu.output_interface.GPUOutputInterface;
import com.pcplanet.pcplanetbackend.component.vendor.Vendor;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class GPU extends Component {
    private String chip;
    private Short chipFrequency;
    private Short memoryAmount;
    private String memoryType;
    private Integer memoryFrequency;
    private String memoryInterface;
    private String connectionInterface;
    private String additionalPower;
    private Short recommendedPsuPower;
    private String size;
    @ManyToMany
    @JoinTable(name = "gpu_with_interface")
    private List<GPUOutputInterface> outputInterfaces;

    public GPU(String name,
               String sku,
               Vendor vendor,
               String chip,
               Short chipFrequency,
               Short memoryAmount,
               String memoryType,
               Integer memoryFrequency,
               String memoryInterface,
               String connectionInterface,
               String additionalPower,
               Short recommendedPsuPower,
               String size,
               List<GPUOutputInterface> outputInterfaces) {
        super(name, sku, vendor);
        this.chip = chip;
        this.chipFrequency = chipFrequency;
        this.memoryAmount = memoryAmount;
        this.memoryType = memoryType;
        this.memoryFrequency = memoryFrequency;
        this.memoryInterface = memoryInterface;
        this.connectionInterface = connectionInterface;
        this.additionalPower = additionalPower;
        this.recommendedPsuPower = recommendedPsuPower;
        this.size = size;
        this.outputInterfaces = outputInterfaces;
    }
}
