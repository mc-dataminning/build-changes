import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public interface kt {
   Codec<Map<kt.b<?>, kt>> b = Codec.dispatchedMap(mg.ao.q(), kt.b::a);

   static MapCodec<kt.a<?>> a(String $$0) {
      return mg.ao.q().dispatchMap($$0, kt.a::a, kt.b::b);
   }

   boolean a(kf var1);

   public static record a<T extends kt>(kt.b<T> a, T b) {
   }

   public static final class b<T extends kt> {
      private final Codec<T> a;
      private final MapCodec<kt.a<T>> b;

      public b(Codec<T> $$0) {
         this.a = $$0;
         this.b = RecordCodecBuilder.mapCodec($$1 -> $$1.group($$0.fieldOf("value").forGetter(kt.a::b)).apply($$1, $$0xx -> new kt.a<>(this, (T)$$0xx)));
      }

      public Codec<T> a() {
         return this.a;
      }

      public MapCodec<kt.a<T>> b() {
         return this.b;
      }
   }
}
