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
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class uk {
   public static final Codec<ui> a = asg.a(uk::a);
   public static final Codec<ui> b = asg.c.flatXmap($$0 -> a.parse(JsonOps.INSTANCE, $$0), $$0 -> a.encodeStart(JsonOps.INSTANCE, $$0));

   private static uw a(List<ui> $$0) {
      uw $$1 = $$0.get(0).f();

      for (int $$2 = 1; $$2 < $$0.size(); $$2++) {
         $$1.b($$0.get($$2));
      }

      return $$1;
   }

   public static <T extends atr, E> MapCodec<E> a(T[] $$0, Function<T, MapCodec<? extends E>> $$1, Function<E, T> $$2) {
      MapCodec<E> $$3 = new uk.a<>(Stream.<T>of($$0).map($$1).toList(), $$2x -> (MapEncoder<? extends E>)$$1.apply($$2.apply((E)$$2x)));
      Codec<T> $$4 = atr.b((Supplier<T[]>)(() -> $$0));
      MapCodec<E> $$5 = $$4.dispatchMap($$2, $$1x -> $$1.apply((T)$$1x).codec());
      MapCodec<E> $$6 = Codec.mapEither($$5, $$3).xmap($$0x -> $$0x.map($$0xx -> $$0xx, $$0xx -> $$0xx), Either::right);
      return asg.a($$6, $$5);
   }

   private static Codec<ui> a(Codec<ui> $$0) {
      uj.a<?>[] $$1 = new uj.a[]{vp.b, vt.c, vm.b, vq.c, vr.b, vo.b};
      MapCodec<uj> $$2 = a($$1, uj.a::a, uj::a);
      Codec<ui> $$3 = RecordCodecBuilder.create(
         $$2x -> $$2x.group($$2.forGetter(ui::b), asg.a(asg.a($$0.listOf()), "extra", List.of()).forGetter(ui::c), vf.b.a.forGetter(ui::a))
               .apply($$2x, uw::new)
      );
      return Codec.either(Codec.either(Codec.STRING, asg.a($$0.listOf())), $$3)
         .xmap($$0x -> (ui)$$0x.map($$0xx -> (ui)$$0xx.map(ui::b, uk::a), $$0xx -> $$0xx), $$0x -> {
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
}
