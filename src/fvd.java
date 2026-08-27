public class fvd implements fvf<dgs> {
   public static final ggo a = new ggo(gek.e, new ahg("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fmv c;

   public fvd(fvg.a $$0) {
      fmv $$1 = $$0.a(fmu.k);
      this.c = $$1.b("bell_body");
   }

   public static fnb b() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      fne $$2 = $$1.a("bell_body", fna.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fmx.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fna.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fmx.a(-8.0F, -12.0F, -8.0F));
      return fnb.a($$0, 32, 32);
   }

   public void a(dgs $$0, float $$1, epz $$2, ftf $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = aun.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == ic.c) {
            $$7 = -$$9;
         } else if ($$0.c == ic.d) {
            $$7 = $$9;
         } else if ($$0.c == ic.f) {
            $$8 = -$$9;
         } else if ($$0.c == ic.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      eqd $$10 = a.a($$3, ftn::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
