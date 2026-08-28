public class hbw extends hcw<hgb, gjg> {
   private final gio<hgb> a;
   private final hnf b;

   public hbw(haf<hgb, gjg> $$0, gla $$1, hnf $$2) {
      super($$0);
      this.a = new gje<>($$1.a(gld.ct));
      this.b = $$2;
   }

   private boolean a(czy $$0, hng.d $$1) {
      dih $$2 = $$0.a(kk.D);
      if ($$2 != null && !$$2.d().isEmpty()) {
         hng $$3 = this.b.a($$2.d().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(flo $$0, gsa $$1, int $$2, hgb $$3, float $$4, float $$5) {
      if (!$$3.z && $$3.ay) {
         hmc $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.W, hng.d.c)) {
               $$0.a();
               if (this.a($$3.W, hng.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               flr $$7 = $$1.getBuffer(gsl.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hkq.d);
               $$0.b();
            }
         }
      }
   }
}
