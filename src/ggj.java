public class ggj extends gij {
   private final gkr a;

   public ggj(gkr $$0) {
      super($$0, gry::d);
      this.a = $$0.b("flag");
   }

   public static gkx a(boolean $$0) {
      gkz $$1 = new gkz();
      glb $$2 = $$1.a();
      $$2.a("flag", gkw.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), gkt.a(0.0F, $$0 ? -44.0F : -20.5F, $$0 ? 0.0F : 10.5F));
      return gkx.a($$1, 64, 64);
   }

   public void a(float $$0) {
      this.a.e = (-0.0125F + 0.01F * azz.b((float) (Math.PI * 2) * $$0)) * (float) Math.PI;
   }
}
