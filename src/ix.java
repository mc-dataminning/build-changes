import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class ix<A extends ArgumentType<?>> implements iu<A, ix<A>.a> {
   private final ix<A>.a a;

   private ix(Function<et, A> $$0) {
      this.a = new ix.a($$0);
   }

   public static <T extends ArgumentType<?>> ix<T> a(Supplier<T> $$0) {
      return new ix<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> ix<T> a(Function<et, T> $$0) {
      return new ix<>($$0);
   }

   public void a(ix<A>.a $$0, vr $$1) {
   }

   public void a(ix<A>.a $$0, JsonObject $$1) {
   }

   public ix<A>.a a(vr $$0) {
      return this.a;
   }

   public ix<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements iu.a<A> {
      private final Function<et, A> b;

      public a(final Function<et, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(et $$0) {
         return this.b.apply($$0);
      }

      @Override
      public iu<A, ?> a() {
         return ix.this;
      }
   }
}
