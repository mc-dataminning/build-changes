import javax.annotation.Nullable;

public class gcb extends gcc {
   private final iz a;
   private final float b;
   private final float F;

   public gcb(fxv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dsc $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, iz.a($$1, $$2, $$3));
   }

   public gcb(fxv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dsc $$7, iz $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.a = $$8;
      this.a(fff.Q().ao().a().a($$7));
      this.u = 1.0F;
      this.v = 0.6F;
      this.w = 0.6F;
      this.x = 0.6F;
      if (!$$7.a(dfb.i)) {
         int $$9 = fff.Q().av().a($$7, $$0, $$8, 0);
         this.v *= (float)($$9 >> 16 & 0xFF) / 255.0F;
         this.w *= (float)($$9 >> 8 & 0xFF) / 255.0F;
         this.x *= (float)($$9 & 0xFF) / 255.0F;
      }

      this.D /= 2.0F;
      this.b = this.r.i() * 3.0F;
      this.F = this.r.i() * 3.0F;
   }

   @Override
   public gbg b() {
      return gbg.a;
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
      return $$1 == 0 && this.c.B(this.a) ? gdm.a(this.c, this.a) : $$1;
   }

   @Nullable
   static gcb a(la $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      dsc $$8 = $$0.b();
      return !$$8.i() && !$$8.a(dfb.bQ) && $$8.z() ? new gcb($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) : null;
   }

   public static class a implements gbf<la> {
      @Nullable
      public gbc a(la $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbc $$8 = gcb.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         if ($$8 != null) {
            $$8.b($$1.z.k() / 30.0, $$6 + $$1.z.k() / 2.0, $$1.z.k() / 30.0);
            $$8.a($$1.z.a(20) + 20);
         }

         return $$8;
      }
   }

   public static class b implements gbf<la> {
      @Nullable
      public gbc a(la $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return gcb.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
