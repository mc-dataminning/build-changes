public class gjr implements gjw<drk> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final gaq g;
   private final gaq h;
   private final gaq i;

   public gjr(gjx.a $$0) {
      gaq $$1 = $$0.a(gap.m);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static gaw a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      $$1.a("flag", gav.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), gas.a(0.0F, -32.0F, 0.0F));
      $$1.a("pole", gav.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), gas.a);
      $$1.a("bar", gav.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), gas.a);
      return gaw.a($$0, 64, 64);
   }

   public void a(drk $$0, float $$1, fdi $$2, ghl $$3, int $$4, int $$5) {
      float $$6 = 0.6666667F;
      boolean $$7 = $$0.i() == null;
      $$2.a();
      long $$8;
      if ($$7) {
         $$8 = 0L;
         $$2.a(0.5F, 0.5F, 0.5F);
         this.h.k = true;
      } else {
         $$8 = $$0.i().aa();
         dus $$10 = $$0.m();
         if ($$10.b() instanceof dgr) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$11 = -dvy.b($$10.c(dgr.b));
            $$2.a(a.d.rotationDegrees($$11));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$12 = -$$10.c(dqk.b).p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      fdm $$13 = gzp.f.a($$3, ghv::c);
      this.h.a($$2, $$13, $$4, $$5);
      this.i.a($$2, $$13, $$4, $$5);
      jf $$14 = $$0.aC_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$8, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * azf.b((float) (Math.PI * 2) * $$15)) * (float) Math.PI;
      a($$2, $$3, $$4, $$5, this.g, gzp.f, true, $$0.f(), $$0.b());
      $$2.b();
      $$2.b();
   }

   public static void a(fdi $$0, ghl $$1, int $$2, int $$3, gaq $$4, gzm $$5, boolean $$6, cum $$7, drm $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fdi $$0, ghl $$1, int $$2, int $$3, gaq $$4, gzm $$5, boolean $$6, cum $$7, drm $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, ghv::c, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gig.m : gig.n, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         drm.b $$12 = $$8.b().get($$11);
         gzm $$13 = $$6 ? gig.a($$12.b()) : gig.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fdi $$0, ghl $$1, int $$2, int $$3, gaq $$4, gzm $$5, cum $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, ghv::m), $$2, $$3, $$7);
   }
}
