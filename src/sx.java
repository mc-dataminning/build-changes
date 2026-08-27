import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.RecordBuilder.AbstractStringBuilder;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class sx implements DynamicOps<tg> {
   public static final sx a = new sx();
   private static final String b = "";

   protected sx() {
   }

   public tg a() {
      return sl.b;
   }

   public <U> U a(DynamicOps<U> $$0, tg $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((sz)$$1).i());
         case 2:
            return (U)$$0.createShort(((sz)$$1).h());
         case 3:
            return (U)$$0.createInt(((sz)$$1).g());
         case 4:
            return (U)$$0.createLong(((sz)$$1).f());
         case 5:
            return (U)$$0.createFloat(((sz)$$1).k());
         case 6:
            return (U)$$0.createDouble(((sz)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((sg)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.t_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((sn)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((sq)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(tg $$0) {
      return $$0 instanceof sz $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public tg a(Number $$0) {
      return sk.a($$0.doubleValue());
   }

   public tg a(byte $$0) {
      return sh.a($$0);
   }

   public tg a(short $$0) {
      return tb.a($$0);
   }

   public tg a(int $$0) {
      return so.a($$0);
   }

   public tg a(long $$0) {
      return sr.a($$0);
   }

   public tg a(float $$0) {
      return sm.a($$0);
   }

   public tg a(double $$0) {
      return sk.a($$0);
   }

   public tg a(boolean $$0) {
      return sh.a($$0);
   }

   public DataResult<String> b(tg $$0) {
      return $$0 instanceof te $$1 ? DataResult.success($$1.t_()) : DataResult.error(() -> "Not a string");
   }

   public tg a(String $$0) {
      return te.a($$0);
   }

   public DataResult<tg> a(tg $$0, tg $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<tg> a(tg $$0, List<tg> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<tg> a(tg $$0, tg $$1, tg $$2) {
      if (!($$0 instanceof sj) && !($$0 instanceof sl)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof te)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         sj $$3 = new sj();
         if ($$0 instanceof sj $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.t_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<tg> a(tg $$0, MapLike<tg> $$1) {
      if (!($$0 instanceof sj) && !($$0 instanceof sl)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         sj $$2 = new sj();
         if ($$0 instanceof sj $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<tg> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            tg $$3 = (tg)$$2x.getFirst();
            if (!($$3 instanceof te)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.t_(), (tg)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<tg, tg>>> c(tg $$0) {
      return $$0 instanceof sj $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<tg, tg>>> d(tg $$0) {
      return $$0 instanceof sj $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<tg>> e(tg $$0) {
      return $$0 instanceof sj $$1 ? DataResult.success(new MapLike<tg>() {
         @Nullable
         public tg a(tg $$0) {
            return $$1.c($$0.t_());
         }

         @Nullable
         public tg a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<tg, tg>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(sx.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public tg a(Stream<Pair<tg, tg>> $$0) {
      sj $$1 = new sj();
      $$0.forEach($$1x -> $$1.a(((tg)$$1x.getFirst()).t_(), (tg)$$1x.getSecond()));
      return $$1;
   }

   private static tg a(sj $$0) {
      if ($$0.f() == 1) {
         tg $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<tg>> f(tg $$0) {
      if ($$0 instanceof sp $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((sj)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof si<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<tg>>> g(tg $$0) {
      if ($$0 instanceof sp $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((sj)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof si<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(tg $$0) {
      return $$0 instanceof sg $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public tg a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new sg($$2);
   }

   public DataResult<IntStream> i(tg $$0) {
      return $$0 instanceof sn $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public tg a(IntStream $$0) {
      return new sn($$0.toArray());
   }

   public DataResult<LongStream> j(tg $$0) {
      return $$0 instanceof sq $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public tg a(LongStream $$0) {
      return new sq($$0.toArray());
   }

   public tg b(Stream<tg> $$0) {
      return sx.d.a.a($$0).a();
   }

   public tg a(tg $$0, String $$1) {
      if ($$0 instanceof sj $$2) {
         sj $$3 = new sj();
         $$2.e().stream().filter($$1x -> !Objects.equals($$1x, $$1)).forEach($$2x -> $$3.a($$2x, $$2.c($$2x)));
         return $$3;
      } else {
         return $$0;
      }
   }

   @Override
   public String toString() {
      return "NBT";
   }

   public RecordBuilder<tg> mapBuilder() {
      return new sx.h();
   }

   private static Optional<sx.f> k(tg $$0) {
      if ($$0 instanceof sl) {
         return Optional.of(sx.d.a);
      } else {
         if ($$0 instanceof si<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(sx.d.a);
            }

            if ($$1 instanceof sp $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(sx.d.a);
                  case 10 -> Optional.of(new sx.b($$2));
                  default -> Optional.of(new sx.c($$2));
               };
            }

            if ($$1 instanceof sg $$3) {
               return Optional.of(new sx.a($$3.e()));
            }

            if ($$1 instanceof sn $$4) {
               return Optional.of(new sx.e($$4.g()));
            }

            if ($$1 instanceof sq $$5) {
               return Optional.of(new sx.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements sx.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sx.f a(tg $$0) {
         if ($$0 instanceof sh $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new sx.b(this.a).a($$0);
         }
      }

      @Override
      public tg a() {
         return new sg(this.a.toByteArray());
      }
   }

   static class b implements sx.f {
      private final sp a = new sp();

      public b() {
      }

      public b(Collection<tg> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(so.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sh.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sr.a($$0x))));
      }

      private static boolean a(sj $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static tg b(tg $$0) {
         if ($$0 instanceof sj $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static sj c(tg $$0) {
         sj $$1 = new sj();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public sx.f a(tg $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public tg a() {
         return this.a;
      }
   }

   static class c implements sx.f {
      private final sp a = new sp();

      c(tg $$0) {
         this.a.add($$0);
      }

      c(sp $$0) {
         this.a.addAll($$0);
      }

      @Override
      public sx.f a(tg $$0) {
         if ($$0.b() != this.a.f()) {
            return new sx.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public tg a() {
         return this.a;
      }
   }

   static class d implements sx.f {
      public static final sx.d a = new sx.d();

      private d() {
      }

      @Override
      public sx.f a(tg $$0) {
         if ($$0 instanceof sj $$1) {
            return new sx.b().a($$1);
         } else if ($$0 instanceof sh $$2) {
            return new sx.a($$2.i());
         } else if ($$0 instanceof so $$3) {
            return new sx.e($$3.g());
         } else {
            return (sx.f)($$0 instanceof sr $$4 ? new sx.g($$4.f()) : new sx.c($$0));
         }
      }

      @Override
      public tg a() {
         return new sp();
      }
   }

   static class e implements sx.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sx.f a(tg $$0) {
         if ($$0 instanceof so $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new sx.b(this.a).a($$0);
         }
      }

      @Override
      public tg a() {
         return new sn(this.a.toIntArray());
      }
   }

   interface f {
      sx.f a(tg var1);

      default sx.f a(Iterable<tg> $$0) {
         sx.f $$1 = this;

         for (tg $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default sx.f a(Stream<tg> $$0) {
         return this.a($$0::iterator);
      }

      tg a();
   }

   static class g implements sx.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sx.f a(tg $$0) {
         if ($$0 instanceof sr $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new sx.b(this.a).a($$0);
         }
      }

      @Override
      public tg a() {
         return new sq(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<tg, sj> {
      protected h() {
         super(sx.this);
      }

      protected sj a() {
         return new sj();
      }

      protected sj a(String $$0, tg $$1, sj $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<tg> a(sj $$0, tg $$1) {
         if ($$1 == null || $$1 == sl.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof sj $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            sj $$3 = new sj(Maps.newHashMap($$2.i()));

            for (Entry<String, tg> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
