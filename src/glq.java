import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joml.Matrix4f;

public class glq {
   private final String a;
   private final gkt b;
   private final alz c;
   private final List<glp.h> d;
   private final List<glq.a> e = new ArrayList<>();

   public glq(String $$0, gkt $$1, alz $$2, List<glp.h> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public void a(glq.a $$0) {
      this.e.add($$0);
   }

   public void a(fev $$0, Map<alz, fgd<ffb>> $$1, Matrix4f $$2) {
      few $$3 = $$0.a(this.a);

      for (glq.a $$4 : this.e) {
         $$4.a($$3, $$1);
      }

      fgd<ffb> $$5 = $$1.computeIfPresent(this.c, ($$1x, $$2x) -> $$3.b($$2x));
      if ($$5 == null) {
         throw new IllegalStateException("Missing handle for target " + this.c);
      } else {
         $$3.a(() -> {
            ffb $$3x = $$5.get();
            RenderSystem.viewport(0, 0, $$3x.c, $$3x.d);

            for (glq.a $$4x : this.e) {
               $$4x.a(this.b, $$1);
            }

            this.b.c("OutSize").a((float)$$3x.c, (float)$$3x.d);

            for (glp.h $$5x : this.d) {
               fgi $$6 = this.b.a($$5x.a());
               if ($$6 != null) {
                  $$6.a($$5x.b(), $$5x.b().size());
               }
            }

            $$3x.a(0.0F, 0.0F, 0.0F, 0.0F);
            $$3x.f();
            $$3x.a(false);
            RenderSystem.depthFunc(519);
            RenderSystem.setShader(this.b);
            RenderSystem.backupProjectionMatrix();
            RenderSystem.setProjectionMatrix($$2, fea.b);
            fgm $$7 = fgt.b().a(fgw.c.h, fgp.e);
            $$7.a(0.0F, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, (float)$$3x.d, 500.0F);
            $$7.a(0.0F, (float)$$3x.d, 500.0F);
            fgn.a($$7.b());
            RenderSystem.depthFunc(515);
            RenderSystem.restoreProjectionMatrix();
            $$3x.e();

            for (glq.a $$8 : this.e) {
               $$8.a($$1);
            }

            this.b();
         });
      }
   }

   private void b() {
      for (glp.h $$0 : this.d) {
         String $$1 = $$0.a();
         fgi $$2 = this.b.a($$1);
         gmd.b $$3 = this.b.b($$1);
         if ($$2 != null && $$3 != null && !$$0.b().equals($$3.d())) {
            $$2.a($$3);
         }
      }
   }

   public gkt a() {
      return this.b;
   }

   public interface a {
      void a(few var1, Map<alz, fgd<ffb>> var2);

      void a(gkt var1, Map<alz, fgd<ffb>> var2);

      default void a(Map<alz, fgd<ffb>> $$0) {
      }
   }

   public static record b(String a, alz b, boolean c, boolean d) implements glq.a {
      private fgd<ffb> b(Map<alz, fgd<ffb>> $$0) {
         fgd<ffb> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(few $$0, Map<alz, fgd<ffb>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(gkt $$0, Map<alz, fgd<ffb>> $$1) {
         fgd<ffb> $$2 = this.b($$1);
         ffb $$3 = $$2.get();
         $$3.a(this.d ? 9729 : 9728);
         $$0.a(this.a + "Sampler", this.c ? $$3.h() : $$3.g());
         $$0.c(this.a + "Size").a((float)$$3.c, (float)$$3.d);
      }

      @Override
      public void a(Map<alz, fgd<ffb>> $$0) {
         if (this.d) {
            this.b($$0).get().a(9728);
         }
      }
   }

   public static record c(String a, hav b, int c, int d) implements glq.a {
      @Override
      public void a(few $$0, Map<alz, fgd<ffb>> $$1) {
      }

      @Override
      public void a(gkt $$0, Map<alz, fgd<ffb>> $$1) {
         $$0.a(this.a + "Sampler", this.b.a());
         $$0.c(this.a + "Size").a((float)this.c, (float)this.d);
      }
   }
}
