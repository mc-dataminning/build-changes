public class gcl extends gcx<bzy, fkh<bzy>> {
   private final fkh<bzy> a;

   public gcl(gah<bzy, fkh<bzy>> $$0, fms $$1) {
      super($$0);
      this.a = new fkh<>($$1.a(fmv.an));
   }

   public void a(eqa $$0, ftg $$1, int $$2, bzy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
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

         eqe $$19 = $$1.getBuffer(fto.e($$11.h()));
         this.a.a($$0, $$19, $$2, ged.d, $$13, $$14, $$15, 1.0F);
      }
   }
}
