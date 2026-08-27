public class gff<T extends box, M extends foj<T>> extends ggs<T, M> {
   private final gbw a;

   public gff(gby.a $$0, gcz<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eN();
   }

   @Override
   protected void a(etd $$0, fwq $$1, int $$2, bof $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = awm.c($$4 * $$4 + $$6 * $$6);
      cii $$9 = new cii($$3.dJ(), $$3.do(), $$3.dq(), $$3.du(), cpq.h);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.M = $$9.dz();
      $$9.N = $$9.dB();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
