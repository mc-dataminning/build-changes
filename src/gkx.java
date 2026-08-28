public class gkx<T extends cjj> extends gjm<T, fvt<T>> {
   private static final ale a = new ale("textures/entity/skeleton/skeleton.png");

   public gkx(giv.a $$0) {
      this($$0, fwx.bn, fwx.bp, fwx.bq);
   }

   public gkx(giv.a $$0, fww $$1, fww $$2, fww $$3) {
      this($$0, $$2, $$3, new fvt<>($$0.a($$1)));
   }

   public gkx(giv.a $$0, fww $$1, fww $$2, fvt<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gmx<>(this, new fvt($$0.a($$1)), new fvt($$0.a($$2)), $$0.g()));
   }

   public ale a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gs();
   }
}
