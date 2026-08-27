import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record kd<T>(ka<T> b, T c) {
   public static final yv<wi, kd<?>> a = new yv<wi, kd<?>>() {
      public kd<?> a(wi $$0) {
         ka<?> $$1 = ka.b.decode($$0);
         return a($$0, (ka<T>)$$1);
      }

      private static <T> kd<T> a(wi $$0, ka<T> $$1) {
         return new kd<>($$1, $$1.e().decode($$0));
      }

      public void a(wi $$0, kd<?> $$1) {
         b($$0, (kd<T>)$$1);
      }

      private static <T> void b(wi $$0, kd<T> $$1) {
         ka.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static kd<?> a(Entry<ka<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   static <T> kd<T> a(ka<T> $$0, Object $$1) {
      return new kd<>($$0, (T)$$1);
   }

   public void a(kc $$0) {
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

   public ka<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
