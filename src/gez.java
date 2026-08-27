public class gez extends gfl<ccb, fmt<ccb>> {
   private final fmt<ccb> a;

   public gez(gcv<ccb, fmt<ccb>> $$0, fpf $$1) {
      super($$0);
      this.a = new fmt<>($$1.a(fpi.am));
   }

   public void a(esh $$0, fvt $$1, int $$2, ccb $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cpd $$10 = $$3.u();
      if ($$10.d() instanceof cmm $$11 && $$11.d() == cmm.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$11 instanceof cnt) {
            int $$13 = ((cnt)$$11).e_($$10);
            $$14 = (float)($$13 >> 16 & 0xFF) / 255.0F;
            $$15 = (float)($$13 >> 8 & 0xFF) / 255.0F;
            $$16 = (float)($$13 & 0xFF) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         esl $$20 = $$1.getBuffer(fwb.e($$11.b()));
         this.a.a($$0, $$20, $$2, ggs.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
