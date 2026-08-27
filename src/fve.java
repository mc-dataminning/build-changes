public class fve extends ftu<byx, fgt<byx>> {
   private static final aez a = new aez("textures/entity/skeleton/skeleton.png");

   public fve(ftd.a $$0) {
      this($$0, fhw.bh, fhw.bj, fhw.bk);
   }

   public fve(ftd.a $$0, fhv $$1, fhv $$2, fhv $$3) {
      super($$0, new fgt<>($$0.a($$1)), 0.5F);
      this.a(new fxb<>(this, new fgt($$0.a($$2)), new fgt($$0.a($$3)), $$0.g()));
   }

   public aez a(byx $$0) {
      return a;
   }

   protected boolean b(byx $$0) {
      return $$0.ge();
   }
}
