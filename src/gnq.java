public class gnq implements gnv<dul> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final gen g;
   private final gen h;
   private final gen i;

   public gnq(gnw.a $$0) {
      gen $$1 = $$0.a(gem.q);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static get a() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("flag", ges.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), gep.a(0.0F, -32.0F, 0.0F));
      $$1.a("pole", ges.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), gep.a);
      $$1.a("bar", ges.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), gep.a);
      return get.a($$0, 64, 64);
   }

   public void a(dul $$0, float $$1, fgr $$2, glk $$3, int $$4, int $$5) {
      float $$6 = 0.6666667F;
      boolean $$7 = $$0.i() == null;
      $$2.a();
      long $$8;
      if ($$7) {
         $$8 = 0L;
         $$2.a(0.5F, 0.5F, 0.5F);
         this.h.k = true;
      } else {
         $$8 = $$0.i().ac();
         dxu $$10 = $$0.m();
         if ($$10.b() instanceof djq) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$11 = -dyz.b($$10.c(djq.b));
            $$2.a(a.d.rotationDegrees($$11));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$12 = -$$10.c(dtl.b).p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      fgv $$13 = hdw.f.a($$3, glu::d);
      this.h.a($$2, $$13, $$4, $$5);
      this.i.a($$2, $$13, $$4, $$5);
      jh $$14 = $$0.aB_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$8, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * bae.b((float) (Math.PI * 2) * $$15)) * (float) Math.PI;
      a($$2, $$3, $$4, $$5, this.g, hdw.f, true, $$0.f(), $$0.b());
      $$2.b();
      $$2.b();
   }

   public static void a(fgr $$0, glk $$1, int $$2, int $$3, gen $$4, hdt $$5, boolean $$6, cwl $$7, dun $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fgr $$0, glk $$1, int $$2, int $$3, gen $$4, hdt $$5, boolean $$6, cwl $$7, dun $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, glu::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gmf.m : gmf.n, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dun.b $$12 = $$8.b().get($$11);
         hdt $$13 = $$6 ? gmf.a($$12.b()) : gmf.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fgr $$0, glk $$1, int $$2, int $$3, gen $$4, hdt $$5, cwl $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, glu::n), $$2, $$3, $$7);
   }
}
