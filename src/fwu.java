public class fwu extends fyj {
   private static final String a = "bell_body";
   private final gaq b;

   public fwu(gaq $$0) {
      super($$0, ghv::c);
      this.b = $$0.b("bell_body");
   }

   public static gaw a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      gba $$2 = $$1.a("bell_body", gav.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), gas.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", gav.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), gas.a(-8.0F, -12.0F, -8.0F));
      return gaw.a($$0, 32, 32);
   }

   public void a(drt $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = azf.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
         if ($$0.c == jk.c) {
            $$3 = -$$5;
         } else if ($$0.c == jk.d) {
            $$3 = $$5;
         } else if ($$0.c == jk.f) {
            $$4 = -$$5;
         } else if ($$0.c == jk.e) {
            $$4 = $$5;
         }
      }

      this.b.e = $$3;
      this.b.g = $$4;
   }
}
