public class ggu implements ggz<dpw> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final fyk g;
   private final fyk h;
   private final fyk i;

   public ggu(gha.a $$0) {
      fyk $$1 = $$0.a(fyj.g);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static fyq a() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("flag", fyp.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), fym.a);
      $$1.a("pole", fyp.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), fym.a);
      $$1.a("bar", fyp.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), fym.a);
      return fyq.a($$0, 64, 64);
   }

   public void a(dpw $$0, float $$1, fbi $$2, gez $$3, int $$4, int $$5) {
      float $$6 = 0.6666667F;
      boolean $$7 = $$0.i() == null;
      $$2.a();
      long $$8;
      if ($$7) {
         $$8 = 0L;
         $$2.a(0.5F, 0.5F, 0.5F);
         this.h.k = true;
      } else {
         $$8 = $$0.i().Z();
         dtc $$10 = $$0.n();
         if ($$10.b() instanceof dfd) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$11 = -dui.b($$10.c(dfd.b));
            $$2.a(a.d.rotationDegrees($$11));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$12 = -$$10.c(dow.b).p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      fbm $$13 = gss.f.a($$3, gfh::c);
      this.h.a($$2, $$13, $$4, $$5);
      this.i.a($$2, $$13, $$4, $$5);
      jd $$14 = $$0.aD_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$8, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * ayo.b((float) (Math.PI * 2) * $$15)) * (float) Math.PI;
      this.g.c = -32.0F;
      a($$2, $$3, $$4, $$5, this.g, gss.f, true, $$0.f(), $$0.b());
      $$2.b();
      $$2.b();
   }

   public static void a(fbi $$0, gez $$1, int $$2, int $$3, fyk $$4, gsq $$5, boolean $$6, cti $$7, dpy $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false);
   }

   public static void a(fbi $$0, gez $$1, int $$2, int $$3, fyk $$4, gsq $$5, boolean $$6, cti $$7, dpy $$8, boolean $$9) {
      $$4.a($$0, $$5.a($$1, gfh::c, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gfo.m : gfo.n, $$7);

      for (int $$10 = 0; $$10 < 16 && $$10 < $$8.b().size(); $$10++) {
         dpy.b $$11 = $$8.b().get($$10);
         gsq $$12 = $$6 ? gfo.a($$11.b()) : gfo.b($$11.b());
         a($$0, $$1, $$2, $$3, $$4, $$12, $$11.c());
      }
   }

   private static void a(fbi $$0, gez $$1, int $$2, int $$3, fyk $$4, gsq $$5, cti $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gfh::m), $$2, $$3, $$7);
   }
}
