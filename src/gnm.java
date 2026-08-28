public class gnm extends gpf<cky, gtv, fxr> {
   private static final alh a = alh.b("textures/entity/creeper/creeper.png");

   public gnm(gnz.a $$0) {
      super($$0, new fxr($$0.a(gba.W)), 0.5F);
      this.a(new grp(this, $$0.f()));
   }

   protected void a(gtv $$0, fdt $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azj.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azj.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gtv $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azj.a($$1, 0.5F, 1.0F);
   }

   public alh b(gtv $$0) {
      return a;
   }

   public gtv a() {
      return new gtv();
   }

   public void a(cky $$0, gtv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.t();
   }
}
