public class guh extends gqf<cpa, gzz, gdt> {
   private static final alp b = alp.b("textures/entity/villager/villager.png");
   public static final gve.a a = new gve.a(-0.1171875F, -0.07421875F, 1.0F);

   public guh(grl.a $$0) {
      super($$0, new gdt($$0.a(gei.dt)), new gdt($$0.a(gei.du)), 0.5F);
      this.a(new gve<>(this, $$0.f(), a, $$0.b()));
      this.a(new gwk<>(this, $$0.e(), "villager"));
      this.a(new gvd<>(this, $$0.b()));
   }

   public alp a(gzz $$0) {
      return b;
   }

   protected float b(gzz $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gzz b() {
      return new gzz();
   }

   public void a(cpa $$0, gzz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p() > 0;
      $$1.b = $$0.gy();
   }
}
