public class grz implements gse<dwl> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final geo c;
   private final geo d;
   private final gen e;
   private final gen f;

   public grz(gsf.a $$0) {
      this($$0.f());
   }

   public grz(giq $$0) {
      this.c = new geo($$0.a(git.q));
      this.d = new geo($$0.a(git.s));
      this.e = new gen($$0.a(git.r));
      this.f = new gen($$0.a(git.t));
   }

   public void a(dwl $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      dzz $$7 = $$0.m();
      geo $$9;
      gen $$10;
      float $$8;
      if ($$7.b() instanceof dlf) {
         $$8 = -ebf.b($$7.c(dlf.b));
         $$9 = this.c;
         $$10 = this.e;
      } else {
         $$8 = -$$7.c(dvl.b).p();
         $$9 = this.d;
         $$10 = this.f;
      }

      long $$14 = $$0.i().ae();
      iu $$15 = $$0.aw_();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$14, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$8, $$9, $$10, $$16, $$0.f(), $$0.b());
   }

   public void a(fjc $$0, gps $$1, int $$2, int $$3, cxw $$4, dwn $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(fjc $$0, gps $$1, int $$2, int $$3, float $$4, geo $$5, gen $$6, float $$7, cxw $$8, dwn $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hkz.f.a($$1, gqc::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hkz.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(fjc $$0, gps $$1, int $$2, int $$3, giu $$4, hkw $$5, boolean $$6, cxw $$7, dwn $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fjc $$0, gps $$1, int $$2, int $$3, giu $$4, hkw $$5, boolean $$6, cxw $$7, dwn $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gqc::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gqn.w : gqn.x, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dwn.b $$12 = $$8.b().get($$11);
         hkw $$13 = $$6 ? gqn.a($$12.b()) : gqn.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fjc $$0, gps $$1, int $$2, int $$3, giu $$4, hkw $$5, cxw $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gqc::n), $$2, $$3, $$7);
   }
}
