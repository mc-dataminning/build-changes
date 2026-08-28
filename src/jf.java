import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class jf<T> {
   private final Codec<T> a;

   jf(Codec<T> $$0) {
      this.a = $$0;
   }

   public T a(T $$0, jp.a $$1, jp.a $$2) {
      DynamicOps<Object> $$3 = $$1.a(JavaOps.INSTANCE);
      DynamicOps<Object> $$4 = $$2.a(JavaOps.INSTANCE);
      Object $$5 = this.a.encodeStart($$3, $$0).getOrThrow($$0x -> new IllegalStateException("Failed to encode: " + $$0x));
      return (T)this.a.parse($$4, $$5).getOrThrow($$0x -> new IllegalStateException("Failed to decode: " + $$0x));
   }

   public static class a {
      private final Map<ala<? extends ka<?>>, jf<?>> a = new HashMap<>();

      public <T> jf.a a(ala<? extends ka<? extends T>> $$0, Codec<T> $$1) {
         this.a.put($$0, new jf($$1));
         return this;
      }

      @Nullable
      public <T> jf<T> a(ala<? extends ka<? extends T>> $$0) {
         return (jf<T>)this.a.get($$0);
      }
   }
}
