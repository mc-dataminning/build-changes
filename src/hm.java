import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class hm<A extends ArgumentType<?>> implements hj<A, hm<A>.a> {
   private final hm<A>.a a;

   private hm(Function<dp, A> $$0) {
      this.a = new hm.a($$0);
   }

   public static <T extends ArgumentType<?>> hm<T> a(Supplier<T> $$0) {
      return new hm<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> hm<T> a(Function<dp, T> $$0) {
      return new hm<>($$0);
   }

   public void a(hm<A>.a $$0, ty $$1) {
   }

   public void a(hm<A>.a $$0, JsonObject $$1) {
   }

   public hm<A>.a a(ty $$0) {
      return this.a;
   }

   public hm<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements hj.a<A> {
      private final Function<dp, A> b;

      public a(Function<dp, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(dp $$0) {
         return this.b.apply($$0);
      }

      @Override
      public hj<A, ?> a() {
         return hm.this;
      }
   }
}
