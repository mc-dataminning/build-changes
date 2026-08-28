import javax.annotation.Nullable;

public class hop implements hov {
   private static final int a = 1200;
   private static final wy b = wy.c("tutorial.craft_planks.title");
   private static final wy c = wy.c("tutorial.craft_planks.description");
   private final hou d;
   @Nullable
   private fuo e;
   private int f;

   public hop(hou $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(how.f);
      } else {
         fos $$0 = this.d.e();
         if (this.f == 1) {
            gop $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(axk.b)) {
                  this.d.a(how.f);
                  return;
               }

               if (a($$1, axk.b)) {
                  this.d.a(how.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fuo($$0.h, fuo.a.e, b, c, false);
            $$0.aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.e();
         this.e = null;
      }
   }

   @Override
   public void a(cyy $$0) {
      if ($$0.a(axk.b)) {
         this.d.a(how.f);
      }
   }

   public static boolean a(gop $$0, axr<cyu> $$1) {
      for (je<cyu> $$2 : mf.g.c($$1)) {
         if ($$0.l().a(awx.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
