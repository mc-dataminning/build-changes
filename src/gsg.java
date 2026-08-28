public class gsg extends gqq<cof, gxx, gbv> {
   private static final alj b = alj.b("textures/entity/villager/villager.png");
   public static final gtd.a a = new gtd.a(-0.1171875F, -0.07421875F, 1.0F);

   public gsg(gpk.a $$0) {
      super($$0, new gbv($$0.a(gck.dl)), 0.5F);
      this.a(new gtd<>(this, $$0.f(), a, $$0.b()));
      this.a(new gui<>(this, $$0.e(), "villager"));
      this.a(new gtc<>(this, $$0.b()));
   }

   protected void a(gxx $$0, fer $$1) {
      super.a($$0, $$1);
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   public alj a(gxx $$0) {
      return b;
   }

   protected float b(gxx $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gxx b() {
      return new gxx();
   }

   public void a(cof $$0, gxx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.n() > 0;
      $$1.b = $$0.gx();
   }
}
