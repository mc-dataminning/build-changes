import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
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

public class rk implements DynamicOps<rs> {
   public static final rk a = new rk();
   private static final String b = "";

   protected rk() {
   }

   public rs a() {
      return ra.b;
   }

   public <U> U a(DynamicOps<U> $$0, rs $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((rm)$$1).i());
         case 2:
            return (U)$$0.createShort(((rm)$$1).h());
         case 3:
            return (U)$$0.createInt(((rm)$$1).g());
         case 4:
            return (U)$$0.createLong(((rm)$$1).f());
         case 5:
            return (U)$$0.createFloat(((rm)$$1).k());
         case 6:
            return (U)$$0.createDouble(((rm)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((qv)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.r_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((rc)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((rf)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(rs $$0) {
      return $$0 instanceof rm $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public rs a(Number $$0) {
      return qz.a($$0.doubleValue());
   }

   public rs a(byte $$0) {
      return qw.a($$0);
   }

   public rs a(short $$0) {
      return rn.a($$0);
   }

   public rs a(int $$0) {
      return rd.a($$0);
   }

   public rs a(long $$0) {
      return rg.a($$0);
   }

   public rs a(float $$0) {
      return rb.a($$0);
   }

   public rs a(double $$0) {
      return qz.a($$0);
   }

   public rs a(boolean $$0) {
      return qw.a($$0);
   }

   public DataResult<String> b(rs $$0) {
      return $$0 instanceof rq $$1 ? DataResult.success($$1.r_()) : DataResult.error(() -> "Not a string");
   }

   public rs a(String $$0) {
      return rq.a($$0);
   }

   public DataResult<rs> a(rs $$0, rs $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<rs> a(rs $$0, List<rs> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<rs> a(rs $$0, rs $$1, rs $$2) {
      if (!($$0 instanceof qy) && !($$0 instanceof ra)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof rq)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         qy $$3 = new qy();
         if ($$0 instanceof qy $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.r_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<rs> a(rs $$0, MapLike<rs> $$1) {
      if (!($$0 instanceof qy) && !($$0 instanceof ra)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         qy $$2 = new qy();
         if ($$0 instanceof qy $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<rs> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            rs $$3 = (rs)$$2x.getFirst();
            if (!($$3 instanceof rq)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.r_(), (rs)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<rs, rs>>> c(rs $$0) {
      return $$0 instanceof qy $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<rs, rs>>> d(rs $$0) {
      return $$0 instanceof qy $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<rs>> e(rs $$0) {
      return $$0 instanceof qy $$1 ? DataResult.success(new MapLike<rs>() {
         @Nullable
         public rs a(rs $$0) {
            return $$1.c($$0.r_());
         }

         @Nullable
         public rs a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<rs, rs>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(rk.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public rs a(Stream<Pair<rs, rs>> $$0) {
      qy $$1 = new qy();
      $$0.forEach($$1x -> $$1.a(((rs)$$1x.getFirst()).r_(), (rs)$$1x.getSecond()));
      return $$1;
   }

   private static rs a(qy $$0) {
      if ($$0.f() == 1) {
         rs $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<rs>> f(rs $$0) {
      if ($$0 instanceof re $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((qy)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof qx<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<rs>>> g(rs $$0) {
      if ($$0 instanceof re $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((qy)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof qx<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(rs $$0) {
      return $$0 instanceof qv $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public rs a(ByteBuffer $$0) {
      return new qv(DataFixUtils.toArray($$0));
   }

   public DataResult<IntStream> i(rs $$0) {
      return $$0 instanceof rc $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public rs a(IntStream $$0) {
      return new rc($$0.toArray());
   }

   public DataResult<LongStream> j(rs $$0) {
      return $$0 instanceof rf $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public rs a(LongStream $$0) {
      return new rf($$0.toArray());
   }

   public rs b(Stream<rs> $$0) {
      return rk.d.a.a($$0).a();
   }

   public rs a(rs $$0, String $$1) {
      if ($$0 instanceof qy $$2) {
         qy $$3 = new qy();
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

   public RecordBuilder<rs> mapBuilder() {
      return new rk.h();
   }

   private static Optional<rk.f> k(rs $$0) {
      if ($$0 instanceof ra) {
         return Optional.of(rk.d.a);
      } else {
         if ($$0 instanceof qx<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(rk.d.a);
            }

            if ($$1 instanceof re $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(rk.d.a);
                  case 10 -> Optional.of(new rk.b($$2));
                  default -> Optional.of(new rk.c($$2));
               };
            }

            if ($$1 instanceof qv $$3) {
               return Optional.of(new rk.a($$3.e()));
            }

            if ($$1 instanceof rc $$4) {
               return Optional.of(new rk.e($$4.g()));
            }

            if ($$1 instanceof rf $$5) {
               return Optional.of(new rk.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements rk.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public rk.f a(rs $$0) {
         if ($$0 instanceof qw $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new rk.b(this.a).a($$0);
         }
      }

      @Override
      public rs a() {
         return new qv(this.a.toByteArray());
      }
   }

   static class b implements rk.f {
      private final re a = new re();

      public b() {
      }

      public b(Collection<rs> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(rd.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(qw.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(rg.a($$0x))));
      }

      private static boolean a(qy $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static rs b(rs $$0) {
         if ($$0 instanceof qy $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static qy c(rs $$0) {
         qy $$1 = new qy();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public rk.f a(rs $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public rs a() {
         return this.a;
      }
   }

   static class c implements rk.f {
      private final re a = new re();

      c(rs $$0) {
         this.a.add($$0);
      }

      c(re $$0) {
         this.a.addAll($$0);
      }

      @Override
      public rk.f a(rs $$0) {
         if ($$0.b() != this.a.f()) {
            return new rk.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public rs a() {
         return this.a;
      }
   }

   static class d implements rk.f {
      public static final rk.d a = new rk.d();

      private d() {
      }

      @Override
      public rk.f a(rs $$0) {
         if ($$0 instanceof qy $$1) {
            return new rk.b().a($$1);
         } else if ($$0 instanceof qw $$2) {
            return new rk.a($$2.i());
         } else if ($$0 instanceof rd $$3) {
            return new rk.e($$3.g());
         } else {
            return (rk.f)($$0 instanceof rg $$4 ? new rk.g($$4.f()) : new rk.c($$0));
         }
      }

      @Override
      public rs a() {
         return new re();
      }
   }

   static class e implements rk.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public rk.f a(rs $$0) {
         if ($$0 instanceof rd $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new rk.b(this.a).a($$0);
         }
      }

      @Override
      public rs a() {
         return new rc(this.a.toIntArray());
      }
   }

   interface f {
      rk.f a(rs var1);

      default rk.f a(Iterable<rs> $$0) {
         rk.f $$1 = this;

         for (rs $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default rk.f a(Stream<rs> $$0) {
         return this.a($$0::iterator);
      }

      rs a();
   }

   static class g implements rk.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public rk.f a(rs $$0) {
         if ($$0 instanceof rg $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new rk.b(this.a).a($$0);
         }
      }

      @Override
      public rs a() {
         return new rf(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<rs, qy> {
      protected h() {
         super(rk.this);
      }

      protected qy a() {
         return new qy();
      }

      protected qy a(String $$0, rs $$1, qy $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<rs> a(qy $$0, rs $$1) {
         if ($$1 == null || $$1 == ra.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof qy $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            qy $$3 = new qy(Maps.newHashMap($$2.i()));

            for (Entry<String, rs> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
