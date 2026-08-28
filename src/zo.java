public abstract class zo<T extends wp> implements zq<T> {
   private final Iterable<zq<? super T>> a;

   protected zo(Iterable<zq<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zq<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zs<? extends zo<T>> a();
}
