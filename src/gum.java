public class gum extends gsw<cpj, hae, gdy> {
   private static final alz b = alz.b("textures/entity/villager/villager.png");
   public static final gvj.a a = new gvj.a(-0.1171875F, -0.07421875F, 1.0F);

   public gum(grq.a $$0) {
      super($$0, new gdy($$0.a(gen.do)), 0.5F);
      this.a(new gvj<>(this, $$0.f(), a, $$0.b()));
      this.a(new gwp<>(this, $$0.e(), "villager"));
      this.a(new gvi<>(this, $$0.b()));
   }

   protected void a(hae $$0, fgs $$1) {
      super.a($$0, $$1);
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   public alz a(hae $$0) {
      return b;
   }

   protected float b(hae $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public hae b() {
      return new hae();
   }

   public void a(cpj $$0, hae $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p() > 0;
      $$1.b = $$0.gy();
   }
}
