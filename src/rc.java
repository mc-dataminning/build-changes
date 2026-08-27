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

public class rc implements DynamicOps<rk> {
   public static final rc a = new rc();
   private static final String b = "";

   protected rc() {
   }

   public rk a() {
      return qt.b;
   }

   public <U> U a(DynamicOps<U> $$0, rk $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((re)$$1).i());
         case 2:
            return (U)$$0.createShort(((re)$$1).h());
         case 3:
            return (U)$$0.createInt(((re)$$1).g());
         case 4:
            return (U)$$0.createLong(((re)$$1).f());
         case 5:
            return (U)$$0.createFloat(((re)$$1).k());
         case 6:
            return (U)$$0.createDouble(((re)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((qo)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.m_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((qv)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((qy)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(rk $$0) {
      return $$0 instanceof re $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public rk a(Number $$0) {
      return qs.a($$0.doubleValue());
   }

   public rk a(byte $$0) {
      return qp.a($$0);
   }

   public rk a(short $$0) {
      return rf.a($$0);
   }

   public rk a(int $$0) {
      return qw.a($$0);
   }

   public rk a(long $$0) {
      return qz.a($$0);
   }

   public rk a(float $$0) {
      return qu.a($$0);
   }

   public rk a(double $$0) {
      return qs.a($$0);
   }

   public rk a(boolean $$0) {
      return qp.a($$0);
   }

   public DataResult<String> b(rk $$0) {
      return $$0 instanceof ri $$1 ? DataResult.success($$1.m_()) : DataResult.error(() -> "Not a string");
   }

   public rk a(String $$0) {
      return ri.a($$0);
   }

   public DataResult<rk> a(rk $$0, rk $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<rk> a(rk $$0, List<rk> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<rk> a(rk $$0, rk $$1, rk $$2) {
      if (!($$0 instanceof qr) && !($$0 instanceof qt)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof ri)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         qr $$3 = new qr();
         if ($$0 instanceof qr $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.m_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<rk> a(rk $$0, MapLike<rk> $$1) {
      if (!($$0 instanceof qr) && !($$0 instanceof qt)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         qr $$2 = new qr();
         if ($$0 instanceof qr $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<rk> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            rk $$3 = (rk)$$2x.getFirst();
            if (!($$3 instanceof ri)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.m_(), (rk)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<rk, rk>>> c(rk $$0) {
      return $$0 instanceof qr $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<rk, rk>>> d(rk $$0) {
      return $$0 instanceof qr $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<rk>> e(rk $$0) {
      return $$0 instanceof qr $$1 ? DataResult.success(new MapLike<rk>() {
         @Nullable
         public rk a(rk $$0) {
            return $$1.c($$0.m_());
         }

         @Nullable
         public rk a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<rk, rk>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(rc.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public rk a(Stream<Pair<rk, rk>> $$0) {
      qr $$1 = new qr();
      $$0.forEach($$1x -> $$1.a(((rk)$$1x.getFirst()).m_(), (rk)$$1x.getSecond()));
      return $$1;
   }

   private static rk a(qr $$0) {
      if ($$0.f() == 1) {
         rk $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<rk>> f(rk $$0) {
      if ($$0 instanceof qx $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((qr)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof qq<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<rk>>> g(rk $$0) {
      if ($$0 instanceof qx $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((qr)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof qq<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(rk $$0) {
      return $$0 instanceof qo $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public rk a(ByteBuffer $$0) {
      return new qo(DataFixUtils.toArray($$0));
   }

   public DataResult<IntStream> i(rk $$0) {
      return $$0 instanceof qv $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public rk a(IntStream $$0) {
      return new qv($$0.toArray());
   }

   public DataResult<LongStream> j(rk $$0) {
      return $$0 instanceof qy $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public rk a(LongStream $$0) {
      return new qy($$0.toArray());
   }

   public rk b(Stream<rk> $$0) {
      return rc.d.a.a($$0).a();
   }

   public rk a(rk $$0, String $$1) {
      if ($$0 instanceof qr $$2) {
         qr $$3 = new qr();
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

   public RecordBuilder<rk> mapBuilder() {
      return new rc.h();
   }

   private static Optional<rc.f> k(rk $$0) {
      if ($$0 instanceof qt) {
         return Optional.of(rc.d.a);
      } else {
         if ($$0 instanceof qq<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(rc.d.a);
            }

            if ($$1 instanceof qx $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(rc.d.a);
                  case 10 -> Optional.of(new rc.b($$2));
                  default -> Optional.of(new rc.c($$2));
               };
            }

            if ($$1 instanceof qo $$3) {
               return Optional.of(new rc.a($$3.e()));
            }

            if ($$1 instanceof qv $$4) {
               return Optional.of(new rc.e($$4.g()));
            }

            if ($$1 instanceof qy $$5) {
               return Optional.of(new rc.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements rc.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public rc.f a(rk $$0) {
         if ($$0 instanceof qp $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new rc.b(this.a).a($$0);
         }
      }

      @Override
      public rk a() {
         return new qo(this.a.toByteArray());
      }
   }

   static class b implements rc.f {
      private final qx a = new qx();

      public b() {
      }

      public b(Collection<rk> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(qw.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(qp.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(qz.a($$0x))));
      }

      private static boolean a(qr $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static rk b(rk $$0) {
         if ($$0 instanceof qr $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static qr c(rk $$0) {
         qr $$1 = new qr();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public rc.f a(rk $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public rk a() {
         return this.a;
      }
   }

   static class c implements rc.f {
      private final qx a = new qx();

      c(rk $$0) {
         this.a.add($$0);
      }

      c(qx $$0) {
         this.a.addAll($$0);
      }

      @Override
      public rc.f a(rk $$0) {
         if ($$0.b() != this.a.f()) {
            return new rc.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public rk a() {
         return this.a;
      }
   }

   static class d implements rc.f {
      public static final rc.d a = new rc.d();

      private d() {
      }

      @Override
      public rc.f a(rk $$0) {
         if ($$0 instanceof qr $$1) {
            return new rc.b().a($$1);
         } else if ($$0 instanceof qp $$2) {
            return new rc.a($$2.i());
         } else if ($$0 instanceof qw $$3) {
            return new rc.e($$3.g());
         } else {
            return (rc.f)($$0 instanceof qz $$4 ? new rc.g($$4.f()) : new rc.c($$0));
         }
      }

      @Override
      public rk a() {
         return new qx();
      }
   }

   static class e implements rc.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public rc.f a(rk $$0) {
         if ($$0 instanceof qw $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new rc.b(this.a).a($$0);
         }
      }

      @Override
      public rk a() {
         return new qv(this.a.toIntArray());
      }
   }

   interface f {
      rc.f a(rk var1);

      default rc.f a(Iterable<rk> $$0) {
         rc.f $$1 = this;

         for (rk $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default rc.f a(Stream<rk> $$0) {
         return this.a($$0::iterator);
      }

      rk a();
   }

   static class g implements rc.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public rc.f a(rk $$0) {
         if ($$0 instanceof qz $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new rc.b(this.a).a($$0);
         }
      }

      @Override
      public rk a() {
         return new qy(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<rk, qr> {
      protected h() {
         super(rc.this);
      }

      protected qr a() {
         return new qr();
      }

      protected qr a(String $$0, rk $$1, qr $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<rk> a(qr $$0, rk $$1) {
         if ($$1 == null || $$1 == qt.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof qr $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            qr $$3 = new qr(Maps.newHashMap($$2.i()));

            for (Entry<String, rk> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
