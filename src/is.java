import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class is<A extends ArgumentType<?>> implements ip<A, is<A>.a> {
   private final is<A>.a a;

   private is(Function<ep, A> $$0) {
      this.a = new is.a($$0);
   }

   public static <T extends ArgumentType<?>> is<T> a(Supplier<T> $$0) {
      return new is<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> is<T> a(Function<ep, T> $$0) {
      return new is<>($$0);
   }

   public void a(is<A>.a $$0, wa $$1) {
   }

   public void a(is<A>.a $$0, JsonObject $$1) {
   }

   public is<A>.a a(wa $$0) {
      return this.a;
   }

   public is<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements ip.a<A> {
      private final Function<ep, A> b;

      public a(final Function<ep, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(ep $$0) {
         return this.b.apply($$0);
      }

      @Override
      public ip<A, ?> a() {
         return is.this;
      }
   }
}
