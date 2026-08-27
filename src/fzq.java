public class fzq implements fzs<dkg> {
   public static final glf a = new glf(gjb.e, new ajh("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final frf c;

   public fzq(fzt.a $$0) {
      frf $$1 = $$0.a(fre.l);
      this.c = $$1.b("bell_body");
   }

   public static frl b() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      fro $$2 = $$1.a("bell_body", frk.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), frh.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", frk.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), frh.a(-8.0F, -12.0F, -8.0F));
      return frl.a($$0, 32, 32);
   }

   public void a(dkg $$0, float $$1, eub $$2, fxs $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = aww.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
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
      euf $$10 = a.a($$3, fya::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
