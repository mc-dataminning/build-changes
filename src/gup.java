public class gup implements guu {
   private static final int a = 6000;
   private static final xl b = xl.c("tutorial.find_tree.title");
   private static final xl c = xl.c("tutorial.find_tree.description");
   private final gut d;
   private fjk e;
   private int f;

   public gup(gut $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(guv.f);
      } else {
         if (this.f == 1) {
            gcl $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(guv.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fjk(fjk.a.c, b, c, false);
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
   public void a(fxq $$0, evk $$1) {
      if ($$1.c() == evk.a.b) {
         drx $$2 = $$0.a_(((evi)$$1).a());
         if ($$2.a(awl.aj)) {
            this.d.a(guv.c);
         }
      }
   }

   @Override
   public void a(cuk $$0) {
      if ($$0.a(awu.aM)) {
         this.d.a(guv.e);
      }
   }

   private static boolean b(gcl $$0) {
      return $$0.gc().a_($$0x -> $$0x.a(awu.aM));
   }

   public static boolean a(gcl $$0) {
      for (ji<deu> $$1 : lp.e.c(awl.aj)) {
         deu $$2 = $$1.a();
         if ($$0.j().a(awg.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
