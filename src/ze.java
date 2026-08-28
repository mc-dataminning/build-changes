public abstract class ze<T extends wf> implements zg<T> {
   private final Iterable<zg<? super T>> a;

   protected ze(Iterable<zg<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zg<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zi<? extends ze<T>> a();
}
