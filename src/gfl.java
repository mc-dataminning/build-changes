public class gfl implements gfq {
   private static final int a = 6000;
   private static final ui b = ui.c("tutorial.find_tree.title");
   private static final ui c = ui.c("tutorial.find_tree.description");
   private final gfp d;
   private evt e;
   private int f;

   public gfl(gfp $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gfr.f);
      } else {
         if (this.f == 1) {
            foc $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gfr.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new evt(evt.a.c, b, c, false);
            this.d.e().ay().a(this.e);
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
   public void a(fjr $$0, eid $$1) {
      if ($$1.c() == eid.a.b) {
         dgb $$2 = $$0.a_(((eib)$$1).a());
         if ($$2.a(aqs.ai)) {
            this.d.a(gfr.c);
         }
      }
   }

   @Override
   public void a(ckj $$0) {
      if ($$0.a(ara.al)) {
         this.d.a(gfr.e);
      }
   }

   private static boolean b(foc $$0) {
      return $$0.fS().a_($$0x -> $$0x.a(ara.al));
   }

   public static boolean a(foc $$0) {
      for (ib<cua> $$1 : jy.f.c(aqs.ai)) {
         cua $$2 = $$1.a();
         if ($$0.j().a(aqn.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
