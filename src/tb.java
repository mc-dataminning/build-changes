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

public class tb implements DynamicOps<tk> {
   public static final tb a = new tb();
   private static final String b = "";

   protected tb() {
   }

   public tk a() {
      return sp.b;
   }

   public <U> U a(DynamicOps<U> $$0, tk $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((td)$$1).i());
         case 2:
            return (U)$$0.createShort(((td)$$1).h());
         case 3:
            return (U)$$0.createInt(((td)$$1).g());
         case 4:
            return (U)$$0.createLong(((td)$$1).f());
         case 5:
            return (U)$$0.createFloat(((td)$$1).k());
         case 6:
            return (U)$$0.createDouble(((td)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((sk)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.t_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((sr)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((su)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(tk $$0) {
      return $$0 instanceof td $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public tk a(Number $$0) {
      return so.a($$0.doubleValue());
   }

   public tk a(byte $$0) {
      return sl.a($$0);
   }

   public tk a(short $$0) {
      return tf.a($$0);
   }

   public tk a(int $$0) {
      return ss.a($$0);
   }

   public tk a(long $$0) {
      return sv.a($$0);
   }

   public tk a(float $$0) {
      return sq.a($$0);
   }

   public tk a(double $$0) {
      return so.a($$0);
   }

   public tk a(boolean $$0) {
      return sl.a($$0);
   }

   public DataResult<String> b(tk $$0) {
      return $$0 instanceof ti $$1 ? DataResult.success($$1.t_()) : DataResult.error(() -> "Not a string");
   }

   public tk a(String $$0) {
      return ti.a($$0);
   }

   public DataResult<tk> a(tk $$0, tk $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<tk> a(tk $$0, List<tk> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<tk> a(tk $$0, tk $$1, tk $$2) {
      if (!($$0 instanceof sn) && !($$0 instanceof sp)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof ti)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         sn $$3 = new sn();
         if ($$0 instanceof sn $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.t_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<tk> a(tk $$0, MapLike<tk> $$1) {
      if (!($$0 instanceof sn) && !($$0 instanceof sp)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         sn $$2 = new sn();
         if ($$0 instanceof sn $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<tk> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            tk $$3 = (tk)$$2x.getFirst();
            if (!($$3 instanceof ti)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.t_(), (tk)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<tk, tk>>> c(tk $$0) {
      return $$0 instanceof sn $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<tk, tk>>> d(tk $$0) {
      return $$0 instanceof sn $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<tk>> e(tk $$0) {
      return $$0 instanceof sn $$1 ? DataResult.success(new MapLike<tk>() {
         @Nullable
         public tk a(tk $$0) {
            return $$1.c($$0.t_());
         }

         @Nullable
         public tk a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<tk, tk>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(tb.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public tk a(Stream<Pair<tk, tk>> $$0) {
      sn $$1 = new sn();
      $$0.forEach($$1x -> $$1.a(((tk)$$1x.getFirst()).t_(), (tk)$$1x.getSecond()));
      return $$1;
   }

   private static tk a(sn $$0) {
      if ($$0.f() == 1) {
         tk $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<tk>> f(tk $$0) {
      if ($$0 instanceof st $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((sn)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof sm<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<tk>>> g(tk $$0) {
      if ($$0 instanceof st $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((sn)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof sm<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(tk $$0) {
      return $$0 instanceof sk $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public tk a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new sk($$2);
   }

   public DataResult<IntStream> i(tk $$0) {
      return $$0 instanceof sr $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public tk a(IntStream $$0) {
      return new sr($$0.toArray());
   }

   public DataResult<LongStream> j(tk $$0) {
      return $$0 instanceof su $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public tk a(LongStream $$0) {
      return new su($$0.toArray());
   }

   public tk b(Stream<tk> $$0) {
      return tb.d.a.a($$0).a();
   }

   public tk a(tk $$0, String $$1) {
      if ($$0 instanceof sn $$2) {
         sn $$3 = new sn();
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

   public RecordBuilder<tk> mapBuilder() {
      return new tb.h();
   }

   private static Optional<tb.f> k(tk $$0) {
      if ($$0 instanceof sp) {
         return Optional.of(tb.d.a);
      } else {
         if ($$0 instanceof sm<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(tb.d.a);
            }

            if ($$1 instanceof st $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(tb.d.a);
                  case 10 -> Optional.of(new tb.b($$2));
                  default -> Optional.of(new tb.c($$2));
               };
            }

            if ($$1 instanceof sk $$3) {
               return Optional.of(new tb.a($$3.e()));
            }

            if ($$1 instanceof sr $$4) {
               return Optional.of(new tb.e($$4.g()));
            }

            if ($$1 instanceof su $$5) {
               return Optional.of(new tb.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements tb.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public tb.f a(tk $$0) {
         if ($$0 instanceof sl $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new tb.b(this.a).a($$0);
         }
      }

      @Override
      public tk a() {
         return new sk(this.a.toByteArray());
      }
   }

   static class b implements tb.f {
      private final st a = new st();

      public b() {
      }

      public b(Collection<tk> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ss.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sl.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sv.a($$0x))));
      }

      private static boolean a(sn $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static tk b(tk $$0) {
         if ($$0 instanceof sn $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static sn c(tk $$0) {
         sn $$1 = new sn();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public tb.f a(tk $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public tk a() {
         return this.a;
      }
   }

   static class c implements tb.f {
      private final st a = new st();

      c(tk $$0) {
         this.a.add($$0);
      }

      c(st $$0) {
         this.a.addAll($$0);
      }

      @Override
      public tb.f a(tk $$0) {
         if ($$0.b() != this.a.f()) {
            return new tb.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public tk a() {
         return this.a;
      }
   }

   static class d implements tb.f {
      public static final tb.d a = new tb.d();

      private d() {
      }

      @Override
      public tb.f a(tk $$0) {
         if ($$0 instanceof sn $$1) {
            return new tb.b().a($$1);
         } else if ($$0 instanceof sl $$2) {
            return new tb.a($$2.i());
         } else if ($$0 instanceof ss $$3) {
            return new tb.e($$3.g());
         } else {
            return (tb.f)($$0 instanceof sv $$4 ? new tb.g($$4.f()) : new tb.c($$0));
         }
      }

      @Override
      public tk a() {
         return new st();
      }
   }

   static class e implements tb.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public tb.f a(tk $$0) {
         if ($$0 instanceof ss $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new tb.b(this.a).a($$0);
         }
      }

      @Override
      public tk a() {
         return new sr(this.a.toIntArray());
      }
   }

   interface f {
      tb.f a(tk var1);

      default tb.f a(Iterable<tk> $$0) {
         tb.f $$1 = this;

         for (tk $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default tb.f a(Stream<tk> $$0) {
         return this.a($$0::iterator);
      }

      tk a();
   }

   static class g implements tb.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public tb.f a(tk $$0) {
         if ($$0 instanceof sv $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new tb.b(this.a).a($$0);
         }
      }

      @Override
      public tk a() {
         return new su(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<tk, sn> {
      protected h() {
         super(tb.this);
      }

      protected sn a() {
         return new sn();
      }

      protected sn a(String $$0, tk $$1, sn $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<tk> a(sn $$0, tk $$1) {
         if ($$1 == null || $$1 == sp.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof sn $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            sn $$3 = new sn(Maps.newHashMap($$2.i()));

            for (Entry<String, tk> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
