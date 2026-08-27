public class gmv<T extends cik> extends gli<T, fxn<T>> {
   public static final akt a = new akt("textures/entity/skeleton/skeleton.png");

   public gmv(gkq.a $$0) {
      this($$0, fyr.br, fyr.bt, fyr.bu);
   }

   public gmv(gkq.a $$0, fyq $$1, fyq $$2, fyq $$3) {
      this($$0, $$2, $$3, new fxn<>($$0.a($$1)));
   }

   public gmv(gkq.a $$0, fyq $$1, fyq $$2, fxn<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gov<>(this, new fxn($$0.a($$1)), new fxn($$0.a($$2)), $$0.g()));
   }

   public akt a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gA();
   }
}
