public class gmm implements glr<dvd> {
   private final gqi a;
   private final azu b = azu.a();

   public gmm(gls.a $$0) {
      this.a = $$0.d();
   }

   public void a(dvd $$0, float $$1, fer $$2, gjg $$3, int $$4, int $$5) {
      if (dvd.a.a($$0.c())) {
         dfm $$6 = $$0.i();
         if ($$6 != null) {
            cwm $$7 = $$0.c().a();
            if (!$$7.f()) {
               this.b.b((long)gqg.a($$7));
               dve $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, dfm $$1, fer $$2, gjg $$3, int $$4, cwm $$5, gqi $$6, float $$7, float $$8, azu $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(azm.i($$0, $$7, $$8)));
      gqg.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
