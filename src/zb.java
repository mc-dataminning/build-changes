public abstract class zb<T extends wc> implements zd<T> {
   private final Iterable<zd<? super T>> a;

   protected zb(Iterable<zd<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zd<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zf<? extends zb<T>> a();
}
