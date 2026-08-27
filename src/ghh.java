public class ghh extends ghg<chp> {
   private static final akf a = new akf("textures/entity/illager/illusioner.png");

   public ghh(ggn.a $$0) {
      super($$0, new fsf<>($$0.a(fuq.au)), 0.5F);
      this.a(new gkr<chp, fsf<chp>>(this, $$0.d()) {
         public void a(exn $$0, gbe $$1, int $$2, chp $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gz() || $$3.gh()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public akf a(chp $$0) {
      return a;
   }

   public void a(chp $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      if ($$0.cf()) {
         etf[] $$6 = $$0.G($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)axw.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)axw.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)axw.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(chp $$0) {
      return true;
   }
}
