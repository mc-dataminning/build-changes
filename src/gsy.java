public class gsy<T extends ckt> extends gsa<T, gzf> {
   public static final int a = 5;
   public static final int b = 30;
   private final hbi h;
   private final glu i;
   private final gmz j;

   public gsy(gsb.a $$0) {
      super($$0);
      this.h = $$0.b();
      this.i = $$0.c();
      this.j = $$0.d();
   }

   protected int a(T $$0, ji $$1) {
      return $$0.aq() == buq.af ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(gzf $$0, ffs $$1, glv $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a();
      jn $$4 = $$0.a;
      fay $$5 = this.a($$0);
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
      if (!$$0.z) {
         hha $$11 = this.j.a().a();
         hhb $$12 = b($$0);
         $$1.a();
         $$1.a(-0.5F, -0.5F, -0.5F);
         this.j.b().a($$1.c(), $$2.getBuffer(gmf.e(hel.d)), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$3, hec.d);
         $$1.b();
      }

      if ($$0.z) {
         $$1.a(0.0F, 0.0F, 0.5F);
      } else {
         $$1.a(0.0F, 0.0F, 0.4375F);
      }

      if ($$0.e != null) {
         int $$13 = $$0.c % 4 * 2;
         $$1.a(a.f.rotationDegrees((float)$$13 * 360.0F / 8.0F));
         $$1.a(a.f.rotationDegrees(180.0F));
         float $$14 = 0.0078125F;
         $$1.b(0.0078125F, 0.0078125F, 0.0078125F);
         $$1.a(-64.0F, -64.0F, 0.0F);
         $$1.a(0.0F, 0.0F, -1.0F);
         int $$15 = this.a($$0.d, 15728850, $$3);
         this.i.a($$0.f, $$1, $$2, true, $$15);
      } else if (!$$0.b.c()) {
         $$1.a(a.f.rotationDegrees((float)$$0.c * 360.0F / 8.0F));
         int $$16 = this.a($$0.d, 15728880, $$3);
         $$1.b(0.5F, 0.5F, 0.5F);
         $$0.b.a($$1, $$2, $$16, hec.d);
      }

      $$1.b();
   }

   private int a(boolean $$0, int $$1, int $$2) {
      return $$0 ? $$1 : $$2;
   }

   private static hhb b(gzf $$0) {
      if ($$0.e != null) {
         return $$0.d ? hgo.a : hgo.c;
      } else {
         return $$0.d ? hgo.b : hgo.d;
      }
   }

   public fay a(gzf $$0) {
      return new fay((double)((float)$$0.a.j() * 0.3F), -0.25, (double)((float)$$0.a.l() * 0.3F));
   }

   protected boolean a(T $$0, double $$1) {
      return flh.M() && this.e.c == $$0 && $$0.A().z() != null;
   }

   protected wo a(T $$0) {
      return $$0.A().y();
   }

   public gzf a() {
      return new gzf();
   }

   public void a(T $$0, gzf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.cO();
      cwn $$3 = $$0.A();
      this.h.a($$1.b, $$3, cwl.i, $$0);
      $$1.c = $$0.C();
      $$1.d = $$0.aq() == buq.af;
      $$1.e = null;
      if (!$$3.f()) {
         eup $$4 = $$0.a($$3);
         if ($$4 != null) {
            eur $$5 = $$0.dW().a($$4);
            if ($$5 != null) {
               this.i.a($$4, $$5, $$1.f);
               $$1.e = $$4;
            }
         }
      }
   }
}
