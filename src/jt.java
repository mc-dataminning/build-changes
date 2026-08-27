import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record jt<T>(jq<T> b, T c) {
   public static final yg<vt, jt<?>> a = new yg<vt, jt<?>>() {
      public jt<?> a(vt $$0) {
         jq<?> $$1 = jq.b.decode($$0);
         return a($$0, (jq<T>)$$1);
      }

      private static <T> jt<T> a(vt $$0, jq<T> $$1) {
         return new jt<>($$1, $$1.e().decode($$0));
      }

      public void a(vt $$0, jt<?> $$1) {
         b($$0, (jt<T>)$$1);
      }

      private static <T> void b(vt $$0, jt<T> $$1) {
         jq.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static jt<?> a(Entry<jq<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   static <T> jt<T> a(jq<T> $$0, Object $$1) {
      return new jt<>($$0, (T)$$1);
   }

   public void a(js $$0) {
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

   public jq<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
