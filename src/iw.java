import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class iw<A extends ArgumentType<?>> implements it<A, iw<A>.a> {
   private final iw<A>.a a;

   private iw(Function<et, A> $$0) {
      this.a = new iw.a($$0);
   }

   public static <T extends ArgumentType<?>> iw<T> a(Supplier<T> $$0) {
      return new iw<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> iw<T> a(Function<et, T> $$0) {
      return new iw<>($$0);
   }

   public void a(iw<A>.a $$0, vl $$1) {
   }

   public void a(iw<A>.a $$0, JsonObject $$1) {
   }

   public iw<A>.a a(vl $$0) {
      return this.a;
   }

   public iw<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements it.a<A> {
      private final Function<et, A> b;

      public a(final Function<et, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(et $$0) {
         return this.b.apply($$0);
      }

      @Override
      public it<A, ?> a() {
         return iw.this;
      }
   }
}
