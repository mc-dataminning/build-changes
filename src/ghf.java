public class ghf implements ghk {
   private static final int a = 6000;
   private static final ur b = ur.c("tutorial.find_tree.title");
   private static final ur c = ur.c("tutorial.find_tree.description");
   private final ghj d;
   private exj e;
   private int f;

   public ghf(ghj $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(ghl.f);
      } else {
         if (this.f == 1) {
            fpw $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(ghl.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new exj(exj.a.c, b, c, false);
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
   public void a(flj $$0, ejs $$1) {
      if ($$1.c() == ejs.a.b) {
         dhi $$2 = $$0.a_(((ejq)$$1).a());
         if ($$2.a(arg.ai)) {
            this.d.a(ghl.c);
         }
      }
   }

   @Override
   public void a(clj $$0) {
      if ($$0.a(aro.al)) {
         this.d.a(ghl.e);
      }
   }

   private static boolean b(fpw $$0) {
      return $$0.fT().a_($$0x -> $$0x.a(aro.al));
   }

   public static boolean a(fpw $$0) {
      for (ib<cva> $$1 : jy.f.c(arg.ai)) {
         cva $$2 = $$1.a();
         if ($$0.j().a(arb.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
