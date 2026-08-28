import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public interface ks {
   Codec<Map<ks.b<?>, ks>> b = Codec.dispatchedMap(mf.ao.q(), ks.b::a);

   static MapCodec<ks.a<?>> a(String $$0) {
      return mf.ao.q().dispatchMap($$0, ks.a::a, ks.b::b);
   }

   boolean a(ke var1);

   public static record a<T extends ks>(ks.b<T> a, T b) {
   }

   public static final class b<T extends ks> {
      private final Codec<T> a;
      private final MapCodec<ks.a<T>> b;

      public b(Codec<T> $$0) {
         this.a = $$0;
         this.b = RecordCodecBuilder.mapCodec($$1 -> $$1.group($$0.fieldOf("value").forGetter(ks.a::b)).apply($$1, $$0xx -> new ks.a<>(this, (T)$$0xx)));
      }

      public Codec<T> a() {
         return this.a;
      }

      public MapCodec<ks.a<T>> b() {
         return this.b;
      }
   }
}
