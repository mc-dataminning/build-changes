import com.google.common.collect.ImmutableList;

public interface fwg {
   default void a(fwf $$0, wy $$1) {
      this.a($$0, fwi.a($$1.getString()));
   }

   default void a(fwf $$0, String $$1) {
      this.a($$0, fwi.a($$1));
   }

   default void a(fwf $$0, wy... $$1) {
      this.a($$0, fwi.a(ImmutableList.copyOf($$1)));
   }

   void a(fwf var1, fwi<?> var2);

   fwg a();
}
