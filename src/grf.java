public class grf extends gpq<cny, gww, gaw> {
   private static final ali b = ali.b("textures/entity/villager/villager.png");
   public static final gsc.a a = new gsc.a(-0.1171875F, -0.07421875F, 1.0F);

   public grf(gok.a $$0) {
      super($$0, new gaw($$0.a(gbl.cT)), 0.5F);
      this.a(new gsc<>(this, $$0.f(), a, $$0.b()));
      this.a(new gth<>(this, $$0.e(), "villager"));
      this.a(new gsb<>(this, $$0.b()));
   }

   protected void a(gww $$0, feb $$1) {
      super.a($$0, $$1);
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   public ali a(gww $$0) {
      return b;
   }

   protected float b(gww $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gww c() {
      return new gww();
   }

   public void a(cny $$0, gww $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gE();
   }
}
