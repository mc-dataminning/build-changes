public class gtv implements gua<dyc> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final ggk c;
   private final ggk d;
   private final ggj e;
   private final ggj f;

   public gtv(gub.a $$0) {
      this($$0.f());
   }

   public gtv(gkn $$0) {
      this.c = new ggk($$0.a(gkq.q));
      this.d = new ggk($$0.a(gkq.s));
      this.e = new ggj($$0.a(gkq.r));
      this.f = new ggj($$0.a(gkq.t));
   }

   public void a(dyc $$0, float $$1, fld $$2, grn $$3, int $$4, int $$5, fgc $$6) {
      ebq $$7 = $$0.m();
      ggk $$9;
      ggj $$10;
      float $$8;
      if ($$7.b() instanceof dmt) {
         $$8 = -ecw.b($$7.c(dmt.b));
         $$9 = this.c;
         $$10 = this.e;
      } else {
         $$8 = -$$7.c(dxc.b).p();
         $$9 = this.d;
         $$10 = this.f;
      }

      long $$14 = $$0.i().ae();
      iw $$15 = $$0.ax_();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$14, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$8, $$9, $$10, $$16, $$0.f(), $$0.b());
   }

   public void a(fld $$0, grn $$1, int $$2, int $$3, czi $$4, dye $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(fld $$0, grn $$1, int $$2, int $$3, float $$4, ggk $$5, ggj $$6, float $$7, czi $$8, dye $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hna.f.a($$1, gry::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hna.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(fld $$0, grn $$1, int $$2, int $$3, gkr $$4, hmx $$5, boolean $$6, czi $$7, dye $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fld $$0, grn $$1, int $$2, int $$3, gkr $$4, hmx $$5, boolean $$6, czi $$7, dye $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gry::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gsh.w : gsh.x, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dye.b $$12 = $$8.b().get($$11);
         hmx $$13 = $$6 ? gsh.a($$12.b()) : gsh.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fld $$0, grn $$1, int $$2, int $$3, gkr $$4, hmx $$5, czi $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gry::n), $$2, $$3, $$7);
   }
}
