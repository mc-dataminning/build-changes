public class gdy extends gdz {
   protected final gfe a;

   public gdy(gfe $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gfm a() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      $$1.a("head", gfj.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gfg.a);
      return $$0;
   }

   public static gfk b() {
      gfm $$0 = a();
      gfo $$1 = $$0.a();
      $$1.b("head").a("hat", gfj.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gfi(0.25F)), gfg.a);
      return gfk.a($$0, 64, 64);
   }

   public static gfk c() {
      gfm $$0 = a();
      return gfk.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
