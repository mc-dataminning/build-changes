public class gpe implements gpj<duh> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final gca c;
   private final gca d;
   private final gbz e;
   private final gbz f;

   public gpe(gpk.a $$0) {
      this($$0.f());
   }

   public gpe(gfy $$0) {
      this.c = new gca($$0.a(ggb.q));
      this.d = new gca($$0.a(ggb.s));
      this.e = new gbz($$0.a(ggb.r));
      this.f = new gbz($$0.a(ggb.t));
   }

   public void a(duh $$0, float $$1, fgr $$2, gmx $$3, int $$4, int $$5) {
      dxq $$6 = $$0.m();
      gca $$8;
      gbz $$9;
      float $$7;
      if ($$6.b() instanceof djj) {
         $$7 = -dyw.b($$6.c(djj.b));
         $$8 = this.c;
         $$9 = this.e;
      } else {
         $$7 = -$$6.c(dth.b).p();
         $$8 = this.d;
         $$9 = this.f;
      }

      long $$13 = $$0.i().ae();
      ji $$14 = $$0.aA_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$13, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$7, $$8, $$9, $$15, $$0.f(), $$0.b());
   }

   public void a(fgr $$0, gmx $$1, int $$2, int $$3, cwe $$4, duj $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(fgr $$0, gmx $$1, int $$2, int $$3, float $$4, gca $$5, gbz $$6, float $$7, cwe $$8, duj $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hib.f.a($$1, gnh::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hib.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(fgr $$0, gmx $$1, int $$2, int $$3, ggc $$4, hhy $$5, boolean $$6, cwe $$7, duj $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fgr $$0, gmx $$1, int $$2, int $$3, ggc $$4, hhy $$5, boolean $$6, cwe $$7, duj $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gnh::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gns.m : gns.n, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         duj.b $$12 = $$8.b().get($$11);
         hhy $$13 = $$6 ? gns.a($$12.b()) : gns.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fgr $$0, gmx $$1, int $$2, int $$3, ggc $$4, hhy $$5, cwe $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gnh::n), $$2, $$3, $$7);
   }
}
