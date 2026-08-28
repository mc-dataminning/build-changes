import javax.annotation.Nullable;

public class hlr implements hlx {
   private static final int a = 1200;
   private static final wp b = wp.c("tutorial.craft_planks.title");
   private static final wp c = wp.c("tutorial.craft_planks.description");
   private final hlw d;
   @Nullable
   private fsc e;
   private int f;

   public hlr(hlw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hly.f);
      } else {
         fmg $$0 = this.d.e();
         if (this.f == 1) {
            glv $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gl().a(awy.b)) {
                  this.d.a(hly.f);
                  return;
               }

               if (a($$1, awy.b)) {
                  this.d.a(hly.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fsc($$0.h, fsc.a.e, b, c, false);
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
   public void a(cxh $$0) {
      if ($$0.a(awy.b)) {
         this.d.a(hly.f);
      }
   }

   public static boolean a(glv $$0, axf<cxd> $$1) {
      for (jr<cxd> $$2 : mb.g.c($$1)) {
         if ($$0.l().a(awk.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
