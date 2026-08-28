import javax.annotation.Nullable;

public class gdk extends gdl {
   private final jd a;
   private final float b;
   private final float F;

   public gdk(fzd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dtc $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, jd.a($$1, $$2, $$3));
   }

   public gdk(fzd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dtc $$7, jd $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.a = $$8;
      this.a(fgm.Q().ao().a().a($$7));
      this.u = 1.0F;
      this.v = 0.6F;
      this.w = 0.6F;
      this.x = 0.6F;
      if (!$$7.a(dga.i)) {
         int $$9 = fgm.Q().au().a($$7, $$0, $$8, 0);
         this.v *= (float)($$9 >> 16 & 0xFF) / 255.0F;
         this.w *= (float)($$9 >> 8 & 0xFF) / 255.0F;
         this.x *= (float)($$9 & 0xFF) / 255.0F;
      }

      this.D /= 2.0F;
      this.b = this.r.i() * 3.0F;
      this.F = this.r.i() * 3.0F;
   }

   @Override
   public gcp b() {
      return gcp.a;
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
      return $$1 == 0 && this.c.B(this.a) ? gev.a(this.c, this.a) : $$1;
   }

   @Nullable
   static gdk a(le $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      dtc $$8 = $$0.b();
      return !$$8.i() && !$$8.a(dga.bQ) && $$8.z() ? new gdk($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) : null;
   }

   public static class a implements gco<le> {
      @Nullable
      public gcl a(le $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gcl $$8 = gdk.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         if ($$8 != null) {
            $$8.b($$1.z.k() / 30.0, $$6 + $$1.z.k() / 2.0, $$1.z.k() / 30.0);
            $$8.a($$1.z.a(20) + 20);
         }

         return $$8;
      }
   }

   public static class b implements gco<le> {
      @Nullable
      public gcl a(le $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return gdk.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
