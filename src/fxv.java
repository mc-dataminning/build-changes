import com.google.common.collect.ImmutableList;

public interface fxv {
   default void a(fxu $$0, xg $$1) {
      this.a($$0, fxx.a($$1.getString()));
   }

   default void a(fxu $$0, String $$1) {
      this.a($$0, fxx.a($$1));
   }

   default void a(fxu $$0, xg... $$1) {
      this.a($$0, fxx.a(ImmutableList.copyOf($$1)));
   }

   void a(fxu var1, fxx<?> var2);

   fxv a();
}
