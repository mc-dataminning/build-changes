public class gvb extends gtj<coo, hau, gem> {
   private static final akv a = akv.b("textures/entity/wandering_trader.png");

   public gvb(gsd.a $$0) {
      super($$0, new gem($$0.a(gfb.dw)), 0.5F);
      this.a(new gvw<>(this, $$0.f()));
      this.a(new gvv<>(this));
   }

   public akv a(hau $$0) {
      return a;
   }

   public hau b() {
      return new hau();
   }

   public void a(coo $$0, hau $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyy.a($$0, $$1, this.i);
      $$1.a = $$0.p() > 0;
   }
}
