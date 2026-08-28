public class gis extends gkc<cjs, ftx<cjs>> {
   private static final ale a = new ale("textures/entity/enderman/enderman.png");
   private final azg i = azg.a();

   public gis(giw.a $$0) {
      super($$0, new ftx<>($$0.a(fwy.X)), 0.5F);
      this.a(new gms<>(this));
      this.a(new gmj(this, $$0.c()));
   }

   public void a(cjs $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      dsb $$6 = $$0.gq();
      ftx<cjs> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gr();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public evq a(cjs $$0, float $$1) {
      if ($$0.gr()) {
         double $$2 = 0.02 * (double)$$0.ee();
         return new evq(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public ale a(cjs $$0) {
      return a;
   }
}
