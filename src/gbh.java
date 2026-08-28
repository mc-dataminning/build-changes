public class gbh extends gcx {
   private static final String a = "bell_body";
   private final gfe b;

   public gbh(gfe $$0) {
      super($$0, gmj::d);
      this.b = $$0.b("bell_body");
   }

   public static gfk a() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      gfo $$2 = $$1.a("bell_body", gfj.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), gfg.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", gfj.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), gfg.a(-8.0F, -12.0F, -8.0F));
      return gfk.a($$0, 32, 32);
   }

   public void a(dty $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = ayz.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
         if ($$0.c == jn.c) {
            $$3 = -$$5;
         } else if ($$0.c == jn.d) {
            $$3 = $$5;
         } else if ($$0.c == jn.f) {
            $$4 = -$$5;
         } else if ($$0.c == jn.e) {
            $$4 = $$5;
         }
      }

      this.b.e = $$3;
      this.b.g = $$4;
   }
}
