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

public class sz implements DynamicOps<ti> {
   public static final sz a = new sz();
   private static final String b = "";

   protected sz() {
   }

   public ti a() {
      return sn.b;
   }

   public <U> U a(DynamicOps<U> $$0, ti $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((tb)$$1).i());
         case 2:
            return (U)$$0.createShort(((tb)$$1).h());
         case 3:
            return (U)$$0.createInt(((tb)$$1).g());
         case 4:
            return (U)$$0.createLong(((tb)$$1).f());
         case 5:
            return (U)$$0.createFloat(((tb)$$1).k());
         case 6:
            return (U)$$0.createDouble(((tb)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((si)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.t_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((sp)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((ss)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(ti $$0) {
      return $$0 instanceof tb $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public ti a(Number $$0) {
      return sm.a($$0.doubleValue());
   }

   public ti a(byte $$0) {
      return sj.a($$0);
   }

   public ti a(short $$0) {
      return td.a($$0);
   }

   public ti a(int $$0) {
      return sq.a($$0);
   }

   public ti a(long $$0) {
      return st.a($$0);
   }

   public ti a(float $$0) {
      return so.a($$0);
   }

   public ti a(double $$0) {
      return sm.a($$0);
   }

   public ti a(boolean $$0) {
      return sj.a($$0);
   }

   public DataResult<String> b(ti $$0) {
      return $$0 instanceof tg $$1 ? DataResult.success($$1.t_()) : DataResult.error(() -> "Not a string");
   }

   public ti a(String $$0) {
      return tg.a($$0);
   }

   public DataResult<ti> a(ti $$0, ti $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<ti> a(ti $$0, List<ti> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<ti> a(ti $$0, ti $$1, ti $$2) {
      if (!($$0 instanceof sl) && !($$0 instanceof sn)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof tg)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         sl $$3 = new sl();
         if ($$0 instanceof sl $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.t_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<ti> a(ti $$0, MapLike<ti> $$1) {
      if (!($$0 instanceof sl) && !($$0 instanceof sn)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         sl $$2 = new sl();
         if ($$0 instanceof sl $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<ti> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            ti $$3 = (ti)$$2x.getFirst();
            if (!($$3 instanceof tg)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.t_(), (ti)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<ti, ti>>> c(ti $$0) {
      return $$0 instanceof sl $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<ti, ti>>> d(ti $$0) {
      return $$0 instanceof sl $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<ti>> e(ti $$0) {
      return $$0 instanceof sl $$1 ? DataResult.success(new MapLike<ti>() {
         @Nullable
         public ti a(ti $$0) {
            return $$1.c($$0.t_());
         }

         @Nullable
         public ti a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<ti, ti>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(sz.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public ti a(Stream<Pair<ti, ti>> $$0) {
      sl $$1 = new sl();
      $$0.forEach($$1x -> $$1.a(((ti)$$1x.getFirst()).t_(), (ti)$$1x.getSecond()));
      return $$1;
   }

   private static ti a(sl $$0) {
      if ($$0.f() == 1) {
         ti $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<ti>> f(ti $$0) {
      if ($$0 instanceof sr $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((sl)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof sk<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<ti>>> g(ti $$0) {
      if ($$0 instanceof sr $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((sl)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof sk<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(ti $$0) {
      return $$0 instanceof si $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public ti a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new si($$2);
   }

   public DataResult<IntStream> i(ti $$0) {
      return $$0 instanceof sp $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public ti a(IntStream $$0) {
      return new sp($$0.toArray());
   }

   public DataResult<LongStream> j(ti $$0) {
      return $$0 instanceof ss $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public ti a(LongStream $$0) {
      return new ss($$0.toArray());
   }

   public ti b(Stream<ti> $$0) {
      return sz.d.a.a($$0).a();
   }

   public ti a(ti $$0, String $$1) {
      if ($$0 instanceof sl $$2) {
         sl $$3 = new sl();
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

   public RecordBuilder<ti> mapBuilder() {
      return new sz.h();
   }

   private static Optional<sz.f> k(ti $$0) {
      if ($$0 instanceof sn) {
         return Optional.of(sz.d.a);
      } else {
         if ($$0 instanceof sk<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(sz.d.a);
            }

            if ($$1 instanceof sr $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(sz.d.a);
                  case 10 -> Optional.of(new sz.b($$2));
                  default -> Optional.of(new sz.c($$2));
               };
            }

            if ($$1 instanceof si $$3) {
               return Optional.of(new sz.a($$3.e()));
            }

            if ($$1 instanceof sp $$4) {
               return Optional.of(new sz.e($$4.g()));
            }

            if ($$1 instanceof ss $$5) {
               return Optional.of(new sz.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements sz.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sz.f a(ti $$0) {
         if ($$0 instanceof sj $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new sz.b(this.a).a($$0);
         }
      }

      @Override
      public ti a() {
         return new si(this.a.toByteArray());
      }
   }

   static class b implements sz.f {
      private final sr a = new sr();

      public b() {
      }

      public b(Collection<ti> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sq.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sj.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(st.a($$0x))));
      }

      private static boolean a(sl $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static ti b(ti $$0) {
         if ($$0 instanceof sl $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static sl c(ti $$0) {
         sl $$1 = new sl();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public sz.f a(ti $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public ti a() {
         return this.a;
      }
   }

   static class c implements sz.f {
      private final sr a = new sr();

      c(ti $$0) {
         this.a.add($$0);
      }

      c(sr $$0) {
         this.a.addAll($$0);
      }

      @Override
      public sz.f a(ti $$0) {
         if ($$0.b() != this.a.f()) {
            return new sz.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public ti a() {
         return this.a;
      }
   }

   static class d implements sz.f {
      public static final sz.d a = new sz.d();

      private d() {
      }

      @Override
      public sz.f a(ti $$0) {
         if ($$0 instanceof sl $$1) {
            return new sz.b().a($$1);
         } else if ($$0 instanceof sj $$2) {
            return new sz.a($$2.i());
         } else if ($$0 instanceof sq $$3) {
            return new sz.e($$3.g());
         } else {
            return (sz.f)($$0 instanceof st $$4 ? new sz.g($$4.f()) : new sz.c($$0));
         }
      }

      @Override
      public ti a() {
         return new sr();
      }
   }

   static class e implements sz.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sz.f a(ti $$0) {
         if ($$0 instanceof sq $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new sz.b(this.a).a($$0);
         }
      }

      @Override
      public ti a() {
         return new sp(this.a.toIntArray());
      }
   }

   interface f {
      sz.f a(ti var1);

      default sz.f a(Iterable<ti> $$0) {
         sz.f $$1 = this;

         for (ti $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default sz.f a(Stream<ti> $$0) {
         return this.a($$0::iterator);
      }

      ti a();
   }

   static class g implements sz.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sz.f a(ti $$0) {
         if ($$0 instanceof st $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new sz.b(this.a).a($$0);
         }
      }

      @Override
      public ti a() {
         return new ss(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<ti, sl> {
      protected h() {
         super(sz.this);
      }

      protected sl a() {
         return new sl();
      }

      protected sl a(String $$0, ti $$1, sl $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<ti> a(sl $$0, ti $$1) {
         if ($$1 == null || $$1 == sn.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof sl $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            sl $$3 = new sl(Maps.newHashMap($$2.i()));

            for (Entry<String, ti> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
