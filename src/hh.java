import javax.annotation.Nullable;

public interface hh<T> {
   void a(hf<T> var1);

   void a(@Nullable hj var1);

   @Nullable
   hj a();

   hi b();

   static <T extends ej<T>> hh<T> a(final hg<T> $$0, final hi $$1) {
      return new hh<T>() {
         @Override
         public void a(hf<T> $$0x) {
            $$0.a(new hc<>($$1, $$0));
         }

         @Override
         public void a(@Nullable hj $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public hj a() {
            return $$0.b();
         }

         @Override
         public hi b() {
            return $$1;
         }
      };
   }
}
