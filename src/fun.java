import org.joml.Matrix4f;

public abstract class fun<T extends bji, M extends ffd<T>> extends fui<T, M> {
   public static final int h = 24;

   public fun(fth.a $$0, M $$1, float $$2) {
      super($$0, $$1, $$2);
   }

   protected boolean a(T $$0) {
      return super.b($$0) && ($$0.cC() || $$0.ad() && $$0 == this.c.c);
   }

   public boolean a(T $$0, frg $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         biq $$5 = $$0.fS();
         return $$5 != null ? $$1.a($$5.g_()) : false;
      }
   }

   public void a(T $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      biq $$6 = $$0.fS();
      if ($$6 != null) {
         this.a($$0, $$2, $$3, $$4, $$6);
      }
   }

   private <E extends biq> void a(T $$0, float $$1, elp $$2, foe $$3, E $$4) {
      $$2.a();
      ehn $$5 = $$4.q($$1);
      double $$6 = (double)(arx.i($$1, $$0.aV, $$0.aU) * (float) (Math.PI / 180.0)) + (Math.PI / 2);
      ehn $$7 = $$0.p($$1);
      double $$8 = Math.cos($$6) * $$7.e + Math.sin($$6) * $$7.c;
      double $$9 = Math.sin($$6) * $$7.e - Math.cos($$6) * $$7.c;
      double $$10 = arx.d((double)$$1, $$0.K, $$0.dq()) + $$8;
      double $$11 = arx.d((double)$$1, $$0.L, $$0.ds()) + $$7.d;
      double $$12 = arx.d((double)$$1, $$0.M, $$0.dw()) + $$9;
      $$2.a($$8, $$7.d, $$9);
      float $$13 = (float)($$5.c - $$10);
      float $$14 = (float)($$5.d - $$11);
      float $$15 = (float)($$5.e - $$12);
      float $$16 = 0.025F;
      elt $$17 = $$3.getBuffer(fom.i());
      Matrix4f $$18 = $$2.c().a();
      float $$19 = arx.i($$13 * $$13 + $$15 * $$15) * 0.025F / 2.0F;
      float $$20 = $$15 * $$19;
      float $$21 = $$13 * $$19;
      gw $$22 = gw.a($$0.j($$1));
      gw $$23 = gw.a($$4.j($$1));
      int $$24 = this.a($$0, $$22);
      int $$25 = this.c.a($$4).a($$4, $$23);
      int $$26 = $$0.dL().a(cqe.a, $$22);
      int $$27 = $$0.dL().a(cqe.a, $$23);

      for (int $$28 = 0; $$28 <= 24; $$28++) {
         a($$17, $$18, $$13, $$14, $$15, $$24, $$25, $$26, $$27, 0.025F, 0.025F, $$20, $$21, $$28, false);
      }

      for (int $$29 = 24; $$29 >= 0; $$29--) {
         a($$17, $$18, $$13, $$14, $$15, $$24, $$25, $$26, $$27, 0.025F, 0.0F, $$20, $$21, $$29, true);
      }

      $$2.b();
   }

   private static void a(
      elt $$0,
      Matrix4f $$1,
      float $$2,
      float $$3,
      float $$4,
      int $$5,
      int $$6,
      int $$7,
      int $$8,
      float $$9,
      float $$10,
      float $$11,
      float $$12,
      int $$13,
      boolean $$14
   ) {
      float $$15 = (float)$$13 / 24.0F;
      int $$16 = (int)arx.i($$15, (float)$$5, (float)$$6);
      int $$17 = (int)arx.i($$15, (float)$$7, (float)$$8);
      int $$18 = fod.a($$16, $$17);
      float $$19 = $$13 % 2 == ($$14 ? 1 : 0) ? 0.7F : 1.0F;
      float $$20 = 0.5F * $$19;
      float $$21 = 0.4F * $$19;
      float $$22 = 0.3F * $$19;
      float $$23 = $$2 * $$15;
      float $$24 = $$3 > 0.0F ? $$3 * $$15 * $$15 : $$3 - $$3 * (1.0F - $$15) * (1.0F - $$15);
      float $$25 = $$4 * $$15;
      $$0.a($$1, $$23 - $$11, $$24 + $$10, $$25 + $$12).a($$20, $$21, $$22, 1.0F).b($$18).e();
      $$0.a($$1, $$23 + $$11, $$24 + $$9 - $$10, $$25 - $$12).a($$20, $$21, $$22, 1.0F).b($$18).e();
   }
}
