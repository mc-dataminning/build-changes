import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record kw<T>(kt<T> b, T c) {
   public static final zt<xg, kw<?>> a = new zt<xg, kw<?>>() {
      public kw<?> a(xg $$0) {
         kt<?> $$1 = kt.b.decode($$0);
         return a($$0, (kt<T>)$$1);
      }

      private static <T> kw<T> a(xg $$0, kt<T> $$1) {
         return new kw<>($$1, $$1.e().decode($$0));
      }

      public void a(xg $$0, kw<?> $$1) {
         b($$0, (kw<T>)$$1);
      }

      private static <T> void b(xg $$0, kw<T> $$1) {
         kt.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static kw<?> a(Entry<kt<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   public static <T> kw<T> a(kt<T> $$0, Object $$1) {
      return new kw<>($$0, (T)$$1);
   }

   public void a(kv $$0) {
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

   public kt<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
