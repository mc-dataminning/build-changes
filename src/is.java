import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class is<T> {
   private final Codec<T> a;

   is(Codec<T> $$0) {
      this.a = $$0;
   }

   public T a(T $$0, jc.a $$1, jc.a $$2) {
      DynamicOps<Object> $$3 = $$1.a(ayf.a);
      DynamicOps<Object> $$4 = $$2.a(ayf.a);
      Object $$5 = ad.a(this.a.encodeStart($$3, $$0), $$0x -> new IllegalStateException("Failed to encode: " + $$0x));
      return ad.a(this.a.parse($$4, $$5), $$0x -> new IllegalStateException("Failed to decode: " + $$0x));
   }

   public static class a {
      private final Map<aks<? extends jn<?>>, is<?>> a = new HashMap<>();

      public <T> is.a a(aks<? extends jn<? extends T>> $$0, Codec<T> $$1) {
         this.a.put($$0, new is($$1));
         return this;
      }

      @Nullable
      public <T> is<T> a(aks<? extends jn<? extends T>> $$0) {
         return (is<T>)this.a.get($$0);
      }
   }
}
