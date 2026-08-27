public class gqz implements gre {
   private static final int a = 6000;
   private static final wg b = wg.c("tutorial.find_tree.title");
   private static final wg c = wg.c("tutorial.find_tree.description");
   private final grd d;
   private fga e;
   private int f;

   public gqz(grd $$0) {
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
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(grf.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fga(fga.a.c, b, c, false);
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
   public void a(fuh $$0, ery $$1) {
      if ($$1.c() == ery.a.b) {
         doz $$2 = $$0.a_(((erw)$$1).a());
         if ($$2.a(avc.aj)) {
            this.d.a(grf.c);
         }
      }
   }

   @Override
   public void a(crj $$0) {
      if ($$0.a(avk.al)) {
         this.d.a(grf.e);
      }
   }

   private static boolean b(fzb $$0) {
      return $$0.fZ().a_($$0x -> $$0x.a(avk.al));
   }

   public static boolean a(fzb $$0) {
      for (il<dby> $$1 : kr.e.c(avc.aj)) {
         dby $$2 = $$1.a();
         if ($$0.j().a(auw.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
