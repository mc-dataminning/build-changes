import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class io<A extends ArgumentType<?>> implements il<A, io<A>.a> {
   private final io<A>.a a;

   private io(Function<em, A> $$0) {
      this.a = new io.a($$0);
   }

   public static <T extends ArgumentType<?>> io<T> a(Supplier<T> $$0) {
      return new io<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> io<T> a(Function<em, T> $$0) {
      return new io<>($$0);
   }

   public void a(io<A>.a $$0, vr $$1) {
   }

   public void a(io<A>.a $$0, JsonObject $$1) {
   }

   public io<A>.a a(vr $$0) {
      return this.a;
   }

   public io<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements il.a<A> {
      private final Function<em, A> b;

      public a(final Function<em, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(em $$0) {
         return this.b.apply($$0);
      }

      @Override
      public il<A, ?> a() {
         return io.this;
      }
   }
}
