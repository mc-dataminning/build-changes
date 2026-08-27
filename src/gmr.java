public class gmr implements gmw {
   private static final int a = 6000;
   private static final vq b = vq.c("tutorial.find_tree.title");
   private static final vq c = vq.c("tutorial.find_tree.description");
   private final gmv d;
   private fbz e;
   private int f;

   public gmr(gmv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gmx.f);
      } else {
         if (this.f == 1) {
            fuv $$0 = this.d.e().s;
            if ($$0 != null && (b($$0) || a($$0))) {
               this.d.a(gmx.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new fbz(fbz.a.c, b, c, false);
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
   public void a(fqe $$0, enx $$1) {
      if ($$1.c() == enx.a.b) {
         dlj $$2 = $$0.a_(((env)$$1).a());
         if ($$2.a(aua.ai)) {
            this.d.a(gmx.c);
         }
      }
   }

   @Override
   public void a(cpd $$0) {
      if ($$0.a(aui.al)) {
         this.d.a(gmx.e);
      }
   }

   private static boolean b(fuv $$0) {
      return $$0.fT().a_($$0x -> $$0x.a(aui.al));
   }

   public static boolean a(fuv $$0) {
      for (ij<cys> $$1 : kf.e.c(aua.ai)) {
         cys $$2 = $$1.a();
         if ($$0.j().a(atv.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
