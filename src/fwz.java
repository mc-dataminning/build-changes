public class fwz extends fxl<bwy, ffj<bwy>> {
   private final ffj<bwy> a;

   public fwz(fuy<bwy, ffj<bwy>> $$0, fht $$1) {
      super($$0);
      this.a = new ffj<>($$1.a(fhw.ak));
   }

   public void a(elj $$0, foa $$1, int $$2, bwy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cjl $$10 = $$3.s();
      if ($$10.d() instanceof cjb) {
         cjb $$11 = (cjb)$$10.d();
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$13;
         float $$14;
         float $$15;
         if ($$11 instanceof cic) {
            int $$12 = ((cic)$$11).e_($$10);
            $$13 = (float)($$12 >> 16 & 0xFF) / 255.0F;
            $$14 = (float)($$12 >> 8 & 0xFF) / 255.0F;
            $$15 = (float)($$12 & 0xFF) / 255.0F;
         } else {
            $$13 = 1.0F;
            $$14 = 1.0F;
            $$15 = 1.0F;
         }

         eln $$19 = $$1.getBuffer(foi.e($$11.h()));
         this.a.a($$0, $$19, $$2, fyr.d, $$13, $$14, $$15, 1.0F);
      }
   }
}
