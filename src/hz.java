import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class hz<A extends ArgumentType<?>> implements hw<A, hz<A>.a> {
   private final hz<A>.a a;

   private hz(Function<dy, A> $$0) {
      this.a = new hz.a($$0);
   }

   public static <T extends ArgumentType<?>> hz<T> a(Supplier<T> $$0) {
      return new hz<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> hz<T> a(Function<dy, T> $$0) {
      return new hz<>($$0);
   }

   public void a(hz<A>.a $$0, vs $$1) {
   }

   public void a(hz<A>.a $$0, JsonObject $$1) {
   }

   public hz<A>.a a(vs $$0) {
      return this.a;
   }

   public hz<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements hw.a<A> {
      private final Function<dy, A> b;

      public a(Function<dy, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(dy $$0) {
         return this.b.apply($$0);
      }

      @Override
      public hw<A, ?> a() {
         return hz.this;
      }
   }
}
