public class gfi implements gfn<dov> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final fwz g;
   private final fwz h;
   private final fwz i;

   public gfi(gfo.a $$0) {
      fwz $$1 = $$0.a(fwy.g);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static fxf a() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      $$1.a("flag", fxe.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), fxb.a);
      $$1.a("pole", fxe.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), fxb.a);
      $$1.a("bar", fxe.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), fxb.a);
      return fxf.a($$0, 64, 64);
   }

   public void a(dov $$0, float $$1, ezx $$2, gdn $$3, int $$4, int $$5) {
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
         dsb $$10 = $$0.n();
         if ($$10.b() instanceof ded) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$11 = -dth.b($$10.c(ded.b));
            $$2.a(a.d.rotationDegrees($$11));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$12 = -$$10.c(dnv.b).p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      fab $$13 = gre.f.a($$3, gdv::c);
      this.h.a($$2, $$13, $$4, $$5);
      this.i.a($$2, $$13, $$4, $$5);
      iz $$14 = $$0.ay_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$8, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * ayy.b((float) (Math.PI * 2) * $$15)) * (float) Math.PI;
      this.g.c = -32.0F;
      a($$2, $$3, $$4, $$5, this.g, gre.f, true, $$0.f(), $$0.b());
      $$2.b();
      $$2.b();
   }

   public static void a(ezx $$0, gdn $$1, int $$2, int $$3, fwz $$4, grc $$5, boolean $$6, cth $$7, dox $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false);
   }

   public static void a(ezx $$0, gdn $$1, int $$2, int $$3, fwz $$4, grc $$5, boolean $$6, cth $$7, dox $$8, boolean $$9) {
      $$4.a($$0, $$5.a($$1, gdv::c, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gec.m : gec.n, $$7);

      for (int $$10 = 0; $$10 < 16 && $$10 < $$8.b().size(); $$10++) {
         dox.b $$11 = $$8.b().get($$10);
         grc $$12 = $$6 ? gec.a($$11.b()) : gec.b($$11.b());
         a($$0, $$1, $$2, $$3, $$4, $$12, $$11.c());
      }
   }

   private static void a(ezx $$0, gdn $$1, int $$2, int $$3, fwz $$4, grc $$5, cth $$6) {
      float[] $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gdv::m), $$2, $$3, $$7[0], $$7[1], $$7[2], 1.0F);
   }
}
