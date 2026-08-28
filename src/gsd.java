public class gsd extends grw<guw, fyp> {
   public static final alc a = alc.b("textures/entity/trident_riptide.png");
   private static final int b = 2;
   private final fyf c;
   private final gal[] d = new gal[2];

   public gsd(gpf<guw, fyp> $$0, gah $$1) {
      super($$0);
      gal $$2 = $$1.a(gak.bR);
      this.c = new fyf.a($$2, ghq::f);

      for (int $$3 = 0; $$3 < 2; $$3++) {
         this.d[$$3] = $$2.b(a($$3));
      }
   }

   private static String a(int $$0) {
      return "box" + $$0;
   }

   public static gar a() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();

      for (int $$2 = 0; $$2 < 2; $$2++) {
         float $$3 = -3.2F + 9.6F * (float)($$2 + 1);
         float $$4 = 0.75F * (float)($$2 + 1);
         $$1.a(a($$2), gaq.c().a(0, 0).a(-8.0F, -16.0F + $$3, -8.0F, 16.0F, 32.0F, 16.0F), gan.a.a($$4));
      }

      return gar.a($$0, 64, 64);
   }

   public void a(fde $$0, ghg $$1, int $$2, guw $$3, float $$4, float $$5) {
      if ($$3.ag) {
         for (int $$6 = 0; $$6 < this.d.length; $$6++) {
            float $$7 = $$3.p * (float)(-(45 + ($$6 + 1) * 5));
            this.d[$$6].f = azd.g($$7) * (float) (Math.PI / 180.0);
         }

         fdi $$8 = $$1.getBuffer(this.c.a(a));
         this.c.a($$0, $$8, $$2, gws.d);
      }
   }
}
