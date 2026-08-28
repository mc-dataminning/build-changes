public class ggo extends gij {
   private static final String a = "bell_body";
   private final gkr b;

   public ggo(gkr $$0) {
      super($$0, gry::d);
      this.b = $$0.b("bell_body");
   }

   public static gkx a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      glb $$2 = $$1.a("bell_body", gkw.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), gkt.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", gkw.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), gkt.a(-8.0F, -12.0F, -8.0F));
      return gkx.a($$0, 32, 32);
   }

   public void a(dym $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = azz.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
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
