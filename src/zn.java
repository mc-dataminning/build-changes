public abstract class zn<T extends wo> implements zp<T> {
   private final Iterable<zp<? super T>> a;

   protected zn(Iterable<zp<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zp<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zr<? extends zn<T>> a();
}
