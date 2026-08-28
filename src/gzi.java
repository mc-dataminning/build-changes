public abstract class gzi<S extends hbp, M extends gfd<S>> extends gzy<S, M> {
   public gzi(gxh<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(fiq $$0, gpd $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.u;
         M $$7 = this.c();
         fiu $$8 = $$1.getBuffer(gpn.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, hhp.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract ale a();

   protected abstract M c();
}
