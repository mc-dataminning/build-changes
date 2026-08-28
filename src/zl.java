public abstract class zl<T extends wk> implements zo<T> {
   private final Iterable<zo<? super T>> a;

   protected zl(Iterable<zo<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zo<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zq<? extends zl<T>> a();
}
