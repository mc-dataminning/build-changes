public class gbo extends gdu {
   private final float a;
   private final float b;

   gbo(fzn $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cuh $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gcy b() {
      return gcy.a;
   }

   protected gbo(fzn $$0, double $$1, double $$2, double $$3, cuh $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.a(fgj.Q().as().a($$4, $$0, null, 0).e());
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

   public static class a implements gcx<kx> {
      public gcu a(kx $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbo($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.b());
      }
   }

   public static class b implements gcx<le> {
      public gcu a(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbo($$1, $$2, $$3, $$4, new cuh(cuk.sn));
      }
   }

   public static class c implements gcx<le> {
      public gcu a(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbo($$1, $$2, $$3, $$4, new cuh(cuk.rZ));
      }
   }
}
