public class grb extends gsu<cmi, gxm, gbc> {
   private static final alz a = alz.b("textures/entity/creeper/creeper.png");

   public grb(gro.a $$0) {
      super($$0, new gbc($$0.a(gel.af)), 0.5F);
      this.a(new gvf(this, $$0.f()));
   }

   protected void a(gxm $$0, fgq $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + bae.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = bae.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gxm $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : bae.a($$1, 0.5F, 1.0F);
   }

   public alz b(gxm $$0) {
      return a;
   }

   public gxm a() {
      return new gxm();
   }

   public void a(cmi $$0, gxm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.p();
   }
}
