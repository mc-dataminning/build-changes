import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record kp<T>(km<T> b, T c) {
   public static final ys<wf, kp<?>> a = new ys<wf, kp<?>>() {
      public kp<?> a(wf $$0) {
         km<?> $$1 = km.b.decode($$0);
         return a($$0, (km<T>)$$1);
      }

      private static <T> kp<T> a(wf $$0, km<T> $$1) {
         return new kp<>($$1, $$1.e().decode($$0));
      }

      public void a(wf $$0, kp<?> $$1) {
         b($$0, (kp<T>)$$1);
      }

      private static <T> void b(wf $$0, kp<T> $$1) {
         km.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static kp<?> a(Entry<km<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   public static <T> kp<T> a(km<T> $$0, Object $$1) {
      return new kp<>($$0, (T)$$1);
   }

   public void a(ko $$0) {
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

   public km<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
