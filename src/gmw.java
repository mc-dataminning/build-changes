public class gmw extends gop<ckm, gte, fxc> {
   private static final alc a = alc.b("textures/entity/creeper/creeper.png");

   public gmw(gnj.a $$0) {
      super($$0, new fxc($$0.a(gak.W)), 0.5F);
      this.a(new gqz(this, $$0.f()));
   }

   protected void a(gte $$0, fde $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azd.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azd.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gte $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azd.a($$1, 0.5F, 1.0F);
   }

   public alc b(gte $$0) {
      return a;
   }

   public gte a() {
      return new gte();
   }

   public void a(ckm $$0, gte $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.t();
   }
}
