public class gxv extends gzo<cok, hei, ghs> {
   private static final ali a = ali.b("textures/entity/creeper/creeper.png");

   public gxv(gyi.a $$0) {
      super($$0, new ghs($$0.a(gld.aq)), 0.5F);
      this.a(new hbz(this, $$0.f()));
   }

   protected void a(hei $$0, flo $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azo.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azo.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(hei $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azo.a($$1, 0.5F, 1.0F);
   }

   public ali b(hei $$0) {
      return a;
   }

   public hei a() {
      return new hei();
   }

   public void a(cok $$0, hei $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.m();
   }
}
