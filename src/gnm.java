public class gnm implements gnr<duf> {
   private static final int a = 16;
   private final gai b;
   private final gai c;
   private final gah d;
   private final gah e;

   public gnm(gns.a $$0) {
      this.b = new gai($$0.a(gei.q));
      this.c = new gai($$0.a(gei.s));
      this.d = new gah($$0.a(gei.r));
      this.e = new gah($$0.a(gei.t));
   }

   public void a(duf $$0, float $$1, fgl $$2, glg $$3, int $$4, int $$5) {
      float $$6 = 0.6666667F;
      boolean $$7 = $$0.i() == null;
      long $$8;
      gai $$10;
      gah $$11;
      float $$9;
      if ($$7) {
         $$8 = 0L;
         $$9 = 0.0F;
         $$10 = this.b;
         $$11 = this.d;
      } else {
         $$8 = $$0.i().ad();
         dxo $$13 = $$0.m();
         if ($$13.b() instanceof dji) {
            $$9 = -dyt.b($$13.c(dji.b));
            $$10 = this.b;
            $$11 = this.d;
         } else {
            $$9 = -$$13.c(dtf.b).p();
            $$10 = this.c;
            $$11 = this.e;
         }
      }

      $$2.a();
      $$2.a(0.5F, 0.0F, 0.5F);
      $$2.a(a.d.rotationDegrees($$9));
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$10.a($$2, hds.f.a($$3, glq::d), $$4, $$5);
      jh $$20 = $$0.aB_();
      float $$21 = ((float)Math.floorMod((long)($$20.u() * 7 + $$20.v() * 9 + $$20.w() * 13) + $$8, 100L) + $$1) / 100.0F;
      $$11.a($$21);
      a($$2, $$3, $$4, $$5, $$11.e(), hds.f, true, $$0.f(), $$0.b());
      $$2.b();
   }

   public static void a(fgl $$0, glg $$1, int $$2, int $$3, gej $$4, hdp $$5, boolean $$6, cwd $$7, duh $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fgl $$0, glg $$1, int $$2, int $$3, gej $$4, hdp $$5, boolean $$6, cwd $$7, duh $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, glq::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gmb.m : gmb.n, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         duh.b $$12 = $$8.b().get($$11);
         hdp $$13 = $$6 ? gmb.a($$12.b()) : gmb.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fgl $$0, glg $$1, int $$2, int $$3, gej $$4, hdp $$5, cwd $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, glq::n), $$2, $$3, $$7);
   }
}
