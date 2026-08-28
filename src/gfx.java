public class gfx extends gfy {
   protected final ghd a;

   public gfx(ghd $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static ghl a() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      $$1.a("head", ghi.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), ghf.a);
      return $$0;
   }

   public static ghj b() {
      ghl $$0 = a();
      ghn $$1 = $$0.a();
      $$1.b("head").a("hat", ghi.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ghh(0.25F)), ghf.a);
      return ghj.a($$0, 64, 64);
   }

   public static ghj c() {
      ghl $$0 = a();
      return ghj.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
