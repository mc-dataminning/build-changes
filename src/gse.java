public class gse implements gsj {
   private static final int a = 6000;
   private static final ws b = ws.c("tutorial.find_tree.title");
   private static final ws c = ws.c("tutorial.find_tree.description");
   private final gsi d;
   private fhf e;
   private int f;

   public gse(gsi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gsk.f);
      } else {
         if (this.f == 1) {
            gag $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gsk.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fhf(fhf.a.c, b, c, false);
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
   public void a(fvm $$0, etd $$1) {
      if ($$1.c() == etd.a.b) {
         dpy $$2 = $$0.a_(((etb)$$1).a());
         if ($$2.a(avo.aj)) {
            this.d.a(gsk.c);
         }
      }
   }

   @Override
   public void a(csd $$0) {
      if ($$0.a(avw.al)) {
         this.d.a(gsk.e);
      }
   }

   private static boolean b(gag $$0) {
      return $$0.ga().a_($$0x -> $$0x.a(avw.al));
   }

   public static boolean a(gag $$0) {
      for (iv<dcv> $$1 : lc.e.c(avo.aj)) {
         dcv $$2 = $$1.a();
         if ($$0.j().a(avj.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
