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

public class tc implements DynamicOps<tl> {
   public static final tc a = new tc();
   private static final String b = "";

   protected tc() {
   }

   public tl a() {
      return sq.b;
   }

   public <U> U a(DynamicOps<U> $$0, tl $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((te)$$1).i());
         case 2:
            return (U)$$0.createShort(((te)$$1).h());
         case 3:
            return (U)$$0.createInt(((te)$$1).g());
         case 4:
            return (U)$$0.createLong(((te)$$1).f());
         case 5:
            return (U)$$0.createFloat(((te)$$1).k());
         case 6:
            return (U)$$0.createDouble(((te)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((sl)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.t_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((ss)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((sv)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(tl $$0) {
      return $$0 instanceof te $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public tl a(Number $$0) {
      return sp.a($$0.doubleValue());
   }

   public tl a(byte $$0) {
      return sm.a($$0);
   }

   public tl a(short $$0) {
      return tg.a($$0);
   }

   public tl a(int $$0) {
      return st.a($$0);
   }

   public tl a(long $$0) {
      return sw.a($$0);
   }

   public tl a(float $$0) {
      return sr.a($$0);
   }

   public tl a(double $$0) {
      return sp.a($$0);
   }

   public tl a(boolean $$0) {
      return sm.a($$0);
   }

   public DataResult<String> b(tl $$0) {
      return $$0 instanceof tj $$1 ? DataResult.success($$1.t_()) : DataResult.error(() -> "Not a string");
   }

   public tl a(String $$0) {
      return tj.a($$0);
   }

   public DataResult<tl> a(tl $$0, tl $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<tl> a(tl $$0, List<tl> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<tl> a(tl $$0, tl $$1, tl $$2) {
      if (!($$0 instanceof so) && !($$0 instanceof sq)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof tj)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         so $$3 = new so();
         if ($$0 instanceof so $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.t_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<tl> a(tl $$0, MapLike<tl> $$1) {
      if (!($$0 instanceof so) && !($$0 instanceof sq)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         so $$2 = new so();
         if ($$0 instanceof so $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<tl> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            tl $$3 = (tl)$$2x.getFirst();
            if (!($$3 instanceof tj)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.t_(), (tl)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<tl, tl>>> c(tl $$0) {
      return $$0 instanceof so $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<tl, tl>>> d(tl $$0) {
      return $$0 instanceof so $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<tl>> e(tl $$0) {
      return $$0 instanceof so $$1 ? DataResult.success(new MapLike<tl>() {
         @Nullable
         public tl a(tl $$0) {
            return $$1.c($$0.t_());
         }

         @Nullable
         public tl a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<tl, tl>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(tc.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public tl a(Stream<Pair<tl, tl>> $$0) {
      so $$1 = new so();
      $$0.forEach($$1x -> $$1.a(((tl)$$1x.getFirst()).t_(), (tl)$$1x.getSecond()));
      return $$1;
   }

   private static tl a(so $$0) {
      if ($$0.f() == 1) {
         tl $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<tl>> f(tl $$0) {
      if ($$0 instanceof su $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((so)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof sn<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<tl>>> g(tl $$0) {
      if ($$0 instanceof su $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((so)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof sn<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(tl $$0) {
      return $$0 instanceof sl $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public tl a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new sl($$2);
   }

   public DataResult<IntStream> i(tl $$0) {
      return $$0 instanceof ss $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public tl a(IntStream $$0) {
      return new ss($$0.toArray());
   }

   public DataResult<LongStream> j(tl $$0) {
      return $$0 instanceof sv $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public tl a(LongStream $$0) {
      return new sv($$0.toArray());
   }

   public tl b(Stream<tl> $$0) {
      return tc.d.a.a($$0).a();
   }

   public tl a(tl $$0, String $$1) {
      if ($$0 instanceof so $$2) {
         so $$3 = new so();
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

   public RecordBuilder<tl> mapBuilder() {
      return new tc.h();
   }

   private static Optional<tc.f> k(tl $$0) {
      if ($$0 instanceof sq) {
         return Optional.of(tc.d.a);
      } else {
         if ($$0 instanceof sn<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(tc.d.a);
            }

            if ($$1 instanceof su $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(tc.d.a);
                  case 10 -> Optional.of(new tc.b($$2));
                  default -> Optional.of(new tc.c($$2));
               };
            }

            if ($$1 instanceof sl $$3) {
               return Optional.of(new tc.a($$3.e()));
            }

            if ($$1 instanceof ss $$4) {
               return Optional.of(new tc.e($$4.g()));
            }

            if ($$1 instanceof sv $$5) {
               return Optional.of(new tc.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements tc.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public tc.f a(tl $$0) {
         if ($$0 instanceof sm $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new tc.b(this.a).a($$0);
         }
      }

      @Override
      public tl a() {
         return new sl(this.a.toByteArray());
      }
   }

   static class b implements tc.f {
      private final su a = new su();

      public b() {
      }

      public b(Collection<tl> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(st.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sm.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sw.a($$0x))));
      }

      private static boolean a(so $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static tl b(tl $$0) {
         if ($$0 instanceof so $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static so c(tl $$0) {
         so $$1 = new so();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public tc.f a(tl $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public tl a() {
         return this.a;
      }
   }

   static class c implements tc.f {
      private final su a = new su();

      c(tl $$0) {
         this.a.add($$0);
      }

      c(su $$0) {
         this.a.addAll($$0);
      }

      @Override
      public tc.f a(tl $$0) {
         if ($$0.b() != this.a.f()) {
            return new tc.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public tl a() {
         return this.a;
      }
   }

   static class d implements tc.f {
      public static final tc.d a = new tc.d();

      private d() {
      }

      @Override
      public tc.f a(tl $$0) {
         if ($$0 instanceof so $$1) {
            return new tc.b().a($$1);
         } else if ($$0 instanceof sm $$2) {
            return new tc.a($$2.i());
         } else if ($$0 instanceof st $$3) {
            return new tc.e($$3.g());
         } else {
            return (tc.f)($$0 instanceof sw $$4 ? new tc.g($$4.f()) : new tc.c($$0));
         }
      }

      @Override
      public tl a() {
         return new su();
      }
   }

   static class e implements tc.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public tc.f a(tl $$0) {
         if ($$0 instanceof st $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new tc.b(this.a).a($$0);
         }
      }

      @Override
      public tl a() {
         return new ss(this.a.toIntArray());
      }
   }

   interface f {
      tc.f a(tl var1);

      default tc.f a(Iterable<tl> $$0) {
         tc.f $$1 = this;

         for (tl $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default tc.f a(Stream<tl> $$0) {
         return this.a($$0::iterator);
      }

      tl a();
   }

   static class g implements tc.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public tc.f a(tl $$0) {
         if ($$0 instanceof sw $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new tc.b(this.a).a($$0);
         }
      }

      @Override
      public tl a() {
         return new sv(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<tl, so> {
      protected h() {
         super(tc.this);
      }

      protected so a() {
         return new so();
      }

      protected so a(String $$0, tl $$1, so $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<tl> a(so $$0, tl $$1) {
         if ($$1 == null || $$1 == sq.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof so $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            so $$3 = new so(Maps.newHashMap($$2.i()));

            for (Entry<String, tl> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
