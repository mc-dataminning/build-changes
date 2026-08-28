import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joml.Matrix4f;

public class gmb {
   private final String a;
   private final glf b;
   private final aku c;
   private final List<gma.h> d;
   private final List<gmb.a> e = new ArrayList<>();

   public gmb(String $$0, glf $$1, aku $$2, List<gma.h> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public void a(gmb.a $$0) {
      this.e.add($$0);
   }

   public void a(fdw $$0, Map<aku, ffe<fec>> $$1, Matrix4f $$2) {
      fdx $$3 = $$0.a(this.a);

      for (gmb.a $$4 : this.e) {
         $$4.a($$3, $$1);
      }

      ffe<fec> $$5 = $$1.computeIfPresent(this.c, ($$1x, $$2x) -> $$3.b($$2x));
      if ($$5 == null) {
         throw new IllegalStateException("Missing handle for target " + this.c);
      } else {
         $$3.a(() -> {
            fec $$3x = $$5.get();
            RenderSystem.viewport(0, 0, $$3x.c, $$3x.d);

            for (gmb.a $$4x : this.e) {
               $$4x.a(this.b, $$1);
            }

            this.b.c("OutSize").a((float)$$3x.c, (float)$$3x.d);

            for (gma.h $$5x : this.d) {
               ffj $$6 = this.b.a($$5x.a());
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
            RenderSystem.setProjectionMatrix($$2, fdb.b);
            ffn $$7 = ffu.b().a(ffx.c.h, ffq.e);
            $$7.a(0.0F, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, (float)$$3x.d, 500.0F);
            $$7.a(0.0F, (float)$$3x.d, 500.0F);
            ffo.a($$7.b());
            RenderSystem.depthFunc(515);
            RenderSystem.restoreProjectionMatrix();
            $$3x.e();

            for (gmb.a $$8 : this.e) {
               $$8.a($$1);
            }

            this.b();
         });
      }
   }

   private void b() {
      for (gma.h $$0 : this.d) {
         String $$1 = $$0.a();
         ffj $$2 = this.b.a($$1);
         gmo.b $$3 = this.b.b($$1);
         if ($$2 != null && $$3 != null && !$$0.b().equals($$3.d())) {
            $$2.a($$3);
         }
      }
   }

   public glf a() {
      return this.b;
   }

   public interface a {
      void a(fdx var1, Map<aku, ffe<fec>> var2);

      void a(glf var1, Map<aku, ffe<fec>> var2);

      default void a(Map<aku, ffe<fec>> $$0) {
      }
   }

   public static record b(String a, aku b, boolean c, boolean d) implements gmb.a {
      private ffe<fec> b(Map<aku, ffe<fec>> $$0) {
         ffe<fec> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(fdx $$0, Map<aku, ffe<fec>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(glf $$0, Map<aku, ffe<fec>> $$1) {
         ffe<fec> $$2 = this.b($$1);
         fec $$3 = $$2.get();
         $$3.a(this.d ? 9729 : 9728);
         $$0.a(this.a + "Sampler", this.c ? $$3.h() : $$3.g());
         $$0.c(this.a + "Size").a((float)$$3.c, (float)$$3.d);
      }

      @Override
      public void a(Map<aku, ffe<fec>> $$0) {
         if (this.d) {
            this.b($$0).get().a(9728);
         }
      }
   }

   public static record c(String a, hdx b, int c, int d) implements gmb.a {
      @Override
      public void a(fdx $$0, Map<aku, ffe<fec>> $$1) {
      }

      @Override
      public void a(glf $$0, Map<aku, ffe<fec>> $$1) {
         $$0.a(this.a + "Sampler", this.b.a());
         $$0.c(this.a + "Size").a((float)this.c, (float)this.d);
      }
   }
}
