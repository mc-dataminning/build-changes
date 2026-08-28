import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record ks<T>(kp<T> b, T c) {
   public static final yw<wj, ks<?>> a = new yw<wj, ks<?>>() {
      public ks<?> a(wj $$0) {
         kp<?> $$1 = kp.b.decode($$0);
         return a($$0, (kp<T>)$$1);
      }

      private static <T> ks<T> a(wj $$0, kp<T> $$1) {
         return new ks<>($$1, $$1.e().decode($$0));
      }

      public void a(wj $$0, ks<?> $$1) {
         b($$0, (ks<T>)$$1);
      }

      private static <T> void b(wj $$0, ks<T> $$1) {
         kp.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static ks<?> a(Entry<kp<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   public static <T> ks<T> a(kp<T> $$0, Object $$1) {
      return new ks<>($$0, (T)$$1);
   }

   public void a(kr $$0) {
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

   public kp<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
