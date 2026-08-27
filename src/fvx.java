public class fvx extends fvz<ciy> {
   private static final float[] a = new float[]{1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F};
   private static final float[] b = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F};
   private static final float[] f = new float[]{0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F};
   private static final float[] g;
   private static final float[] h;
   private static final float i = 16.0F;
   private static final float[] j;
   private static final float k = 9.4F;
   private static final float l;
   private static final float m;
   private static final float[] n;
   private static final float[] o;
   private static final float[] p;
   private static final float[] q;
   private static final float[] r;
   private static final float[] s;
   private static final float[] t;
   private static final float u = 19.0F;
   private static final float[] w;
   private static final String x = "eye";
   private static final String y = "tail0";
   private static final String z = "tail1";
   private static final String A = "tail2";
   private final fys B;
   private final fys C;
   private final fys D;
   private final fys[] E;
   private final fys[] F;

   public fvx(fys $$0) {
      this.B = $$0;
      this.E = new fys[12];
      this.C = $$0.b("head");

      for (int $$1 = 0; $$1 < this.E.length; $$1++) {
         this.E[$$1] = this.C.b(a($$1));
      }

      this.D = this.C.b("eye");
      this.F = new fys[3];
      this.F[0] = this.C.b("tail0");
      this.F[1] = this.F[0].b("tail1");
      this.F[2] = this.F[1].b("tail2");
   }

   private static String a(int $$0) {
      return "spike" + $$0;
   }

   public static fyy a(boolean $$0) {
      fza $$1 = new fza();
      fzb $$2 = $$1.a();
      int $$3 = $$0 ? 3 : 0;
      fzb $$4 = $$2.a(
         "head",
         fyx.c()
            .a(0, 0)
            .a(-6.0F, (float)(10 + $$3 * 2), -8.0F, 12.0F, (float)(12 - $$3 * 2), 16.0F)
            .a(0, 28)
            .a(-8.0F, (float)(10 + $$3 * 2), -6.0F, 2.0F, (float)(12 - $$3 * 2), 12.0F)
            .a(0, 28)
            .a(6.0F, (float)(10 + $$3 * 2), -6.0F, 2.0F, (float)(12 - $$3 * 2), 12.0F, true)
            .a(16, 40)
            .a(-6.0F, (float)(8 + $$3 * 2), -6.0F, 12.0F, 2.0F, 12.0F)
            .a(16, 40)
            .a(-6.0F, 22.0F, -6.0F, 12.0F, 2.0F, 12.0F),
         fyu.a
      );
      fyx $$5 = fyx.c().a(0, 0).a(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F);

      for (int $$6 = 0; $$6 < 12; $$6++) {
         if ($$0) {
            float $$7 = s[$$6] + r[$$6];
            float $$8 = 19.0F + t[$$6];
            float $$9 = w[$$6];
            float $$10 = n[$$6];
            float $$11 = o[$$6];
            float $$12 = p[$$6];
            $$4.a(a($$6), $$5, fyu.a($$7, $$8, $$9, $$10, $$11, $$12));
         } else {
            float $$13 = g[$$6];
            float $$14 = 16.0F + h[$$6];
            float $$15 = j[$$6];
            float $$16 = a[$$6];
            float $$17 = b[$$6];
            float $$18 = f[$$6];
            $$4.a(a($$6), $$5, fyu.a($$13, $$14, $$15, $$16, $$17, $$18));
         }
      }

      $$4.a("eye", fyx.c().a(8, 0).a(-1.0F, (float)(15 + $$3), 0.0F, 2.0F, 2.0F, 1.0F), fyu.a(0.0F, 0.0F, -8.25F));
      fzb $$19 = $$4.a("tail0", fyx.c().a(40, 0).a(-2.0F, (float)(14 + $$3), 7.0F, 4.0F, 4.0F, 8.0F), fyu.a);
      fzb $$20 = $$19.a("tail1", fyx.c().a(0, 54).a(0.0F, (float)(14 + $$3), 0.0F, 3.0F, 3.0F, 7.0F), fyu.a(-1.5F, 0.5F, 14.0F));
      $$20.a(
         "tail2",
         fyx.c().a(41, 32).a(0.0F, (float)(14 + $$3), 0.0F, 2.0F, 2.0F, 6.0F).a(25, 19).a(1.0F, 10.5F + (float)$$3, 3.0F, 1.0F, 9.0F, 9.0F),
         fyu.a(0.5F, 0.5F, 6.0F)
      );
      return fyy.a($$1, 64, 64);
   }

   @Override
   public fys a() {
      return this.B;
   }

   public void a(ciy $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$3 - (float)$$0.am;
      this.C.f = $$4 * (float) (Math.PI / 180.0);
      this.C.e = $$5 * (float) (Math.PI / 180.0);
      float $$7 = (1.0F - $$0.H($$6)) * 0.55F;
      if ($$0.gz()) {
         this.a($$3, $$7, $$0.bX(), $$0.bW());
      } else {
         this.a($$3, $$7);
      }

      brv $$8 = fgj.Q().ao();
      if ($$0.gC()) {
         $$8 = $$0.gD();
      }

      if ($$8 != null) {
         ewu $$9 = $$8.j(0.0F);
         ewu $$10 = $$0.j(0.0F);
         double $$11 = $$9.d - $$10.d;
         if ($$11 > 0.0) {
            this.D.c = 0.0F;
         } else {
            this.D.c = 1.0F;
         }

         ewu $$12 = $$0.f(0.0F);
         $$12 = new ewu($$12.c, 0.0, $$12.e);
         ewu $$13 = new ewu($$10.c - $$9.c, 0.0, $$10.e - $$9.e).d().b((float) (Math.PI / 2));
         double $$14 = $$12.b($$13);
         this.D.b = aym.c((float)Math.abs($$14)) * 2.0F * (float)Math.signum($$14);
      }

      this.D.k = true;
      float $$15 = $$0.G($$6);
      this.F[0].f = aym.a($$15) * (float) Math.PI * 0.05F;
      this.F[1].f = aym.a($$15) * (float) Math.PI * 0.1F;
      this.F[2].f = aym.a($$15) * (float) Math.PI * 0.15F;
   }

   private void a(float $$0, float $$1) {
      for (int $$2 = 0; $$2 < 12; $$2++) {
         this.E[$$2].b = g[$$2] * a($$2, $$0, $$1);
         this.E[$$2].c = 16.0F + h[$$2] * a($$2, $$0, $$1);
         this.E[$$2].d = j[$$2] * a($$2, $$0, $$1);
         this.E[$$2].g = f[$$2];
      }

      for (int $$3 = 0; $$3 < 4; $$3++) {
         this.E[$$3].k = true;
      }
   }

   private void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      int $$4 = $$2 ? -1 : 1;
      float[] $$5 = $$2 ? q : p;

      for (int $$6 = 0; $$6 < 12; $$6++) {
         this.E[$$6].b = s[$$6] * a($$6, $$0, $$1) + r[$$6];
         this.E[$$6].c = 19.0F + (float)$$4 * t[$$6] * a($$6, $$0, $$1);
         this.E[$$6].d = w[$$6] * a($$6, $$0, $$1);
         this.E[$$6].g = $$5[$$6];
      }

      if ($$2 && $$3) {
         for (int $$7 = 0; $$7 < 4; $$7++) {
            this.E[$$7].k = false;
         }
      } else {
         for (int $$8 = 0; $$8 < 4; $$8++) {
            this.E[$$8].k = true;
         }
      }
   }

   private static float a(int $$0, float $$1, float $$2) {
      return 1.0F + aym.b($$1 * 1.5F + (float)$$0) * 0.01F - $$2;
   }

   static {
      for (int $$0 = 0; $$0 < 12; $$0++) {
         a[$$0] = (float) Math.PI * a[$$0];
         b[$$0] = (float) Math.PI * b[$$0];
         f[$$0] = (float) Math.PI * f[$$0];
      }

      g = new float[]{0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F};
      h = new float[]{-8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F};
      j = new float[]{8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F};
      l = (float)Math.atan2(2.0, 1.0);
      m = (float)Math.atan2(1.0, 2.0);
      n = new float[]{l, m, -m, -l, l, m, -m, -l, l, m, -m, -l};
      o = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      p = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F};
      q = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 0.5F, 0.5F, 0.5F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F};
      r = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, 3.0F, -3.0F, -3.0F, -3.0F, -3.0F};
      s = new float[]{0.0F, 0.0F, 0.0F, 0.0F, aym.b(l), aym.b(m), aym.b(m), aym.b(l), -aym.b(l), -aym.b(m), -aym.b(m), -aym.b(l)};
      t = new float[]{-aym.b(l), -aym.b(m), -aym.b(m), -aym.b(l), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      w = new float[]{-aym.a(l), -aym.a(m), aym.a(m), aym.a(l), -aym.a(l), -aym.a(m), aym.a(m), aym.a(l), -aym.a(l), -aym.a(m), aym.a(m), aym.a(l)};

      for (int $$1 = 0; $$1 < 12; $$1++) {
         p[$$1] = p[$$1] * (float) Math.PI;
         q[$$1] = q[$$1] * (float) Math.PI;
         s[$$1] = s[$$1] * 9.4F;
         t[$$1] = t[$$1] * 9.4F;
         w[$$1] = w[$$1] * 9.4F;
      }
   }
}
