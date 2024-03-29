package com.pcplanet.pcplanetbackend.component.gpu.output_interface;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "gpu_output_interface")
public class GPUOutputInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;
    private String interfaceName;

    public GPUOutputInterface(String interfaceName) {
        this.interfaceName = interfaceName;
    }
}
