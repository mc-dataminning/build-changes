import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class gj<A extends ArgumentType<?>> implements gg<A, gj<A>.a> {
   private final gj<A>.a a;

   private gj(Function<dl, A> $$0) {
      this.a = new gj.a($$0);
   }

   public static <T extends ArgumentType<?>> gj<T> a(Supplier<T> $$0) {
      return new gj<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> gj<T> a(Function<dl, T> $$0) {
      return new gj<>($$0);
   }

   public void a(gj<A>.a $$0, si $$1) {
   }

   public void a(gj<A>.a $$0, JsonObject $$1) {
   }

   public gj<A>.a a(si $$0) {
      return this.a;
   }

   public gj<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements gg.a<A> {
      private final Function<dl, A> b;

      public a(Function<dl, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(dl $$0) {
         return this.b.apply($$0);
      }

      @Override
      public gg<A, ?> a() {
         return gj.this;
      }
   }
}
