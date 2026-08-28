public abstract class zi<T extends wj> implements zk<T> {
   private final Iterable<zk<? super T>> a;

   protected zi(Iterable<zk<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zk<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zm<? extends zi<T>> a();
}
