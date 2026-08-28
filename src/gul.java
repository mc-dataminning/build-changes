public class gul extends gsv<cpi, had, gdx> {
   private static final alz b = alz.b("textures/entity/villager/villager.png");
   public static final gvi.a a = new gvi.a(-0.1171875F, -0.07421875F, 1.0F);

   public gul(grp.a $$0) {
      super($$0, new gdx($$0.a(gem.do)), 0.5F);
      this.a(new gvi<>(this, $$0.f(), a, $$0.b()));
      this.a(new gwo<>(this, $$0.e(), "villager"));
      this.a(new gvh<>(this, $$0.b()));
   }

   protected void a(had $$0, fgr $$1) {
      super.a($$0, $$1);
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   public alz a(had $$0) {
      return b;
   }

   protected float b(had $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public had b() {
      return new had();
   }

   public void a(cpi $$0, had $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p() > 0;
      $$1.b = $$0.gy();
   }
}
