import com.mojang.datafixers.util.Either;
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

public class vw {
   public static final Codec<vu> a = awe.a("Component", vw::a);
   public static final xs<vf, vu> b = xq.b(a);
   public static final xs<vf, Optional<vu>> c = b.a(xq::a);
   public static final xs<ByteBuf, vu> d = xq.a(a);
   public static final Codec<vu> e = awe.c.flatXmap($$0 -> a.parse(JsonOps.INSTANCE, $$0), $$0 -> a.encodeStart(JsonOps.INSTANCE, $$0));

   private static wi a(List<vu> $$0) {
      wi $$1 = $$0.get(0).f();

      for (int $$2 = 1; $$2 < $$0.size(); $$2++) {
         $$1.b($$0.get($$2));
      }

      return $$1;
   }

   public static <T extends axq, E> MapCodec<E> a(T[] $$0, Function<T, MapCodec<? extends E>> $$1, Function<E, T> $$2, String $$3) {
      MapCodec<E> $$4 = new vw.a<>(Stream.<T>of($$0).map($$1).toList(), $$2x -> (MapEncoder<? extends E>)$$1.apply($$2.apply((E)$$2x)));
      Codec<T> $$5 = axq.b((Supplier<T[]>)(() -> $$0));
      MapCodec<E> $$6 = $$5.dispatchMap($$3, $$2, $$1x -> $$1.apply((T)$$1x).codec());
      MapCodec<E> $$7 = new vw.b($$3, $$6, $$4);
      return awe.a($$7, $$6);
   }

   private static Codec<vu> a(Codec<vu> $$0) {
      vv.a<?>[] $$1 = new vv.a[]{xb.b, xf.c, wy.b, xc.c, xd.b, xa.b};
      MapCodec<vv> $$2 = a($$1, vv.a::a, vv::a, "type");
      Codec<vu> $$3 = RecordCodecBuilder.create(
         $$2x -> $$2x.group($$2.forGetter(vu::b), awe.a(awe.a($$0.listOf()), "extra", List.of()).forGetter(vu::c), wr.b.a.forGetter(vu::a))
               .apply($$2x, wi::new)
      );
      return Codec.either(Codec.either(Codec.STRING, awe.a($$0.listOf())), $$3)
         .xmap($$0x -> (vu)$$0x.map($$0xx -> (vu)$$0xx.map(vu::b, vw::a), $$0xx -> $$0xx), $$0x -> {
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
