public class gen extends ggm {
   private final giu a;

   public gen(giu $$0) {
      super($$0, gqc::d);
      this.a = $$0.b("flag");
   }

   public static gja a(boolean $$0) {
      gjc $$1 = new gjc();
      gje $$2 = $$1.a();
      $$2.a("flag", giz.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), giw.a(0.0F, $$0 ? -44.0F : -20.5F, $$0 ? 0.0F : 10.5F));
      return gja.a($$1, 64, 64);
   }

   public void a(float $$0) {
      this.a.e = (-0.0125F + 0.01F * azm.b((float) (Math.PI * 2) * $$0)) * (float) Math.PI;
   }
}
