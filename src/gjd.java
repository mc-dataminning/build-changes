import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joml.Matrix4f;

public class gjd {
   private final String a;
   private final gig b;
   private final all c;
   private final List<gjc.h> d;
   private final List<gjd.a> e = new ArrayList<>();

   public gjd(String $$0, gig $$1, all $$2, List<gjc.h> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public void a(gjd.a $$0) {
      this.e.add($$0);
   }

   public void a(fco $$0, Map<all, fdw<fcu>> $$1, Matrix4f $$2) {
      fcp $$3 = $$0.a(this.a);

      for (gjd.a $$4 : this.e) {
         $$4.a($$3, $$1);
      }

      fdw<fcu> $$5 = $$1.computeIfPresent(this.c, ($$1x, $$2x) -> $$3.b($$2x));
      if ($$5 == null) {
         throw new IllegalStateException("Missing handle for target " + this.c);
      } else {
         $$3.a(() -> {
            fcu $$3x = $$5.get();
            RenderSystem.viewport(0, 0, $$3x.c, $$3x.d);

            for (gjd.a $$4x : this.e) {
               $$4x.a(this.b, $$1);
            }

            this.b.b("OutSize").a((float)$$3x.c, (float)$$3x.d);

            for (gjc.h $$5x : this.d) {
               feb $$6 = this.b.a($$5x.a());
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
            RenderSystem.setProjectionMatrix($$2, fes.b);
            fef $$7 = fem.b().a(fep.c.h, fei.e);
            $$7.a(0.0F, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, 0.0F, 500.0F);
            $$7.a((float)$$3x.c, (float)$$3x.d, 500.0F);
            $$7.a(0.0F, (float)$$3x.d, 500.0F);
            feg.a($$7.b());
            RenderSystem.depthFunc(515);
            RenderSystem.restoreProjectionMatrix();
            $$3x.e();

            for (gjd.a $$8 : this.e) {
               $$8.a($$1);
            }
         });
      }
   }

   private static void a(feb $$0, List<Float> $$1) {
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

   public gig a() {
      return this.b;
   }

   public interface a {
      void a(fcp var1, Map<all, fdw<fcu>> var2);

      void a(gig var1, Map<all, fdw<fcu>> var2);

      default void a(Map<all, fdw<fcu>> $$0) {
      }
   }

   public static record b(String a, all b, boolean c, boolean d) implements gjd.a {
      private fdw<fcu> b(Map<all, fdw<fcu>> $$0) {
         fdw<fcu> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(fcp $$0, Map<all, fdw<fcu>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(gig $$0, Map<all, fdw<fcu>> $$1) {
         fdw<fcu> $$2 = this.b($$1);
         fcu $$3 = $$2.get();
         $$3.a(this.d ? 9729 : 9728);
         $$0.a(this.a + "Sampler", this.c ? $$3.h() : $$3.g());
         $$0.b(this.a + "Size").a((float)$$3.c, (float)$$3.d);
      }

      @Override
      public void a(Map<all, fdw<fcu>> $$0) {
         if (this.d) {
            this.b($$0).get().a(9728);
         }
      }
   }

   public static record c(String a, gye b, int c, int d) implements gjd.a {
      @Override
      public void a(fcp $$0, Map<all, fdw<fcu>> $$1) {
      }

      @Override
      public void a(gig $$0, Map<all, fdw<fcu>> $$1) {
         $$0.a(this.a + "Sampler", this.b.a());
         $$0.b(this.a + "Size").a((float)this.c, (float)this.d);
      }
   }
}
