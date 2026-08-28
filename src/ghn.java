public class ghn extends gho {
   protected final giu a;

   public ghn(giu $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gjc a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      $$1.a("head", giz.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), giw.a);
      return $$0;
   }

   public static gja b() {
      gjc $$0 = a();
      gje $$1 = $$0.a();
      $$1.b("head").a("hat", giz.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new giy(0.25F)), giw.a);
      return gja.a($$0, 64, 64);
   }

   public static gja c() {
      gjc $$0 = a();
      return gja.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
