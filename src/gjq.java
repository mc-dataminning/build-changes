import javax.annotation.Nullable;

public class gjq extends gjr {
   private final jh a;
   private final float b;
   private final float F;

   public gjq(gfj $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dxu $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, jh.a($$1, $$2, $$3));
   }

   public gjq(gfj $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dxu $$7, jh $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.a = $$8;
      this.a(fmf.Q().ap().a().a($$7));
      this.u = 1.0F;
      this.v = 0.6F;
      this.w = 0.6F;
      this.x = 0.6F;
      if (!$$7.a(dkn.i)) {
         int $$9 = fmf.Q().aw().a($$7, $$0, $$8, 0);
         this.v *= (float)($$9 >> 16 & 0xFF) / 255.0F;
         this.w *= (float)($$9 >> 8 & 0xFF) / 255.0F;
         this.x *= (float)($$9 & 0xFF) / 255.0F;
      }

      this.D /= 2.0F;
      this.b = this.r.i() * 3.0F;
      this.F = this.r.i() * 3.0F;
   }

   @Override
   public giv b() {
      return giv.a;
   }

   @Override
   protected float c() {
      return this.E.a((this.b + 1.0F) / 4.0F);
   }

   @Override
   protected float d() {
      return this.E.a(this.b / 4.0F);
   }

   @Override
   protected float e() {
      return this.E.c(this.F / 4.0F);
   }

   @Override
   protected float f() {
      return this.E.c((this.F + 1.0F) / 4.0F);
   }

   @Override
   public int a(float $$0) {
      int $$1 = super.a($$0);
      return $$1 == 0 && this.c.B(this.a) ? glg.a(this.c, this.a) : $$1;
   }

   @Nullable
   static gjq a(lk $$0, gfj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      dxu $$8 = $$0.b();
      return !$$8.l() && !$$8.a(dkn.bX) && $$8.D() ? new gjq($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) : null;
   }

   public static class a implements giu<lk> {
      @Nullable
      public gir a(lk $$0, gfj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gir $$8 = gjq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         if ($$8 != null) {
            $$8.b(0.0, 0.0, 0.0);
            $$8.a($$1.A.a(10) + 1);
         }

         return $$8;
      }
   }

   public static class b implements giu<lk> {
      @Nullable
      public gir a(lk $$0, gfj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gir $$8 = gjq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         if ($$8 != null) {
            $$8.b($$1.A.k() / 30.0, $$6 + $$1.A.k() / 2.0, $$1.A.k() / 30.0);
            $$8.a($$1.A.a(20) + 20);
         }

         return $$8;
      }
   }

   public static class c implements giu<lk> {
      @Nullable
      public gir a(lk $$0, gfj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return gjq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
