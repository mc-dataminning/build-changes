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

public class sr implements DynamicOps<ta> {
   public static final sr a = new sr();
   private static final String b = "";

   protected sr() {
   }

   public ta a() {
      return sf.b;
   }

   public <U> U a(DynamicOps<U> $$0, ta $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((st)$$1).i());
         case 2:
            return (U)$$0.createShort(((st)$$1).h());
         case 3:
            return (U)$$0.createInt(((st)$$1).g());
         case 4:
            return (U)$$0.createLong(((st)$$1).f());
         case 5:
            return (U)$$0.createFloat(((st)$$1).k());
         case 6:
            return (U)$$0.createDouble(((st)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((sa)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.t_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((sh)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((sk)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(ta $$0) {
      return $$0 instanceof st $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public ta a(Number $$0) {
      return se.a($$0.doubleValue());
   }

   public ta a(byte $$0) {
      return sb.a($$0);
   }

   public ta a(short $$0) {
      return sv.a($$0);
   }

   public ta a(int $$0) {
      return si.a($$0);
   }

   public ta a(long $$0) {
      return sl.a($$0);
   }

   public ta a(float $$0) {
      return sg.a($$0);
   }

   public ta a(double $$0) {
      return se.a($$0);
   }

   public ta a(boolean $$0) {
      return sb.a($$0);
   }

   public DataResult<String> b(ta $$0) {
      return $$0 instanceof sy $$1 ? DataResult.success($$1.t_()) : DataResult.error(() -> "Not a string");
   }

   public ta a(String $$0) {
      return sy.a($$0);
   }

   public DataResult<ta> a(ta $$0, ta $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<ta> a(ta $$0, List<ta> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<ta> a(ta $$0, ta $$1, ta $$2) {
      if (!($$0 instanceof sd) && !($$0 instanceof sf)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof sy)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         sd $$3 = new sd();
         if ($$0 instanceof sd $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.t_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<ta> a(ta $$0, MapLike<ta> $$1) {
      if (!($$0 instanceof sd) && !($$0 instanceof sf)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         sd $$2 = new sd();
         if ($$0 instanceof sd $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<ta> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            ta $$3 = (ta)$$2x.getFirst();
            if (!($$3 instanceof sy)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.t_(), (ta)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<ta, ta>>> c(ta $$0) {
      return $$0 instanceof sd $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<ta, ta>>> d(ta $$0) {
      return $$0 instanceof sd $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<ta>> e(ta $$0) {
      return $$0 instanceof sd $$1 ? DataResult.success(new MapLike<ta>() {
         @Nullable
         public ta a(ta $$0) {
            return $$1.c($$0.t_());
         }

         @Nullable
         public ta a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<ta, ta>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(sr.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public ta a(Stream<Pair<ta, ta>> $$0) {
      sd $$1 = new sd();
      $$0.forEach($$1x -> $$1.a(((ta)$$1x.getFirst()).t_(), (ta)$$1x.getSecond()));
      return $$1;
   }

   private static ta a(sd $$0) {
      if ($$0.f() == 1) {
         ta $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<ta>> f(ta $$0) {
      if ($$0 instanceof sj $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((sd)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof sc<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<ta>>> g(ta $$0) {
      if ($$0 instanceof sj $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((sd)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof sc<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(ta $$0) {
      return $$0 instanceof sa $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public ta a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new sa($$2);
   }

   public DataResult<IntStream> i(ta $$0) {
      return $$0 instanceof sh $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public ta a(IntStream $$0) {
      return new sh($$0.toArray());
   }

   public DataResult<LongStream> j(ta $$0) {
      return $$0 instanceof sk $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public ta a(LongStream $$0) {
      return new sk($$0.toArray());
   }

   public ta b(Stream<ta> $$0) {
      return sr.d.a.a($$0).a();
   }

   public ta a(ta $$0, String $$1) {
      if ($$0 instanceof sd $$2) {
         sd $$3 = new sd();
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

   public RecordBuilder<ta> mapBuilder() {
      return new sr.h();
   }

   private static Optional<sr.f> k(ta $$0) {
      if ($$0 instanceof sf) {
         return Optional.of(sr.d.a);
      } else {
         if ($$0 instanceof sc<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(sr.d.a);
            }

            if ($$1 instanceof sj $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(sr.d.a);
                  case 10 -> Optional.of(new sr.b($$2));
                  default -> Optional.of(new sr.c($$2));
               };
            }

            if ($$1 instanceof sa $$3) {
               return Optional.of(new sr.a($$3.e()));
            }

            if ($$1 instanceof sh $$4) {
               return Optional.of(new sr.e($$4.g()));
            }

            if ($$1 instanceof sk $$5) {
               return Optional.of(new sr.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements sr.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sr.f a(ta $$0) {
         if ($$0 instanceof sb $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new sr.b(this.a).a($$0);
         }
      }

      @Override
      public ta a() {
         return new sa(this.a.toByteArray());
      }
   }

   static class b implements sr.f {
      private final sj a = new sj();

      public b() {
      }

      public b(Collection<ta> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(si.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sb.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sl.a($$0x))));
      }

      private static boolean a(sd $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static ta b(ta $$0) {
         if ($$0 instanceof sd $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static sd c(ta $$0) {
         sd $$1 = new sd();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public sr.f a(ta $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public ta a() {
         return this.a;
      }
   }

   static class c implements sr.f {
      private final sj a = new sj();

      c(ta $$0) {
         this.a.add($$0);
      }

      c(sj $$0) {
         this.a.addAll($$0);
      }

      @Override
      public sr.f a(ta $$0) {
         if ($$0.b() != this.a.f()) {
            return new sr.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public ta a() {
         return this.a;
      }
   }

   static class d implements sr.f {
      public static final sr.d a = new sr.d();

      private d() {
      }

      @Override
      public sr.f a(ta $$0) {
         if ($$0 instanceof sd $$1) {
            return new sr.b().a($$1);
         } else if ($$0 instanceof sb $$2) {
            return new sr.a($$2.i());
         } else if ($$0 instanceof si $$3) {
            return new sr.e($$3.g());
         } else {
            return (sr.f)($$0 instanceof sl $$4 ? new sr.g($$4.f()) : new sr.c($$0));
         }
      }

      @Override
      public ta a() {
         return new sj();
      }
   }

   static class e implements sr.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sr.f a(ta $$0) {
         if ($$0 instanceof si $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new sr.b(this.a).a($$0);
         }
      }

      @Override
      public ta a() {
         return new sh(this.a.toIntArray());
      }
   }

   interface f {
      sr.f a(ta var1);

      default sr.f a(Iterable<ta> $$0) {
         sr.f $$1 = this;

         for (ta $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default sr.f a(Stream<ta> $$0) {
         return this.a($$0::iterator);
      }

      ta a();
   }

   static class g implements sr.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sr.f a(ta $$0) {
         if ($$0 instanceof sl $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new sr.b(this.a).a($$0);
         }
      }

      @Override
      public ta a() {
         return new sk(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<ta, sd> {
      protected h() {
         super(sr.this);
      }

      protected sd a() {
         return new sd();
      }

      protected sd a(String $$0, ta $$1, sd $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<ta> a(sd $$0, ta $$1) {
         if ($$1 == null || $$1 == sf.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof sd $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            sd $$3 = new sd(Maps.newHashMap($$2.i()));

            for (Entry<String, ta> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
