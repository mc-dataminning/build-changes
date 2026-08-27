public class fwm extends fxf<bur, feo<bur>> {
   private final fnq a;

   public fwm(fus<bur, feo<bur>> $$0, fnq $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(elf $$0, fnu $$1, int $$2, bur $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fk() == bis.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = arp.e($$3.dC()) / 60.0F;
      if ($$3.dC() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      cix $$14 = $$10 ? $$3.eR() : $$3.eS();
      this.a.a($$3, $$14, ciu.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
