public class gui implements gun<dxq> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final ggx c;
   private final ggx d;
   private final ggw e;
   private final ggw f;

   public gui(guo.a $$0) {
      this($$0.f());
   }

   public gui(gla $$0) {
      this.c = new ggx($$0.a(gld.q));
      this.d = new ggx($$0.a(gld.s));
      this.e = new ggw($$0.a(gld.r));
      this.f = new ggw($$0.a(gld.t));
   }

   public void a(dxq $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      ebe $$7 = $$0.m();
      ggx $$9;
      ggw $$10;
      float $$8;
      if ($$7.b() instanceof dmh) {
         $$8 = -eck.b($$7.c(dmh.b));
         $$9 = this.c;
         $$10 = this.e;
      } else {
         $$8 = -$$7.c(dwq.b).p();
         $$9 = this.d;
         $$10 = this.f;
      }

      long $$14 = $$0.i().ae();
      iv $$15 = $$0.aB_();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$14, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$8, $$9, $$10, $$16, $$0.f(), $$0.b());
   }

   public void a(flo $$0, gsa $$1, int $$2, int $$3, cyw $$4, dxs $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(flo $$0, gsa $$1, int $$2, int $$3, float $$4, ggx $$5, ggw $$6, float $$7, cyw $$8, dxs $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hnk.f.a($$1, gsl::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hnk.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(flo $$0, gsa $$1, int $$2, int $$3, gle $$4, hnh $$5, boolean $$6, cyw $$7, dxs $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(flo $$0, gsa $$1, int $$2, int $$3, gle $$4, hnh $$5, boolean $$6, cyw $$7, dxs $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gsl::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gsu.w : gsu.x, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dxs.b $$12 = $$8.b().get($$11);
         hnh $$13 = $$6 ? gsu.a($$12.b()) : gsu.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(flo $$0, gsa $$1, int $$2, int $$3, gle $$4, hnh $$5, cyw $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gsl::n), $$2, $$3, $$7);
   }
}
