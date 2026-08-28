public class gfv implements gfx<dpl> {
   public static final grm a = new grm(gph.e, new akk("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fxi c;

   public gfv(gfy.a $$0) {
      fxi $$1 = $$0.a(fxh.l);
      this.c = $$1.b("bell_body");
   }

   public static fxo b() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      fxr $$2 = $$1.a("bell_body", fxn.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fxk.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fxn.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fxk.a(-8.0F, -12.0F, -8.0F));
      return fxo.a($$0, 32, 32);
   }

   public void a(dpl $$0, float $$1, fag $$2, gdx $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = aye.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == jf.c) {
            $$7 = -$$9;
         } else if ($$0.c == jf.d) {
            $$7 = $$9;
         } else if ($$0.c == jf.f) {
            $$8 = -$$9;
         } else if ($$0.c == jf.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      fak $$10 = a.a($$3, gef::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
