import com.google.common.collect.ImmutableList;

public interface fwx {
   default void a(fww $$0, wy $$1) {
      this.a($$0, fwz.a($$1.getString()));
   }

   default void a(fww $$0, String $$1) {
      this.a($$0, fwz.a($$1));
   }

   default void a(fww $$0, wy... $$1) {
      this.a($$0, fwz.a(ImmutableList.copyOf($$1)));
   }

   void a(fww var1, fwz<?> var2);

   fwx a();
}
