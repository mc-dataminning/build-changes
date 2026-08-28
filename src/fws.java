import com.google.common.collect.ImmutableList;

public interface fws {
   default void a(fwr $$0, wy $$1) {
      this.a($$0, fwu.a($$1.getString()));
   }

   default void a(fwr $$0, String $$1) {
      this.a($$0, fwu.a($$1));
   }

   default void a(fwr $$0, wy... $$1) {
      this.a($$0, fwu.a(ImmutableList.copyOf($$1)));
   }

   void a(fwr var1, fwu<?> var2);

   fws a();
}
