public abstract class zm<T extends wn> implements zo<T> {
   private final Iterable<zo<? super T>> a;

   protected zm(Iterable<zo<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zo<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zq<? extends zm<T>> a();
}
