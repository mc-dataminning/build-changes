import com.google.gson.JsonElement;
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

public class wx {
   public static final Codec<wv> a = Codec.recursive("Component", wx::a);
   public static final yt<wg, wv> b = yr.d(a);
   public static final yt<wg, Optional<wv>> c = b.a(yr::a);
   public static final yt<wg, wv> d = yr.c(a);
   public static final yt<wg, Optional<wv>> e = d.a(yr::a);
   public static final yt<ByteBuf, wv> f = yr.a(a);

   public static Codec<wv> a(final int $$0) {
      return new Codec<wv>() {
         public <T> DataResult<Pair<wv, T>> decode(DynamicOps<T> $$0x, T $$1) {
            return wx.a
               .decode($$0, $$1)
               .flatMap(
                  $$2 -> this.a($$0, (wv)$$2.getFirst())
                        ? DataResult.error(() -> "Component was too large: greater than max size " + $$0)
                        : DataResult.success($$2)
               );
         }

         public <T> DataResult<T> a(wv $$0x, DynamicOps<T> $$1, T $$2) {
            return wx.a.encodeStart($$1, $$0);
         }

         private <T> boolean a(DynamicOps<T> $$0x, wv $$1) {
            DataResult<JsonElement> $$2 = wx.a.encodeStart(a($$0), $$1);
            return $$2.isSuccess() && aza.a((JsonElement)$$2.getOrThrow(), $$0);
         }

         private static <T> DynamicOps<JsonElement> a(DynamicOps<T> $$0x) {
            return (DynamicOps<JsonElement>)($$0 instanceof alb<T> $$1 ? $$1.a(JsonOps.INSTANCE) : JsonOps.INSTANCE);
         }
      };
   }

   private static xj a(List<wv> $$0) {
      xj $$1 = $$0.get(0).f();

      for (int $$2 = 1; $$2 < $$0.size(); $$2++) {
         $$1.b($$0.get($$2));
      }

      return $$1;
   }

   public static <T extends bag, E> MapCodec<E> a(T[] $$0, Function<T, MapCodec<? extends E>> $$1, Function<E, T> $$2, String $$3) {
      MapCodec<E> $$4 = new wx.a<>(Stream.<T>of($$0).map($$1).toList(), $$2x -> (MapEncoder<? extends E>)$$1.apply($$2.apply((E)$$2x)));
      Codec<T> $$5 = bag.b((Supplier<T[]>)(() -> $$0));
      MapCodec<E> $$6 = $$5.dispatchMap($$3, $$2, $$1);
      MapCodec<E> $$7 = new wx.b($$3, $$6, $$4);
      return ays.a($$7, $$6);
   }

   private static Codec<wv> a(Codec<wv> $$0) {
      ww.a<?>[] $$1 = new ww.a[]{yc.b, yg.c, xz.b, yd.c, ye.b, yb.b};
      MapCodec<ww> $$2 = a($$1, ww.a::a, ww::a, "type");
      Codec<wv> $$3 = RecordCodecBuilder.create(
         $$2x -> $$2x.group($$2.forGetter(wv::b), ays.b($$0.listOf()).optionalFieldOf("extra", List.of()).forGetter(wv::c), xs.b.a.forGetter(wv::a))
               .apply($$2x, xj::new)
      );
      return Codec.either(Codec.either(Codec.STRING, ays.b($$0.listOf())), $$3)
         .xmap($$0x -> (wv)$$0x.map($$0xx -> (wv)$$0xx.map(wv::b, wx::a), $$0xx -> $$0xx), $$0x -> {
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
