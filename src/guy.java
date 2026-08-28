public class guy extends gqw<coi, hat, gem> {
   private static final aku b = aku.b("textures/entity/villager/villager.png");
   public static final gvv.a a = new gvv.a(-0.1171875F, -0.07421875F, 1.0F);

   public guy(gsc.a $$0) {
      super($$0, new gem($$0.a(gfb.dt)), new gem($$0.a(gfb.du)), 0.5F);
      this.a(new gvv<>(this, $$0.f(), a));
      this.a(new gxb<>(this, $$0.e(), "villager"));
      this.a(new gvu<>(this));
   }

   public aku a(hat $$0) {
      return b;
   }

   protected float b(hat $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hat b() {
      return new hat();
   }

   public void a(coi $$0, hat $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyx.a($$0, $$1, this.i);
      $$1.a = $$0.p() > 0;
      $$1.b = $$0.gz();
   }
}
