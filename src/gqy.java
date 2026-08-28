import com.mojang.blaze3d.buffers.BufferType;
import com.mojang.blaze3d.buffers.BufferUsage;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public class gqy {
   private static final int a = 6;
   @Nullable
   private GpuBuffer b = null;
   private final List<alr> c;

   public gqy(alr $$0) {
      this.c = IntStream.range(0, 6).mapToObj($$1 -> $$0.e($$0.a() + "_" + $$1 + ".png")).toList();
   }

   public void a(fqq $$0, float $$1, float $$2, float $$3) {
      if (this.b == null) {
         this.a();
      }

      Matrix4f $$4 = new Matrix4f().setPerspective(1.4835298F, (float)$$0.aO().k() / (float)$$0.aO().l(), 0.05F, 10.0F);
      RenderSystem.backupProjectionMatrix();
      RenderSystem.setProjectionMatrix($$4, fig.a);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.rotationX((float) Math.PI);
      int $$6 = 2;
      RenderPipeline $$7 = grw.aE;
      fjr $$8 = fqq.Q().h();
      GpuTexture $$9 = $$8.c();
      GpuTexture $$10 = $$8.d();
      RenderSystem.a $$11 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
      GpuBuffer $$12 = $$11.b(36);

      try (RenderPass $$13 = RenderSystem.getDevice().createCommandEncoder().createRenderPass($$9, OptionalInt.empty(), $$10, OptionalDouble.empty())) {
         $$13.setPipeline($$7);
         $$13.setVertexBuffer(0, this.b);
         $$13.setIndexBuffer($$12, $$11.a());

         for (int $$14 = 0; $$14 < 4; $$14++) {
            $$5.pushMatrix();
            float $$15 = ((float)($$14 % 2) / 2.0F - 0.5F) / 256.0F;
            float $$16 = ((float)($$14 / 2) / 2.0F - 0.5F) / 256.0F;
            float $$17 = 0.0F;
            $$5.translate($$15, $$16, 0.0F);
            $$5.rotateX($$1 * (float) (Math.PI / 180.0));
            $$5.rotateY($$2 * (float) (Math.PI / 180.0));
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$3 / (float)($$14 + 1));

            for (int $$18 = 0; $$18 < 6; $$18++) {
               $$13.bindSampler("Sampler0", $$0.aa().b(this.c.get($$18)).a());
               $$13.drawIndexed(6 * $$18, 6);
            }

            $$5.popMatrix();
         }
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.restoreProjectionMatrix();
      $$5.popMatrix();
   }

   private void a() {
      this.b = RenderSystem.getDevice()
         .createBuffer(() -> "Cube map vertex buffer", BufferType.VERTICES, BufferUsage.DYNAMIC_WRITE, 24 * flb.i.getVertexSize());

      try (fla $$0 = new fla(flb.i.getVertexSize() * 4)) {
         fkz $$1 = new fkz($$0, VertexFormat.b.h, flb.i);
         $$1.a(-1.0F, -1.0F, 1.0F).a(0.0F, 0.0F);
         $$1.a(-1.0F, 1.0F, 1.0F).a(0.0F, 1.0F);
         $$1.a(1.0F, 1.0F, 1.0F).a(1.0F, 1.0F);
         $$1.a(1.0F, -1.0F, 1.0F).a(1.0F, 0.0F);
         $$1.a(1.0F, -1.0F, 1.0F).a(0.0F, 0.0F);
         $$1.a(1.0F, 1.0F, 1.0F).a(0.0F, 1.0F);
         $$1.a(1.0F, 1.0F, -1.0F).a(1.0F, 1.0F);
         $$1.a(1.0F, -1.0F, -1.0F).a(1.0F, 0.0F);
         $$1.a(1.0F, -1.0F, -1.0F).a(0.0F, 0.0F);
         $$1.a(1.0F, 1.0F, -1.0F).a(0.0F, 1.0F);
         $$1.a(-1.0F, 1.0F, -1.0F).a(1.0F, 1.0F);
         $$1.a(-1.0F, -1.0F, -1.0F).a(1.0F, 0.0F);
         $$1.a(-1.0F, -1.0F, -1.0F).a(0.0F, 0.0F);
         $$1.a(-1.0F, 1.0F, -1.0F).a(0.0F, 1.0F);
         $$1.a(-1.0F, 1.0F, 1.0F).a(1.0F, 1.0F);
         $$1.a(-1.0F, -1.0F, 1.0F).a(1.0F, 0.0F);
         $$1.a(-1.0F, -1.0F, -1.0F).a(0.0F, 0.0F);
         $$1.a(-1.0F, -1.0F, 1.0F).a(0.0F, 1.0F);
         $$1.a(1.0F, -1.0F, 1.0F).a(1.0F, 1.0F);
         $$1.a(1.0F, -1.0F, -1.0F).a(1.0F, 0.0F);
         $$1.a(-1.0F, 1.0F, 1.0F).a(0.0F, 0.0F);
         $$1.a(-1.0F, 1.0F, -1.0F).a(0.0F, 1.0F);
         $$1.a(1.0F, 1.0F, -1.0F).a(1.0F, 1.0F);
         $$1.a(1.0F, 1.0F, 1.0F).a(1.0F, 0.0F);

         try (flc $$2 = $$1.b()) {
            CommandEncoder $$3 = RenderSystem.getDevice().createCommandEncoder();
            $$3.writeToBuffer(this.b, $$2.a(), 0);
         }
      }
   }

   public void a(hks $$0) {
      for (alr $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
