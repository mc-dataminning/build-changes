public class grs extends gtl<cll, gye, gbu> {
   private static final akv a = akv.b("textures/entity/creeper/creeper.png");

   public grs(gsf.a $$0) {
      super($$0, new gbu($$0.a(gfd.ai)), 0.5F);
      this.a(new gvw(this, $$0.f()));
   }

   protected void a(gye $$0, ffv $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + ayz.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = ayz.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(gye $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : ayz.a($$1, 0.5F, 1.0F);
   }

   public akv b(gye $$0) {
      return a;
   }

   public gye a() {
      return new gye();
   }

   public void a(cll $$0, gye $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.p();
   }
}
