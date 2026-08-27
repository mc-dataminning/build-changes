public class fxd extends fxp<bws, ffo<bws>> {
   private final ffo<bws> a;

   public fxd(fvc<bws, ffo<bws>> $$0, fhy $$1) {
      super($$0);
      this.a = new ffo<>($$1.a(fib.ak));
   }

   public void a(elp $$0, foe $$1, int $$2, bws $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cjf $$10 = $$3.s();
      if ($$10.d() instanceof civ) {
         civ $$11 = (civ)$$10.d();
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$13;
         float $$14;
         float $$15;
         if ($$11 instanceof chw) {
            int $$12 = ((chw)$$11).e_($$10);
            $$13 = (float)($$12 >> 16 & 0xFF) / 255.0F;
            $$14 = (float)($$12 >> 8 & 0xFF) / 255.0F;
            $$15 = (float)($$12 & 0xFF) / 255.0F;
         } else {
            $$13 = 1.0F;
            $$14 = 1.0F;
            $$15 = 1.0F;
         }

         elt $$19 = $$1.getBuffer(fom.e($$11.h()));
         this.a.a($$0, $$19, $$2, fyv.d, $$13, $$14, $$15, 1.0F);
      }
   }
}
