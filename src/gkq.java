public class gkq extends gki<cnl> {
   private static final akr a = akr.b("textures/entity/fishing_hook.png");
   private static final gfh g = gfh.d(a);
   private static final double h = 960.0;

   public gkq(gkj.a $$0) {
      super($$0);
   }

   public void a(cnl $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      cmx $$6 = $$0.t();
      if ($$6 != null) {
         $$3.a();
         $$3.a();
         $$3.b(0.5F, 0.5F, 0.5F);
         $$3.a(this.d.b());
         fbi.a $$7 = $$3.c();
         fbm $$8 = $$4.getBuffer(g);
         a($$8, $$7, $$5, 0.0F, 0, 0, 1);
         a($$8, $$7, $$5, 1.0F, 0, 1, 1);
         a($$8, $$7, $$5, 1.0F, 1, 1, 0);
         a($$8, $$7, $$5, 0.0F, 1, 0, 0);
         $$3.b();
         float $$9 = $$6.B($$2);
         float $$10 = ayo.a(ayo.c($$9) * (float) Math.PI);
         exc $$11 = this.a($$6, $$10, $$2);
         exc $$12 = $$0.m($$2).b(0.0, 0.25, 0.0);
         float $$13 = (float)($$11.c - $$12.c);
         float $$14 = (float)($$11.d - $$12.d);
         float $$15 = (float)($$11.e - $$12.e);
         fbm $$16 = $$4.getBuffer(gfh.z());
         fbi.a $$17 = $$3.c();
         int $$18 = 16;

         for (int $$19 = 0; $$19 <= 16; $$19++) {
            a($$13, $$14, $$15, $$16, $$17, a($$19, 16), a($$19 + 1, 16));
         }

         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private exc a(cmx $$0, float $$1, float $$2) {
      int $$3 = $$0.fq() == btg.b ? 1 : -1;
      cuq $$4 = $$0.eT();
      if (!$$4.a(cut.qV)) {
         $$3 = -$$3;
      }

      if (this.d.d.aB().a() && $$0 == fgo.Q().s) {
         double $$12 = 960.0 / (double)this.d.d.ah().c().intValue();
         exc $$13 = this.d.b.j().a((float)$$3 * 0.525F, -0.1F).a($$12).b($$1 * 0.5F).a(-$$1 * 0.7F);
         return $$0.k($$2).e($$13);
      } else {
         float $$5 = ayo.i($$2, $$0.aZ, $$0.aY) * (float) (Math.PI / 180.0);
         double $$6 = (double)ayo.a($$5);
         double $$7 = (double)ayo.b($$5);
         float $$8 = $$0.eb();
         double $$9 = (double)$$3 * 0.35 * (double)$$8;
         double $$10 = 0.8 * (double)$$8;
         float $$11 = $$0.cb() ? -0.1875F : 0.0F;
         return $$0.k($$2).b(-$$7 * $$9 - $$6 * $$10, (double)$$11 - 0.45 * (double)$$8, -$$6 * $$9 + $$7 * $$10);
      }
   }

   private static float a(int $$0, int $$1) {
      return (float)$$0 / (float)$$1;
   }

   private static void a(fbm $$0, fbi.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.5F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(gqc.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   private static void a(float $$0, float $$1, float $$2, fbm $$3, fbi.a $$4, float $$5, float $$6) {
      float $$7 = $$0 * $$5;
      float $$8 = $$1 * ($$5 * $$5 + $$5) * 0.5F + 0.25F;
      float $$9 = $$2 * $$5;
      float $$10 = $$0 * $$6 - $$7;
      float $$11 = $$1 * ($$6 * $$6 + $$6) * 0.5F + 0.25F - $$8;
      float $$12 = $$2 * $$6 - $$9;
      float $$13 = ayo.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
      $$10 /= $$13;
      $$11 /= $$13;
      $$12 /= $$13;
      $$3.a($$4, $$7, $$8, $$9).a(-16777216).b($$4, $$10, $$11, $$12);
   }

   public akr a(cnl $$0) {
      return a;
   }
}
