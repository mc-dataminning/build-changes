public class glo<T extends chz> extends gkp<T> {
   private static final gtg g = gtg.c("item_frame", "map=false");
   private static final gtg h = gtg.c("item_frame", "map=true");
   private static final gtg i = gtg.c("glow_item_frame", "map=false");
   private static final gtg j = gtg.c("glow_item_frame", "map=true");
   public static final int a = 5;
   public static final int b = 30;
   private final glp k;
   private final gga l;

   public glo(gkq.a $$0) {
      super($$0);
      this.k = $$0.b();
      this.l = $$0.c();
   }

   protected int a(T $$0, ir $$1) {
      return $$0.ak() == bsb.X ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      iw $$6 = $$0.cM();
      ewu $$7 = this.a($$0, $$2);
      $$3.a(-$$7.a(), -$$7.b(), -$$7.c());
      double $$8 = 0.46875;
      $$3.a((double)$$6.j() * 0.46875, (double)$$6.k() * 0.46875, (double)$$6.l() * 0.46875);
      $$3.a(a.b.rotationDegrees($$0.dM()));
      $$3.a(a.d.rotationDegrees(180.0F - $$0.dK()));
      boolean $$9 = $$0.cm();
      cuh $$10 = $$0.E();
      if (!$$9) {
         gtf $$11 = this.l.a().a();
         gtg $$12 = this.a($$0, $$10);
         $$3.a();
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.l.b().a($$3.c(), $$4.getBuffer(gfv.h()), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$5, gqp.d);
         $$3.b();
      }

      if (!$$10.d()) {
         eqr $$13 = $$0.F();
         if ($$9) {
            $$3.a(0.0F, 0.0F, 0.5F);
         } else {
            $$3.a(0.0F, 0.0F, 0.4375F);
         }

         int $$14 = $$13 != null ? $$0.I() % 4 * 2 : $$0.I();
         $$3.a(a.f.rotationDegrees((float)$$14 * 360.0F / 8.0F));
         if ($$13 != null) {
            $$3.a(a.f.rotationDegrees(180.0F));
            float $$15 = 0.0078125F;
            $$3.b(0.0078125F, 0.0078125F, 0.0078125F);
            $$3.a(-64.0F, -64.0F, 0.0F);
            eqt $$16 = cuq.a($$13, $$0.dU());
            $$3.a(0.0F, 0.0F, -1.0F);
            if ($$16 != null) {
               int $$17 = this.a($$0, 15728850, $$5);
               fgj.Q().j.j().a($$3, $$4, $$13, $$16, true, $$17);
            }
         } else {
            int $$18 = this.a($$0, 15728880, $$5);
            $$3.b(0.5F, 0.5F, 0.5F);
            this.k.a($$10, cue.i, $$18, gqp.d, $$3, $$4, $$0.dU(), $$0.al());
         }
      }

      $$3.b();
   }

   private int a(T $$0, int $$1, int $$2) {
      return $$0.ak() == bsb.X ? $$1 : $$2;
   }

   private gtg a(T $$0, cuh $$1) {
      boolean $$2 = $$0.ak() == bsb.X;
      if ($$1.a(cuk.tr)) {
         return $$2 ? j : h;
      } else {
         return $$2 ? i : g;
      }
   }

   public ewu a(T $$0, float $$1) {
      return new ewu((double)((float)$$0.cM().j() * 0.3F), -0.25, (double)((float)$$0.cM().l() * 0.3F));
   }

   public akt a(T $$0) {
      return gqx.e;
   }

   protected boolean b(T $$0) {
      if (fgj.M() && !$$0.E().d() && $$0.E().b(ke.f) && this.d.c == $$0) {
         double $$1 = this.d.b($$0);
         float $$2 = $$0.cd() ? 32.0F : 64.0F;
         return $$1 < (double)($$2 * $$2);
      } else {
         return false;
      }
   }

   protected void a(T $$0, xe $$1, fbc $$2, gfg $$3, int $$4, float $$5) {
      super.a($$0, $$0.E().w(), $$2, $$3, $$4, $$5);
   }
}
