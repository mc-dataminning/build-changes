public class gqy implements gre {
   private static final int a = 1200;
   private static final wg b = wg.c("tutorial.craft_planks.title");
   private static final wg c = wg.c("tutorial.craft_planks.description");
   private final grd d;
   private fga e;
   private int f;

   public gqy(grd $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(grf.f);
      } else {
         if (this.f == 1) {
            fzb $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fZ().a(avk.b)) {
                  this.d.a(grf.f);
                  return;
               }

               if (a($$0, avk.b)) {
                  this.d.a(grf.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fga(fga.a.e, b, c, false);
            this.d.e().aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.c();
         this.e = null;
      }
   }

   @Override
   public void a(crj $$0) {
      if ($$0.a(avk.b)) {
         this.d.a(grf.f);
      }
   }

   public static boolean a(fzb $$0, avr<cre> $$1) {
      for (il<cre> $$2 : kr.h.c($$1)) {
         if ($$0.j().a(auw.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
