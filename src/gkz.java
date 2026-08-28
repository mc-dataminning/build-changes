public class gkz<T extends cjl> extends gjo<T, fvv<T>> {
   private static final alf a = new alf("textures/entity/skeleton/skeleton.png");

   public gkz(gix.a $$0) {
      this($$0, fwz.bn, fwz.bp, fwz.bq);
   }

   public gkz(gix.a $$0, fwy $$1, fwy $$2, fwy $$3) {
      this($$0, $$2, $$3, new fvv<>($$0.a($$1)));
   }

   public gkz(gix.a $$0, fwy $$1, fwy $$2, fvv<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gmz<>(this, new fvv($$0.a($$1)), new fvv($$0.a($$2)), $$0.g()));
   }

   public alf a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gs();
   }
}
