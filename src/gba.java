public class gba extends gcb {
   gba(fxu $$0, double $$1, double $$2, double $$3, double $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.B = 0.66F;
      this.C = true;
      this.j *= 0.01F;
      this.k *= 0.01F;
      this.l *= 0.01F;
      this.k += 0.2;
      this.v = Math.max(0.0F, ayy.a(((float)$$4 + 0.0F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.w = Math.max(0.0F, ayy.a(((float)$$4 + 0.33333334F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.x = Math.max(0.0F, ayy.a(((float)$$4 + 0.6666667F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.D *= 1.5F;
      this.t = 6;
   }

   @Override
   public gbf b() {
      return gbf.b;
   }

   @Override
   public float b(float $$0) {
      return this.D * ayy.a(((float)this.s + $$0) / (float)this.t * 32.0F, 0.0F, 1.0F);
   }

   public static class a implements gbe<lm> {
      private final gbw a;

      public a(gbw $$0) {
         this.a = $$0;
      }

      public gbb a(lm $$0, fxu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gba $$8 = new gba($$1, $$2, $$3, $$4, $$5);
         $$8.a(this.a);
         return $$8;
      }
   }
}
