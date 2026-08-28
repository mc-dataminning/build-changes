public class gzh<T extends cnx> extends gyj<T, hfp> {
   public static final int a = 5;
   public static final int g = 30;
   private final hhs h;
   private final gsa i;
   private final gtf j;

   public gzh(gyk.a $$0) {
      super($$0);
      this.h = $$0.b();
      this.i = $$0.c();
      this.j = $$0.d();
   }

   protected int a(T $$0, iw $$1) {
      return $$0.an() == bxe.ag ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(hfp $$0, flq $$1, gsc $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a();
      jc $$4 = $$0.a;
      ffs $$5 = this.a($$0);
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
         ebg $$11 = hne.a($$0.d, $$0.e != null);
         gtp $$12 = this.j.a($$11);
         $$1.a();
         $$1.a(-0.5F, -0.5F, -0.5F);
         this.j.b().a($$1.c(), $$2.getBuffer(gsn.e(hlb.c)), $$12, 1.0F, 1.0F, 1.0F, $$3, hks.d);
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
         $$0.b.a($$1, $$2, $$16, hks.d);
      }

      $$1.b();
   }

   private int a(boolean $$0, int $$1, int $$2) {
      return $$0 ? $$1 : $$2;
   }

   public ffs a(hfp $$0) {
      return new ffs((double)((float)$$0.a.j() * 0.3F), -0.25, (double)((float)$$0.a.l() * 0.3F));
   }

   protected boolean a(T $$0, double $$1) {
      return frf.M() && this.d.c == $$0 && $$0.w().z() != null;
   }

   protected xc a(T $$0) {
      return $$0.w().y();
   }

   public hfp a() {
      return new hfp();
   }

   public void a(T $$0, hfp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.cO();
      daa $$3 = $$0.w();
      this.h.a($$1.b, $$3, czy.i, $$0);
      $$1.c = $$0.y();
      $$1.d = $$0.an() == bxe.ag;
      $$1.e = null;
      if (!$$3.f()) {
         ezj $$4 = $$0.a($$3);
         if ($$4 != null) {
            ezl $$5 = $$0.dV().a($$4);
            if ($$5 != null) {
               this.i.a($$4, $$5, $$1.f);
               $$1.e = $$4;
            }
         }
      }
   }
}
