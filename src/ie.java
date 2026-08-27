import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class ie<A extends ArgumentType<?>> implements ib<A, ie<A>.a> {
   private final ie<A>.a a;

   private ie(Function<ed, A> $$0) {
      this.a = new ie.a($$0);
   }

   public static <T extends ArgumentType<?>> ie<T> a(Supplier<T> $$0) {
      return new ie<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> ie<T> a(Function<ed, T> $$0) {
      return new ie<>($$0);
   }

   public void a(ie<A>.a $$0, we $$1) {
   }

   public void a(ie<A>.a $$0, JsonObject $$1) {
   }

   public ie<A>.a a(we $$0) {
      return this.a;
   }

   public ie<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements ib.a<A> {
      private final Function<ed, A> b;

      public a(Function<ed, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(ed $$0) {
         return this.b.apply($$0);
      }

      @Override
      public ib<A, ?> a() {
         return ie.this;
      }
   }
}
