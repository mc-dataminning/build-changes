public class gxi extends gzb<cow, hdv, ghf> {
   private static final alr a = alr.b("textures/entity/creeper/creeper.png");

   public gxi(gxv.a $$0) {
      super($$0, new ghf($$0.a(gkq.aq)), 0.5F);
      this.a(new hbm(this, $$0.f()));
   }

   protected void a(hdv $$0, fld $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azz.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azz.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(hdv $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azz.a($$1, 0.5F, 1.0F);
   }

   public alr b(hdv $$0) {
      return a;
   }

   public hdv a() {
      return new hdv();
   }

   public void a(cow $$0, hdv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.p();
   }
}
