public class gfm extends gfd<hcc> {
   public static final gip a = gip.scaling(2.35F);
   private static final float[] b = new float[]{1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F};
   private static final float[] c = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F};
   private static final float[] d = new float[]{0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F};
   private static final float[] e = new float[]{0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F};
   private static final float[] f = new float[]{-8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F};
   private static final float[] g = new float[]{8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F};
   private static final String i = "eye";
   private static final String j = "tail0";
   private static final String k = "tail1";
   private static final String l = "tail2";
   private final gig m;
   private final gig n;
   private final gig[] o = new gig[12];
   private final gig[] p;

   public gfm(gig $$0) {
      super($$0);
      this.m = $$0.b("head");

      for (int $$1 = 0; $$1 < this.o.length; $$1++) {
         this.o[$$1] = this.m.b(a($$1));
      }

      this.n = this.m.b("eye");
      this.p = new gig[3];
      this.p[0] = this.m.b("tail0");
      this.p[1] = this.p[0].b("tail1");
      this.p[2] = this.p[1].b("tail2");
   }

   private static String a(int $$0) {
      return "spike" + $$0;
   }

   public static gim a() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      giq $$2 = $$1.a(
         "head",
         gil.c()
            .a(0, 0)
            .a(-6.0F, 10.0F, -8.0F, 12.0F, 12.0F, 16.0F)
            .a(0, 28)
            .a(-8.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F)
            .a(0, 28)
            .a(6.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F, true)
            .a(16, 40)
            .a(-6.0F, 8.0F, -6.0F, 12.0F, 2.0F, 12.0F)
            .a(16, 40)
            .a(-6.0F, 22.0F, -6.0F, 12.0F, 2.0F, 12.0F),
         gii.a
      );
      gil $$3 = gil.c().a(0, 0).a(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F);

      for (int $$4 = 0; $$4 < 12; $$4++) {
         float $$5 = b($$4, 0.0F, 0.0F);
         float $$6 = c($$4, 0.0F, 0.0F);
         float $$7 = d($$4, 0.0F, 0.0F);
         float $$8 = (float) Math.PI * b[$$4];
         float $$9 = (float) Math.PI * c[$$4];
         float $$10 = (float) Math.PI * d[$$4];
         $$2.a(a($$4), $$3, gii.a($$5, $$6, $$7, $$8, $$9, $$10));
      }

      $$2.a("eye", gil.c().a(8, 0).a(-1.0F, 15.0F, 0.0F, 2.0F, 2.0F, 1.0F), gii.a(0.0F, 0.0F, -8.25F));
      giq $$11 = $$2.a("tail0", gil.c().a(40, 0).a(-2.0F, 14.0F, 7.0F, 4.0F, 4.0F, 8.0F), gii.a);
      giq $$12 = $$11.a("tail1", gil.c().a(0, 54).a(0.0F, 14.0F, 0.0F, 3.0F, 3.0F, 7.0F), gii.a(-1.5F, 0.5F, 14.0F));
      $$12.a("tail2", gil.c().a(41, 32).a(0.0F, 14.0F, 0.0F, 2.0F, 2.0F, 6.0F).a(25, 19).a(1.0F, 10.5F, 3.0F, 1.0F, 9.0F, 9.0F), gii.a(0.5F, 0.5F, 6.0F));
      return gim.a($$0, 64, 64);
   }

   public static gim b() {
      return a().a(a);
   }

   public void a(hcc $$0) {
      super.a($$0);
      this.m.f = $$0.aa * (float) (Math.PI / 180.0);
      this.m.e = $$0.ab * (float) (Math.PI / 180.0);
      float $$1 = (1.0F - $$0.a) * 0.55F;
      this.a($$0.u, $$1);
      if ($$0.e != null && $$0.d != null) {
         double $$2 = $$0.e.e - $$0.c.e;
         if ($$2 > 0.0) {
            this.n.c = 0.0F;
         } else {
            this.n.c = 1.0F;
         }

         fdw $$3 = $$0.d;
         $$3 = new fdw($$3.d, 0.0, $$3.f);
         fdw $$4 = new fdw($$0.c.d - $$0.e.d, 0.0, $$0.c.f - $$0.e.f).d().b((float) (Math.PI / 2));
         double $$5 = $$3.b($$4);
         this.n.b = azk.c((float)Math.abs($$5)) * 2.0F * (float)Math.signum($$5);
      }

      this.n.k = true;
      float $$6 = $$0.b;
      this.p[0].f = azk.a($$6) * (float) Math.PI * 0.05F;
      this.p[1].f = azk.a($$6) * (float) Math.PI * 0.1F;
      this.p[2].f = azk.a($$6) * (float) Math.PI * 0.15F;
   }

   private void a(float $$0, float $$1) {
      for (int $$2 = 0; $$2 < 12; $$2++) {
         this.o[$$2].b = b($$2, $$0, $$1);
         this.o[$$2].c = c($$2, $$0, $$1);
         this.o[$$2].d = d($$2, $$0, $$1);
      }
   }

   private static float a(int $$0, float $$1, float $$2) {
      return 1.0F + azk.b($$1 * 1.5F + (float)$$0) * 0.01F - $$2;
   }

   private static float b(int $$0, float $$1, float $$2) {
      return e[$$0] * a($$0, $$1, $$2);
   }

   private static float c(int $$0, float $$1, float $$2) {
      return 16.0F + f[$$0] * a($$0, $$1, $$2);
   }

   private static float d(int $$0, float $$1, float $$2) {
      return g[$$0] * a($$0, $$1, $$2);
   }
}
