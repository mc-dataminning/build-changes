import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record kt<T>(kq<T> b, T c) {
   public static final zb<wo, kt<?>> a = new zb<wo, kt<?>>() {
      public kt<?> a(wo $$0) {
         kq<?> $$1 = kq.b.decode($$0);
         return a($$0, (kq<T>)$$1);
      }

      private static <T> kt<T> a(wo $$0, kq<T> $$1) {
         return new kt<>($$1, $$1.e().decode($$0));
      }

      public void a(wo $$0, kt<?> $$1) {
         b($$0, (kt<T>)$$1);
      }

      private static <T> void b(wo $$0, kt<T> $$1) {
         kq.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static kt<?> a(Entry<kq<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   public static <T> kt<T> a(kq<T> $$0, Object $$1) {
      return new kt<>($$0, (T)$$1);
   }

   public void a(ks $$0) {
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

   public kq<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
