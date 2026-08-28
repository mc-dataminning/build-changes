public class gdd extends gew {
   private static final String a = "bell_body";
   private final ghd b;

   public gdd(ghd $$0) {
      super($$0, goi::d);
      this.b = $$0.b("bell_body");
   }

   public static ghj a() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      ghn $$2 = $$1.a("bell_body", ghi.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), ghf.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", ghi.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), ghf.a(-8.0F, -12.0F, -8.0F));
      return ghj.a($$0, 32, 32);
   }

   public void a(dvj $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = azk.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
         if ($$0.c == jo.c) {
            $$3 = -$$5;
         } else if ($$0.c == jo.d) {
            $$3 = $$5;
         } else if ($$0.c == jo.f) {
            $$4 = -$$5;
         } else if ($$0.c == jo.e) {
            $$4 = $$5;
         }
      }

      this.b.e = $$3;
      this.b.g = $$4;
   }
}
