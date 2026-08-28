public abstract class zh<T extends wi> implements zj<T> {
   private final Iterable<zj<? super T>> a;

   protected zh(Iterable<zj<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zj<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zl<? extends zh<T>> a();
}
