public class gnp implements gnu<dul> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final gem g;
   private final gem h;
   private final gem i;

   public gnp(gnv.a $$0) {
      gem $$1 = $$0.a(gel.q);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      $$1.a("flag", ger.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), geo.a(0.0F, -32.0F, 0.0F));
      $$1.a("pole", ger.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), geo.a);
      $$1.a("bar", ger.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), geo.a);
      return ges.a($$0, 64, 64);
   }

   public void a(dul $$0, float $$1, fgq $$2, glj $$3, int $$4, int $$5) {
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
      fgu $$13 = hdv.f.a($$3, glt::c);
      this.h.a($$2, $$13, $$4, $$5);
      this.i.a($$2, $$13, $$4, $$5);
      jh $$14 = $$0.aB_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$8, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * bae.b((float) (Math.PI * 2) * $$15)) * (float) Math.PI;
      a($$2, $$3, $$4, $$5, this.g, hdv.f, true, $$0.f(), $$0.b());
      $$2.b();
      $$2.b();
   }

   public static void a(fgq $$0, glj $$1, int $$2, int $$3, gem $$4, hds $$5, boolean $$6, cwl $$7, dun $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fgq $$0, glj $$1, int $$2, int $$3, gem $$4, hds $$5, boolean $$6, cwl $$7, dun $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, glt::c, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gme.m : gme.n, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dun.b $$12 = $$8.b().get($$11);
         hds $$13 = $$6 ? gme.a($$12.b()) : gme.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fgq $$0, glj $$1, int $$2, int $$3, gem $$4, hds $$5, cwl $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, glt::m), $$2, $$3, $$7);
   }
}
