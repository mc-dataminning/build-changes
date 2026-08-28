public class gqw extends gsp<cme, gxh, gax> {
   private static final alz a = alz.b("textures/entity/creeper/creeper.png");

   public gqw(grj.a $$0) {
      super($$0, new gax($$0.a(geg.af)), 0.5F);
      this.a(new gva(this, $$0.f()));
   }

   protected void a(gxh $$0, fgl $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + bae.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = bae.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gxh $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : bae.a($$1, 0.5F, 1.0F);
   }

   public alz b(gxh $$0) {
      return a;
   }

   public gxh a() {
      return new gxh();
   }

   public void a(cme $$0, gxh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.p();
   }
}
