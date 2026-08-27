import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class in<T> {
   private final Codec<T> a;

   in(Codec<T> $$0) {
      this.a = $$0;
   }

   public T a(T $$0, ix.a $$1, ix.a $$2) {
      DynamicOps<Object> $$3 = $$1.a(axp.a);
      DynamicOps<Object> $$4 = $$2.a(axp.a);
      Object $$5 = ac.a(this.a.encodeStart($$3, $$0), $$0x -> new IllegalStateException("Failed to encode: " + $$0x));
      return ac.a(this.a.parse($$4, $$5), $$0x -> new IllegalStateException("Failed to decode: " + $$0x));
   }

   public static class a {
      private final Map<ake<? extends ji<?>>, in<?>> a = new HashMap<>();

      public <T> in.a a(ake<? extends ji<? extends T>> $$0, Codec<T> $$1) {
         this.a.put($$0, new in($$1));
         return this;
      }

      @Nullable
      public <T> in<T> a(ake<? extends ji<? extends T>> $$0) {
         return (in<T>)this.a.get($$0);
      }
   }
}
