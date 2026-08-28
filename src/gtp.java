public class gtp extends gsp<ciq, gym, gdf> {
   private static final alz a = alz.b("textures/entity/snow_golem.png");

   public gtp(grj.a $$0) {
      super($$0, new gdf($$0.a(geg.cP)), 0.5F);
      this.a(new gwd(this, $$0.d(), $$0.b()));
   }

   @Override
   public alz b(gym $$0) {
      return a;
   }

   public gym b() {
      return new gym();
   }

   public void a(ciq $$0, gym $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.ao = $$0.p() ? new cxk(cxo.fy) : cxk.k;
      $$1.an = this.i.a($$1.ao, $$0, cxi.f);
   }
}
