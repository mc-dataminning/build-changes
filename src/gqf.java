public class gqf implements gqk<duz> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final gcz c;
   private final gcz d;
   private final gcy e;
   private final gcy f;

   public gqf(gql.a $$0) {
      this($$0.f());
   }

   public gqf(ggz $$0) {
      this.c = new gcz($$0.a(ghc.q));
      this.d = new gcz($$0.a(ghc.s));
      this.e = new gcy($$0.a(ghc.r));
      this.f = new gcy($$0.a(ghc.t));
   }

   public void a(duz $$0, float $$1, fho $$2, gny $$3, int $$4, int $$5) {
      dym $$6 = $$0.m();
      gcz $$8;
      gcy $$9;
      float $$7;
      if ($$6.b() instanceof djz) {
         $$7 = -dzs.b($$6.c(djz.b));
         $$8 = this.c;
         $$9 = this.e;
      } else {
         $$7 = -$$6.c(dtz.b).p();
         $$8 = this.d;
         $$9 = this.f;
      }

      long $$13 = $$0.i().ae();
      jj $$14 = $$0.aw_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$13, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$7, $$8, $$9, $$15, $$0.f(), $$0.b());
   }

   public void a(fho $$0, gny $$1, int $$2, int $$3, cwv $$4, dvb $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(fho $$0, gny $$1, int $$2, int $$3, float $$4, gcz $$5, gcy $$6, float $$7, cwv $$8, dvb $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hjc.f.a($$1, goi::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hjc.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(fho $$0, gny $$1, int $$2, int $$3, ghd $$4, hiz $$5, boolean $$6, cwv $$7, dvb $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fho $$0, gny $$1, int $$2, int $$3, ghd $$4, hiz $$5, boolean $$6, cwv $$7, dvb $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, goi::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? got.m : got.n, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dvb.b $$12 = $$8.b().get($$11);
         hiz $$13 = $$6 ? got.a($$12.b()) : got.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fho $$0, gny $$1, int $$2, int $$3, ghd $$4, hiz $$5, cwv $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, goi::n), $$2, $$3, $$7);
   }
}
