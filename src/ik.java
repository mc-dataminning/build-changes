import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class ik<A extends ArgumentType<?>> implements ih<A, ik<A>.a> {
   private final ik<A>.a a;

   private ik(Function<eg, A> $$0) {
      this.a = new ik.a($$0);
   }

   public static <T extends ArgumentType<?>> ik<T> a(Supplier<T> $$0) {
      return new ik<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> ik<T> a(Function<eg, T> $$0) {
      return new ik<>($$0);
   }

   public void a(ik<A>.a $$0, vy $$1) {
   }

   public void a(ik<A>.a $$0, JsonObject $$1) {
   }

   public ik<A>.a a(vy $$0) {
      return this.a;
   }

   public ik<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements ih.a<A> {
      private final Function<eg, A> b;

      public a(final Function<eg, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(eg $$0) {
         return this.b.apply($$0);
      }

      @Override
      public ih<A, ?> a() {
         return ik.this;
      }
   }
}
