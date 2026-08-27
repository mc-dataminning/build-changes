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

public class to implements DynamicOps<tx> {
   public static final to a = new to();
   private static final String b = "";

   protected to() {
   }

   public tx a() {
      return tc.b;
   }

   public <U> U a(DynamicOps<U> $$0, tx $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((tq)$$1).i());
         case 2:
            return (U)$$0.createShort(((tq)$$1).h());
         case 3:
            return (U)$$0.createInt(((tq)$$1).g());
         case 4:
            return (U)$$0.createLong(((tq)$$1).f());
         case 5:
            return (U)$$0.createFloat(((tq)$$1).k());
         case 6:
            return (U)$$0.createDouble(((tq)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((sx)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.s_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((te)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((th)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(tx $$0) {
      return $$0 instanceof tq $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public tx a(Number $$0) {
      return tb.a($$0.doubleValue());
   }

   public tx a(byte $$0) {
      return sy.a($$0);
   }

   public tx a(short $$0) {
      return ts.a($$0);
   }

   public tx a(int $$0) {
      return tf.a($$0);
   }

   public tx a(long $$0) {
      return ti.a($$0);
   }

   public tx a(float $$0) {
      return td.a($$0);
   }

   public tx a(double $$0) {
      return tb.a($$0);
   }

   public tx a(boolean $$0) {
      return sy.a($$0);
   }

   public DataResult<String> b(tx $$0) {
      return $$0 instanceof tv $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public tx a(String $$0) {
      return tv.a($$0);
   }

   public DataResult<tx> a(tx $$0, tx $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<tx> a(tx $$0, List<tx> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<tx> a(tx $$0, tx $$1, tx $$2) {
      if (!($$0 instanceof ta) && !($$0 instanceof tc)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof tv)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         ta $$3 = new ta();
         if ($$0 instanceof ta $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.s_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<tx> a(tx $$0, MapLike<tx> $$1) {
      if (!($$0 instanceof ta) && !($$0 instanceof tc)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ta $$2 = new ta();
         if ($$0 instanceof ta $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<tx> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            tx $$3 = (tx)$$2x.getFirst();
            if (!($$3 instanceof tv)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.s_(), (tx)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<tx, tx>>> c(tx $$0) {
      return $$0 instanceof ta $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<tx, tx>>> d(tx $$0) {
      return $$0 instanceof ta $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<tx>> e(tx $$0) {
      return $$0 instanceof ta $$1 ? DataResult.success(new MapLike<tx>() {
         @Nullable
         public tx a(tx $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public tx a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<tx, tx>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(to.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public tx a(Stream<Pair<tx, tx>> $$0) {
      ta $$1 = new ta();
      $$0.forEach($$1x -> $$1.a(((tx)$$1x.getFirst()).s_(), (tx)$$1x.getSecond()));
      return $$1;
   }

   private static tx a(ta $$0) {
      if ($$0.f() == 1) {
         tx $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<tx>> f(tx $$0) {
      if ($$0 instanceof tg $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((ta)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof sz<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<tx>>> g(tx $$0) {
      if ($$0 instanceof tg $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((ta)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof sz<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(tx $$0) {
      return $$0 instanceof sx $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public tx a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new sx($$2);
   }

   public DataResult<IntStream> i(tx $$0) {
      return $$0 instanceof te $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public tx a(IntStream $$0) {
      return new te($$0.toArray());
   }

   public DataResult<LongStream> j(tx $$0) {
      return $$0 instanceof th $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public tx a(LongStream $$0) {
      return new th($$0.toArray());
   }

   public tx b(Stream<tx> $$0) {
      return to.d.a.a($$0).a();
   }

   public tx a(tx $$0, String $$1) {
      if ($$0 instanceof ta $$2) {
         ta $$3 = new ta();
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

   public RecordBuilder<tx> mapBuilder() {
      return new to.h();
   }

   private static Optional<to.f> k(tx $$0) {
      if ($$0 instanceof tc) {
         return Optional.of(to.d.a);
      } else {
         if ($$0 instanceof sz<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(to.d.a);
            }

            if ($$1 instanceof tg $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(to.d.a);
                  case 10 -> Optional.of(new to.b($$2));
                  default -> Optional.of(new to.c($$2));
               };
            }

            if ($$1 instanceof sx $$3) {
               return Optional.of(new to.a($$3.e()));
            }

            if ($$1 instanceof te $$4) {
               return Optional.of(new to.e($$4.g()));
            }

            if ($$1 instanceof th $$5) {
               return Optional.of(new to.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements to.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public to.f a(tx $$0) {
         if ($$0 instanceof sy $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new to.b(this.a).a($$0);
         }
      }

      @Override
      public tx a() {
         return new sx(this.a.toByteArray());
      }
   }

   static class b implements to.f {
      private final tg a = new tg();

      public b() {
      }

      public b(Collection<tx> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tf.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sy.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ti.a($$0x))));
      }

      private static boolean a(ta $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static tx b(tx $$0) {
         if ($$0 instanceof ta $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static ta c(tx $$0) {
         ta $$1 = new ta();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public to.f a(tx $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public tx a() {
         return this.a;
      }
   }

   static class c implements to.f {
      private final tg a = new tg();

      c(tx $$0) {
         this.a.add($$0);
      }

      c(tg $$0) {
         this.a.addAll($$0);
      }

      @Override
      public to.f a(tx $$0) {
         if ($$0.b() != this.a.f()) {
            return new to.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public tx a() {
         return this.a;
      }
   }

   static class d implements to.f {
      public static final to.d a = new to.d();

      private d() {
      }

      @Override
      public to.f a(tx $$0) {
         if ($$0 instanceof ta $$1) {
            return new to.b().a($$1);
         } else if ($$0 instanceof sy $$2) {
            return new to.a($$2.i());
         } else if ($$0 instanceof tf $$3) {
            return new to.e($$3.g());
         } else {
            return (to.f)($$0 instanceof ti $$4 ? new to.g($$4.f()) : new to.c($$0));
         }
      }

      @Override
      public tx a() {
         return new tg();
      }
   }

   static class e implements to.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public to.f a(tx $$0) {
         if ($$0 instanceof tf $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new to.b(this.a).a($$0);
         }
      }

      @Override
      public tx a() {
         return new te(this.a.toIntArray());
      }
   }

   interface f {
      to.f a(tx var1);

      default to.f a(Iterable<tx> $$0) {
         to.f $$1 = this;

         for (tx $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default to.f a(Stream<tx> $$0) {
         return this.a($$0::iterator);
      }

      tx a();
   }

   static class g implements to.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public to.f a(tx $$0) {
         if ($$0 instanceof ti $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new to.b(this.a).a($$0);
         }
      }

      @Override
      public tx a() {
         return new th(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<tx, ta> {
      protected h() {
         super(to.this);
      }

      protected ta a() {
         return new ta();
      }

      protected ta a(String $$0, tx $$1, ta $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<tx> a(ta $$0, tx $$1) {
         if ($$1 == null || $$1 == tc.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof ta $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            ta $$3 = new ta(Maps.newHashMap($$2.i()));

            for (Entry<String, tx> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
