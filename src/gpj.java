import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joml.Matrix4f;

public class gpj {
   private final String a;
   private final gom b;
   private final ale c;
   private final List<gpi.h> d;
   private final List<gpj.a> e = new ArrayList<>();

   public gpj(String $$0, gom $$1, ale $$2, List<gpi.h> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public void a(gpj.a $$0) {
      this.e.add($$0);
   }

   public void a(fgu $$0, Map<ale, fic<fha>> $$1, Matrix4f $$2) {
      fgv $$3 = $$0.a(this.a);

      for (gpj.a $$4 : this.e) {
         $$4.a($$3, $$1);
      }

      fic<fha> $$5 = $$1.computeIfPresent(this.c, ($$1x, $$2x) -> $$3.b($$2x));
      if ($$5 == null) {
         throw new IllegalStateException("Missing handle for target " + this.c);
      } else {
         $$3.a(() -> {
            fha $$3x = $$5.get();
            RenderSystem.viewport(0, 0, $$3x.c, $$3x.d);

            for (gpj.a $$4x : this.e) {
               $$4x.a(this.b, $$1);
            }

            this.b.c("OutSize").a((float)$$3x.c, (float)$$3x.d);

            for (gpi.h $$5x : this.d) {
               fih $$6 = this.b.a($$5x.a());
               if ($$6 != null) {
                  $$6.a($$5x.b(), $$5x.b().size());
               }
            }

            $$3x.a(false);
            RenderSystem.depthFunc(519);
            RenderSystem.setShader(this.b);
            RenderSystem.backupProjectionMatrix();
            RenderSystem.setProjectionMatrix($$2, ffz.b);
            fil $$7 = fis.b().a(fiv.c.h, fio.e);
            $$7.a(0.0F, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, (float)$$3x.d, 500.0F);
            $$7.a(0.0F, (float)$$3x.d, 500.0F);
            fim.a($$7.b());
            RenderSystem.depthFunc(515);
            RenderSystem.restoreProjectionMatrix();
            $$3x.e();

            for (gpj.a $$8 : this.e) {
               $$8.a($$1);
            }

            this.b();
         });
      }
   }

   private void b() {
      for (gpi.h $$0 : this.d) {
         String $$1 = $$0.a();
         fih $$2 = this.b.a($$1);
         gpw.b $$3 = this.b.b($$1);
         if ($$2 != null && $$3 != null && !$$0.b().equals($$3.d())) {
            $$2.a($$3);
         }
      }
   }

   public gom a() {
      return this.b;
   }

   public interface a {
      void a(fgv var1, Map<ale, fic<fha>> var2);

      void a(gom var1, Map<ale, fic<fha>> var2);

      default void a(Map<ale, fic<fha>> $$0) {
      }
   }

   public static record b(String a, ale b, boolean c, boolean d) implements gpj.a {
      private fic<fha> b(Map<ale, fic<fha>> $$0) {
         fic<fha> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(fgv $$0, Map<ale, fic<fha>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(gom $$0, Map<ale, fic<fha>> $$1) {
         fic<fha> $$2 = this.b($$1);
         fha $$3 = $$2.get();
         $$3.a(this.d ? 9729 : 9728);
         $$0.a(this.a + "Sampler", this.c ? $$3.h() : $$3.g());
         $$0.c(this.a + "Size").a((float)$$3.c, (float)$$3.d);
      }

      @Override
      public void a(Map<ale, fic<fha>> $$0) {
         if (this.d) {
            this.b($$0).get().a(9728);
         }
      }
   }

   public static record c(String a, hhk b, int c, int d) implements gpj.a {
      @Override
      public void a(fgv $$0, Map<ale, fic<fha>> $$1) {
      }

      @Override
      public void a(gom $$0, Map<ale, fic<fha>> $$1) {
         $$0.a(this.a + "Sampler", this.b.a());
         $$0.c(this.a + "Size").a((float)this.c, (float)this.d);
      }
   }
}
