import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joml.Matrix4f;

public class glr {
   private final String a;
   private final gku b;
   private final alz c;
   private final List<glq.h> d;
   private final List<glr.a> e = new ArrayList<>();

   public glr(String $$0, gku $$1, alz $$2, List<glq.h> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public void a(glr.a $$0) {
      this.e.add($$0);
   }

   public void a(few $$0, Map<alz, fge<ffc>> $$1, Matrix4f $$2) {
      fex $$3 = $$0.a(this.a);

      for (glr.a $$4 : this.e) {
         $$4.a($$3, $$1);
      }

      fge<ffc> $$5 = $$1.computeIfPresent(this.c, ($$1x, $$2x) -> $$3.b($$2x));
      if ($$5 == null) {
         throw new IllegalStateException("Missing handle for target " + this.c);
      } else {
         $$3.a(() -> {
            ffc $$3x = $$5.get();
            RenderSystem.viewport(0, 0, $$3x.c, $$3x.d);

            for (glr.a $$4x : this.e) {
               $$4x.a(this.b, $$1);
            }

            this.b.c("OutSize").a((float)$$3x.c, (float)$$3x.d);

            for (glq.h $$5x : this.d) {
               fgj $$6 = this.b.a($$5x.a());
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
            RenderSystem.setProjectionMatrix($$2, feb.b);
            fgn $$7 = fgu.b().a(fgx.c.h, fgq.e);
            $$7.a(0.0F, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, (float)$$3x.d, 500.0F);
            $$7.a(0.0F, (float)$$3x.d, 500.0F);
            fgo.a($$7.b());
            RenderSystem.depthFunc(515);
            RenderSystem.restoreProjectionMatrix();
            $$3x.e();

            for (glr.a $$8 : this.e) {
               $$8.a($$1);
            }

            this.b();
         });
      }
   }

   private void b() {
      for (glq.h $$0 : this.d) {
         String $$1 = $$0.a();
         fgj $$2 = this.b.a($$1);
         gme.b $$3 = this.b.b($$1);
         if ($$2 != null && $$3 != null && !$$0.b().equals($$3.d())) {
            $$2.a($$3);
         }
      }
   }

   public gku a() {
      return this.b;
   }

   public interface a {
      void a(fex var1, Map<alz, fge<ffc>> var2);

      void a(gku var1, Map<alz, fge<ffc>> var2);

      default void a(Map<alz, fge<ffc>> $$0) {
      }
   }

   public static record b(String a, alz b, boolean c, boolean d) implements glr.a {
      private fge<ffc> b(Map<alz, fge<ffc>> $$0) {
         fge<ffc> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(fex $$0, Map<alz, fge<ffc>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(gku $$0, Map<alz, fge<ffc>> $$1) {
         fge<ffc> $$2 = this.b($$1);
         ffc $$3 = $$2.get();
         $$3.a(this.d ? 9729 : 9728);
         $$0.a(this.a + "Sampler", this.c ? $$3.h() : $$3.g());
         $$0.c(this.a + "Size").a((float)$$3.c, (float)$$3.d);
      }

      @Override
      public void a(Map<alz, fge<ffc>> $$0) {
         if (this.d) {
            this.b($$0).get().a(9728);
         }
      }
   }

   public static record c(String a, haw b, int c, int d) implements glr.a {
      @Override
      public void a(fex $$0, Map<alz, fge<ffc>> $$1) {
      }

      @Override
      public void a(gku $$0, Map<alz, fge<ffc>> $$1) {
         $$0.a(this.a + "Sampler", this.b.a());
         $$0.c(this.a + "Size").a((float)this.c, (float)this.d);
      }
   }
}
