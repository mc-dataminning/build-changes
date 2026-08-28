import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class grt {
   private final String a;
   private final RenderPipeline b;
   private final alr c;
   private final List<grs.h> d;
   private final List<grt.a> e = new ArrayList<>();

   public grt(RenderPipeline $$0, alr $$1, List<grs.h> $$2) {
      this.b = $$0;
      this.a = $$0.getLocation().toString();
      this.c = $$1;
      this.d = $$2;
   }

   public void a(grt.a $$0) {
      this.e.add($$0);
   }

   public void a(fix $$0, Map<alr, fkr<fjr>> $$1, Matrix4f $$2, @Nullable Consumer<RenderPass> $$3) {
      fiy $$4 = $$0.a(this.a);

      for (grt.a $$5 : this.e) {
         $$5.a($$4, $$1);
      }

      fkr<fjr> $$6 = $$1.computeIfPresent(this.c, ($$1x, $$2x) -> $$4.b($$2x));
      if ($$6 == null) {
         throw new IllegalStateException("Missing handle for target " + this.c);
      } else {
         $$4.a(
            () -> {
               fjr $$4x = $$6.get();
               RenderSystem.backupProjectionMatrix();
               RenderSystem.setProjectionMatrix($$2, fig.b);
               GpuBuffer $$5x = RenderSystem.getQuadVertexBuffer();
               RenderSystem.a $$6x = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
               GpuBuffer $$7 = $$6x.b(6);

               try (RenderPass $$8 = RenderSystem.getDevice()
                     .createCommandEncoder()
                     .createRenderPass($$4x.c(), OptionalInt.empty(), $$4x.h ? $$4x.d() : null, OptionalDouble.empty())) {
                  $$8.setPipeline(this.b);
                  $$8.setUniform("OutSize", (float)$$4x.c, (float)$$4x.d);
                  $$8.setVertexBuffer(0, $$5x);
                  $$8.setIndexBuffer($$7, $$6x.a());

                  for (grt.a $$9 : this.e) {
                     $$9.a($$8, $$1);
                  }

                  if ($$3 != null) {
                     $$3.accept($$8);
                  }

                  for (grs.h $$10 : this.d) {
                     $$10.a($$8);
                  }

                  $$8.drawIndexed(0, 6);
               }

               RenderSystem.restoreProjectionMatrix();

               for (grt.a $$11 : this.e) {
                  $$11.a($$1);
               }
            }
         );
      }
   }

   public interface a {
      void a(fiy var1, Map<alr, fkr<fjr>> var2);

      void a(RenderPass var1, Map<alr, fkr<fjr>> var2);

      default void a(Map<alr, fkr<fjr>> $$0) {
      }
   }

   public static record b(String a, alr b, boolean c, boolean d) implements grt.a {
      private fkr<fjr> b(Map<alr, fkr<fjr>> $$0) {
         fkr<fjr> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(fiy $$0, Map<alr, fkr<fjr>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(RenderPass $$0, Map<alr, fkr<fjr>> $$1) {
         fkr<fjr> $$2 = this.b($$1);
         fjr $$3 = $$2.get();
         $$3.a(this.d ? FilterMode.LINEAR : FilterMode.NEAREST);
         GpuTexture $$4 = this.c ? $$3.d() : $$3.c();
         if ($$4 == null) {
            throw new IllegalStateException("Missing " + (this.c ? "depth" : "color") + "texture for target " + this.b);
         } else {
            $$0.bindSampler(this.a + "Sampler", $$4);
            $$0.setUniform(this.a + "Size", (float)$$3.c, (float)$$3.d);
         }
      }

      @Override
      public void a(Map<alr, fkr<fjr>> $$0) {
         if (this.d) {
            this.b($$0).get().a(FilterMode.NEAREST);
         }
      }
   }

   public static record c(String a, hkb b, int c, int d) implements grt.a {
      @Override
      public void a(fiy $$0, Map<alr, fkr<fjr>> $$1) {
      }

      @Override
      public void a(RenderPass $$0, Map<alr, fkr<fjr>> $$1) {
         $$0.bindSampler(this.a + "Sampler", this.b.a());
         $$0.setUniform(this.a + "Size", (float)this.c, (float)this.d);
      }
   }
}
