import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class hi<A extends ArgumentType<?>> implements hf<A, hi<A>.a> {
   private final hi<A>.a a;

   private hi(Function<dp, A> $$0) {
      this.a = new hi.a($$0);
   }

   public static <T extends ArgumentType<?>> hi<T> a(Supplier<T> $$0) {
      return new hi<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> hi<T> a(Function<dp, T> $$0) {
      return new hi<>($$0);
   }

   public void a(hi<A>.a $$0, tu $$1) {
   }

   public void a(hi<A>.a $$0, JsonObject $$1) {
   }

   public hi<A>.a a(tu $$0) {
      return this.a;
   }

   public hi<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements hf.a<A> {
      private final Function<dp, A> b;

      public a(Function<dp, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(dp $$0) {
         return this.b.apply($$0);
      }

      @Override
      public hf<A, ?> a() {
         return hi.this;
      }
   }
}
