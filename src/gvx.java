public class gvx implements gwc {
   private static final int a = 6000;
   private static final wy b = wy.c("tutorial.find_tree.title");
   private static final wy c = wy.c("tutorial.find_tree.description");
   private final gwb d;
   private fkr e;
   private int f;

   public gvx(gwb $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwd.f);
      } else {
         if (this.f == 1) {
            gdv $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gwd.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fkr(fkr.a.c, b, c, false);
            this.d.e().aw().a(this.e);
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
   public void a(fyz $$0, ewu $$1) {
      if ($$1.c() == ewu.a.b) {
         dta $$2 = $$0.a_(((ews)$$1).a());
         if ($$2.a(awd.aj)) {
            this.d.a(gwd.c);
         }
      }
   }

   @Override
   public void a(cuo $$0) {
      if ($$0.a(awm.aM)) {
         this.d.a(gwd.e);
      }
   }

   private static boolean b(gdv $$0) {
      return $$0.fZ().a_($$0x -> $$0x.a(awm.aM));
   }

   public static boolean a(gdv $$0) {
      for (jm<dfw> $$1 : lt.e.c(awd.aj)) {
         dfw $$2 = $$1.a();
         if ($$0.j().a(avy.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
