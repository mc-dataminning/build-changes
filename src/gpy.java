import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joml.Matrix4f;

public class gpy {
   private final String a;
   private final gpb b;
   private final alg c;
   private final List<gpx.h> d;
   private final List<gpy.a> e = new ArrayList<>();

   public gpy(String $$0, gpb $$1, alg $$2, List<gpx.h> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public void a(gpy.a $$0) {
      this.e.add($$0);
   }

   public void a(fhg $$0, Map<alg, fio<fhm>> $$1, Matrix4f $$2) {
      fhh $$3 = $$0.a(this.a);

      for (gpy.a $$4 : this.e) {
         $$4.a($$3, $$1);
      }

      fio<fhm> $$5 = $$1.computeIfPresent(this.c, ($$1x, $$2x) -> $$3.b($$2x));
      if ($$5 == null) {
         throw new IllegalStateException("Missing handle for target " + this.c);
      } else {
         $$3.a(() -> {
            fhm $$3x = $$5.get();
            RenderSystem.viewport(0, 0, $$3x.c, $$3x.d);

            for (gpy.a $$4x : this.e) {
               $$4x.a(this.b, $$1);
            }

            this.b.c("OutSize").a((float)$$3x.c, (float)$$3x.d);

            for (gpx.h $$5x : this.d) {
               fit $$6 = this.b.a($$5x.a());
               if ($$6 != null) {
                  $$6.a($$5x.b(), $$5x.b().size());
               }
            }

            $$3x.a(false);
            RenderSystem.depthFunc(519);
            RenderSystem.setShader(this.b);
            RenderSystem.backupProjectionMatrix();
            RenderSystem.setProjectionMatrix($$2, fgl.b);
            fix $$7 = fje.b().a(fjh.c.h, fja.e);
            $$7.a(0.0F, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, (float)$$3x.d, 500.0F);
            $$7.a(0.0F, (float)$$3x.d, 500.0F);
            fiy.a($$7.b());
            RenderSystem.depthFunc(515);
            RenderSystem.restoreProjectionMatrix();
            $$3x.e();

            for (gpy.a $$8 : this.e) {
               $$8.a($$1);
            }

            this.b();
         });
      }
   }

   private void b() {
      for (gpx.h $$0 : this.d) {
         String $$1 = $$0.a();
         fit $$2 = this.b.a($$1);
         gql.b $$3 = this.b.b($$1);
         if ($$2 != null && $$3 != null && !$$0.b().equals($$3.d())) {
            $$2.a($$3);
         }
      }
   }

   public gpb a() {
      return this.b;
   }

   public interface a {
      void a(fhh var1, Map<alg, fio<fhm>> var2);

      void a(gpb var1, Map<alg, fio<fhm>> var2);

      default void a(Map<alg, fio<fhm>> $$0) {
      }
   }

   public static record b(String a, alg b, boolean c, boolean d) implements gpy.a {
      private fio<fhm> b(Map<alg, fio<fhm>> $$0) {
         fio<fhm> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(fhh $$0, Map<alg, fio<fhm>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(gpb $$0, Map<alg, fio<fhm>> $$1) {
         fio<fhm> $$2 = this.b($$1);
         fhm $$3 = $$2.get();
         $$3.a(this.d ? 9729 : 9728);
         $$0.a(this.a + "Sampler", this.c ? $$3.h() : $$3.g());
         $$0.c(this.a + "Size").a((float)$$3.c, (float)$$3.d);
      }

      @Override
      public void a(Map<alg, fio<fhm>> $$0) {
         if (this.d) {
            this.b($$0).get().a(9728);
         }
      }
   }

   public static record c(String a, hia b, int c, int d) implements gpy.a {
      @Override
      public void a(fhh $$0, Map<alg, fio<fhm>> $$1) {
      }

      @Override
      public void a(gpb $$0, Map<alg, fio<fhm>> $$1) {
         $$0.a(this.a + "Sampler", this.b.a());
         $$0.c(this.a + "Size").a((float)this.c, (float)this.d);
      }
   }
}
