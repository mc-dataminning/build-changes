public class ghb extends giw {
   private static final String a = "bell_body";
   private final gle b;

   public ghb(gle $$0) {
      super($$0, gsl::d);
      this.b = $$0.b("bell_body");
   }

   public static glk a() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      glo $$2 = $$1.a("bell_body", glj.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), glg.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", glj.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), glg.a(-8.0F, -12.0F, -8.0F));
      return glk.a($$0, 32, 32);
   }

   public void a(dya $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = azo.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
         if ($$0.c == jb.c) {
            $$3 = -$$5;
         } else if ($$0.c == jb.d) {
            $$3 = $$5;
         } else if ($$0.c == jb.f) {
            $$4 = -$$5;
         } else if ($$0.c == jb.e) {
            $$4 = $$5;
         }
      }

      this.b.e = $$3;
      this.b.g = $$4;
   }
}
