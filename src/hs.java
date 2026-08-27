import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class hs<A extends ArgumentType<?>> implements hp<A, hs<A>.a> {
   private final hs<A>.a a;

   private hs(Function<dr, A> $$0) {
      this.a = new hs.a($$0);
   }

   public static <T extends ArgumentType<?>> hs<T> a(Supplier<T> $$0) {
      return new hs<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> hs<T> a(Function<dr, T> $$0) {
      return new hs<>($$0);
   }

   public void a(hs<A>.a $$0, vi $$1) {
   }

   public void a(hs<A>.a $$0, JsonObject $$1) {
   }

   public hs<A>.a a(vi $$0) {
      return this.a;
   }

   public hs<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements hp.a<A> {
      private final Function<dr, A> b;

      public a(Function<dr, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(dr $$0) {
         return this.b.apply($$0);
      }

      @Override
      public hp<A, ?> a() {
         return hs.this;
      }
   }
}
