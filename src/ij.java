import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class ij<A extends ArgumentType<?>> implements ig<A, ij<A>.a> {
   private final ij<A>.a a;

   private ij(Function<ef, A> $$0) {
      this.a = new ij.a($$0);
   }

   public static <T extends ArgumentType<?>> ij<T> a(Supplier<T> $$0) {
      return new ij<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> ij<T> a(Function<ef, T> $$0) {
      return new ij<>($$0);
   }

   public void a(ij<A>.a $$0, vu $$1) {
   }

   public void a(ij<A>.a $$0, JsonObject $$1) {
   }

   public ij<A>.a a(vu $$0) {
      return this.a;
   }

   public ij<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements ig.a<A> {
      private final Function<ef, A> b;

      public a(final Function<ef, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(ef $$0) {
         return this.b.apply($$0);
      }

      @Override
      public ig<A, ?> a() {
         return ij.this;
      }
   }
}
