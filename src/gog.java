public class gog implements gol<dtp> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final gbd c;
   private final gbd d;
   private final gbc e;
   private final gbc f;

   public gog(gom.a $$0) {
      this($$0.f());
   }

   public gog(gfa $$0) {
      this.c = new gbd($$0.a(gfd.q));
      this.d = new gbd($$0.a(gfd.s));
      this.e = new gbc($$0.a(gfd.r));
      this.f = new gbc($$0.a(gfd.t));
   }

   public void a(dtp $$0, float $$1, ffv $$2, glz $$3, int $$4, int $$5) {
      dwy $$6 = $$0.m();
      gbd $$8;
      gbc $$9;
      float $$7;
      if ($$6.b() instanceof dis) {
         $$7 = -dyd.b($$6.c(dis.b));
         $$8 = this.c;
         $$9 = this.e;
      } else {
         $$7 = -$$6.c(dsp.b).p();
         $$8 = this.d;
         $$9 = this.f;
      }

      long $$13 = $$0.i().ad();
      ji $$14 = $$0.aA_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$13, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$7, $$8, $$9, $$15, $$0.f(), $$0.b());
   }

   public void a(ffv $$0, glz $$1, int $$2, int $$3, cvn $$4, dtr $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(ffv $$0, glz $$1, int $$2, int $$3, float $$4, gbd $$5, gbc $$6, float $$7, cvn $$8, dtr $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hhd.f.a($$1, gmj::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hhd.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(ffv $$0, glz $$1, int $$2, int $$3, gfe $$4, hha $$5, boolean $$6, cvn $$7, dtr $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(ffv $$0, glz $$1, int $$2, int $$3, gfe $$4, hha $$5, boolean $$6, cvn $$7, dtr $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gmj::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gmu.m : gmu.n, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dtr.b $$12 = $$8.b().get($$11);
         hha $$13 = $$6 ? gmu.a($$12.b()) : gmu.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(ffv $$0, glz $$1, int $$2, int $$3, gfe $$4, hha $$5, cvn $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gmj::n), $$2, $$3, $$7);
   }
}
