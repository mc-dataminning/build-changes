public class fzk extends fzl {
   protected final gaq a;

   public fzk(gaq $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gay a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      $$1.a("head", gav.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gas.a);
      return $$0;
   }

   public static gaw b() {
      gay $$0 = a();
      gba $$1 = $$0.a();
      $$1.b("head").a("hat", gav.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gau(0.25F)), gas.a);
      return gaw.a($$0, 64, 64);
   }

   public static gaw c() {
      gay $$0 = a();
      return gaw.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
