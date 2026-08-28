public class glb<T extends cjn> extends gjq<T, fvx<T>> {
   private static final alf a = new alf("textures/entity/skeleton/skeleton.png");

   public glb(giz.a $$0) {
      this($$0, fxb.bn, fxb.bp, fxb.bq);
   }

   public glb(giz.a $$0, fxa $$1, fxa $$2, fxa $$3) {
      this($$0, $$2, $$3, new fvx<>($$0.a($$1)));
   }

   public glb(giz.a $$0, fxa $$1, fxa $$2, fvx<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gnb<>(this, new fvx($$0.a($$1)), new fvx($$0.a($$2)), $$0.g()));
   }

   public alf a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gs();
   }
}
