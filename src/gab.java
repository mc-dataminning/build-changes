public class gab implements gag {
   private static final int a = 6000;
   private static final sw b = sw.c("tutorial.find_tree.title");
   private static final sw c = sw.c("tutorial.find_tree.description");
   private final gaf d;
   private eri e;
   private int f;

   public gab(gaf $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gah.f);
      } else {
         if (this.f == 1) {
            fiy $$0 = this.d.e().t;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gah.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new eri(eri.a.c, b, c, false);
            this.d.e().az().a(this.e);
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
   public void a(few $$0, eeg $$1) {
      if ($$1.c() == eeg.a.b) {
         dcb $$2 = $$0.a_(((eee)$$1).a());
         if ($$2.a(amw.ah)) {
            this.d.a(gah.c);
         }
      }
   }

   @Override
   public void a(cfz $$0) {
      if ($$0.a(ane.al)) {
         this.d.a(gah.e);
      }
   }

   private static boolean b(fiy $$0) {
      return $$0.fN().a_($$0x -> $$0x.a(ane.al));
   }

   public static boolean a(fiy $$0) {
      for (he<cpn> $$1 : jb.f.c(amw.ah)) {
         cpn $$2 = $$1.a();
         if ($$0.v().a(amr.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
