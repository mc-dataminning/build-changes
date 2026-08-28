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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ul implements DynamicOps<uu> {
   public static final ul a = new ul();
   private static final String b = "";

   private ul() {
   }

   public uu a() {
      return tz.b;
   }

   public <U> U a(DynamicOps<U> $$0, uu $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((un)$$1).i());
         case 2 -> (Object)$$0.createShort(((un)$$1).h());
         case 3 -> (Object)$$0.createInt(((un)$$1).g());
         case 4 -> (Object)$$0.createLong(((un)$$1).f());
         case 5 -> (Object)$$0.createFloat(((un)$$1).k());
         case 6 -> (Object)$$0.createDouble(((un)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((tu)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.p_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((ub)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((ue)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(uu $$0) {
      return $$0 instanceof un $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public uu a(Number $$0) {
      return ty.a($$0.doubleValue());
   }

   public uu a(byte $$0) {
      return tv.a($$0);
   }

   public uu a(short $$0) {
      return up.a($$0);
   }

   public uu a(int $$0) {
      return uc.a($$0);
   }

   public uu a(long $$0) {
      return uf.a($$0);
   }

   public uu a(float $$0) {
      return ua.a($$0);
   }

   public uu a(double $$0) {
      return ty.a($$0);
   }

   public uu a(boolean $$0) {
      return tv.a($$0);
   }

   public DataResult<String> b(uu $$0) {
      return $$0 instanceof us $$1 ? DataResult.success($$1.p_()) : DataResult.error(() -> "Not a string");
   }

   public uu a(String $$0) {
      return us.a($$0);
   }

   public DataResult<uu> a(uu $$0, uu $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<uu> a(uu $$0, List<uu> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<uu> a(uu $$0, uu $$1, uu $$2) {
      if (!($$0 instanceof tx) && !($$0 instanceof tz)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof us)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         tx $$4 = $$0 instanceof tx $$3 ? $$3.h() : new tx();
         $$4.a($$1.p_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<uu> a(uu $$0, MapLike<uu> $$1) {
      if (!($$0 instanceof tx) && !($$0 instanceof tz)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         tx $$3 = $$0 instanceof tx $$2 ? $$2.h() : new tx();
         List<uu> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            uu $$3x = (uu)$$2x.getFirst();
            if (!($$3x instanceof us)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.p_(), (uu)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<uu> a(uu $$0, Map<uu, uu> $$1) {
      if (!($$0 instanceof tx) && !($$0 instanceof tz)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         tx $$3 = $$0 instanceof tx $$2 ? $$2.h() : new tx();
         List<uu> $$4 = new ArrayList<>();

         for (Entry<uu, uu> $$5 : $$1.entrySet()) {
            uu $$6 = $$5.getKey();
            if ($$6 instanceof us) {
               $$3.a($$6.p_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<uu, uu>>> c(uu $$0) {
      return $$0 instanceof tx $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (uu)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<uu, uu>>> d(uu $$0) {
      return $$0 instanceof tx $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, uu> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<uu>> e(uu $$0) {
      return $$0 instanceof tx $$1 ? DataResult.success(new MapLike<uu>() {
         @Nullable
         public uu a(uu $$0) {
            return $$1.c($$0.p_());
         }

         @Nullable
         public uu a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<uu, uu>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(ul.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public uu a(Stream<Pair<uu, uu>> $$0) {
      tx $$1 = new tx();
      $$0.forEach($$1x -> $$1.a(((uu)$$1x.getFirst()).p_(), (uu)$$1x.getSecond()));
      return $$1;
   }

   private static uu a(tx $$0) {
      if ($$0.f() == 1) {
         uu $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<uu>> f(uu $$0) {
      if ($$0 instanceof ud $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((tx)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof tw<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<uu>>> g(uu $$0) {
      if ($$0 instanceof ud $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (uu $$2x : $$1) {
               $$1x.accept(a((tx)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof tw<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(uu $$0) {
      return $$0 instanceof tu $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public uu a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new tu($$2);
   }

   public DataResult<IntStream> i(uu $$0) {
      return $$0 instanceof ub $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public uu a(IntStream $$0) {
      return new ub($$0.toArray());
   }

   public DataResult<LongStream> j(uu $$0) {
      return $$0 instanceof ue $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public uu a(LongStream $$0) {
      return new ue($$0.toArray());
   }

   public uu b(Stream<uu> $$0) {
      return ul.d.a.a($$0).a();
   }

   public uu a(uu $$0, String $$1) {
      if ($$0 instanceof tx $$2) {
         tx $$3 = $$2.h();
         $$3.r($$1);
         return $$3;
      } else {
         return $$0;
      }
   }

   @Override
   public String toString() {
      return "NBT";
   }

   public RecordBuilder<uu> mapBuilder() {
      return new ul.h();
   }

   private static Optional<ul.f> k(uu $$0) {
      if ($$0 instanceof tz) {
         return Optional.of(ul.d.a);
      } else if ($$0 instanceof tw<?> $$1) {
         if ($$1.isEmpty()) {
            return Optional.of(ul.d.a);
         } else {
            Objects.requireNonNull($$1);

            return switch ($$1) {
               case ud $$2 -> {
                  switch ($$2.f()) {
                     case 0:
                        yield Optional.of(ul.d.a);
                     case 10:
                        yield Optional.of(new ul.b($$2));
                     default:
                        yield Optional.of(new ul.c($$2));
                  }
               }
               case tu $$3 -> Optional.of(new ul.a($$3.e()));
               case ub $$4 -> Optional.of(new ul.e($$4.g()));
               case ue $$5 -> Optional.of(new ul.g($$5.g()));
               default -> Optional.empty();
            };
         }
      } else {
         return Optional.empty();
      }
   }

   static class a implements ul.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ul.f a(uu $$0) {
         if ($$0 instanceof tv $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new ul.b(this.a).a($$0);
         }
      }

      @Override
      public uu a() {
         return new tu(this.a.toByteArray());
      }
   }

   static class b implements ul.f {
      private final ud a = new ud();

      public b() {
      }

      public b(Collection<uu> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uc.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tv.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uf.a($$0x))));
      }

      private static boolean a(tx $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static uu b(uu $$0) {
         if ($$0 instanceof tx $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static tx c(uu $$0) {
         tx $$1 = new tx();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public ul.f a(uu $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public uu a() {
         return this.a;
      }
   }

   static class c implements ul.f {
      private final ud a = new ud();

      c(uu $$0) {
         this.a.add($$0);
      }

      c(ud $$0) {
         this.a.addAll($$0);
      }

      @Override
      public ul.f a(uu $$0) {
         if ($$0.b() != this.a.f()) {
            return new ul.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public uu a() {
         return this.a;
      }
   }

   static class d implements ul.f {
      public static final ul.f a = new ul.d();

      private d() {
      }

      @Override
      public ul.f a(uu $$0) {
         return (ul.f)($$0 instanceof tx $$1 ? new ul.b().a($$1) : new ul.c($$0));
      }

      @Override
      public uu a() {
         return new ud();
      }
   }

   static class e implements ul.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ul.f a(uu $$0) {
         if ($$0 instanceof uc $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new ul.b(this.a).a($$0);
         }
      }

      @Override
      public uu a() {
         return new ub(this.a.toIntArray());
      }
   }

   interface f {
      ul.f a(uu var1);

      default ul.f a(Iterable<uu> $$0) {
         ul.f $$1 = this;

         for (uu $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default ul.f a(Stream<uu> $$0) {
         return this.a($$0::iterator);
      }

      uu a();
   }

   static class g implements ul.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ul.f a(uu $$0) {
         if ($$0 instanceof uf $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new ul.b(this.a).a($$0);
         }
      }

      @Override
      public uu a() {
         return new ue(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<uu, tx> {
      protected h() {
         super(ul.this);
      }

      protected tx a() {
         return new tx();
      }

      protected tx a(String $$0, uu $$1, tx $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<uu> a(tx $$0, uu $$1) {
         if ($$1 == null || $$1 == tz.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof tx $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            tx $$3 = $$2.h();

            for (Entry<String, uu> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
