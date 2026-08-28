public class gqc extends gpf<clv, gvy, fzx> {
   public static final alh a = alh.b("textures/entity/slime/slime.png");

   public gqc(gnz.a $$0) {
      super($$0, new fzx($$0.a(gba.cs)), 0.25F);
      this.a(new gsq(this, $$0.f()));
   }

   public void a(gvy $$0, fdt $$1, ghw $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gvy $$0, fdt $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public alh a(gvy $$0) {
      return a;
   }

   public gvy c() {
      return new gvy();
   }

   public void a(clv $$0, gvy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azj.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gw();
   }
}
