public abstract class ym<T extends vo> implements yp<T> {
   @Override
   public final void a(T $$0) {
      throw new AssertionError("This packet should be handled by pipeline");
   }

   @Override
   public abstract yr<? extends ym<T>> a();
}
