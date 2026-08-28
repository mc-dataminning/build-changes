public class gof implements gok<dto> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final gbc c;
   private final gbc d;
   private final gbb e;
   private final gbb f;

   public gof(gol.a $$0) {
      this($$0.f());
   }

   public gof(gez $$0) {
      this.c = new gbc($$0.a(gfc.q));
      this.d = new gbc($$0.a(gfc.s));
      this.e = new gbb($$0.a(gfc.r));
      this.f = new gbb($$0.a(gfc.t));
   }

   public void a(dto $$0, float $$1, ffu $$2, gly $$3, int $$4, int $$5) {
      dwx $$6 = $$0.m();
      gbc $$8;
      gbb $$9;
      float $$7;
      if ($$6.b() instanceof dir) {
         $$7 = -dyc.b($$6.c(dir.b));
         $$8 = this.c;
         $$9 = this.e;
      } else {
         $$7 = -$$6.c(dso.b).p();
         $$8 = this.d;
         $$9 = this.f;
      }

      long $$13 = $$0.i().ad();
      ji $$14 = $$0.aA_();
      float $$15 = ((float)Math.floorMod((long)($$14.u() * 7 + $$14.v() * 9 + $$14.w() * 13) + $$13, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$7, $$8, $$9, $$15, $$0.f(), $$0.b());
   }

   public void a(ffu $$0, gly $$1, int $$2, int $$3, cvm $$4, dtq $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(ffu $$0, gly $$1, int $$2, int $$3, float $$4, gbc $$5, gbb $$6, float $$7, cvm $$8, dtq $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hhc.f.a($$1, gmi::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hhc.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(ffu $$0, gly $$1, int $$2, int $$3, gfd $$4, hgz $$5, boolean $$6, cvm $$7, dtq $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(ffu $$0, gly $$1, int $$2, int $$3, gfd $$4, hgz $$5, boolean $$6, cvm $$7, dtq $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gmi::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gmt.m : gmt.n, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         dtq.b $$12 = $$8.b().get($$11);
         hgz $$13 = $$6 ? gmt.a($$12.b()) : gmt.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(ffu $$0, gly $$1, int $$2, int $$3, gfd $$4, hgz $$5, cvm $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gmi::n), $$2, $$3, $$7);
   }
}
