import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joml.Matrix4f;

public class gqg {
   private final String a;
   private final gpj b;
   private final alg c;
   private final List<gqf.h> d;
   private final List<gqg.a> e = new ArrayList<>();

   public gqg(String $$0, gpj $$1, alg $$2, List<gqf.h> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public void a(gqg.a $$0) {
      this.e.add($$0);
   }

   public void a(fho $$0, Map<alg, fiw<fhu>> $$1, Matrix4f $$2) {
      fhp $$3 = $$0.a(this.a);

      for (gqg.a $$4 : this.e) {
         $$4.a($$3, $$1);
      }

      fiw<fhu> $$5 = $$1.computeIfPresent(this.c, ($$1x, $$2x) -> $$3.b($$2x));
      if ($$5 == null) {
         throw new IllegalStateException("Missing handle for target " + this.c);
      } else {
         $$3.a(() -> {
            fhu $$3x = $$5.get();
            RenderSystem.viewport(0, 0, $$3x.c, $$3x.d);

            for (gqg.a $$4x : this.e) {
               $$4x.a(this.b, $$1);
            }

            this.b.c("OutSize").a((float)$$3x.c, (float)$$3x.d);

            for (gqf.h $$5x : this.d) {
               fjb $$6 = this.b.a($$5x.a());
               if ($$6 != null) {
                  $$6.a($$5x.b(), $$5x.b().size());
               }
            }

            $$3x.a(false);
            RenderSystem.depthFunc(519);
            RenderSystem.setShader(this.b);
            RenderSystem.backupProjectionMatrix();
            RenderSystem.setProjectionMatrix($$2, fgt.b);
            fjm $$7 = RenderSystem.getQuadVertices();
            $$7.a();
            $$7.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
            fjm.b();
            RenderSystem.depthFunc(515);
            RenderSystem.restoreProjectionMatrix();
            $$3x.e();

            for (gqg.a $$8 : this.e) {
               $$8.a($$1);
            }

            this.b();
         });
      }
   }

   private void b() {
      for (gqf.h $$0 : this.d) {
         String $$1 = $$0.a();
         fjb $$2 = this.b.a($$1);
         gqt.b $$3 = this.b.b($$1);
         if ($$2 != null && $$3 != null && !$$0.b().equals($$3.d())) {
            $$2.a($$3);
         }
      }
   }

   public gpj a() {
      return this.b;
   }

   public interface a {
      void a(fhp var1, Map<alg, fiw<fhu>> var2);

      void a(gpj var1, Map<alg, fiw<fhu>> var2);

      default void a(Map<alg, fiw<fhu>> $$0) {
      }
   }

   public static record b(String a, alg b, boolean c, boolean d) implements gqg.a {
      private fiw<fhu> b(Map<alg, fiw<fhu>> $$0) {
         fiw<fhu> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(fhp $$0, Map<alg, fiw<fhu>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(gpj $$0, Map<alg, fiw<fhu>> $$1) {
         fiw<fhu> $$2 = this.b($$1);
         fhu $$3 = $$2.get();
         $$3.a(this.d ? 9729 : 9728);
         $$0.a(this.a + "Sampler", this.c ? $$3.h() : $$3.g());
         $$0.c(this.a + "Size").a((float)$$3.c, (float)$$3.d);
      }

      @Override
      public void a(Map<alg, fiw<fhu>> $$0) {
         if (this.d) {
            this.b($$0).get().a(9728);
         }
      }
   }

   public static record c(String a, hii b, int c, int d) implements gqg.a {
      @Override
      public void a(fhp $$0, Map<alg, fiw<fhu>> $$1) {
      }

      @Override
      public void a(gpj $$0, Map<alg, fiw<fhu>> $$1) {
         $$0.a(this.a + "Sampler", this.b.a());
         $$0.c(this.a + "Size").a((float)this.c, (float)this.d);
      }
   }
}
