import com.google.common.collect.ImmutableList;

public interface fvz {
   default void a(fvy $$0, wy $$1) {
      this.a($$0, fwb.a($$1.getString()));
   }

   default void a(fvy $$0, String $$1) {
      this.a($$0, fwb.a($$1));
   }

   default void a(fvy $$0, wy... $$1) {
      this.a($$0, fwb.a(ImmutableList.copyOf($$1)));
   }

   void a(fvy var1, fwb<?> var2);

   fvz a();
}
