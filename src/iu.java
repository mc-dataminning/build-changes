import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class iu<A extends ArgumentType<?>> implements ir<A, iu<A>.a> {
   private final iu<A>.a a;

   private iu(Function<er, A> $$0) {
      this.a = new iu.a($$0);
   }

   public static <T extends ArgumentType<?>> iu<T> a(Supplier<T> $$0) {
      return new iu<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> iu<T> a(Function<er, T> $$0) {
      return new iu<>($$0);
   }

   public void a(iu<A>.a $$0, we $$1) {
   }

   public void a(iu<A>.a $$0, JsonObject $$1) {
   }

   public iu<A>.a a(we $$0) {
      return this.a;
   }

   public iu<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements ir.a<A> {
      private final Function<er, A> b;

      public a(final Function<er, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(er $$0) {
         return this.b.apply($$0);
      }

      @Override
      public ir<A, ?> a() {
         return iu.this;
      }
   }
}
