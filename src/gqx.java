import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joml.Matrix4f;

public class gqx {
   private final String a;
   private final fii b;
   private final gqa c;
   private final alg d;
   private final List<gqw.h> e;
   private final List<gqx.a> f = new ArrayList<>();

   public gqx(fii $$0, gqa $$1, alg $$2, List<gqw.h> $$3) {
      this.b = $$0;
      this.a = $$0.d().toString();
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public void a(gqx.a $$0) {
      this.f.add($$0);
   }

   public void a(fib $$0, Map<alg, fjl<fij>> $$1, Matrix4f $$2) {
      fic $$3 = $$0.a(this.a);

      for (gqx.a $$4 : this.f) {
         $$4.a($$3, $$1);
      }

      fjl<fij> $$5 = $$1.computeIfPresent(this.d, ($$1x, $$2x) -> $$3.b($$2x));
      if ($$5 == null) {
         throw new IllegalStateException("Missing handle for target " + this.d);
      } else {
         $$3.a(() -> {
            fij $$3x = $$5.get();
            RenderSystem.viewport(0, 0, $$3x.c, $$3x.d);
            $$3x.a(false);
            RenderSystem.backupProjectionMatrix();
            RenderSystem.setProjectionMatrix($$2, fhg.b);
            fkg $$4x = RenderSystem.getQuadVertices();
            $$4x.a(this.b, $$2xx -> {
               for (gqx.a $$3xx : this.f) {
                  $$3xx.a($$2xx, $$1);
               }

               $$2xx.b("OutSize").a((float)$$3x.c, (float)$$3x.d);

               for (gqw.h $$4xx : this.e) {
                  if ($$4xx.c().isPresent()) {
                     fjq $$5x = $$2xx.a($$4xx.a());
                     if ($$5x != null) {
                        List<Float> $$6 = $$4xx.c().get();
                        $$5x.a($$6, $$6.size());
                     }
                  }
               }
            });
            RenderSystem.restoreProjectionMatrix();
            $$3x.d();

            for (gqx.a $$5x : this.f) {
               $$5x.a($$1);
            }
         });
      }
   }

   public gqa a() {
      return this.c;
   }

   public interface a {
      void a(fic var1, Map<alg, fjl<fij>> var2);

      void a(gqa var1, Map<alg, fjl<fij>> var2);

      default void a(Map<alg, fjl<fij>> $$0) {
      }
   }

   public static record b(String a, alg b, boolean c, boolean d) implements gqx.a {
      private fjl<fij> b(Map<alg, fjl<fij>> $$0) {
         fjl<fij> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(fic $$0, Map<alg, fjl<fij>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(gqa $$0, Map<alg, fjl<fij>> $$1) {
         fjl<fij> $$2 = this.b($$1);
         fij $$3 = $$2.get();
         $$3.a(this.d ? fjv.b : fjv.a);
         $$0.a(this.a + "Sampler", this.c ? $$3.h() : $$3.g());
         $$0.b(this.a + "Size").a((float)$$3.c, (float)$$3.d);
      }

      @Override
      public void a(Map<alg, fjl<fij>> $$0) {
         if (this.d) {
            this.b($$0).get().a(fjv.a);
         }
      }
   }

   public static record c(String a, hjb b, int c, int d) implements gqx.a {
      @Override
      public void a(fic $$0, Map<alg, fjl<fij>> $$1) {
      }

      @Override
      public void a(gqa $$0, Map<alg, fjl<fij>> $$1) {
         $$0.a(this.a + "Sampler", this.b.b());
         $$0.b(this.a + "Size").a((float)this.c, (float)this.d);
      }
   }
}
