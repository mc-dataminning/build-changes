public abstract class ggk extends gic<hec> {
   private final glg a;
   private final glg b;

   public ggk(glg $$0) {
      super($$0);
      this.a = $$0.b("left_paddle");
      this.b = $$0.b("right_paddle");
   }

   public void a(hec $$0) {
      super.a($$0);
      a($$0.g, 0, this.a);
      a($$0.h, 1, this.b);
   }

   private static void a(float $$0, int $$1, glg $$2) {
      $$2.e = azq.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (azq.a(-$$0) + 1.0F) / 2.0F);
      $$2.f = azq.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (azq.a(-$$0 + 1.0F) + 1.0F) / 2.0F);
      if ($$1 == 1) {
         $$2.f = (float) Math.PI - $$2.f;
      }
   }
}
