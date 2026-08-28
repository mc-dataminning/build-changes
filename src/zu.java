public abstract class zu<T extends wv> implements zw<T> {
   private final Iterable<zw<? super T>> a;

   protected zu(Iterable<zw<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zw<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zy<? extends zu<T>> a();
}
