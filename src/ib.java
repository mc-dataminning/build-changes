import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class ib<A extends ArgumentType<?>> implements hy<A, ib<A>.a> {
   private final ib<A>.a a;

   private ib(Function<ea, A> $$0) {
      this.a = new ib.a($$0);
   }

   public static <T extends ArgumentType<?>> ib<T> a(Supplier<T> $$0) {
      return new ib<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> ib<T> a(Function<ea, T> $$0) {
      return new ib<>($$0);
   }

   public void a(ib<A>.a $$0, vx $$1) {
   }

   public void a(ib<A>.a $$0, JsonObject $$1) {
   }

   public ib<A>.a a(vx $$0) {
      return this.a;
   }

   public ib<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements hy.a<A> {
      private final Function<ea, A> b;

      public a(Function<ea, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(ea $$0) {
         return this.b.apply($$0);
      }

      @Override
      public hy<A, ?> a() {
         return ib.this;
      }
   }
}
