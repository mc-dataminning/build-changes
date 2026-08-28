public class guf extends gth<cmf, hae, gdw> {
   public static final aku a = aku.b("textures/entity/slime/slime.png");

   public guf(gsb.a $$0) {
      super($$0, new gdw($$0.a(gez.cO)), 0.25F);
      this.a(new gwu(this, $$0.f()));
   }

   protected float a(hae $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hae $$0, ffs $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public aku b(hae $$0) {
      return a;
   }

   public hae b() {
      return new hae();
   }

   public void a(cmf $$0, hae $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayy.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gp();
   }
}
