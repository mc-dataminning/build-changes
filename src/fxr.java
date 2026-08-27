public class fxr implements fxt<div> {
   public static final gje a = new gje(gha.e, new aiy("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fpj c;

   public fxr(fxu.a $$0) {
      fpj $$1 = $$0.a(fpi.l);
      this.c = $$1.b("bell_body");
   }

   public static fpp b() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      fps $$2 = $$1.a("bell_body", fpo.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fpl.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fpo.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fpl.a(-8.0F, -12.0F, -8.0F));
      return fpp.a($$0, 32, 32);
   }

   public void a(div $$0, float $$1, esh $$2, fvt $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = awi.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == ie.c) {
            $$7 = -$$9;
         } else if ($$0.c == ie.d) {
            $$7 = $$9;
         } else if ($$0.c == ie.f) {
            $$8 = -$$9;
         } else if ($$0.c == ie.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      esl $$10 = a.a($$3, fwb::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
