public abstract class zj<T extends wk> implements zl<T> {
   private final Iterable<zl<? super T>> a;

   protected zj(Iterable<zl<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zl<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zn<? extends zj<T>> a();
}
