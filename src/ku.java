import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record ku<T>(kr<T> b, T c) {
   public static final zc<wp, ku<?>> a = new zc<wp, ku<?>>() {
      public ku<?> a(wp $$0) {
         kr<?> $$1 = kr.b.decode($$0);
         return a($$0, (kr<T>)$$1);
      }

      private static <T> ku<T> a(wp $$0, kr<T> $$1) {
         return new ku<>($$1, $$1.e().decode($$0));
      }

      public void a(wp $$0, ku<?> $$1) {
         b($$0, (ku<T>)$$1);
      }

      private static <T> void b(wp $$0, ku<T> $$1) {
         kr.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static ku<?> a(Entry<kr<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   public static <T> ku<T> a(kr<T> $$0, Object $$1) {
      return new ku<>($$0, (T)$$1);
   }

   public void a(kt $$0) {
      $$0.b(this.b, this.c);
   }

   public <D> DataResult<D> a(DynamicOps<D> $$0) {
      Codec<T> $$1 = this.b.b();
      return $$1 == null ? DataResult.error(() -> "Component of type " + this.b + " is not encodable") : $$1.encodeStart($$0, this.c);
   }

   @Override
   public String toString() {
      return this.b + "=>" + this.c;
   }

   public kr<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
