public class gpc extends gny<cli, gut, fzd> {
   private static final alb a = alb.b("textures/entity/strider/strider.png");
   private static final alb b = alb.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gpc(gms.a $$0) {
      super($$0, new fzd($$0.a(gaa.cE)), 0.5F);
      this.a(new grg<>(this, new fzd($$0.a(gaa.cF)), alb.b("textures/entity/strider/strider_saddle.png")));
   }

   public alb a(gut $$0) {
      return $$0.b ? b : a;
   }

   protected float b(gut $$0) {
      float $$1 = super.f($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gut c() {
      return new gut();
   }

   public void a(cli $$0, gut $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
      $$1.b = $$0.q();
      $$1.c = $$0.bX();
   }

   protected void a(gut $$0, fcu $$1) {
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   protected boolean c(gut $$0) {
      return super.a($$0) || $$0.b;
   }
}
