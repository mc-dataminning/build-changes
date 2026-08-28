public class gfy implements ggd<dpe> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final fxo g;
   private final fxo h;
   private final fxo i;

   public gfy(gge.a $$0) {
      fxo $$1 = $$0.a(fxn.g);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static fxu a() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      $$1.a("flag", fxt.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), fxq.a);
      $$1.a("pole", fxt.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), fxq.a);
      $$1.a("bar", fxt.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), fxq.a);
      return fxu.a($$0, 64, 64);
   }

   public void a(dpe $$0, float $$1, fam $$2, ged $$3, int $$4, int $$5) {
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
         dsk $$10 = $$0.n();
         if ($$10.b() instanceof dem) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$11 = -dtq.b($$10.c(dem.b));
            $$2.a(a.d.rotationDegrees($$11));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$12 = -$$10.c(doe.b).p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      faq $$13 = gru.f.a($$3, gel::c);
      this.h.a($$2, $$13, $$4, $$5);
      this.i.a($$2, $$13, $$4, $$5);
      ja $$14 = $$0.az_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$8, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * ayg.b((float) (Math.PI * 2) * $$15)) * (float) Math.PI;
      this.g.c = -32.0F;
      a($$2, $$3, $$4, $$5, this.g, gru.f, true, $$0.f(), $$0.b());
      $$2.b();
      $$2.b();
   }

   public static void a(fam $$0, ged $$1, int $$2, int $$3, fxo $$4, grs $$5, boolean $$6, csv $$7, dpg $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false);
   }

   public static void a(fam $$0, ged $$1, int $$2, int $$3, fxo $$4, grs $$5, boolean $$6, csv $$7, dpg $$8, boolean $$9) {
      $$4.a($$0, $$5.a($$1, gel::c, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? ges.m : ges.n, $$7);

      for (int $$10 = 0; $$10 < 16 && $$10 < $$8.b().size(); $$10++) {
         dpg.b $$11 = $$8.b().get($$10);
         grs $$12 = $$6 ? ges.a($$11.b()) : ges.b($$11.b());
         a($$0, $$1, $$2, $$3, $$4, $$12, $$11.c());
      }
   }

   private static void a(fam $$0, ged $$1, int $$2, int $$3, fxo $$4, grs $$5, csv $$6) {
      float[] $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gel::m), $$2, $$3, $$7[0], $$7[1], $$7[2], 1.0F);
   }
}
