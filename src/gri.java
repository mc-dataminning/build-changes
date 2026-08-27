public class gri implements grn {
   private static final int a = 6000;
   private static final wi b = wi.c("tutorial.find_tree.title");
   private static final wi c = wi.c("tutorial.find_tree.description");
   private final grm d;
   private fgj e;
   private int f;

   public gri(grm $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gro.f);
      } else {
         if (this.f == 1) {
            fzk $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gro.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fgj(fgj.a.c, b, c, false);
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
   public void a(fuq $$0, esh $$1) {
      if ($$1.c() == esh.a.b) {
         dpi $$2 = $$0.a_(((esf)$$1).a());
         if ($$2.a(ave.aj)) {
            this.d.a(gro.c);
         }
      }
   }

   @Override
   public void a(crs $$0) {
      if ($$0.a(avm.al)) {
         this.d.a(gro.e);
      }
   }

   private static boolean b(fzk $$0) {
      return $$0.fZ().a_($$0x -> $$0x.a(avm.al));
   }

   public static boolean a(fzk $$0) {
      for (in<dch> $$1 : kt.e.c(ave.aj)) {
         dch $$2 = $$1.a();
         if ($$0.j().a(auz.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
