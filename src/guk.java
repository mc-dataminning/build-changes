public class guk implements gup<dxs> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final ggz c;
   private final ggz d;
   private final ggy e;
   private final ggy f;

   public guk(guq.a $$0) {
      this($$0.f());
   }

   public guk(glc $$0) {
      this.c = new ggz($$0.a(glf.q));
      this.d = new ggz($$0.a(glf.s));
      this.e = new ggy($$0.a(glf.r));
      this.f = new ggy($$0.a(glf.t));
   }

   public void a(dxs $$0, float $$1, flq $$2, gsc $$3, int $$4, int $$5, ffs $$6) {
      ebg $$7 = $$0.m();
      ggz $$9;
      ggy $$10;
      float $$8;
      if ($$7.b() instanceof dmj) {
         $$8 = -ecm.b($$7.c(dmj.b));
         $$9 = this.c;
         $$10 = this.e;
      } else {
         $$8 = -$$7.c(dws.b).p();
         $$9 = this.d;
         $$10 = this.f;
      }

      long $$14 = $$0.i().ae();
      iw $$15 = $$0.aB_();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$14, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$8, $$9, $$10, $$16, $$0.f(), $$0.b());
   }

   public void a(flq $$0, gsc $$1, int $$2, int $$3, cyy $$4, dxu $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(flq $$0, gsc $$1, int $$2, int $$3, float $$4, ggz $$5, ggy $$6, float $$7, cyy $$8, dxu $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hnm.f.a($$1, gsn::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hnm.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(flq $$0, gsc $$1, int $$2, int $$3, glg $$4, hnj $$5, boolean $$6, cyy $$7, dxu $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(flq $$0, gsc $$1, int $$2, int $$3, glg $$4, hnj $$5, boolean $$6, cyy $$7, dxu $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gsn::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gsw.w : gsw.x, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dxu.b $$12 = $$8.b().get($$11);
         hnj $$13 = $$6 ? gsw.a($$12.b()) : gsw.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(flq $$0, gsc $$1, int $$2, int $$3, glg $$4, hnj $$5, cyy $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gsn::n), $$2, $$3, $$7);
   }
}
