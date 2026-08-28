public class guu implements guz {
   private static final int a = 6000;
   private static final xp b = xp.c("tutorial.find_tree.title");
   private static final xp c = xp.c("tutorial.find_tree.description");
   private final guy d;
   private fjp e;
   private int f;

   public guu(guy $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gva.f);
      } else {
         if (this.f == 1) {
            gcq $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gva.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fjp(fjp.a.c, b, c, false);
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
   public void a(fxv $$0, evp $$1) {
      if ($$1.c() == evp.a.b) {
         dsc $$2 = $$0.a_(((evn)$$1).a());
         if ($$2.a(awp.aj)) {
            this.d.a(gva.c);
         }
      }
   }

   @Override
   public void a(cup $$0) {
      if ($$0.a(awy.aM)) {
         this.d.a(gva.e);
      }
   }

   private static boolean b(gcq $$0) {
      return $$0.gc().a_($$0x -> $$0x.a(awy.aM));
   }

   public static boolean a(gcq $$0) {
      for (ji<dez> $$1 : lp.e.c(awp.aj)) {
         dez $$2 = $$1.a();
         if ($$0.j().a(awk.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
