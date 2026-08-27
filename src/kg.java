import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record kg<T>(kd<T> b, T c) {
   public static final zc<wp, kg<?>> a = new zc<wp, kg<?>>() {
      public kg<?> a(wp $$0) {
         kd<?> $$1 = kd.b.decode($$0);
         return a($$0, (kd<T>)$$1);
      }

      private static <T> kg<T> a(wp $$0, kd<T> $$1) {
         return new kg<>($$1, $$1.e().decode($$0));
      }

      public void a(wp $$0, kg<?> $$1) {
         b($$0, (kg<T>)$$1);
      }

      private static <T> void b(wp $$0, kg<T> $$1) {
         kd.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static kg<?> a(Entry<kd<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   static <T> kg<T> a(kd<T> $$0, Object $$1) {
      return new kg<>($$0, (T)$$1);
   }

   public void a(kf $$0) {
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

   public kd<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
