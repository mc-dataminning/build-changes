public class ggw extends giw {
   private final gle a;

   public ggw(gle $$0) {
      super($$0, gsl::d);
      this.a = $$0.b("flag");
   }

   public static glk a(boolean $$0) {
      glm $$1 = new glm();
      glo $$2 = $$1.a();
      $$2.a("flag", glj.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), glg.a(0.0F, $$0 ? -44.0F : -20.5F, $$0 ? 0.0F : 10.5F));
      return glk.a($$1, 64, 64);
   }

   public void a(float $$0) {
      this.a.e = (-0.0125F + 0.01F * azo.b((float) (Math.PI * 2) * $$0)) * (float) Math.PI;
   }
}
