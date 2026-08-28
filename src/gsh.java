public class gsh implements gsm<dwt> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final gev c;
   private final gev d;
   private final geu e;
   private final geu f;

   public gsh(gsn.a $$0) {
      this($$0.f());
   }

   public gsh(giy $$0) {
      this.c = new gev($$0.a(gjb.q));
      this.d = new gev($$0.a(gjb.s));
      this.e = new geu($$0.a(gjb.r));
      this.f = new geu($$0.a(gjb.t));
   }

   public void a(dwt $$0, float $$1, fjj $$2, gqa $$3, int $$4, int $$5, feq $$6) {
      eah $$7 = $$0.m();
      gev $$9;
      geu $$10;
      float $$8;
      if ($$7.b() instanceof dlk) {
         $$8 = -ebn.b($$7.c(dlk.b));
         $$9 = this.c;
         $$10 = this.e;
      } else {
         $$8 = -$$7.c(dvt.b).p();
         $$9 = this.d;
         $$10 = this.f;
      }

      long $$14 = $$0.i().ae();
      iu $$15 = $$0.ax_();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$14, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$8, $$9, $$10, $$16, $$0.f(), $$0.b());
   }

   public void a(fjj $$0, gqa $$1, int $$2, int $$3, cyb $$4, dwv $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(fjj $$0, gqa $$1, int $$2, int $$3, float $$4, gev $$5, geu $$6, float $$7, cyb $$8, dwv $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hlh.f.a($$1, gqk::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hlh.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(fjj $$0, gqa $$1, int $$2, int $$3, gjc $$4, hle $$5, boolean $$6, cyb $$7, dwv $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fjj $$0, gqa $$1, int $$2, int $$3, gjc $$4, hle $$5, boolean $$6, cyb $$7, dwv $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gqk::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gqv.w : gqv.x, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dwv.b $$12 = $$8.b().get($$11);
         hle $$13 = $$6 ? gqv.a($$12.b()) : gqv.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fjj $$0, gqa $$1, int $$2, int $$3, gjc $$4, hle $$5, cyb $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gqk::n), $$2, $$3, $$7);
   }
}
