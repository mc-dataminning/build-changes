public abstract class zm<T extends wo> implements zp<T> {
   @Override
   public final void a(T $$0) {
      throw new AssertionError("This packet should be handled by pipeline");
   }

   @Override
   public abstract zr<? extends zm<T>> a();
}
