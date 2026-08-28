public class ged extends gcb<gzw> {
   private static final int a = 2;
   private final gfd[] b = new gfd[2];

   public ged(gfd $$0) {
      super($$0);

      for (int $$1 = 0; $$1 < 2; $$1++) {
         this.b[$$1] = $$0.b(a($$1));
      }
   }

   private static String a(int $$0) {
      return "box" + $$0;
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();

      for (int $$2 = 0; $$2 < 2; $$2++) {
         float $$3 = -3.2F + 9.6F * (float)($$2 + 1);
         float $$4 = 0.75F * (float)($$2 + 1);
         $$1.a(a($$2), gfi.c().a(0, 0).a(-8.0F, -16.0F + $$3, -8.0F, 16.0F, 32.0F, 16.0F), gff.a.a($$4));
      }

      return gfj.a($$0, 64, 64);
   }

   public void a(gzw $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.b.length; $$1++) {
         float $$2 = $$0.u * (float)(-(45 + ($$1 + 1) * 5));
         this.b[$$1].f = ayz.h($$2) * (float) (Math.PI / 180.0);
      }
   }
}
