public class guw implements gvb {
   private static final int a = 6000;
   private static final xp b = xp.c("tutorial.find_tree.title");
   private static final xp c = xp.c("tutorial.find_tree.description");
   private final gva d;
   private fjr e;
   private int f;

   public guw(gva $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvc.f);
      } else {
         if (this.f == 1) {
            gcs $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gvc.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fjr(fjr.a.c, b, c, false);
            this.d.e().ax().a(this.e);
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
   public void a(fxx $$0, evr $$1) {
      if ($$1.c() == evr.a.b) {
         dse $$2 = $$0.a_(((evp)$$1).a());
         if ($$2.a(awp.aj)) {
            this.d.a(gvc.c);
         }
      }
   }

   @Override
   public void a(cur $$0) {
      if ($$0.a(awy.aM)) {
         this.d.a(gvc.e);
      }
   }

   private static boolean b(gcs $$0) {
      return $$0.gc().a_($$0x -> $$0x.a(awy.aM));
   }

   public static boolean a(gcs $$0) {
      for (ji<dfb> $$1 : lp.e.c(awp.aj)) {
         dfb $$2 = $$1.a();
         if ($$0.j().a(awk.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
