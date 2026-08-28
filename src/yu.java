public abstract class yu<T extends vv> implements yw<T> {
   private final Iterable<yw<? super T>> a;

   protected yu(Iterable<yw<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<yw<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract yy<? extends yu<T>> a();
}
