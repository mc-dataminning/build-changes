import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ia<T> {
   private final Codec<T> a;

   ia(Codec<T> $$0) {
      this.a = $$0;
   }

   public T a(T $$0, il.b $$1, il.b $$2) {
      DynamicOps<Object> $$3 = aiw.a(awb.a, $$1);
      DynamicOps<Object> $$4 = aiw.a(awb.a, $$2);
      Object $$5 = ac.a(this.a.encodeStart($$3, $$0), $$0x -> new IllegalStateException("Failed to encode: " + $$0x));
      return ac.a(this.a.parse($$4, $$5), $$0x -> new IllegalStateException("Failed to decode: " + $$0x));
   }

   public static class a {
      private final Map<aix<? extends iv<?>>, ia<?>> a = new HashMap<>();

      public <T> ia.a a(aix<? extends iv<? extends T>> $$0, Codec<T> $$1) {
         this.a.put($$0, new ia($$1));
         return this;
      }

      @Nullable
      public <T> ia<T> a(aix<? extends iv<? extends T>> $$0) {
         return (ia<T>)this.a.get($$0);
      }
   }
}
