public class fwf extends fwr<bwj, fev<bwj>> {
   private final fev<bwj> a;

   public fwf(fue<bwj, fev<bwj>> $$0, fhf $$1) {
      super($$0);
      this.a = new fev<>($$1.a(fhi.ak));
   }

   public void a(elh $$0, fng $$1, int $$2, bwj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ciw $$10 = $$3.p();
      if ($$10.d() instanceof cim) {
         cim $$11 = (cim)$$10.d();
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$13;
         float $$14;
         float $$15;
         if ($$11 instanceof chn) {
            int $$12 = ((chn)$$11).e_($$10);
            $$13 = (float)($$12 >> 16 & 0xFF) / 255.0F;
            $$14 = (float)($$12 >> 8 & 0xFF) / 255.0F;
            $$15 = (float)($$12 & 0xFF) / 255.0F;
         } else {
            $$13 = 1.0F;
            $$14 = 1.0F;
            $$15 = 1.0F;
         }

         ell $$19 = $$1.getBuffer(fno.d($$11.h()));
         this.a.a($$0, $$19, $$2, fxx.d, $$13, $$14, $$15, 1.0F);
      }
   }
}
