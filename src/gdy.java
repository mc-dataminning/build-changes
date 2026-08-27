public class gdy<T extends cex> extends gda<T> {
   private static final glj g = glj.c("item_frame", "map=false");
   private static final glj h = glj.c("item_frame", "map=true");
   private static final glj i = glj.c("glow_item_frame", "map=false");
   private static final glj j = glj.c("glow_item_frame", "map=true");
   public static final int a = 5;
   public static final int f = 30;
   private final gdz k;
   private final fym l;

   public gdy(gdb.a $$0) {
      super($$0);
      this.k = $$0.b();
      this.l = $$0.c();
   }

   protected int a(T $$0, ib $$1) {
      return $$0.ai() == bpd.W ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      ih $$6 = $$0.cE();
      ept $$7 = this.a($$0, $$2);
      $$3.a(-$$7.a(), -$$7.b(), -$$7.c());
      double $$8 = 0.46875;
      $$3.a((double)$$6.j() * 0.46875, (double)$$6.k() * 0.46875, (double)$$6.l() * 0.46875);
      $$3.a(a.b.rotationDegrees($$0.dE()));
      $$3.a(a.d.rotationDegrees(180.0F - $$0.dC()));
      boolean $$9 = $$0.ce();
      cqm $$10 = $$0.E();
      if (!$$9) {
         gli $$11 = this.l.a().a();
         glj $$12 = this.a($$0, $$10);
         $$3.a();
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.l.b().a($$3.c(), $$4.getBuffer(fyh.h()), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$5, git.d);
         $$3.b();
      }

      if (!$$10.b()) {
         ejy $$13 = $$0.G();
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
            eka $$16 = cqt.a($$13, $$0.dM());
            $$3.a(0.0F, 0.0F, -1.0F);
            if ($$16 != null) {
               int $$17 = this.a($$0, 15728850, $$5);
               ezi.Q().j.j().a($$3, $$4, $$13, $$16, true, $$17);
            }
         } else {
            int $$18 = this.a($$0, 15728880, $$5);
            $$3.b(0.5F, 0.5F, 0.5F);
            this.k.a($$10, cqj.i, $$18, git.d, $$3, $$4, $$0.dM(), $$0.aj());
         }
      }

      $$3.b();
   }

   private int a(T $$0, int $$1, int $$2) {
      return $$0.ai() == bpd.W ? $$1 : $$2;
   }

   private glj a(T $$0, cqm $$1) {
      boolean $$2 = $$0.ai() == bpd.W;
      if ($$1.a(cqp.rT)) {
         return $$2 ? j : h;
      } else {
         return $$2 ? i : g;
      }
   }

   public ept a(T $$0, float $$1) {
      return new ept((double)((float)$$0.cE().j() * 0.3F), -0.25, (double)((float)$$0.cE().l() * 0.3F));
   }

   public ajh a(T $$0) {
      return gjb.e;
   }

   protected boolean b(T $$0) {
      if (ezi.M() && !$$0.E().b() && $$0.E().B() && this.c.c == $$0) {
         double $$1 = this.c.b($$0);
         float $$2 = $$0.bV() ? 32.0F : 64.0F;
         return $$1 < (double)($$2 * $$2);
      } else {
         return false;
      }
   }

   protected void a(T $$0, vu $$1, eub $$2, fxs $$3, int $$4, float $$5) {
      super.a($$0, $$0.E().z(), $$2, $$3, $$4, $$5);
   }
}
