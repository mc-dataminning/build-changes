import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record jr<T>(jo<T> b, T c) {
   public static final ye<vr, jr<?>> a = new ye<vr, jr<?>>() {
      public jr<?> a(vr $$0) {
         jo<?> $$1 = jo.b.decode($$0);
         return a($$0, (jo<T>)$$1);
      }

      private static <T> jr<T> a(vr $$0, jo<T> $$1) {
         return new jr<>($$1, $$1.e().decode($$0));
      }

      public void a(vr $$0, jr<?> $$1) {
         b($$0, (jr<T>)$$1);
      }

      private static <T> void b(vr $$0, jr<T> $$1) {
         jo.b.encode($$0, $$1.a());
         $$1.a().e().encode($$0, $$1.b());
      }
   };

   static jr<?> a(Entry<jo<?>, Object> $$0) {
      return a($$0.getKey(), $$0.getValue());
   }

   static <T> jr<T> a(jo<T> $$0, Object $$1) {
      return new jr<>($$0, (T)$$1);
   }

   public void a(jq $$0) {
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

   public jo<T> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
