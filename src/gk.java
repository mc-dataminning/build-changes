import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class gk<A extends ArgumentType<?>> implements gh<A, gk<A>.a> {
   private final gk<A>.a a;

   private gk(Function<dm, A> $$0) {
      this.a = new gk.a($$0);
   }

   public static <T extends ArgumentType<?>> gk<T> a(Supplier<T> $$0) {
      return new gk<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> gk<T> a(Function<dm, T> $$0) {
      return new gk<>($$0);
   }

   public void a(gk<A>.a $$0, sh $$1) {
   }

   public void a(gk<A>.a $$0, JsonObject $$1) {
   }

   public gk<A>.a a(sh $$0) {
      return this.a;
   }

   public gk<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements gh.a<A> {
      private final Function<dm, A> b;

      public a(Function<dm, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(dm $$0) {
         return this.b.apply($$0);
      }

      @Override
      public gh<A, ?> a() {
         return gk.this;
      }
   }
}
