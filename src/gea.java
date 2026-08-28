public class gea extends gby<gzt> {
   private static final int a = 2;
   private final gfa[] b = new gfa[2];

   public gea(gfa $$0) {
      super($$0);

      for (int $$1 = 0; $$1 < 2; $$1++) {
         this.b[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "box" + $$0;
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();

      for (int $$2 = 0; $$2 < 2; $$2++) {
         float $$3 = -3.2F + 9.6F * (float)($$2 + 1);
         float $$4 = 0.75F * (float)($$2 + 1);
         $$1.a(a($$2), gff.c().a(0, 0).a(-8.0F, -16.0F + $$3, -8.0F, 16.0F, 32.0F, 16.0F), gfc.a.a($$4));
      }

      return gfg.a($$0, 64, 64);
   }

   public void a(gzt $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         float $$2 = $$0.u * (float)(-(45 + ($$1 + 1) * 5));
         this.b[$$1].f = ayy.h($$2) * (float) (Math.PI / 180.0);
      }
   }
}
