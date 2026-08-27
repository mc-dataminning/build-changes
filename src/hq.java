import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class hq<A extends ArgumentType<?>> implements hn<A, hq<A>.a> {
   private final hq<A>.a a;

   private hq(Function<dq, A> $$0) {
      this.a = new hq.a($$0);
   }

   public static <T extends ArgumentType<?>> hq<T> a(Supplier<T> $$0) {
      return new hq<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> hq<T> a(Function<dq, T> $$0) {
      return new hq<>($$0);
   }

   public void a(hq<A>.a $$0, vg $$1) {
   }

   public void a(hq<A>.a $$0, JsonObject $$1) {
   }

   public hq<A>.a a(vg $$0) {
      return this.a;
   }

   public hq<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements hn.a<A> {
      private final Function<dq, A> b;

      public a(Function<dq, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(dq $$0) {
         return this.b.apply($$0);
      }

      @Override
      public hn<A, ?> a() {
         return hq.this;
      }
   }
}
