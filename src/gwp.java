public class gwp implements gwu {
   private static final int a = 6000;
   private static final xe b = xe.c("tutorial.find_tree.title");
   private static final xe c = xe.c("tutorial.find_tree.description");
   private final gwt d;
   private fky e;
   private int f;

   public gwp(gwt $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwv.f);
      } else {
         if (this.f == 1) {
            gei $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gwv.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fky(fky.a.c, b, c, false);
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
   public void a(fzn $$0, ews $$1) {
      if ($$1.c() == ews.a.b) {
         dtc $$2 = $$0.a_(((ewq)$$1).a());
         if ($$2.a(awe.ak)) {
            this.d.a(gwv.c);
         }
      }
   }

   @Override
   public void a(cuh $$0) {
      if ($$0.a(awm.aM)) {
         this.d.a(gwv.e);
      }
   }

   private static boolean b(gei $$0) {
      return $$0.gl().b($$0x -> $$0x.a(awm.aM));
   }

   public static boolean a(gei $$0) {
      for (ja<dfc> $$1 : lh.e.c(awe.ak)) {
         dfc $$2 = $$1.a();
         if ($$0.j().a(avz.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
