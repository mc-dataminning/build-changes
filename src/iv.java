import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class iv<A extends ArgumentType<?>> implements is<A, iv<A>.a> {
   private final iv<A>.a a;

   private iv(Function<es, A> $$0) {
      this.a = new iv.a($$0);
   }

   public static <T extends ArgumentType<?>> iv<T> a(Supplier<T> $$0) {
      return new iv<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> iv<T> a(Function<es, T> $$0) {
      return new iv<>($$0);
   }

   public void a(iv<A>.a $$0, wh $$1) {
   }

   public void a(iv<A>.a $$0, JsonObject $$1) {
   }

   public iv<A>.a a(wh $$0) {
      return this.a;
   }

   public iv<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements is.a<A> {
      private final Function<es, A> b;

      public a(final Function<es, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(es $$0) {
         return this.b.apply($$0);
      }

      @Override
      public is<A, ?> a() {
         return iv.this;
      }
   }
}
