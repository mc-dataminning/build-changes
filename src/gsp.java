public class gsp implements gsu {
   private static final int a = 6000;
   private static final wu b = wu.c("tutorial.find_tree.title");
   private static final wu c = wu.c("tutorial.find_tree.description");
   private final gst d;
   private fhp e;
   private int f;

   public gsp(gst $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gsv.f);
      } else {
         if (this.f == 1) {
            gaq $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gsv.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fhp(fhp.a.c, b, c, false);
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
   public void a(fvw $$0, etn $$1) {
      if ($$1.c() == etn.a.b) {
         dqh $$2 = $$0.a_(((etl)$$1).a());
         if ($$2.a(avr.aj)) {
            this.d.a(gsv.c);
         }
      }
   }

   @Override
   public void a(csz $$0) {
      if ($$0.a(avz.aM)) {
         this.d.a(gsv.e);
      }
   }

   private static boolean b(gaq $$0) {
      return $$0.ga().a_($$0x -> $$0x.a(avz.aM));
   }

   public static boolean a(gaq $$0) {
      for (iw<dde> $$1 : ld.e.c(avr.aj)) {
         dde $$2 = $$1.a();
         if ($$0.j().a(avm.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
