public class guz extends gqx<coh, hau, gem> {
   private static final akv b = akv.b("textures/entity/villager/villager.png");
   public static final gvw.a a = new gvw.a(-0.1171875F, -0.07421875F, 1.0F);

   public guz(gsd.a $$0) {
      super($$0, new gem($$0.a(gfb.dt)), new gem($$0.a(gfb.du)), 0.5F);
      this.a(new gvw<>(this, $$0.f(), a));
      this.a(new gxc<>(this, $$0.e(), "villager"));
      this.a(new gvv<>(this));
   }

   public akv a(hau $$0) {
      return b;
   }

   protected float b(hau $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hau b() {
      return new hau();
   }

   public void a(coh $$0, hau $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyy.a($$0, $$1, this.i);
      $$1.a = $$0.p() > 0;
      $$1.b = $$0.gC();
   }
}
