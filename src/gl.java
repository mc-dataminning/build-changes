import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class gl<A extends ArgumentType<?>> implements gi<A, gl<A>.a> {
   private final gl<A>.a a;

   private gl(Function<dn, A> $$0) {
      this.a = new gl.a($$0);
   }

   public static <T extends ArgumentType<?>> gl<T> a(Supplier<T> $$0) {
      return new gl<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> gl<T> a(Function<dn, T> $$0) {
      return new gl<>($$0);
   }

   public void a(gl<A>.a $$0, sp $$1) {
   }

   public void a(gl<A>.a $$0, JsonObject $$1) {
   }

   public gl<A>.a a(sp $$0) {
      return this.a;
   }

   public gl<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements gi.a<A> {
      private final Function<dn, A> b;

      public a(Function<dn, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(dn $$0) {
         return this.b.apply($$0);
      }

      @Override
      public gi<A, ?> a() {
         return gl.this;
      }
   }
}
