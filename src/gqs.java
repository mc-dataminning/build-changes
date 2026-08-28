import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joml.Matrix4f;

public class gqs {
   private final String a;
   private final fid b;
   private final gpv c;
   private final alg d;
   private final List<gqr.h> e;
   private final List<gqs.a> f = new ArrayList<>();

   public gqs(fid $$0, gpv $$1, alg $$2, List<gqr.h> $$3) {
      this.b = $$0;
      this.a = $$0.d().toString();
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public void a(gqs.a $$0) {
      this.f.add($$0);
   }

   public void a(fhw $$0, Map<alg, fjg<fie>> $$1, Matrix4f $$2) {
      fhx $$3 = $$0.a(this.a);

      for (gqs.a $$4 : this.f) {
         $$4.a($$3, $$1);
      }

      fjg<fie> $$5 = $$1.computeIfPresent(this.d, ($$1x, $$2x) -> $$3.b($$2x));
      if ($$5 == null) {
         throw new IllegalStateException("Missing handle for target " + this.d);
      } else {
         $$3.a(() -> {
            fie $$3x = $$5.get();
            RenderSystem.viewport(0, 0, $$3x.c, $$3x.d);
            $$3x.a(false);
            RenderSystem.backupProjectionMatrix();
            RenderSystem.setProjectionMatrix($$2, fhb.b);
            fkb $$4x = RenderSystem.getQuadVertices();
            $$4x.a(this.b, $$2xx -> {
               for (gqs.a $$3xx : this.f) {
                  $$3xx.a($$2xx, $$1);
               }

               $$2xx.b("OutSize").a((float)$$3x.c, (float)$$3x.d);

               for (gqr.h $$4xx : this.e) {
                  if ($$4xx.c().isPresent()) {
                     fjl $$5x = $$2xx.a($$4xx.a());
                     if ($$5x != null) {
                        List<Float> $$6 = $$4xx.c().get();
                        $$5x.a($$6, $$6.size());
                     }
                  }
               }
            });
            RenderSystem.restoreProjectionMatrix();
            $$3x.d();

            for (gqs.a $$5x : this.f) {
               $$5x.a($$1);
            }
         });
      }
   }

   public gpv a() {
      return this.c;
   }

   public interface a {
      void a(fhx var1, Map<alg, fjg<fie>> var2);

      void a(gpv var1, Map<alg, fjg<fie>> var2);

      default void a(Map<alg, fjg<fie>> $$0) {
      }
   }

   public static record b(String a, alg b, boolean c, boolean d) implements gqs.a {
      private fjg<fie> b(Map<alg, fjg<fie>> $$0) {
         fjg<fie> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(fhx $$0, Map<alg, fjg<fie>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(gpv $$0, Map<alg, fjg<fie>> $$1) {
         fjg<fie> $$2 = this.b($$1);
         fie $$3 = $$2.get();
         $$3.a(this.d ? fjq.b : fjq.a);
         $$0.a(this.a + "Sampler", this.c ? $$3.h() : $$3.g());
         $$0.b(this.a + "Size").a((float)$$3.c, (float)$$3.d);
      }

      @Override
      public void a(Map<alg, fjg<fie>> $$0) {
         if (this.d) {
            this.b($$0).get().a(fjq.a);
         }
      }
   }

   public static record c(String a, hiv b, int c, int d) implements gqs.a {
      @Override
      public void a(fhx $$0, Map<alg, fjg<fie>> $$1) {
      }

      @Override
      public void a(gpv $$0, Map<alg, fjg<fie>> $$1) {
         $$0.a(this.a + "Sampler", this.b.d());
         $$0.b(this.a + "Size").a((float)this.c, (float)this.d);
      }
   }
}
