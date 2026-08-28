public class gdh extends gdi {
   protected final gen a;

   public gdh(gen $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gev a() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("head", ges.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gep.a);
      return $$0;
   }

   public static get b() {
      gev $$0 = a();
      gex $$1 = $$0.a();
      $$1.b("head").a("hat", ges.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ger(0.25F)), gep.a);
      return get.a($$0, 64, 64);
   }

   public static get c() {
      gev $$0 = a();
      return get.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
