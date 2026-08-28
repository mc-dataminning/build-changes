public class ghd extends giy {
   private static final String a = "bell_body";
   private final glg b;

   public ghd(glg $$0) {
      super($$0, gsn::d);
      this.b = $$0.b("bell_body");
   }

   public static glm a() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      glq $$2 = $$1.a("bell_body", gll.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), gli.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", gll.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), gli.a(-8.0F, -12.0F, -8.0F));
      return glm.a($$0, 32, 32);
   }

   public void a(dyc $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = azq.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
         if ($$0.c == jc.c) {
            $$3 = -$$5;
         } else if ($$0.c == jc.d) {
            $$3 = $$5;
         } else if ($$0.c == jc.f) {
            $$4 = -$$5;
         } else if ($$0.c == jc.e) {
            $$4 = $$5;
         }
      }

      this.b.e = $$3;
      this.b.g = $$4;
   }
}
