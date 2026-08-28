public class goe implements goj<dtn> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final gbb c;
   private final gbb d;
   private final gba e;
   private final gba f;

   public goe(gok.a $$0) {
      this($$0.f());
   }

   public goe(gey $$0) {
      this.c = new gbb($$0.a(gfb.q));
      this.d = new gbb($$0.a(gfb.s));
      this.e = new gba($$0.a(gfb.r));
      this.f = new gba($$0.a(gfb.t));
   }

   public void a(dtn $$0, float $$1, fft $$2, glx $$3, int $$4, int $$5) {
      dww $$6 = $$0.m();
      gbb $$8;
      gba $$9;
      float $$7;
      if ($$6.b() instanceof diq) {
         $$7 = -dyb.b($$6.c(diq.b));
         $$8 = this.c;
         $$9 = this.e;
      } else {
         $$7 = -$$6.c(dsn.b).p();
         $$8 = this.d;
         $$9 = this.f;
      }

      long $$13 = $$0.i().ad();
      ji $$14 = $$0.aA_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$13, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$7, $$8, $$9, $$15, $$0.f(), $$0.b());
   }

   public void a(fft $$0, glx $$1, int $$2, int $$3, cvl $$4, dtp $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(fft $$0, glx $$1, int $$2, int $$3, float $$4, gbb $$5, gba $$6, float $$7, cvl $$8, dtp $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hhb.f.a($$1, gmh::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hhb.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(fft $$0, glx $$1, int $$2, int $$3, gfc $$4, hgy $$5, boolean $$6, cvl $$7, dtp $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fft $$0, glx $$1, int $$2, int $$3, gfc $$4, hgy $$5, boolean $$6, cvl $$7, dtp $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gmh::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gms.m : gms.n, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dtp.b $$12 = $$8.b().get($$11);
         hgy $$13 = $$6 ? gms.a($$12.b()) : gms.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fft $$0, glx $$1, int $$2, int $$3, gfc $$4, hgy $$5, cvl $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gmh::n), $$2, $$3, $$7);
   }
}
