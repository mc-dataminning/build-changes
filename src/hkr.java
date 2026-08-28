import javax.annotation.Nullable;

public class hkr implements hkx {
   private static final int a = 1200;
   private static final wp b = wp.c("tutorial.craft_planks.title");
   private static final wp c = wp.c("tutorial.craft_planks.description");
   private final hkw d;
   @Nullable
   private fre e;
   private int f;

   public hkr(hkw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hky.f);
      } else {
         fli $$0 = this.d.e();
         if (this.f == 1) {
            gkv $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(awy.b)) {
                  this.d.a(hky.f);
                  return;
               }

               if (a($$1, awy.b)) {
                  this.d.a(hky.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fre($$0.h, fre.a.e, b, c, false);
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
   public void a(cwo $$0) {
      if ($$0.a(awy.b)) {
         this.d.a(hky.f);
      }
   }

   public static boolean a(gkv $$0, axf<cwk> $$1) {
      for (jr<cwk> $$2 : mb.g.c($$1)) {
         if ($$0.m().a(awk.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
