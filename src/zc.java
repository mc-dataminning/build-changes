public abstract class zc<T extends wd> implements ze<T> {
   private final Iterable<ze<? super T>> a;

   protected zc(Iterable<ze<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<ze<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zg<? extends zc<T>> a();
}
