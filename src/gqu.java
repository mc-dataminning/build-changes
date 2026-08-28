public class gqu extends gpf<cnt, gwl, gal> {
   private static final alh b = alh.b("textures/entity/villager/villager.png");
   public static final grr.a a = new grr.a(-0.1171875F, -0.07421875F, 1.0F);

   public gqu(gnz.a $$0) {
      super($$0, new gal($$0.a(gba.cT)), 0.5F);
      this.a(new grr<>(this, $$0.f(), a, $$0.b()));
      this.a(new gsw<>(this, $$0.e(), "villager"));
      this.a(new grq<>(this, $$0.b()));
   }

   protected void a(gwl $$0, fdt $$1) {
      super.a($$0, $$1);
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   public alh a(gwl $$0) {
      return b;
   }

   protected float b(gwl $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gwl c() {
      return new gwl();
   }

   public void a(cnt $$0, gwl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gF();
   }
}
