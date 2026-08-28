public class fwg extends fxv {
   private static final String a = "bell_body";
   private final gab b;
   private final gab c;

   public fwg(gab $$0) {
      super(ghe::c);
      this.b = $$0;
      this.c = $$0.b("bell_body");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a("bell_body", gag.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), gad.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", gag.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), gad.a(-8.0F, -12.0F, -8.0F));
      return gah.a($$0, 32, 32);
   }

   public void a(drc $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = azc.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
         if ($$0.c == jj.c) {
            $$3 = -$$5;
         } else if ($$0.c == jj.d) {
            $$3 = $$5;
         } else if ($$0.c == jj.f) {
            $$4 = -$$5;
         } else if ($$0.c == jj.e) {
            $$4 = $$5;
         }
      }

      this.c.e = $$3;
      this.c.g = $$4;
   }

   @Override
   public gab a() {
      return this.b;
   }
}
