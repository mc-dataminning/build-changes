import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class wq {
   public static final Codec<wo> a = Codec.recursive("Component", wq::a);
   public static final ym<vz, wo> b = yk.d(a);
   public static final ym<vz, Optional<wo>> c = b.a(yk::a);
   public static final ym<vz, wo> d = yk.c(a);
   public static final ym<vz, Optional<wo>> e = d.a(yk::a);
   public static final ym<ByteBuf, wo> f = yk.a(a);
   public static final Codec<wo> g = a(Integer.MAX_VALUE);

   public static Codec<wo> a(int $$0) {
      final Codec<String> $$1 = Codec.string(0, $$0);
      return new Codec<wo>() {
         public <T> DataResult<Pair<wo, T>> decode(DynamicOps<T> $$0, T $$1x) {
            DynamicOps<JsonElement> $$2 = a($$0);
            return $$1.decode($$0, $$1).flatMap($$1xxx -> {
               try {
                  JsonElement $$2x = JsonParser.parseString((String)$$1xxx.getFirst());
                  return wq.a.parse($$2, $$2x).map($$1xxxxx -> Pair.of($$1xxxxx, $$1xxx.getSecond()));
               } catch (JsonParseException var3x) {
                  return DataResult.error(var3x::getMessage);
               }
            });
         }

         public <T> DataResult<T> a(wo $$0, DynamicOps<T> $$1x, T $$2) {
            DynamicOps<JsonElement> $$3 = a($$1);
            return wq.a.encodeStart($$3, $$0).flatMap($$2x -> {
               try {
                  return $$1.encodeStart($$1, ayp.e($$2x));
               } catch (IllegalArgumentException var4x) {
                  return DataResult.error(var4x::getMessage);
               }
            });
         }

         private static <T> DynamicOps<JsonElement> a(DynamicOps<T> $$0) {
            return (DynamicOps<JsonElement>)($$0 instanceof aks<T> $$1 ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
         }
      };
   }

   private static xc a(List<wo> $$0) {
      xc $$1 = $$0.get(0).f();

      for (int $$2 = 1; $$2 < $$0.size(); $$2++) {
         $$1.b($$0.get($$2));
      }

      return $$1;
   }

   public static <T extends azv, E> MapCodec<E> a(T[] $$0, Function<T, MapCodec<? extends E>> $$1, Function<E, T> $$2, String $$3) {
      MapCodec<E> $$4 = new wq.a<>(Stream.<T>of($$0).map($$1).toList(), $$2x -> (MapEncoder<? extends E>)$$1.apply($$2.apply((E)$$2x)));
      Codec<T> $$5 = azv.b((Supplier<T[]>)(() -> $$0));
      MapCodec<E> $$6 = $$5.dispatchMap($$3, $$2, $$1);
      MapCodec<E> $$7 = new wq.b($$3, $$6, $$4);
      return ayi.a($$7, $$6);
   }

   private static Codec<wo> a(Codec<wo> $$0) {
      wp.a<?>[] $$1 = new wp.a[]{xv.b, xz.c, xs.b, xw.c, xx.b, xu.b};
      MapCodec<wp> $$2 = a($$1, wp.a::a, wp::a, "type");
      Codec<wo> $$3 = RecordCodecBuilder.create(
         $$2x -> $$2x.group($$2.forGetter(wo::b), ayi.b($$0.listOf()).optionalFieldOf("extra", List.of()).forGetter(wo::c), xl.b.a.forGetter(wo::a))
               .apply($$2x, xc::new)
      );
      return Codec.either(Codec.either(Codec.STRING, ayi.b($$0.listOf())), $$3)
         .xmap($$0x -> (wo)$$0x.map($$0xx -> (wo)$$0xx.map(wo::b, wq::a), $$0xx -> $$0xx), $$0x -> {
            String $$1x = $$0x.d();
            return $$1x != null ? Either.left(Either.left($$1x)) : Either.right($$0x);
         });
   }

   static class a<T> extends MapCodec<T> {
      private final List<MapCodec<? extends T>> a;
      private final Function<T, MapEncoder<? extends T>> b;

      public a(List<MapCodec<? extends T>> $$0, Function<T, MapEncoder<? extends T>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public <S> DataResult<T> decode(DynamicOps<S> $$0, MapLike<S> $$1) {
         for (MapDecoder<? extends T> $$2 : this.a) {
            DataResult<? extends T> $$3 = $$2.decode($$0, $$1);
            if ($$3.result().isPresent()) {
               return (DataResult<T>)$$3;
            }
         }

         return DataResult.error(() -> "No matching codec found");
      }

      public <S> RecordBuilder<S> encode(T $$0, DynamicOps<S> $$1, RecordBuilder<S> $$2) {
         MapEncoder<T> $$3 = (MapEncoder<T>)this.b.apply($$0);
         return $$3.encode($$0, $$1, $$2);
      }

      public <S> Stream<S> keys(DynamicOps<S> $$0) {
         return this.a.stream().flatMap($$1 -> $$1.keys($$0)).distinct();
      }

      public String toString() {
         return "FuzzyCodec[" + this.a + "]";
      }
   }

   static class b<T> extends MapCodec<T> {
      private final String a;
      private final MapCodec<T> b;
      private final MapCodec<T> c;

      public b(String $$0, MapCodec<T> $$1, MapCodec<T> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public <O> DataResult<T> decode(DynamicOps<O> $$0, MapLike<O> $$1) {
         return $$1.get(this.a) != null ? this.b.decode($$0, $$1) : this.c.decode($$0, $$1);
      }

      public <O> RecordBuilder<O> encode(T $$0, DynamicOps<O> $$1, RecordBuilder<O> $$2) {
         return this.c.encode($$0, $$1, $$2);
      }

      public <T1> Stream<T1> keys(DynamicOps<T1> $$0) {
         return Stream.concat(this.b.keys($$0), this.c.keys($$0)).distinct();
      }
   }
}
