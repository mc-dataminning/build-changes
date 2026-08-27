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

public class tm implements DynamicOps<tv> {
   public static final tm a = new tm();
   private static final String b = "";

   protected tm() {
   }

   public tv a() {
      return ta.b;
   }

   public <U> U a(DynamicOps<U> $$0, tv $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((to)$$1).i());
         case 2:
            return (U)$$0.createShort(((to)$$1).h());
         case 3:
            return (U)$$0.createInt(((to)$$1).g());
         case 4:
            return (U)$$0.createLong(((to)$$1).f());
         case 5:
            return (U)$$0.createFloat(((to)$$1).k());
         case 6:
            return (U)$$0.createDouble(((to)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((sv)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.t_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((tc)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((tf)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(tv $$0) {
      return $$0 instanceof to $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public tv a(Number $$0) {
      return sz.a($$0.doubleValue());
   }

   public tv a(byte $$0) {
      return sw.a($$0);
   }

   public tv a(short $$0) {
      return tq.a($$0);
   }

   public tv a(int $$0) {
      return td.a($$0);
   }

   public tv a(long $$0) {
      return tg.a($$0);
   }

   public tv a(float $$0) {
      return tb.a($$0);
   }

   public tv a(double $$0) {
      return sz.a($$0);
   }

   public tv a(boolean $$0) {
      return sw.a($$0);
   }

   public DataResult<String> b(tv $$0) {
      return $$0 instanceof tt $$1 ? DataResult.success($$1.t_()) : DataResult.error(() -> "Not a string");
   }

   public tv a(String $$0) {
      return tt.a($$0);
   }

   public DataResult<tv> a(tv $$0, tv $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<tv> a(tv $$0, List<tv> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<tv> a(tv $$0, tv $$1, tv $$2) {
      if (!($$0 instanceof sy) && !($$0 instanceof ta)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof tt)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         sy $$3 = new sy();
         if ($$0 instanceof sy $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.t_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<tv> a(tv $$0, MapLike<tv> $$1) {
      if (!($$0 instanceof sy) && !($$0 instanceof ta)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         sy $$2 = new sy();
         if ($$0 instanceof sy $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<tv> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            tv $$3 = (tv)$$2x.getFirst();
            if (!($$3 instanceof tt)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.t_(), (tv)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<tv, tv>>> c(tv $$0) {
      return $$0 instanceof sy $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<tv, tv>>> d(tv $$0) {
      return $$0 instanceof sy $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<tv>> e(tv $$0) {
      return $$0 instanceof sy $$1 ? DataResult.success(new MapLike<tv>() {
         @Nullable
         public tv a(tv $$0) {
            return $$1.c($$0.t_());
         }

         @Nullable
         public tv a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<tv, tv>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(tm.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public tv a(Stream<Pair<tv, tv>> $$0) {
      sy $$1 = new sy();
      $$0.forEach($$1x -> $$1.a(((tv)$$1x.getFirst()).t_(), (tv)$$1x.getSecond()));
      return $$1;
   }

   private static tv a(sy $$0) {
      if ($$0.f() == 1) {
         tv $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<tv>> f(tv $$0) {
      if ($$0 instanceof te $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((sy)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof sx<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<tv>>> g(tv $$0) {
      if ($$0 instanceof te $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((sy)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof sx<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(tv $$0) {
      return $$0 instanceof sv $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public tv a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new sv($$2);
   }

   public DataResult<IntStream> i(tv $$0) {
      return $$0 instanceof tc $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public tv a(IntStream $$0) {
      return new tc($$0.toArray());
   }

   public DataResult<LongStream> j(tv $$0) {
      return $$0 instanceof tf $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public tv a(LongStream $$0) {
      return new tf($$0.toArray());
   }

   public tv b(Stream<tv> $$0) {
      return tm.d.a.a($$0).a();
   }

   public tv a(tv $$0, String $$1) {
      if ($$0 instanceof sy $$2) {
         sy $$3 = new sy();
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

   public RecordBuilder<tv> mapBuilder() {
      return new tm.h();
   }

   private static Optional<tm.f> k(tv $$0) {
      if ($$0 instanceof ta) {
         return Optional.of(tm.d.a);
      } else {
         if ($$0 instanceof sx<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(tm.d.a);
            }

            if ($$1 instanceof te $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(tm.d.a);
                  case 10 -> Optional.of(new tm.b($$2));
                  default -> Optional.of(new tm.c($$2));
               };
            }

            if ($$1 instanceof sv $$3) {
               return Optional.of(new tm.a($$3.e()));
            }

            if ($$1 instanceof tc $$4) {
               return Optional.of(new tm.e($$4.g()));
            }

            if ($$1 instanceof tf $$5) {
               return Optional.of(new tm.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements tm.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public tm.f a(tv $$0) {
         if ($$0 instanceof sw $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new tm.b(this.a).a($$0);
         }
      }

      @Override
      public tv a() {
         return new sv(this.a.toByteArray());
      }
   }

   static class b implements tm.f {
      private final te a = new te();

      public b() {
      }

      public b(Collection<tv> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(td.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sw.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tg.a($$0x))));
      }

      private static boolean a(sy $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static tv b(tv $$0) {
         if ($$0 instanceof sy $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static sy c(tv $$0) {
         sy $$1 = new sy();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public tm.f a(tv $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public tv a() {
         return this.a;
      }
   }

   static class c implements tm.f {
      private final te a = new te();

      c(tv $$0) {
         this.a.add($$0);
      }

      c(te $$0) {
         this.a.addAll($$0);
      }

      @Override
      public tm.f a(tv $$0) {
         if ($$0.b() != this.a.f()) {
            return new tm.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public tv a() {
         return this.a;
      }
   }

   static class d implements tm.f {
      public static final tm.d a = new tm.d();

      private d() {
      }

      @Override
      public tm.f a(tv $$0) {
         if ($$0 instanceof sy $$1) {
            return new tm.b().a($$1);
         } else if ($$0 instanceof sw $$2) {
            return new tm.a($$2.i());
         } else if ($$0 instanceof td $$3) {
            return new tm.e($$3.g());
         } else {
            return (tm.f)($$0 instanceof tg $$4 ? new tm.g($$4.f()) : new tm.c($$0));
         }
      }

      @Override
      public tv a() {
         return new te();
      }
   }

   static class e implements tm.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public tm.f a(tv $$0) {
         if ($$0 instanceof td $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new tm.b(this.a).a($$0);
         }
      }

      @Override
      public tv a() {
         return new tc(this.a.toIntArray());
      }
   }

   interface f {
      tm.f a(tv var1);

      default tm.f a(Iterable<tv> $$0) {
         tm.f $$1 = this;

         for (tv $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default tm.f a(Stream<tv> $$0) {
         return this.a($$0::iterator);
      }

      tv a();
   }

   static class g implements tm.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public tm.f a(tv $$0) {
         if ($$0 instanceof tg $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new tm.b(this.a).a($$0);
         }
      }

      @Override
      public tv a() {
         return new tf(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<tv, sy> {
      protected h() {
         super(tm.this);
      }

      protected sy a() {
         return new sy();
      }

      protected sy a(String $$0, tv $$1, sy $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<tv> a(sy $$0, tv $$1) {
         if ($$1 == null || $$1 == ta.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof sy $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            sy $$3 = new sy(Maps.newHashMap($$2.i()));

            for (Entry<String, tv> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
