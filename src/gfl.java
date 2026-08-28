public class gfl extends ghl {
   private final gjt a;

   public gfl(gjt $$0) {
      super($$0, grc::d);
      this.a = $$0.b("flag");
   }

   public static gjz a(boolean $$0) {
      gkb $$1 = new gkb();
      gkd $$2 = $$1.a();
      $$2.a("flag", gjy.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), gjv.a(0.0F, $$0 ? -44.0F : -20.5F, $$0 ? 0.0F : 10.5F));
      return gjz.a($$1, 64, 64);
   }

   public void a(float $$0) {
      this.a.e = (-0.0125F + 0.01F * azm.b((float) (Math.PI * 2) * $$0)) * (float) Math.PI;
   }
}
