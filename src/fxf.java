public class fxf extends fyu {
   private static final String a = "bell_body";
   private final gbb b;

   public fxf(gbb $$0) {
      super($$0, gig::c);
      this.b = $$0.b("bell_body");
   }

   public static gbh a() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      gbl $$2 = $$1.a("bell_body", gbg.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), gbd.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", gbg.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), gbd.a(-8.0F, -12.0F, -8.0F));
      return gbh.a($$0, 32, 32);
   }

   public void a(dse $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = azj.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
         if ($$0.c == jl.c) {
            $$3 = -$$5;
         } else if ($$0.c == jl.d) {
            $$3 = $$5;
         } else if ($$0.c == jl.f) {
            $$4 = -$$5;
         } else if ($$0.c == jl.e) {
            $$4 = $$5;
         }
      }

      this.b.e = $$3;
      this.b.g = $$4;
   }
}
