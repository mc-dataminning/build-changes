public class gjv<T extends cim> extends gik<T, fur<T>> {
   private static final akn a = new akn("textures/entity/skeleton/skeleton.png");

   public gjv(ght.a $$0) {
      this($$0, fvv.bn, fvv.bp, fvv.bq);
   }

   public gjv(ght.a $$0, fvu $$1, fvu $$2, fvu $$3) {
      this($$0, $$2, $$3, new fur<>($$0.a($$1)));
   }

   public gjv(ght.a $$0, fvu $$1, fvu $$2, fur<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new glv<>(this, new fur($$0.a($$1)), new fur($$0.a($$2)), $$0.g()));
   }

   public akn a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gr();
   }
}
