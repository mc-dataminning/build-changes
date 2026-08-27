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

public class tk implements DynamicOps<tt> {
   public static final tk a = new tk();
   private static final String b = "";

   protected tk() {
   }

   public tt a() {
      return sy.b;
   }

   public <U> U a(DynamicOps<U> $$0, tt $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((tm)$$1).i());
         case 2:
            return (U)$$0.createShort(((tm)$$1).h());
         case 3:
            return (U)$$0.createInt(((tm)$$1).g());
         case 4:
            return (U)$$0.createLong(((tm)$$1).f());
         case 5:
            return (U)$$0.createFloat(((tm)$$1).k());
         case 6:
            return (U)$$0.createDouble(((tm)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((st)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.t_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((ta)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((td)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(tt $$0) {
      return $$0 instanceof tm $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public tt a(Number $$0) {
      return sx.a($$0.doubleValue());
   }

   public tt a(byte $$0) {
      return su.a($$0);
   }

   public tt a(short $$0) {
      return to.a($$0);
   }

   public tt a(int $$0) {
      return tb.a($$0);
   }

   public tt a(long $$0) {
      return te.a($$0);
   }

   public tt a(float $$0) {
      return sz.a($$0);
   }

   public tt a(double $$0) {
      return sx.a($$0);
   }

   public tt a(boolean $$0) {
      return su.a($$0);
   }

   public DataResult<String> b(tt $$0) {
      return $$0 instanceof tr $$1 ? DataResult.success($$1.t_()) : DataResult.error(() -> "Not a string");
   }

   public tt a(String $$0) {
      return tr.a($$0);
   }

   public DataResult<tt> a(tt $$0, tt $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<tt> a(tt $$0, List<tt> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<tt> a(tt $$0, tt $$1, tt $$2) {
      if (!($$0 instanceof sw) && !($$0 instanceof sy)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof tr)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         sw $$3 = new sw();
         if ($$0 instanceof sw $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.t_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<tt> a(tt $$0, MapLike<tt> $$1) {
      if (!($$0 instanceof sw) && !($$0 instanceof sy)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         sw $$2 = new sw();
         if ($$0 instanceof sw $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<tt> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            tt $$3 = (tt)$$2x.getFirst();
            if (!($$3 instanceof tr)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.t_(), (tt)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<tt, tt>>> c(tt $$0) {
      return $$0 instanceof sw $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<tt, tt>>> d(tt $$0) {
      return $$0 instanceof sw $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<tt>> e(tt $$0) {
      return $$0 instanceof sw $$1 ? DataResult.success(new MapLike<tt>() {
         @Nullable
         public tt a(tt $$0) {
            return $$1.c($$0.t_());
         }

         @Nullable
         public tt a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<tt, tt>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(tk.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public tt a(Stream<Pair<tt, tt>> $$0) {
      sw $$1 = new sw();
      $$0.forEach($$1x -> $$1.a(((tt)$$1x.getFirst()).t_(), (tt)$$1x.getSecond()));
      return $$1;
   }

   private static tt a(sw $$0) {
      if ($$0.f() == 1) {
         tt $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<tt>> f(tt $$0) {
      if ($$0 instanceof tc $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((sw)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof sv<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<tt>>> g(tt $$0) {
      if ($$0 instanceof tc $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((sw)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof sv<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(tt $$0) {
      return $$0 instanceof st $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public tt a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new st($$2);
   }

   public DataResult<IntStream> i(tt $$0) {
      return $$0 instanceof ta $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public tt a(IntStream $$0) {
      return new ta($$0.toArray());
   }

   public DataResult<LongStream> j(tt $$0) {
      return $$0 instanceof td $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public tt a(LongStream $$0) {
      return new td($$0.toArray());
   }

   public tt b(Stream<tt> $$0) {
      return tk.d.a.a($$0).a();
   }

   public tt a(tt $$0, String $$1) {
      if ($$0 instanceof sw $$2) {
         sw $$3 = new sw();
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

   public RecordBuilder<tt> mapBuilder() {
      return new tk.h();
   }

   private static Optional<tk.f> k(tt $$0) {
      if ($$0 instanceof sy) {
         return Optional.of(tk.d.a);
      } else {
         if ($$0 instanceof sv<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(tk.d.a);
            }

            if ($$1 instanceof tc $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(tk.d.a);
                  case 10 -> Optional.of(new tk.b($$2));
                  default -> Optional.of(new tk.c($$2));
               };
            }

            if ($$1 instanceof st $$3) {
               return Optional.of(new tk.a($$3.e()));
            }

            if ($$1 instanceof ta $$4) {
               return Optional.of(new tk.e($$4.g()));
            }

            if ($$1 instanceof td $$5) {
               return Optional.of(new tk.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements tk.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public tk.f a(tt $$0) {
         if ($$0 instanceof su $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new tk.b(this.a).a($$0);
         }
      }

      @Override
      public tt a() {
         return new st(this.a.toByteArray());
      }
   }

   static class b implements tk.f {
      private final tc a = new tc();

      public b() {
      }

      public b(Collection<tt> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tb.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(su.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(te.a($$0x))));
      }

      private static boolean a(sw $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static tt b(tt $$0) {
         if ($$0 instanceof sw $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static sw c(tt $$0) {
         sw $$1 = new sw();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public tk.f a(tt $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public tt a() {
         return this.a;
      }
   }

   static class c implements tk.f {
      private final tc a = new tc();

      c(tt $$0) {
         this.a.add($$0);
      }

      c(tc $$0) {
         this.a.addAll($$0);
      }

      @Override
      public tk.f a(tt $$0) {
         if ($$0.b() != this.a.f()) {
            return new tk.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public tt a() {
         return this.a;
      }
   }

   static class d implements tk.f {
      public static final tk.d a = new tk.d();

      private d() {
      }

      @Override
      public tk.f a(tt $$0) {
         if ($$0 instanceof sw $$1) {
            return new tk.b().a($$1);
         } else if ($$0 instanceof su $$2) {
            return new tk.a($$2.i());
         } else if ($$0 instanceof tb $$3) {
            return new tk.e($$3.g());
         } else {
            return (tk.f)($$0 instanceof te $$4 ? new tk.g($$4.f()) : new tk.c($$0));
         }
      }

      @Override
      public tt a() {
         return new tc();
      }
   }

   static class e implements tk.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public tk.f a(tt $$0) {
         if ($$0 instanceof tb $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new tk.b(this.a).a($$0);
         }
      }

      @Override
      public tt a() {
         return new ta(this.a.toIntArray());
      }
   }

   interface f {
      tk.f a(tt var1);

      default tk.f a(Iterable<tt> $$0) {
         tk.f $$1 = this;

         for (tt $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default tk.f a(Stream<tt> $$0) {
         return this.a($$0::iterator);
      }

      tt a();
   }

   static class g implements tk.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public tk.f a(tt $$0) {
         if ($$0 instanceof te $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new tk.b(this.a).a($$0);
         }
      }

      @Override
      public tt a() {
         return new td(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<tt, sw> {
      protected h() {
         super(tk.this);
      }

      protected sw a() {
         return new sw();
      }

      protected sw a(String $$0, tt $$1, sw $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<tt> a(sw $$0, tt $$1) {
         if ($$1 == null || $$1 == sy.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof sw $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            sw $$3 = new sw(Maps.newHashMap($$2.i()));

            for (Entry<String, tt> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
