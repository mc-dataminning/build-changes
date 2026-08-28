public class gbg extends gcw {
   private static final String a = "bell_body";
   private final gfd b;

   public gbg(gfd $$0) {
      super($$0, gmi::d);
      this.b = $$0.b("bell_body");
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      gfn $$2 = $$1.a("bell_body", gfi.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), gff.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", gfi.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), gff.a(-8.0F, -12.0F, -8.0F));
      return gfj.a($$0, 32, 32);
   }

   public void a(dtx $$0, float $$1) {
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
