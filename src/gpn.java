public class gpn extends gny<cnc, gvd, fzl> {
   private static final alb b = alb.b("textures/entity/villager/villager.png");
   public static final gqk.a a = new gqk.a(-0.1171875F, -0.07421875F, 1.0F);

   public gpn(gms.a $$0) {
      super($$0, new fzl($$0.a(gaa.cS)), 0.5F);
      this.a(new gqk<>(this, $$0.f(), a, $$0.b()));
      this.a(new grp<>(this, $$0.e(), "villager"));
      this.a(new gqj<>(this, $$0.b()));
   }

   protected void a(gvd $$0, fcu $$1) {
      super.a($$0, $$1);
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   public alb a(gvd $$0) {
      return b;
   }

   protected float b(gvd $$0) {
      float $$1 = super.f($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gvd c() {
      return new gvd();
   }

   public void a(cnc $$0, gvd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gy();
   }
}
