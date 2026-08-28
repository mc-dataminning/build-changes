public class glm implements glr<dsn> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final gcl g;
   private final gcl h;
   private final gcl i;

   public glm(gls.a $$0) {
      gcl $$1 = $$0.a(gck.q);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static gcr a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      $$1.a("flag", gcq.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), gcn.a(0.0F, -32.0F, 0.0F));
      $$1.a("pole", gcq.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), gcn.a);
      $$1.a("bar", gcq.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), gcn.a);
      return gcr.a($$0, 64, 64);
   }

   public void a(dsn $$0, float $$1, fer $$2, gjg $$3, int $$4, int $$5) {
      float $$6 = 0.6666667F;
      boolean $$7 = $$0.i() == null;
      $$2.a();
      long $$8;
      if ($$7) {
         $$8 = 0L;
         $$2.a(0.5F, 0.5F, 0.5F);
         this.h.k = true;
      } else {
         $$8 = $$0.i().ab();
         dvv $$10 = $$0.m();
         if ($$10.b() instanceof dhv) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$11 = -dxa.b($$10.c(dhv.b));
            $$2.a(a.d.rotationDegrees($$11));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$12 = -$$10.c(drn.b).p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      fev $$13 = hbq.f.a($$3, gjq::c);
      this.h.a($$2, $$13, $$4, $$5);
      this.i.a($$2, $$13, $$4, $$5);
      jh $$14 = $$0.aA_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$8, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * azm.b((float) (Math.PI * 2) * $$15)) * (float) Math.PI;
      a($$2, $$3, $$4, $$5, this.g, hbq.f, true, $$0.f(), $$0.b());
      $$2.b();
      $$2.b();
   }

   public static void a(fer $$0, gjg $$1, int $$2, int $$3, gcl $$4, hbn $$5, boolean $$6, cvj $$7, dsp $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fer $$0, gjg $$1, int $$2, int $$3, gcl $$4, hbn $$5, boolean $$6, cvj $$7, dsp $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gjq::c, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gkb.m : gkb.n, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dsp.b $$12 = $$8.b().get($$11);
         hbn $$13 = $$6 ? gkb.a($$12.b()) : gkb.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fer $$0, gjg $$1, int $$2, int $$3, gcl $$4, hbn $$5, cvj $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gjq::m), $$2, $$3, $$7);
   }
}
