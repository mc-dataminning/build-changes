public class glq<T extends ciz> extends gkf<T, fwl<T>> {
   private static final akk a = new akk("textures/entity/skeleton/skeleton.png");

   public glq(gjo.a $$0) {
      this($$0, fxp.bn, fxp.bp, fxp.bq);
   }

   public glq(gjo.a $$0, fxo $$1, fxo $$2, fxo $$3) {
      this($$0, $$2, $$3, new fwl<>($$0.a($$1)));
   }

   public glq(gjo.a $$0, fxo $$1, fxo $$2, fwl<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gnq<>(this, new fwl($$0.a($$1)), new fwl($$0.a($$2)), $$0.g()));
   }

   public akk a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gp();
   }
}
