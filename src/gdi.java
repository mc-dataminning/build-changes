public class gdi extends gdj {
   protected final geo a;

   public gdi(geo $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gew a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      $$1.a("head", get.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), geq.a);
      return $$0;
   }

   public static geu b() {
      gew $$0 = a();
      gey $$1 = $$0.a();
      $$1.b("head").a("hat", get.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ges(0.25F)), geq.a);
      return geu.a($$0, 64, 64);
   }

   public static geu c() {
      gew $$0 = a();
      return geu.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
