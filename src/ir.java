import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class ir<A extends ArgumentType<?>> implements io<A, ir<A>.a> {
   private final ir<A>.a a;

   private ir(Function<ep, A> $$0) {
      this.a = new ir.a($$0);
   }

   public static <T extends ArgumentType<?>> ir<T> a(Supplier<T> $$0) {
      return new ir<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> ir<T> a(Function<ep, T> $$0) {
      return new ir<>($$0);
   }

   public void a(ir<A>.a $$0, vv $$1) {
   }

   public void a(ir<A>.a $$0, JsonObject $$1) {
   }

   public ir<A>.a a(vv $$0) {
      return this.a;
   }

   public ir<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements io.a<A> {
      private final Function<ep, A> b;

      public a(final Function<ep, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(ep $$0) {
         return this.b.apply($$0);
      }

      @Override
      public io<A, ?> a() {
         return ir.this;
      }
   }
}
