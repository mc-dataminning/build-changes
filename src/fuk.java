import com.google.common.collect.ImmutableList;

public interface fuk {
   default void a(fuj $$0, wv $$1) {
      this.a($$0, fum.a($$1.getString()));
   }

   default void a(fuj $$0, String $$1) {
      this.a($$0, fum.a($$1));
   }

   default void a(fuj $$0, wv... $$1) {
      this.a($$0, fum.a(ImmutableList.copyOf($$1)));
   }

   void a(fuj var1, fum<?> var2);

   fuk a();
}
