public class gbu implements gbz<dlu> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final ftm g;
   private final ftm h;
   private final ftm i;

   public gbu(gca.a $$0) {
      ftm $$1 = $$0.a(ftl.g);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static fts a() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("flag", ftr.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), fto.a);
      $$1.a("pole", ftr.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), fto.a);
      $$1.a("bar", ftr.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), fto.a);
      return fts.a($$0, 64, 64);
   }

   public void a(dlu $$0, float $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      dlw $$6 = $$0.b();
      float $$7 = 0.6666667F;
      boolean $$8 = $$0.i() == null;
      $$2.a();
      long $$9;
      if ($$8) {
         $$9 = 0L;
         $$2.a(0.5F, 0.5F, 0.5F);
         this.h.k = true;
      } else {
         $$9 = $$0.i().Y();
         doz $$11 = $$0.n();
         if ($$11.b() instanceof dbd) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$12 = -dqf.b($$11.c(dbd.b));
            $$2.a(a.d.rotationDegrees($$12));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$13 = -$$11.c(dku.b).p();
            $$2.a(a.d.rotationDegrees($$13));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      ewm $$14 = gno.f.a($$3, gah::c);
      this.h.a($$2, $$14, $$4, $$5);
      this.i.a($$2, $$14, $$4, $$5);
      ib $$15 = $$0.aA_();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$9, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * axk.b((float) (Math.PI * 2) * $$16)) * (float) Math.PI;
      this.g.c = -32.0F;
      a($$2, $$3, $$4, $$5, this.g, gno.f, true, $$6);
      $$2.b();
      $$2.b();
   }

   public static void a(ewi $$0, fzz $$1, int $$2, int $$3, ftm $$4, gnm $$5, boolean $$6, dlw $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
   }

   public static void a(ewi $$0, fzz $$1, int $$2, int $$3, ftm $$4, gnm $$5, boolean $$6, dlw $$7, boolean $$8) {
      $$4.a($$0, $$5.a($$1, gah::c, $$8), $$2, $$3);

      for (int $$9 = 0; $$9 < 17 && $$9 < $$7.b().size(); $$9++) {
         dlw.b $$10 = $$7.b().get($$9);
         float[] $$11 = $$10.b().d();
         $$10.a()
            .e()
            .map($$1x -> $$6 ? gao.a($$1x) : gao.b($$1x))
            .ifPresent($$6x -> $$4.a($$0, $$6x.a($$1, gah::m), $$2, $$3, $$11[0], $$11[1], $$11[2], 1.0F));
      }
   }
}
