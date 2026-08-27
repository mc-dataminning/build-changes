import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class ia<A extends ArgumentType<?>> implements hx<A, ia<A>.a> {
   private final ia<A>.a a;

   private ia(Function<dz, A> $$0) {
      this.a = new ia.a($$0);
   }

   public static <T extends ArgumentType<?>> ia<T> a(Supplier<T> $$0) {
      return new ia<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> ia<T> a(Function<dz, T> $$0) {
      return new ia<>($$0);
   }

   public void a(ia<A>.a $$0, vu $$1) {
   }

   public void a(ia<A>.a $$0, JsonObject $$1) {
   }

   public ia<A>.a a(vu $$0) {
      return this.a;
   }

   public ia<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements hx.a<A> {
      private final Function<dz, A> b;

      public a(Function<dz, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(dz $$0) {
         return this.b.apply($$0);
      }

      @Override
      public hx<A, ?> a() {
         return ia.this;
      }
   }
}
