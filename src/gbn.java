public class gbn extends gbm<cel> {
   private static final aiy a = new aiy("textures/entity/illager/illusioner.png");

   public gbn(gat.a $$0) {
      super($$0, new fmp<>($$0.a(fpb.aq)), 0.5F);
      this.a(new gex<cel, fmp<cel>>(this, $$0.d()) {
         public void a(esa $$0, fvm $$1, int $$2, cel $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gq() || $$3.fY()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public aiy a(cel $$0) {
      return a;
   }

   public void a(cel $$0, float $$1, float $$2, esa $$3, fvm $$4, int $$5) {
      if ($$0.ce()) {
         ens[] $$6 = $$0.E($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)awh.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)awh.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)awh.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(cel $$0) {
      return true;
   }
}
