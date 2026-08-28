import com.google.common.collect.ImmutableList;

public interface fyk {
   default void a(fyj $$0, xc $$1) {
      this.a($$0, fym.a($$1.getString()));
   }

   default void a(fyj $$0, String $$1) {
      this.a($$0, fym.a($$1));
   }

   default void a(fyj $$0, xc... $$1) {
      this.a($$0, fym.a(ImmutableList.copyOf($$1)));
   }

   void a(fyj var1, fym<?> var2);

   fyk a();
}
