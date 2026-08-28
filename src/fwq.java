public class fwq extends fyf {
   private static final String a = "bell_body";
   private final gal b;
   private final gal c;

   public fwq(gal $$0) {
      super(ghq::c);
      this.b = $$0;
      this.c = $$0.b("bell_body");
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("bell_body", gaq.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), gan.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", gaq.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), gan.a(-8.0F, -12.0F, -8.0F));
      return gar.a($$0, 32, 32);
   }

   public void a(drq $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = azd.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
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
   public gal a() {
      return this.b;
   }
}
