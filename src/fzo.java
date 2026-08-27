public class fzo implements fzq<dke> {
   public static final glc a = new glc(giy.e, new ajh("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final frd c;

   public fzo(fzr.a $$0) {
      frd $$1 = $$0.a(frc.l);
      this.c = $$1.b("bell_body");
   }

   public static frj b() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      frm $$2 = $$1.a("bell_body", fri.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), frf.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fri.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), frf.a(-8.0F, -12.0F, -8.0F));
      return frj.a($$0, 32, 32);
   }

   public void a(dke $$0, float $$1, etz $$2, fxq $$3, int $$4, int $$5) {
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
      eud $$10 = a.a($$3, fxy::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
