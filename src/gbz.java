import javax.annotation.Nullable;

public class gbz extends gca {
   private final iz a;
   private final float b;
   private final float F;

   public gbz(fxt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dsa $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, iz.a($$1, $$2, $$3));
   }

   public gbz(fxt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dsa $$7, iz $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.a = $$8;
      this.a(ffd.Q().ao().a().a($$7));
      this.u = 1.0F;
      this.v = 0.6F;
      this.w = 0.6F;
      this.x = 0.6F;
      if (!$$7.a(dez.i)) {
         int $$9 = ffd.Q().av().a($$7, $$0, $$8, 0);
         this.v *= (float)($$9 >> 16 & 0xFF) / 255.0F;
         this.w *= (float)($$9 >> 8 & 0xFF) / 255.0F;
         this.x *= (float)($$9 & 0xFF) / 255.0F;
      }

      this.D /= 2.0F;
      this.b = this.r.i() * 3.0F;
      this.F = this.r.i() * 3.0F;
   }

   @Override
   public gbe b() {
      return gbe.a;
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
      return $$1 == 0 && this.c.B(this.a) ? gdk.a(this.c, this.a) : $$1;
   }

   @Nullable
   static gbz a(la $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      dsa $$8 = $$0.b();
      return !$$8.i() && !$$8.a(dez.bQ) && $$8.z() ? new gbz($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) : null;
   }

   public static class a implements gbd<la> {
      @Nullable
      public gba a(la $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gba $$8 = gbz.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         if ($$8 != null) {
            $$8.b($$1.z.k() / 30.0, $$6 + $$1.z.k() / 2.0, $$1.z.k() / 30.0);
            $$8.a($$1.z.a(20) + 20);
         }

         return $$8;
      }
   }

   public static class b implements gbd<la> {
      @Nullable
      public gba a(la $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return gbz.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
