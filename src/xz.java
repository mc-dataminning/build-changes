public abstract class xz<T extends va> implements yb<T> {
   private final Iterable<yb<? super T>> a;

   protected xz(Iterable<yb<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<yb<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract yd<? extends xz<T>> a();
}
