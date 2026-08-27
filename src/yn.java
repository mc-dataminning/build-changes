public abstract class yn<T extends vo> implements yp<T> {
   private final Iterable<yp<? super T>> a;

   protected yn(Iterable<yp<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<yp<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract yr<? extends yn<T>> a();
}
