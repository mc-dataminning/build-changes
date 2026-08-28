import com.google.common.collect.ImmutableList;

public interface fvn {
   default void a(fvm $$0, ww $$1) {
      this.a($$0, fvp.a($$1.getString()));
   }

   default void a(fvm $$0, String $$1) {
      this.a($$0, fvp.a($$1));
   }

   default void a(fvm $$0, ww... $$1) {
      this.a($$0, fvp.a(ImmutableList.copyOf($$1)));
   }

   void a(fvm var1, fvp<?> var2);

   fvn a();
}
