public class grc extends gsv<cmi, gxn, gbd> {
   private static final alz a = alz.b("textures/entity/creeper/creeper.png");

   public grc(grp.a $$0) {
      super($$0, new gbd($$0.a(gem.af)), 0.5F);
      this.a(new gvg(this, $$0.f()));
   }

   protected void a(gxn $$0, fgr $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + bae.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = bae.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gxn $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : bae.a($$1, 0.5F, 1.0F);
   }

   public alz b(gxn $$0) {
      return a;
   }

   public gxn a() {
      return new gxn();
   }

   public void a(cmi $$0, gxn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.p();
   }
}
