import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class ii<A extends ArgumentType<?>> implements ie<A, ii<A>.a> {
   private final ii<A>.a a;

   private ii(Function<ee, A> $$0) {
      this.a = new ii.a($$0);
   }

   public static <T extends ArgumentType<?>> ii<T> a(Supplier<T> $$0) {
      return new ii<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> ii<T> a(Function<ee, T> $$0) {
      return new ii<>($$0);
   }

   public void a(ii<A>.a $$0, vu $$1) {
   }

   public void a(ii<A>.a $$0, JsonObject $$1) {
   }

   public ii<A>.a a(vu $$0) {
      return this.a;
   }

   public ii<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements ie.a<A> {
      private final Function<ee, A> b;

      public a(final Function<ee, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(ee $$0) {
         return this.b.apply($$0);
      }

      @Override
      public ie<A, ?> a() {
         return ii.this;
      }
   }
}
