public class fvr implements fvt<dhb> {
   public static final ghe a = new ghe(gfa.e, new ahh("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fnj c;

   public fvr(fvu.a $$0) {
      fnj $$1 = $$0.a(fni.l);
      this.c = $$1.b("bell_body");
   }

   public static fnp b() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      fns $$2 = $$1.a("bell_body", fno.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fnl.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fno.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fnl.a(-8.0F, -12.0F, -8.0F));
      return fnp.a($$0, 32, 32);
   }

   public void a(dhb $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = aup.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
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
      eqo $$10 = a.a($$3, fub::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
