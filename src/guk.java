public class guk extends gsu<cpi, hac, gdw> {
   private static final alz b = alz.b("textures/entity/villager/villager.png");
   public static final gvh.a a = new gvh.a(-0.1171875F, -0.07421875F, 1.0F);

   public guk(gro.a $$0) {
      super($$0, new gdw($$0.a(gel.do)), 0.5F);
      this.a(new gvh<>(this, $$0.f(), a, $$0.b()));
      this.a(new gwn<>(this, $$0.e(), "villager"));
      this.a(new gvg<>(this, $$0.b()));
   }

   protected void a(hac $$0, fgq $$1) {
      super.a($$0, $$1);
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   public alz a(hac $$0) {
      return b;
   }

   protected float b(hac $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public hac b() {
      return new hac();
   }

   public void a(cpi $$0, hac $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p() > 0;
      $$1.b = $$0.gw();
   }
}
