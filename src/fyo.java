public class fyo implements fyq<djj> {
   public static final gkc a = new gkc(ghy.e, new ajc("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fqf c;

   public fyo(fyr.a $$0) {
      fqf $$1 = $$0.a(fqe.l);
      this.c = $$1.b("bell_body");
   }

   public static fql b() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      fqo $$2 = $$1.a("bell_body", fqk.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fqh.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fqk.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fqh.a(-8.0F, -12.0F, -8.0F));
      return fql.a($$0, 32, 32);
   }

   public void a(djj $$0, float $$1, etd $$2, fwq $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = awm.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == ih.c) {
            $$7 = -$$9;
         } else if ($$0.c == ih.d) {
            $$7 = $$9;
         } else if ($$0.c == ih.f) {
            $$8 = -$$9;
         } else if ($$0.c == ih.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      eth $$10 = a.a($$3, fwy::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
