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

public class un implements DynamicOps<uw> {
   public static final un a = new un();
   private static final String b = "";

   private un() {
   }

   public uw a() {
      return ub.b;
   }

   public <U> U a(DynamicOps<U> $$0, uw $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((up)$$1).i());
         case 2 -> (Object)$$0.createShort(((up)$$1).h());
         case 3 -> (Object)$$0.createInt(((up)$$1).g());
         case 4 -> (Object)$$0.createLong(((up)$$1).f());
         case 5 -> (Object)$$0.createFloat(((up)$$1).k());
         case 6 -> (Object)$$0.createDouble(((up)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((tw)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.p_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((ud)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((ug)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(uw $$0) {
      return $$0 instanceof up $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public uw a(Number $$0) {
      return ua.a($$0.doubleValue());
   }

   public uw a(byte $$0) {
      return tx.a($$0);
   }

   public uw a(short $$0) {
      return ur.a($$0);
   }

   public uw a(int $$0) {
      return ue.a($$0);
   }

   public uw a(long $$0) {
      return uh.a($$0);
   }

   public uw a(float $$0) {
      return uc.a($$0);
   }

   public uw a(double $$0) {
      return ua.a($$0);
   }

   public uw a(boolean $$0) {
      return tx.a($$0);
   }

   public DataResult<String> b(uw $$0) {
      return $$0 instanceof uu $$1 ? DataResult.success($$1.p_()) : DataResult.error(() -> "Not a string");
   }

   public uw a(String $$0) {
      return uu.a($$0);
   }

   public DataResult<uw> a(uw $$0, uw $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<uw> a(uw $$0, List<uw> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<uw> a(uw $$0, uw $$1, uw $$2) {
      if (!($$0 instanceof tz) && !($$0 instanceof ub)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof uu)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         tz $$4 = $$0 instanceof tz $$3 ? $$3.h() : new tz();
         $$4.a($$1.p_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<uw> a(uw $$0, MapLike<uw> $$1) {
      if (!($$0 instanceof tz) && !($$0 instanceof ub)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         tz $$3 = $$0 instanceof tz $$2 ? $$2.h() : new tz();
         List<uw> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            uw $$3x = (uw)$$2x.getFirst();
            if (!($$3x instanceof uu)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.p_(), (uw)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<uw> a(uw $$0, Map<uw, uw> $$1) {
      if (!($$0 instanceof tz) && !($$0 instanceof ub)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         tz $$3 = $$0 instanceof tz $$2 ? $$2.h() : new tz();
         List<uw> $$4 = new ArrayList<>();

         for (Entry<uw, uw> $$5 : $$1.entrySet()) {
            uw $$6 = $$5.getKey();
            if ($$6 instanceof uu) {
               $$3.a($$6.p_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<uw, uw>>> c(uw $$0) {
      return $$0 instanceof tz $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (uw)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<uw, uw>>> d(uw $$0) {
      return $$0 instanceof tz $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, uw> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<uw>> e(uw $$0) {
      return $$0 instanceof tz $$1 ? DataResult.success(new MapLike<uw>() {
         @Nullable
         public uw a(uw $$0) {
            return $$1.c($$0.p_());
         }

         @Nullable
         public uw a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<uw, uw>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(un.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public uw a(Stream<Pair<uw, uw>> $$0) {
      tz $$1 = new tz();
      $$0.forEach($$1x -> $$1.a(((uw)$$1x.getFirst()).p_(), (uw)$$1x.getSecond()));
      return $$1;
   }

   private static uw a(tz $$0) {
      if ($$0.f() == 1) {
         uw $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<uw>> f(uw $$0) {
      if ($$0 instanceof uf $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((tz)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof ty<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<uw>>> g(uw $$0) {
      if ($$0 instanceof uf $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (uw $$2x : $$1) {
               $$1x.accept(a((tz)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof ty<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(uw $$0) {
      return $$0 instanceof tw $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public uw a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new tw($$2);
   }

   public DataResult<IntStream> i(uw $$0) {
      return $$0 instanceof ud $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public uw a(IntStream $$0) {
      return new ud($$0.toArray());
   }

   public DataResult<LongStream> j(uw $$0) {
      return $$0 instanceof ug $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public uw a(LongStream $$0) {
      return new ug($$0.toArray());
   }

   public uw b(Stream<uw> $$0) {
      return un.d.a.a($$0).a();
   }

   public uw a(uw $$0, String $$1) {
      if ($$0 instanceof tz $$2) {
         tz $$3 = $$2.h();
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

   public RecordBuilder<uw> mapBuilder() {
      return new un.h();
   }

   private static Optional<un.f> k(uw $$0) {
      if ($$0 instanceof ub) {
         return Optional.of(un.d.a);
      } else if ($$0 instanceof ty<?> $$1) {
         if ($$1.isEmpty()) {
            return Optional.of(un.d.a);
         } else {
            Objects.requireNonNull($$1);

            return switch ($$1) {
               case uf $$2 -> {
                  switch ($$2.f()) {
                     case 0:
                        yield Optional.of(un.d.a);
                     case 10:
                        yield Optional.of(new un.b($$2));
                     default:
                        yield Optional.of(new un.c($$2));
                  }
               }
               case tw $$3 -> Optional.of(new un.a($$3.e()));
               case ud $$4 -> Optional.of(new un.e($$4.g()));
               case ug $$5 -> Optional.of(new un.g($$5.g()));
               default -> Optional.empty();
            };
         }
      } else {
         return Optional.empty();
      }
   }

   static class a implements un.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public un.f a(uw $$0) {
         if ($$0 instanceof tx $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new un.b(this.a).a($$0);
         }
      }

      @Override
      public uw a() {
         return new tw(this.a.toByteArray());
      }
   }

   static class b implements un.f {
      private final uf a = new uf();

      public b() {
      }

      public b(Collection<uw> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ue.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tx.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uh.a($$0x))));
      }

      private static boolean a(tz $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static uw b(uw $$0) {
         if ($$0 instanceof tz $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static tz c(uw $$0) {
         tz $$1 = new tz();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public un.f a(uw $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public uw a() {
         return this.a;
      }
   }

   static class c implements un.f {
      private final uf a = new uf();

      c(uw $$0) {
         this.a.add($$0);
      }

      c(uf $$0) {
         this.a.addAll($$0);
      }

      @Override
      public un.f a(uw $$0) {
         if ($$0.b() != this.a.f()) {
            return new un.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public uw a() {
         return this.a;
      }
   }

   static class d implements un.f {
      public static final un.f a = new un.d();

      private d() {
      }

      @Override
      public un.f a(uw $$0) {
         return (un.f)($$0 instanceof tz $$1 ? new un.b().a($$1) : new un.c($$0));
      }

      @Override
      public uw a() {
         return new uf();
      }
   }

   static class e implements un.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public un.f a(uw $$0) {
         if ($$0 instanceof ue $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new un.b(this.a).a($$0);
         }
      }

      @Override
      public uw a() {
         return new ud(this.a.toIntArray());
      }
   }

   interface f {
      un.f a(uw var1);

      default un.f a(Iterable<uw> $$0) {
         un.f $$1 = this;

         for (uw $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default un.f a(Stream<uw> $$0) {
         return this.a($$0::iterator);
      }

      uw a();
   }

   static class g implements un.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public un.f a(uw $$0) {
         if ($$0 instanceof uh $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new un.b(this.a).a($$0);
         }
      }

      @Override
      public uw a() {
         return new ug(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<uw, tz> {
      protected h() {
         super(un.this);
      }

      protected tz a() {
         return new tz();
      }

      protected tz a(String $$0, uw $$1, tz $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<uw> a(tz $$0, uw $$1) {
         if ($$1 == null || $$1 == ub.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof tz $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            tz $$3 = $$2.h();

            for (Entry<String, uw> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
