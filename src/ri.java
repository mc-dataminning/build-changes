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

public class ri implements DynamicOps<rq> {
   public static final ri a = new ri();
   private static final String b = "";

   protected ri() {
   }

   public rq a() {
      return qy.b;
   }

   public <U> U a(DynamicOps<U> $$0, rq $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((rk)$$1).i());
         case 2:
            return (U)$$0.createShort(((rk)$$1).h());
         case 3:
            return (U)$$0.createInt(((rk)$$1).g());
         case 4:
            return (U)$$0.createLong(((rk)$$1).f());
         case 5:
            return (U)$$0.createFloat(((rk)$$1).k());
         case 6:
            return (U)$$0.createDouble(((rk)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((qt)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.r_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((ra)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((rd)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(rq $$0) {
      return $$0 instanceof rk $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public rq a(Number $$0) {
      return qx.a($$0.doubleValue());
   }

   public rq a(byte $$0) {
      return qu.a($$0);
   }

   public rq a(short $$0) {
      return rl.a($$0);
   }

   public rq a(int $$0) {
      return rb.a($$0);
   }

   public rq a(long $$0) {
      return re.a($$0);
   }

   public rq a(float $$0) {
      return qz.a($$0);
   }

   public rq a(double $$0) {
      return qx.a($$0);
   }

   public rq a(boolean $$0) {
      return qu.a($$0);
   }

   public DataResult<String> b(rq $$0) {
      return $$0 instanceof ro $$1 ? DataResult.success($$1.r_()) : DataResult.error(() -> "Not a string");
   }

   public rq a(String $$0) {
      return ro.a($$0);
   }

   public DataResult<rq> a(rq $$0, rq $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<rq> a(rq $$0, List<rq> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<rq> a(rq $$0, rq $$1, rq $$2) {
      if (!($$0 instanceof qw) && !($$0 instanceof qy)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof ro)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         qw $$3 = new qw();
         if ($$0 instanceof qw $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.r_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<rq> a(rq $$0, MapLike<rq> $$1) {
      if (!($$0 instanceof qw) && !($$0 instanceof qy)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         qw $$2 = new qw();
         if ($$0 instanceof qw $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<rq> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            rq $$3 = (rq)$$2x.getFirst();
            if (!($$3 instanceof ro)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.r_(), (rq)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<rq, rq>>> c(rq $$0) {
      return $$0 instanceof qw $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<rq, rq>>> d(rq $$0) {
      return $$0 instanceof qw $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<rq>> e(rq $$0) {
      return $$0 instanceof qw $$1 ? DataResult.success(new MapLike<rq>() {
         @Nullable
         public rq a(rq $$0) {
            return $$1.c($$0.r_());
         }

         @Nullable
         public rq a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<rq, rq>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(ri.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public rq a(Stream<Pair<rq, rq>> $$0) {
      qw $$1 = new qw();
      $$0.forEach($$1x -> $$1.a(((rq)$$1x.getFirst()).r_(), (rq)$$1x.getSecond()));
      return $$1;
   }

   private static rq a(qw $$0) {
      if ($$0.f() == 1) {
         rq $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<rq>> f(rq $$0) {
      if ($$0 instanceof rc $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((qw)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof qv<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<rq>>> g(rq $$0) {
      if ($$0 instanceof rc $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((qw)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof qv<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(rq $$0) {
      return $$0 instanceof qt $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public rq a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new qt($$2);
   }

   public DataResult<IntStream> i(rq $$0) {
      return $$0 instanceof ra $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public rq a(IntStream $$0) {
      return new ra($$0.toArray());
   }

   public DataResult<LongStream> j(rq $$0) {
      return $$0 instanceof rd $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public rq a(LongStream $$0) {
      return new rd($$0.toArray());
   }

   public rq b(Stream<rq> $$0) {
      return ri.d.a.a($$0).a();
   }

   public rq a(rq $$0, String $$1) {
      if ($$0 instanceof qw $$2) {
         qw $$3 = new qw();
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

   public RecordBuilder<rq> mapBuilder() {
      return new ri.h();
   }

   private static Optional<ri.f> k(rq $$0) {
      if ($$0 instanceof qy) {
         return Optional.of(ri.d.a);
      } else {
         if ($$0 instanceof qv<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(ri.d.a);
            }

            if ($$1 instanceof rc $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(ri.d.a);
                  case 10 -> Optional.of(new ri.b($$2));
                  default -> Optional.of(new ri.c($$2));
               };
            }

            if ($$1 instanceof qt $$3) {
               return Optional.of(new ri.a($$3.e()));
            }

            if ($$1 instanceof ra $$4) {
               return Optional.of(new ri.e($$4.g()));
            }

            if ($$1 instanceof rd $$5) {
               return Optional.of(new ri.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements ri.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ri.f a(rq $$0) {
         if ($$0 instanceof qu $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new ri.b(this.a).a($$0);
         }
      }

      @Override
      public rq a() {
         return new qt(this.a.toByteArray());
      }
   }

   static class b implements ri.f {
      private final rc a = new rc();

      public b() {
      }

      public b(Collection<rq> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(rb.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(qu.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(re.a($$0x))));
      }

      private static boolean a(qw $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static rq b(rq $$0) {
         if ($$0 instanceof qw $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static qw c(rq $$0) {
         qw $$1 = new qw();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public ri.f a(rq $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public rq a() {
         return this.a;
      }
   }

   static class c implements ri.f {
      private final rc a = new rc();

      c(rq $$0) {
         this.a.add($$0);
      }

      c(rc $$0) {
         this.a.addAll($$0);
      }

      @Override
      public ri.f a(rq $$0) {
         if ($$0.b() != this.a.f()) {
            return new ri.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public rq a() {
         return this.a;
      }
   }

   static class d implements ri.f {
      public static final ri.d a = new ri.d();

      private d() {
      }

      @Override
      public ri.f a(rq $$0) {
         if ($$0 instanceof qw $$1) {
            return new ri.b().a($$1);
         } else if ($$0 instanceof qu $$2) {
            return new ri.a($$2.i());
         } else if ($$0 instanceof rb $$3) {
            return new ri.e($$3.g());
         } else {
            return (ri.f)($$0 instanceof re $$4 ? new ri.g($$4.f()) : new ri.c($$0));
         }
      }

      @Override
      public rq a() {
         return new rc();
      }
   }

   static class e implements ri.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ri.f a(rq $$0) {
         if ($$0 instanceof rb $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new ri.b(this.a).a($$0);
         }
      }

      @Override
      public rq a() {
         return new ra(this.a.toIntArray());
      }
   }

   interface f {
      ri.f a(rq var1);

      default ri.f a(Iterable<rq> $$0) {
         ri.f $$1 = this;

         for (rq $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default ri.f a(Stream<rq> $$0) {
         return this.a($$0::iterator);
      }

      rq a();
   }

   static class g implements ri.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ri.f a(rq $$0) {
         if ($$0 instanceof re $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new ri.b(this.a).a($$0);
         }
      }

      @Override
      public rq a() {
         return new rd(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<rq, qw> {
      protected h() {
         super(ri.this);
      }

      protected qw a() {
         return new qw();
      }

      protected qw a(String $$0, rq $$1, qw $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<rq> a(qw $$0, rq $$1) {
         if ($$1 == null || $$1 == qy.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof qw $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            qw $$3 = new qw(Maps.newHashMap($$2.i()));

            for (Entry<String, rq> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
