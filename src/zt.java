public abstract class zt<T extends wu> implements zv<T> {
   private final Iterable<zv<? super T>> a;

   protected zt(Iterable<zv<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zv<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zx<? extends zt<T>> a();
}
