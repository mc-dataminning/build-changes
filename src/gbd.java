public class gbd extends gct {
   private static final String a = "bell_body";
   private final gfa b;

   public gbd(gfa $$0) {
      super($$0, gmf::d);
      this.b = $$0.b("bell_body");
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      gfk $$2 = $$1.a("bell_body", gff.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), gfc.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", gff.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), gfc.a(-8.0F, -12.0F, -8.0F));
      return gfg.a($$0, 32, 32);
   }

   public void a(dtv $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = ayy.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
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
