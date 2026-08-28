import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record kv<T>(ks<T> b, T c) {
   public static final zf<ws, kv<?>> a = new zf<ws, kv<?>>() {
      public kv<?> a(ws $$0) {
         ks<?> $$1 = ks.b.decode($$0);
         return a($$0, (ks<T>)$$1);
      }

      private static <T> kv<T> a(ws $$0, ks<T> $$1) {
         return new kv<>($$1, $$1.e().decode($$0));
      }

      public void a(ws $$0, kv<?> $$1) {
         b($$0, (kv<T>)$$1);
      }

      private static <T> void b(ws $$0, kv<T> $$1) {
         ks.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static kv<?> a(Entry<ks<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   public static <T> kv<T> a(ks<T> $$0, Object $$1) {
      return new kv<>($$0, (T)$$1);
   }

   public void a(ku $$0) {
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

   public ks<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
