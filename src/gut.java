public class gut implements guy {
   private static final int a = 6000;
   private static final xo b = xo.c("tutorial.find_tree.title");
   private static final xo c = xo.c("tutorial.find_tree.description");
   private final gux d;
   private fjo e;
   private int f;

   public gut(gux $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(guz.f);
      } else {
         if (this.f == 1) {
            gcp $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(guz.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fjo(fjo.a.c, b, c, false);
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
   public void a(fxu $$0, evo $$1) {
      if ($$1.c() == evo.a.b) {
         dsb $$2 = $$0.a_(((evm)$$1).a());
         if ($$2.a(awo.aj)) {
            this.d.a(guz.c);
         }
      }
   }

   @Override
   public void a(cuo $$0) {
      if ($$0.a(awx.aM)) {
         this.d.a(guz.e);
      }
   }

   private static boolean b(gcp $$0) {
      return $$0.gc().a_($$0x -> $$0x.a(awx.aM));
   }

   public static boolean a(gcp $$0) {
      for (ji<dey> $$1 : lp.e.c(awo.aj)) {
         dey $$2 = $$1.a();
         if ($$0.j().a(awj.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
