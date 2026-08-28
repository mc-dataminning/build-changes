public class gal extends gcr {
   private final float a;
   private final float b;

   gal(fyj $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cuc $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gbv b() {
      return gbv.a;
   }

   protected gal(fyj $$0, double $$1, double $$2, double $$3, cuc $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.a(fft.Q().ar().a($$4, $$0, null, 0).e());
      this.u = 1.0F;
      this.D /= 2.0F;
      this.a = this.r.i() * 3.0F;
      this.b = this.r.i() * 3.0F;
   }

   @Override
   protected float c() {
      return this.E.a((this.a + 1.0F) / 4.0F);
   }

   @Override
   protected float d() {
      return this.E.a(this.a / 4.0F);
   }

   @Override
   protected float e() {
      return this.E.c(this.b / 4.0F);
   }

   @Override
   protected float f() {
      return this.E.c((this.b + 1.0F) / 4.0F);
   }

   public static class a implements gbu<ln> {
      public gbr a(ln $$0, fyj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gal($$1, $$2, $$3, $$4, new cuc(cuf.cM));
      }
   }

   public static class b implements gbu<lf> {
      public gbr a(lf $$0, fyj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gal($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.b());
      }
   }

   public static class c implements gbu<ln> {
      public gbr a(ln $$0, fyj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gal($$1, $$2, $$3, $$4, new cuc(cuf.qQ));
      }
   }

   public static class d implements gbu<ln> {
      public gbr a(ln $$0, fyj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gal($$1, $$2, $$3, $$4, new cuc(cuf.qC));
      }
   }
}
