public class fwt extends fxf<bwk, ffe<bwk>> {
   private final ffe<bwk> a;

   public fwt(fus<bwk, ffe<bwk>> $$0, fho $$1) {
      super($$0);
      this.a = new ffe<>($$1.a(fhr.ak));
   }

   public void a(elf $$0, fnu $$1, int $$2, bwk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cix $$10 = $$3.p();
      if ($$10.d() instanceof cin) {
         cin $$11 = (cin)$$10.d();
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$13;
         float $$14;
         float $$15;
         if ($$11 instanceof cho) {
            int $$12 = ((cho)$$11).e_($$10);
            $$13 = (float)($$12 >> 16 & 0xFF) / 255.0F;
            $$14 = (float)($$12 >> 8 & 0xFF) / 255.0F;
            $$15 = (float)($$12 & 0xFF) / 255.0F;
         } else {
            $$13 = 1.0F;
            $$14 = 1.0F;
            $$15 = 1.0F;
         }

         elj $$19 = $$1.getBuffer(foc.e($$11.h()));
         this.a.a($$0, $$19, $$2, fyl.d, $$13, $$14, $$15, 1.0F);
      }
   }
}
