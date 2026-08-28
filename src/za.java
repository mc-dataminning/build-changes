public abstract class za<T extends wb> implements zc<T> {
   private final Iterable<zc<? super T>> a;

   protected za(Iterable<zc<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zc<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract ze<? extends za<T>> a();
}
