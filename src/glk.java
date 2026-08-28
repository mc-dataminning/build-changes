import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joml.Matrix4f;

public class glk {
   private final String a;
   private final gkn b;
   private final alz c;
   private final List<glj.h> d;
   private final List<glk.a> e = new ArrayList<>();

   public glk(String $$0, gkn $$1, alz $$2, List<glj.h> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public void a(glk.a $$0) {
      this.e.add($$0);
   }

   public void a(fep $$0, Map<alz, ffx<fev>> $$1, Matrix4f $$2) {
      feq $$3 = $$0.a(this.a);

      for (glk.a $$4 : this.e) {
         $$4.a($$3, $$1);
      }

      ffx<fev> $$5 = $$1.computeIfPresent(this.c, ($$1x, $$2x) -> $$3.b($$2x));
      if ($$5 == null) {
         throw new IllegalStateException("Missing handle for target " + this.c);
      } else {
         $$3.a(() -> {
            fev $$3x = $$5.get();
            RenderSystem.viewport(0, 0, $$3x.c, $$3x.d);

            for (glk.a $$4x : this.e) {
               $$4x.a(this.b, $$1);
            }

            this.b.b("OutSize").a((float)$$3x.c, (float)$$3x.d);

            for (glj.h $$5x : this.d) {
               fgc $$6 = this.b.a($$5x.a());
               if ($$6 != null) {
                  a($$6, $$5x.b());
               }
            }

            $$3x.a(0.0F, 0.0F, 0.0F, 0.0F);
            $$3x.f();
            $$3x.a(false);
            RenderSystem.depthFunc(519);
            RenderSystem.setShader(this.b);
            RenderSystem.backupProjectionMatrix();
            RenderSystem.setProjectionMatrix($$2, fgt.b);
            fgg $$7 = fgn.b().a(fgq.c.h, fgj.e);
            $$7.a(0.0F, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, (float)$$3x.d, 500.0F);
            $$7.a(0.0F, (float)$$3x.d, 500.0F);
            fgh.a($$7.b());
            RenderSystem.depthFunc(515);
            RenderSystem.restoreProjectionMatrix();
            $$3x.e();

            for (glk.a $$8 : this.e) {
               $$8.a($$1);
            }
         });
      }
   }

   private static void a(fgc $$0, List<Float> $$1) {
      switch ($$1.size()) {
         case 1:
            $$0.a($$1.getFirst());
            break;
         case 2:
            $$0.a($$1.get(0), $$1.get(1));
            break;
         case 3:
            $$0.a($$1.get(0), $$1.get(1), $$1.get(2));
            break;
         case 4:
            $$0.a($$1.get(0), $$1.get(1), $$1.get(2), $$1.get(3));
      }
   }

   public gkn a() {
      return this.b;
   }

   public interface a {
      void a(feq var1, Map<alz, ffx<fev>> var2);

      void a(gkn var1, Map<alz, ffx<fev>> var2);

      default void a(Map<alz, ffx<fev>> $$0) {
      }
   }

   public static record b(String a, alz b, boolean c, boolean d) implements glk.a {
      private ffx<fev> b(Map<alz, ffx<fev>> $$0) {
         ffx<fev> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(feq $$0, Map<alz, ffx<fev>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(gkn $$0, Map<alz, ffx<fev>> $$1) {
         ffx<fev> $$2 = this.b($$1);
         fev $$3 = $$2.get();
         $$3.a(this.d ? 9729 : 9728);
         $$0.a(this.a + "Sampler", this.c ? $$3.h() : $$3.g());
         $$0.b(this.a + "Size").a((float)$$3.c, (float)$$3.d);
      }

      @Override
      public void a(Map<alz, ffx<fev>> $$0) {
         if (this.d) {
            this.b($$0).get().a(9728);
         }
      }
   }

   public static record c(String a, hap b, int c, int d) implements glk.a {
      @Override
      public void a(feq $$0, Map<alz, ffx<fev>> $$1) {
      }

      @Override
      public void a(gkn $$0, Map<alz, ffx<fev>> $$1) {
         $$0.a(this.a + "Sampler", this.b.a());
         $$0.b(this.a + "Size").a((float)this.c, (float)this.d);
      }
   }
}
