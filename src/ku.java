import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public interface ku {
   Codec<Map<ku.b<?>, ku>> b = Codec.dispatchedMap(mh.ao.q(), ku.b::a);
   za<wn, ku.a<?>> c = yy.a(mi.q).b(ku.a::a, ku.b::c);
   za<wn, Map<ku.b<?>, ku>> d = c.a(yy.c(64))
      .a($$0 -> $$0.stream().collect(Collectors.toMap(ku.a::a, ku.a::b)), $$0 -> $$0.entrySet().stream().map(ku.a::a).toList());

   static MapCodec<ku.a<?>> a(String $$0) {
      return mh.ao.q().dispatchMap($$0, ku.a::a, ku.b::b);
   }

   boolean a(kg var1);

   public static record a<T extends ku>(ku.b<T> a, T b) {
      private static <T extends ku> ku.a<T> a(Entry<ku.b<?>, T> $$0) {
         return new ku.a<>((ku.b<T>)$$0.getKey(), $$0.getValue());
      }
   }

   public static final class b<T extends ku> {
      private final Codec<T> a;
      private final MapCodec<ku.a<T>> b;
      private final za<wn, ku.a<T>> c;

      public b(Codec<T> $$0) {
         this.a = $$0;
         this.b = RecordCodecBuilder.mapCodec($$1 -> $$1.group($$0.fieldOf("value").forGetter(ku.a::b)).apply($$1, $$0xx -> new ku.a<>(this, (T)$$0xx)));
         this.c = yy.<ku>d($$0).a($$0x -> new ku.a<>(this, (T)$$0x), ku.a::b);
      }

      public Codec<T> a() {
         return this.a;
      }

      public MapCodec<ku.a<T>> b() {
         return this.b;
      }

      public za<wn, ku.a<T>> c() {
         return this.c;
      }
   }
}
