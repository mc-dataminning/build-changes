import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class hk<A extends ArgumentType<?>> implements hh<A, hk<A>.a> {
   private final hk<A>.a a;

   private hk(Function<dn, A> $$0) {
      this.a = new hk.a($$0);
   }

   public static <T extends ArgumentType<?>> hk<T> a(Supplier<T> $$0) {
      return new hk<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> hk<T> a(Function<dn, T> $$0) {
      return new hk<>($$0);
   }

   public void a(hk<A>.a $$0, ue $$1) {
   }

   public void a(hk<A>.a $$0, JsonObject $$1) {
   }

   public hk<A>.a a(ue $$0) {
      return this.a;
   }

   public hk<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements hh.a<A> {
      private final Function<dn, A> b;

      public a(Function<dn, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(dn $$0) {
         return this.b.apply($$0);
      }

      @Override
      public hh<A, ?> a() {
         return hk.this;
      }
   }
}
