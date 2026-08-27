public class gmk implements gmp {
   private static final int a = 6000;
   private static final vq b = vq.c("tutorial.find_tree.title");
   private static final vq c = vq.c("tutorial.find_tree.description");
   private final gmo d;
   private fbs e;
   private int f;

   public gmk(gmo $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gmq.f);
      } else {
         if (this.f == 1) {
            fuo $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gmq.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fbs(fbs.a.c, b, c, false);
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
   public void a(fpx $$0, enq $$1) {
      if ($$1.c() == enq.a.b) {
         dlf $$2 = $$0.a_(((eno)$$1).a());
         if ($$2.a(atz.ai)) {
            this.d.a(gmq.c);
         }
      }
   }

   @Override
   public void a(coz $$0) {
      if ($$0.a(auh.al)) {
         this.d.a(gmq.e);
      }
   }

   private static boolean b(fuo $$0) {
      return $$0.fT().a_($$0x -> $$0x.a(auh.al));
   }

   public static boolean a(fuo $$0) {
      for (ij<cyo> $$1 : kf.e.c(atz.ai)) {
         cyo $$2 = $$1.a();
         if ($$0.j().a(atu.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
