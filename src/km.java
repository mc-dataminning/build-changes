import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record km<T>(kj<T> b, T c) {
   public static final yw<wj, km<?>> a = new yw<wj, km<?>>() {
      public km<?> a(wj $$0) {
         kj<?> $$1 = kj.b.decode($$0);
         return a($$0, (kj<T>)$$1);
      }

      private static <T> km<T> a(wj $$0, kj<T> $$1) {
         return new km<>($$1, $$1.e().decode($$0));
      }

      public void a(wj $$0, km<?> $$1) {
         b($$0, (km<T>)$$1);
      }

      private static <T> void b(wj $$0, km<T> $$1) {
         kj.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static km<?> a(Entry<kj<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   public static <T> km<T> a(kj<T> $$0, Object $$1) {
      return new km<>($$0, (T)$$1);
   }

   public void a(kl $$0) {
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

   public kj<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
