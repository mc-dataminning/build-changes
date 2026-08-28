import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class in<A extends ArgumentType<?>> implements ik<A, in<A>.a> {
   private final in<A>.a a;

   private in(Function<el, A> $$0) {
      this.a = new in.a($$0);
   }

   public static <T extends ArgumentType<?>> in<T> a(Supplier<T> $$0) {
      return new in<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> in<T> a(Function<el, T> $$0) {
      return new in<>($$0);
   }

   public void a(in<A>.a $$0, wm $$1) {
   }

   public void a(in<A>.a $$0, JsonObject $$1) {
   }

   public in<A>.a a(wm $$0) {
      return this.a;
   }

   public in<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements ik.a<A> {
      private final Function<el, A> b;

      public a(final Function<el, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(el $$0) {
         return this.b.apply($$0);
      }

      @Override
      public ik<A, ?> a() {
         return in.this;
      }
   }
}
