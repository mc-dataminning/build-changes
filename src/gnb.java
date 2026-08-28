public class gnb extends gou<ckp, gtj, fxg> {
   private static final ale a = ale.b("textures/entity/creeper/creeper.png");

   public gnb(gno.a $$0) {
      super($$0, new fxg($$0.a(gap.W)), 0.5F);
      this.a(new gre(this, $$0.f()));
   }

   protected void a(gtj $$0, fdi $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azf.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azf.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gtj $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azf.a($$1, 0.5F, 1.0F);
   }

   public ale b(gtj $$0) {
      return a;
   }

   public gtj a() {
      return new gtj();
   }

   public void a(ckp $$0, gtj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.t();
   }
}
