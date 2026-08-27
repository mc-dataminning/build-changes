public class gos implements gox {
   private static final int a = 6000;
   private static final vu b = vu.c("tutorial.find_tree.title");
   private static final vu c = vu.c("tutorial.find_tree.description");
   private final gow d;
   private fdt e;
   private int f;

   public gos(gow $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(goy.f);
      } else {
         if (this.f == 1) {
            fwu $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(goy.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fdt(fdt.a.c, b, c, false);
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
   public void a(fsa $$0, epr $$1) {
      if ($$1.c() == epr.a.b) {
         dnb $$2 = $$0.a_(((epp)$$1).a());
         if ($$2.a(aun.aj)) {
            this.d.a(goy.c);
         }
      }
   }

   @Override
   public void a(cqm $$0) {
      if ($$0.a(auv.al)) {
         this.d.a(goy.e);
      }
   }

   private static boolean b(fwu $$0) {
      return $$0.fZ().a_($$0x -> $$0x.a(auv.al));
   }

   public static boolean a(fwu $$0) {
      for (il<dac> $$1 : ki.e.c(aun.aj)) {
         dac $$2 = $$1.a();
         if ($$0.j().a(aui.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
