public class gqj extends gou<cnk, gvz, gaa> {
   private static final ale b = ale.b("textures/entity/villager/villager.png");
   public static final grg.a a = new grg.a(-0.1171875F, -0.07421875F, 1.0F);

   public gqj(gno.a $$0) {
      super($$0, new gaa($$0.a(gap.cT)), 0.5F);
      this.a(new grg<>(this, $$0.f(), a, $$0.b()));
      this.a(new gsl<>(this, $$0.e(), "villager"));
      this.a(new grf<>(this, $$0.b()));
   }

   protected void a(gvz $$0, fdi $$1) {
      super.a($$0, $$1);
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   public ale a(gvz $$0) {
      return b;
   }

   protected float b(gvz $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gvz c() {
      return new gvz();
   }

   public void a(cnk $$0, gvz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gy();
   }
}
