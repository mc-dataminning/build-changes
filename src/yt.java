public abstract class yt<T extends vu> implements yv<T> {
   private final Iterable<yv<? super T>> a;

   protected yt(Iterable<yv<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<yv<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract yx<? extends yt<T>> a();
}
