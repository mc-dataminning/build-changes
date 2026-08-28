import com.google.common.collect.ImmutableList;

public interface fyi {
   default void a(fyh $$0, xa $$1) {
      this.a($$0, fyk.a($$1.getString()));
   }

   default void a(fyh $$0, String $$1) {
      this.a($$0, fyk.a($$1));
   }

   default void a(fyh $$0, xa... $$1) {
      this.a($$0, fyk.a(ImmutableList.copyOf($$1)));
   }

   void a(fyh var1, fyk<?> var2);

   fyi a();
}
