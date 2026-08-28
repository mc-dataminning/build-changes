import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record kn<T>(kk<T> b, T c) {
   public static final ze<wp, kn<?>> a = new ze<wp, kn<?>>() {
      public kn<?> a(wp $$0) {
         kk<?> $$1 = kk.b.decode($$0);
         return a($$0, (kk<T>)$$1);
      }

      private static <T> kn<T> a(wp $$0, kk<T> $$1) {
         return new kn<>($$1, $$1.e().decode($$0));
      }

      public void a(wp $$0, kn<?> $$1) {
         b($$0, (kn<T>)$$1);
      }

      private static <T> void b(wp $$0, kn<T> $$1) {
         kk.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static kn<?> a(Entry<kk<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   public static <T> kn<T> a(kk<T> $$0, Object $$1) {
      return new kn<>($$0, (T)$$1);
   }

   public void a(km $$0) {
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

   public kk<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
