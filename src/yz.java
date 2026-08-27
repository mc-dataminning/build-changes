public abstract class yz<T extends wa> implements zb<T> {
   private final Iterable<zb<? super T>> a;

   protected yz(Iterable<zb<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zb<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zd<? extends yz<T>> a();
}
