public class gdg extends gdh {
   protected final gem a;

   public gdg(gem $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static geu a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      $$1.a("head", ger.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), geo.a);
      return $$0;
   }

   public static ges b() {
      geu $$0 = a();
      gew $$1 = $$0.a();
      $$1.b("head").a("hat", ger.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new geq(0.25F)), geo.a);
      return ges.a($$0, 64, 64);
   }

   public static ges c() {
      geu $$0 = a();
      return ges.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
