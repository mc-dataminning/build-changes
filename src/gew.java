public class gew extends gex {
   protected final ggc a;

   public gew(ggc $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static ggk a() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      $$1.a("head", ggh.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gge.a);
      return $$0;
   }

   public static ggi b() {
      ggk $$0 = a();
      ggm $$1 = $$0.a();
      $$1.b("head").a("hat", ggh.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ggg(0.25F)), gge.a);
      return ggi.a($$0, 64, 64);
   }

   public static ggi c() {
      ggk $$0 = a();
      return ggi.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
