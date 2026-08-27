public class fxb extends fxf<buy, ffs<buy>> {
   private final fnq a;

   public fxb(fus<buy, ffs<buy>> $$0, fnq $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(elf $$0, fnu $$1, int $$2, buy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cix $$10 = $$3.c(bin.a);
      if ($$3.t() && !$$3.gs()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gg()) {
            $$11 -= 0.2F * arp.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * arp.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, ciu.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
