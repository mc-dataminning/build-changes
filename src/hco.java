public class hco extends hcj<hgb, gjm> {
   private final gjm a;

   public hco(gzs<hgb, gjm> $$0, gkn $$1) {
      super($$0);
      this.a = new gjm($$1.a(gkq.dh));
   }

   public void a(fld $$0, grn $$1, int $$2, hgb $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ar && $$3.A;
      if (!$$3.A || $$6) {
         flg $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gry.s(gzz.a));
         } else {
            $$7 = $$1.getBuffer(gry.j(gzz.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gyw.a($$3, 0.0F));
      }
   }
}
