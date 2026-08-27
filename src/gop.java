public class gop implements gou {
   private static final int a = 6000;
   private static final vu b = vu.c("tutorial.find_tree.title");
   private static final vu c = vu.c("tutorial.find_tree.description");
   private final got d;
   private fdr e;
   private int f;

   public gop(got $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gov.f);
      } else {
         if (this.f == 1) {
            fws $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gov.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fdr(fdr.a.c, b, c, false);
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
   public void a(fry $$0, epp $$1) {
      if ($$1.c() == epp.a.b) {
         dmz $$2 = $$0.a_(((epn)$$1).a());
         if ($$2.a(aun.aj)) {
            this.d.a(gov.c);
         }
      }
   }

   @Override
   public void a(cqk $$0) {
      if ($$0.a(auv.al)) {
         this.d.a(gov.e);
      }
   }

   private static boolean b(fws $$0) {
      return $$0.fZ().a_($$0x -> $$0x.a(auv.al));
   }

   public static boolean a(fws $$0) {
      for (il<daa> $$1 : ki.e.c(aun.aj)) {
         daa $$2 = $$1.a();
         if ($$0.j().a(aui.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
