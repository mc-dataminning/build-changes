import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ie<T> {
   private final Codec<T> a;

   ie(Codec<T> $$0) {
      this.a = $$0;
   }

   public T a(T $$0, ip.a $$1, ip.a $$2) {
      DynamicOps<Object> $$3 = $$1.a(axf.a);
      DynamicOps<Object> $$4 = $$2.a(axf.a);
      Object $$5 = ac.a(this.a.encodeStart($$3, $$0), $$0x -> new IllegalStateException("Failed to encode: " + $$0x));
      return ac.a(this.a.parse($$4, $$5), $$0x -> new IllegalStateException("Failed to decode: " + $$0x));
   }

   public static class a {
      private final Map<aju<? extends ja<?>>, ie<?>> a = new HashMap<>();

      public <T> ie.a a(aju<? extends ja<? extends T>> $$0, Codec<T> $$1) {
         this.a.put($$0, new ie($$1));
         return this;
      }

      @Nullable
      public <T> ie<T> a(aju<? extends ja<? extends T>> $$0) {
         return (ie<T>)this.a.get($$0);
      }
   }
}
