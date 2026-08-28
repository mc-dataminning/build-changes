public abstract class zf<T extends wg> implements zh<T> {
   private final Iterable<zh<? super T>> a;

   protected zf(Iterable<zh<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zh<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zj<? extends zf<T>> a();
}
