public class gak extends gca {
   private static final String a = "bell_body";
   private final geh b;

   public gak(geh $$0) {
      super($$0, glo::c);
      this.b = $$0.b("bell_body");
   }

   public static gen a() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      ger $$2 = $$1.a("bell_body", gem.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), gej.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", gem.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), gej.a(-8.0F, -12.0F, -8.0F));
      return gen.a($$0, 32, 32);
   }

   public void a(dun $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = bae.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
         if ($$0.c == jm.c) {
            $$3 = -$$5;
         } else if ($$0.c == jm.d) {
            $$3 = $$5;
         } else if ($$0.c == jm.f) {
            $$4 = -$$5;
         } else if ($$0.c == jm.e) {
            $$4 = $$5;
         }
      }

      this.b.e = $$3;
      this.b.g = $$4;
   }
}
