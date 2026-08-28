import javax.annotation.Nullable;

public class hks implements hky {
   private static final int a = 1200;
   private static final wp b = wp.c("tutorial.craft_planks.title");
   private static final wp c = wp.c("tutorial.craft_planks.description");
   private final hkx d;
   @Nullable
   private frf e;
   private int f;

   public hks(hkx $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hkz.f);
      } else {
         flj $$0 = this.d.e();
         if (this.f == 1) {
            gkw $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(awy.b)) {
                  this.d.a(hkz.f);
                  return;
               }

               if (a($$1, awy.b)) {
                  this.d.a(hkz.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new frf($$0.h, frf.a.e, b, c, false);
            $$0.aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.d();
         this.e = null;
      }
   }

   @Override
   public void a(cwp $$0) {
      if ($$0.a(awy.b)) {
         this.d.a(hkz.f);
      }
   }

   public static boolean a(gkw $$0, axf<cwl> $$1) {
      for (jr<cwl> $$2 : mb.g.c($$1)) {
         if ($$0.m().a(awk.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
