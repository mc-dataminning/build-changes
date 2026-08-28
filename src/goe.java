import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joml.Matrix4f;

public class goe {
   private final String a;
   private final gni b;
   private final ald c;
   private final List<god.h> d;
   private final List<goe.a> e = new ArrayList<>();

   public goe(String $$0, gni $$1, ald $$2, List<god.h> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public void a(goe.a $$0) {
      this.e.add($$0);
   }

   public void a(ffs $$0, Map<ald, fha<ffy>> $$1, Matrix4f $$2) {
      fft $$3 = $$0.a(this.a);

      for (goe.a $$4 : this.e) {
         $$4.a($$3, $$1);
      }

      fha<ffy> $$5 = $$1.computeIfPresent(this.c, ($$1x, $$2x) -> $$3.b($$2x));
      if ($$5 == null) {
         throw new IllegalStateException("Missing handle for target " + this.c);
      } else {
         $$3.a(() -> {
            ffy $$3x = $$5.get();
            RenderSystem.viewport(0, 0, $$3x.c, $$3x.d);

            for (goe.a $$4x : this.e) {
               $$4x.a(this.b, $$1);
            }

            this.b.c("OutSize").a((float)$$3x.c, (float)$$3x.d);

            for (god.h $$5x : this.d) {
               fhf $$6 = this.b.a($$5x.a());
               if ($$6 != null) {
                  $$6.a($$5x.b(), $$5x.b().size());
               }
            }

            $$3x.a(false);
            RenderSystem.depthFunc(519);
            RenderSystem.setShader(this.b);
            RenderSystem.backupProjectionMatrix();
            RenderSystem.setProjectionMatrix($$2, fex.b);
            fhj $$7 = fhq.b().a(fht.c.h, fhm.e);
            $$7.a(0.0F, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, (float)$$3x.d, 500.0F);
            $$7.a(0.0F, (float)$$3x.d, 500.0F);
            fhk.a($$7.b());
            RenderSystem.depthFunc(515);
            RenderSystem.restoreProjectionMatrix();
            $$3x.e();

            for (goe.a $$8 : this.e) {
               $$8.a($$1);
            }

            this.b();
         });
      }
   }

   private void b() {
      for (god.h $$0 : this.d) {
         String $$1 = $$0.a();
         fhf $$2 = this.b.a($$1);
         gor.b $$3 = this.b.b($$1);
         if ($$2 != null && $$3 != null && !$$0.b().equals($$3.d())) {
            $$2.a($$3);
         }
      }
   }

   public gni a() {
      return this.b;
   }

   public interface a {
      void a(fft var1, Map<ald, fha<ffy>> var2);

      void a(gni var1, Map<ald, fha<ffy>> var2);

      default void a(Map<ald, fha<ffy>> $$0) {
      }
   }

   public static record b(String a, ald b, boolean c, boolean d) implements goe.a {
      private fha<ffy> b(Map<ald, fha<ffy>> $$0) {
         fha<ffy> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(fft $$0, Map<ald, fha<ffy>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(gni $$0, Map<ald, fha<ffy>> $$1) {
         fha<ffy> $$2 = this.b($$1);
         ffy $$3 = $$2.get();
         $$3.a(this.d ? 9729 : 9728);
         $$0.a(this.a + "Sampler", this.c ? $$3.h() : $$3.g());
         $$0.c(this.a + "Size").a((float)$$3.c, (float)$$3.d);
      }

      @Override
      public void a(Map<ald, fha<ffy>> $$0) {
         if (this.d) {
            this.b($$0).get().a(9728);
         }
      }
   }

   public static record c(String a, hgd b, int c, int d) implements goe.a {
      @Override
      public void a(fft $$0, Map<ald, fha<ffy>> $$1) {
      }

      @Override
      public void a(gni $$0, Map<ald, fha<ffy>> $$1) {
         $$0.a(this.a + "Sampler", this.b.a());
         $$0.c(this.a + "Size").a((float)this.c, (float)this.d);
      }
   }
}
