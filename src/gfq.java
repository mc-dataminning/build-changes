public class gfq extends ggj<cau, fmz<cau>> {
   private final fwm a;

   public gfq(gdt<cau, fmz<cau>> $$0, fwm $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(etd $$0, fwq $$1, int $$2, cau $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fo() == bor.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = awm.e($$3.dB()) / 60.0F;
      if ($$3.dB() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      cpq $$14 = $$10 ? $$3.eR() : $$3.eS();
      this.a.a($$3, $$14, cpn.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
