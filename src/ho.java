import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class ho<A extends ArgumentType<?>> implements hl<A, ho<A>.a> {
   private final ho<A>.a a;

   private ho(Function<dq, A> $$0) {
      this.a = new ho.a($$0);
   }

   public static <T extends ArgumentType<?>> ho<T> a(Supplier<T> $$0) {
      return new ho<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> ho<T> a(Function<dq, T> $$0) {
      return new ho<>($$0);
   }

   public void a(ho<A>.a $$0, uq $$1) {
   }

   public void a(ho<A>.a $$0, JsonObject $$1) {
   }

   public ho<A>.a a(uq $$0) {
      return this.a;
   }

   public ho<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements hl.a<A> {
      private final Function<dq, A> b;

      public a(Function<dq, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(dq $$0) {
         return this.b.apply($$0);
      }

      @Override
      public hl<A, ?> a() {
         return ho.this;
      }
   }
}
