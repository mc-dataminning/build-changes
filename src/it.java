import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class it<A extends ArgumentType<?>> implements iq<A, it<A>.a> {
   private final it<A>.a a;

   private it(Function<eq, A> $$0) {
      this.a = new it.a($$0);
   }

   public static <T extends ArgumentType<?>> it<T> a(Supplier<T> $$0) {
      return new it<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> it<T> a(Function<eq, T> $$0) {
      return new it<>($$0);
   }

   public void a(it<A>.a $$0, wb $$1) {
   }

   public void a(it<A>.a $$0, JsonObject $$1) {
   }

   public it<A>.a a(wb $$0) {
      return this.a;
   }

   public it<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements iq.a<A> {
      private final Function<eq, A> b;

      public a(final Function<eq, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(eq $$0) {
         return this.b.apply($$0);
      }

      @Override
      public iq<A, ?> a() {
         return it.this;
      }
   }
}
