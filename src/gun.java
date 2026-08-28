public class gun extends gsv<cpo, had, gdx> {
   private static final alz a = alz.b("textures/entity/wandering_trader.png");

   public gun(grp.a $$0) {
      super($$0, new gdx($$0.a(gem.dq)), 0.5F);
      this.a(new gvi<>(this, $$0.f(), $$0.b()));
      this.a(new gvh<>(this, $$0.b()));
   }

   public alz a(had $$0) {
      return a;
   }

   public had b() {
      return new had();
   }

   public void a(cpo $$0, had $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p() > 0;
   }
}
