public class fzs<T extends cha> extends fym<T> {
   private static final ahg f = new ahg("textures/entity/minecart.png");
   protected final fjx<T> a;
   private final fub g;

   public fzs(fyn.a $$0, fmv $$1) {
      super($$0);
      this.d = 0.7F;
      this.a = new fks<>($$0.a($$1));
      this.g = $$0.c();
   }

   public void a(T $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      long $$6 = (long)$$0.aj() * 493286711L;
      $$6 = $$6 * $$6 * 4392167121L + $$6 * 98761L;
      float $$7 = (((float)($$6 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float $$8 = (((float)($$6 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float $$9 = (((float)($$6 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      $$3.a($$7, $$8, $$9);
      double $$10 = auo.d((double)$$2, $$0.ac, $$0.dr());
      double $$11 = auo.d((double)$$2, $$0.ad, $$0.dt());
      double $$12 = auo.d((double)$$2, $$0.ae, $$0.dx());
      double $$13 = 0.3F;
      elt $$14 = $$0.q($$10, $$11, $$12);
      float $$15 = auo.i($$2, $$0.O, $$0.dE());
      if ($$14 != null) {
         elt $$16 = $$0.a($$10, $$11, $$12, 0.3F);
         elt $$17 = $$0.a($$10, $$11, $$12, -0.3F);
         if ($$16 == null) {
            $$16 = $$14;
         }

         if ($$17 == null) {
            $$17 = $$14;
         }

         $$3.a($$14.c - $$10, ($$16.d + $$17.d) / 2.0 - $$11, $$14.e - $$12);
         elt $$18 = $$17.b(-$$16.c, -$$16.d, -$$16.e);
         if ($$18.f() != 0.0) {
            $$18 = $$18.d();
            $$1 = (float)(Math.atan2($$18.e, $$18.c) * 180.0 / Math.PI);
            $$15 = (float)(Math.atan($$18.d) * 73.0);
         }
      }

      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      $$3.a(a.f.rotationDegrees(-$$15));
      float $$19 = (float)$$0.O() - $$2;
      float $$20 = $$0.N() - $$2;
      if ($$20 < 0.0F) {
         $$20 = 0.0F;
      }

      if ($$19 > 0.0F) {
         $$3.a(a.b.rotationDegrees(auo.a($$19) * $$19 * $$20 / 10.0F * (float)$$0.P()));
      }

      int $$21 = $$0.z();
      djh $$22 = $$0.x();
      if ($$22.l() != dcv.a) {
         $$3.a();
         float $$23 = 0.75F;
         $$3.b(0.75F, 0.75F, 0.75F);
         $$3.a(-0.5F, (float)($$21 - 8) / 16.0F, 0.5F);
         $$3.a(a.d.rotationDegrees(90.0F));
         this.a($$0, $$2, $$22, $$3, $$4, $$5);
         $$3.b();
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      this.a.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eqf $$24 = $$4.getBuffer(this.a.a(this.a($$0)));
      this.a.a($$3, $$24, $$5, gee.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public ahg a(T $$0) {
      return f;
   }

   protected void a(T $$0, float $$1, djh $$2, eqb $$3, fth $$4, int $$5) {
      this.g.a($$2, $$3, $$4, $$5, gee.d);
   }
}
