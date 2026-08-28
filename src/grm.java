public class grm extends grf<guf, fyf> {
   public static final alb a = alb.b("textures/entity/trident_riptide.png");
   private static final int b = 2;
   private final fxv c;
   private final gab[] d = new gab[2];

   public grm(goo<guf, fyf> $$0, fzx $$1) {
      super($$0);
      gab $$2 = $$1.a(gaa.bQ);
      this.c = new fxv.a($$2, ghe::f);

      for (int $$3 = 0; $$3 < 2; $$3++) {
         this.d[$$3] = $$2.b(a($$3));
      }
   }

   private static String a(int $$0) {
      return "box" + $$0;
   }

   public static gah a() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();

      for (int $$2 = 0; $$2 < 2; $$2++) {
         float $$3 = -3.2F + 9.6F * (float)($$2 + 1);
         float $$4 = 0.75F * (float)($$2 + 1);
         $$1.a(a($$2), gag.c().a(0, 0).a(-8.0F, -16.0F + $$3, -8.0F, 16.0F, 32.0F, 16.0F), gad.a.a($$4));
      }

      return gah.a($$0, 64, 64);
   }

   public void a(fcu $$0, ggv $$1, int $$2, guf $$3, float $$4, float $$5) {
      if ($$3.ag) {
         for (int $$6 = 0; $$6 < this.d.length; $$6++) {
            float $$7 = $$3.p * (float)(-(45 + ($$6 + 1) * 5));
            this.d[$$6].f = azc.g($$7) * (float) (Math.PI / 180.0);
         }

         fcy $$8 = $$1.getBuffer(this.c.a(a));
         this.c.a($$0, $$8, $$2, gwb.d);
      }
   }
}
