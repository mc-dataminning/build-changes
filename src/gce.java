public class gce extends gcq<bzt, fka<bzt>> {
   private final fka<bzt> a;

   public gce(gaa<bzt, fka<bzt>> $$0, fml $$1) {
      super($$0);
      this.a = new fka<>($$1.a(fmo.an));
   }

   public void a(ept $$0, fsz $$1, int $$2, bzt $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cmr $$10 = $$3.u();
      if ($$10.d() instanceof cmh) {
         cmh $$11 = (cmh)$$10.d();
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$13;
         float $$14;
         float $$15;
         if ($$11 instanceof cli) {
            int $$12 = ((cli)$$11).e_($$10);
            $$13 = (float)($$12 >> 16 & 0xFF) / 255.0F;
            $$14 = (float)($$12 >> 8 & 0xFF) / 255.0F;
            $$15 = (float)($$12 & 0xFF) / 255.0F;
         } else {
            $$13 = 1.0F;
            $$14 = 1.0F;
            $$15 = 1.0F;
         }

         epx $$19 = $$1.getBuffer(fth.e($$11.h()));
         this.a.a($$0, $$19, $$2, gdw.d, $$13, $$14, $$15, 1.0F);
      }
   }
}
