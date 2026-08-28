public class gdd extends gde {
   protected final gej a;

   public gdd(gej $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static ger a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a("head", geo.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gel.a);
      return $$0;
   }

   public static gep b() {
      ger $$0 = a();
      get $$1 = $$0.a();
      $$1.b("head").a("hat", geo.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gen(0.25F)), gel.a);
      return gep.a($$0, 64, 64);
   }

   public static gep c() {
      ger $$0 = a();
      return gep.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
