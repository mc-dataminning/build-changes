public class gck extends gcw<bzy, fkg<bzy>> {
   private final fkg<bzy> a;

   public gck(gag<bzy, fkg<bzy>> $$0, fmr $$1) {
      super($$0);
      this.a = new fkg<>($$1.a(fmu.an));
   }

   public void a(epz $$0, ftf $$1, int $$2, bzy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cmx $$10 = $$3.u();
      if ($$10.d() instanceof cmn) {
         cmn $$11 = (cmn)$$10.d();
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$13;
         float $$14;
         float $$15;
         if ($$11 instanceof clo) {
            int $$12 = ((clo)$$11).e_($$10);
            $$13 = (float)($$12 >> 16 & 0xFF) / 255.0F;
            $$14 = (float)($$12 >> 8 & 0xFF) / 255.0F;
            $$15 = (float)($$12 & 0xFF) / 255.0F;
         } else {
            $$13 = 1.0F;
            $$14 = 1.0F;
            $$15 = 1.0F;
         }

         eqd $$19 = $$1.getBuffer(ftn.e($$11.h()));
         this.a.a($$0, $$19, $$2, gec.d, $$13, $$14, $$15, 1.0F);
      }
   }
}
