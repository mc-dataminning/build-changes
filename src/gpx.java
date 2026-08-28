public class gpx<T extends cks> extends goz<T, gvz> {
   public static final int a = 5;
   public static final int b = 30;
   private final gpy h;
   private final giw i;
   private final gka j;

   public gpx(gpa.a $$0) {
      super($$0);
      this.h = $$0.b();
      this.i = $$0.c();
      this.j = $$0.d();
   }

   protected int a(T $$0, jh $$1) {
      return $$0.ar() == bup.V ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(gvz $$0, fek $$1, gix $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a();
      jm $$4 = $$0.a;
      ezr $$5 = this.a($$0);
      $$1.a(-$$5.a(), -$$5.b(), -$$5.c());
      double $$6 = 0.46875;
      $$1.a((double)$$4.j() * 0.46875, (double)$$4.k() * 0.46875, (double)$$4.l() * 0.46875);
      float $$7;
      float $$8;
      if ($$4.o().d()) {
         $$7 = 0.0F;
         $$8 = 180.0F - $$4.p();
      } else {
         $$7 = (float)(-90 * $$4.f().a());
         $$8 = 180.0F;
      }

      $$1.a(a.b.rotationDegrees($$7));
      $$1.a(a.d.rotationDegrees($$8));
      cwf $$11 = $$0.b;
      if (!$$0.u) {
         hbi $$12 = this.j.a().a();
         hbj $$13 = this.a($$0.d, $$11);
         $$1.a();
         $$1.a(-0.5F, -0.5F, -0.5F);
         this.j.b().a($$1.c(), $$2.getBuffer(gjh.d(gys.d)), null, $$12.a($$13), 1.0F, 1.0F, 1.0F, $$3, gyk.d);
         $$1.b();
      }

      if (!$$11.f()) {
         etg $$14 = $$0.f;
         if ($$0.u) {
            $$1.a(0.0F, 0.0F, 0.5F);
         } else {
            $$1.a(0.0F, 0.0F, 0.4375F);
         }

         int $$15 = $$14 != null ? $$0.c % 4 * 2 : $$0.c;
         $$1.a(a.f.rotationDegrees((float)$$15 * 360.0F / 8.0F));
         if ($$14 != null) {
            $$1.a(a.f.rotationDegrees(180.0F));
            float $$16 = 0.0078125F;
            $$1.b(0.0078125F, 0.0078125F, 0.0078125F);
            $$1.a(-64.0F, -64.0F, 0.0F);
            $$1.a(0.0F, 0.0F, -1.0F);
            int $$17 = this.a($$0.d, 15728850, $$3);
            this.i.a($$0.g, $$1, $$2, true, $$17);
         } else if ($$0.e != null) {
            int $$18 = this.a($$0.d, 15728880, $$3);
            $$1.b(0.5F, 0.5F, 0.5F);
            this.h.a($$11, cwd.i, false, $$1, $$2, $$18, gyk.d, $$0.e);
         }
      }

      $$1.b();
   }

   private int a(boolean $$0, int $$1, int $$2) {
      return $$0 ? $$1 : $$2;
   }

   private hbj a(boolean $$0, cwf $$1) {
      if ($$1.b(ku.L)) {
         return $$0 ? hax.a : hax.c;
      } else {
         return $$0 ? hax.b : hax.d;
      }
   }

   public ezr a(gvz $$0) {
      return new ezr((double)((float)$$0.a.j() * 0.3F), -0.25, (double)((float)$$0.a.l() * 0.3F));
   }

   protected boolean a(T $$0, double $$1) {
      return fjx.M() && !$$0.C().f() && $$0.C().b(ku.g) && this.e.c == $$0;
   }

   protected xl a(T $$0) {
      return $$0.C().y();
   }

   public gvz a() {
      return new gvz();
   }

   public void a(T $$0, gvz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.cQ();
      cwf $$3 = $$0.C();
      $$1.b = $$3.v();
      $$1.c = $$0.E();
      $$1.d = $$0.ar() == bup.V;
      $$1.e = null;
      $$1.f = null;
      if (!$$1.b.f()) {
         etg $$4 = $$0.a($$3);
         if ($$4 != null) {
            eti $$5 = $$0.dY().a($$4);
            if ($$5 != null) {
               this.i.a($$4, $$5, $$1.g);
               $$1.f = $$4;
            }
         } else {
            $$1.e = this.h.a($$3, $$0.dY(), null, $$0.as());
         }
      }
   }
}
