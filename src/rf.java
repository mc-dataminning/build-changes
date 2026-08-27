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

public class rf implements DynamicOps<rn> {
   public static final rf a = new rf();
   private static final String b = "";

   protected rf() {
   }

   public rn a() {
      return qw.b;
   }

   public <U> U a(DynamicOps<U> $$0, rn $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((rh)$$1).i());
         case 2:
            return (U)$$0.createShort(((rh)$$1).h());
         case 3:
            return (U)$$0.createInt(((rh)$$1).g());
         case 4:
            return (U)$$0.createLong(((rh)$$1).f());
         case 5:
            return (U)$$0.createFloat(((rh)$$1).k());
         case 6:
            return (U)$$0.createDouble(((rh)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((qr)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.m_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((qy)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((rb)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(rn $$0) {
      return $$0 instanceof rh $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public rn a(Number $$0) {
      return qv.a($$0.doubleValue());
   }

   public rn a(byte $$0) {
      return qs.a($$0);
   }

   public rn a(short $$0) {
      return ri.a($$0);
   }

   public rn a(int $$0) {
      return qz.a($$0);
   }

   public rn a(long $$0) {
      return rc.a($$0);
   }

   public rn a(float $$0) {
      return qx.a($$0);
   }

   public rn a(double $$0) {
      return qv.a($$0);
   }

   public rn a(boolean $$0) {
      return qs.a($$0);
   }

   public DataResult<String> b(rn $$0) {
      return $$0 instanceof rl $$1 ? DataResult.success($$1.m_()) : DataResult.error(() -> "Not a string");
   }

   public rn a(String $$0) {
      return rl.a($$0);
   }

   public DataResult<rn> a(rn $$0, rn $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<rn> a(rn $$0, List<rn> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<rn> a(rn $$0, rn $$1, rn $$2) {
      if (!($$0 instanceof qu) && !($$0 instanceof qw)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof rl)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         qu $$3 = new qu();
         if ($$0 instanceof qu $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.m_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<rn> a(rn $$0, MapLike<rn> $$1) {
      if (!($$0 instanceof qu) && !($$0 instanceof qw)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         qu $$2 = new qu();
         if ($$0 instanceof qu $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<rn> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            rn $$3 = (rn)$$2x.getFirst();
            if (!($$3 instanceof rl)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.m_(), (rn)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<rn, rn>>> c(rn $$0) {
      return $$0 instanceof qu $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<rn, rn>>> d(rn $$0) {
      return $$0 instanceof qu $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<rn>> e(rn $$0) {
      return $$0 instanceof qu $$1 ? DataResult.success(new MapLike<rn>() {
         @Nullable
         public rn a(rn $$0) {
            return $$1.c($$0.m_());
         }

         @Nullable
         public rn a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<rn, rn>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(rf.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public rn a(Stream<Pair<rn, rn>> $$0) {
      qu $$1 = new qu();
      $$0.forEach($$1x -> $$1.a(((rn)$$1x.getFirst()).m_(), (rn)$$1x.getSecond()));
      return $$1;
   }

   private static rn a(qu $$0) {
      if ($$0.f() == 1) {
         rn $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<rn>> f(rn $$0) {
      if ($$0 instanceof ra $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((qu)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof qt<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<rn>>> g(rn $$0) {
      if ($$0 instanceof ra $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((qu)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof qt<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(rn $$0) {
      return $$0 instanceof qr $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public rn a(ByteBuffer $$0) {
      return new qr(DataFixUtils.toArray($$0));
   }

   public DataResult<IntStream> i(rn $$0) {
      return $$0 instanceof qy $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public rn a(IntStream $$0) {
      return new qy($$0.toArray());
   }

   public DataResult<LongStream> j(rn $$0) {
      return $$0 instanceof rb $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public rn a(LongStream $$0) {
      return new rb($$0.toArray());
   }

   public rn b(Stream<rn> $$0) {
      return rf.d.a.a($$0).a();
   }

   public rn a(rn $$0, String $$1) {
      if ($$0 instanceof qu $$2) {
         qu $$3 = new qu();
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

   public RecordBuilder<rn> mapBuilder() {
      return new rf.h();
   }

   private static Optional<rf.f> k(rn $$0) {
      if ($$0 instanceof qw) {
         return Optional.of(rf.d.a);
      } else {
         if ($$0 instanceof qt<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(rf.d.a);
            }

            if ($$1 instanceof ra $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(rf.d.a);
                  case 10 -> Optional.of(new rf.b($$2));
                  default -> Optional.of(new rf.c($$2));
               };
            }

            if ($$1 instanceof qr $$3) {
               return Optional.of(new rf.a($$3.e()));
            }

            if ($$1 instanceof qy $$4) {
               return Optional.of(new rf.e($$4.g()));
            }

            if ($$1 instanceof rb $$5) {
               return Optional.of(new rf.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements rf.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public rf.f a(rn $$0) {
         if ($$0 instanceof qs $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new rf.b(this.a).a($$0);
         }
      }

      @Override
      public rn a() {
         return new qr(this.a.toByteArray());
      }
   }

   static class b implements rf.f {
      private final ra a = new ra();

      public b() {
      }

      public b(Collection<rn> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(qz.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(qs.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(rc.a($$0x))));
      }

      private static boolean a(qu $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static rn b(rn $$0) {
         if ($$0 instanceof qu $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static qu c(rn $$0) {
         qu $$1 = new qu();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public rf.f a(rn $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public rn a() {
         return this.a;
      }
   }

   static class c implements rf.f {
      private final ra a = new ra();

      c(rn $$0) {
         this.a.add($$0);
      }

      c(ra $$0) {
         this.a.addAll($$0);
      }

      @Override
      public rf.f a(rn $$0) {
         if ($$0.b() != this.a.f()) {
            return new rf.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public rn a() {
         return this.a;
      }
   }

   static class d implements rf.f {
      public static final rf.d a = new rf.d();

      private d() {
      }

      @Override
      public rf.f a(rn $$0) {
         if ($$0 instanceof qu $$1) {
            return new rf.b().a($$1);
         } else if ($$0 instanceof qs $$2) {
            return new rf.a($$2.i());
         } else if ($$0 instanceof qz $$3) {
            return new rf.e($$3.g());
         } else {
            return (rf.f)($$0 instanceof rc $$4 ? new rf.g($$4.f()) : new rf.c($$0));
         }
      }

      @Override
      public rn a() {
         return new ra();
      }
   }

   static class e implements rf.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public rf.f a(rn $$0) {
         if ($$0 instanceof qz $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new rf.b(this.a).a($$0);
         }
      }

      @Override
      public rn a() {
         return new qy(this.a.toIntArray());
      }
   }

   interface f {
      rf.f a(rn var1);

      default rf.f a(Iterable<rn> $$0) {
         rf.f $$1 = this;

         for (rn $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default rf.f a(Stream<rn> $$0) {
         return this.a($$0::iterator);
      }

      rn a();
   }

   static class g implements rf.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public rf.f a(rn $$0) {
         if ($$0 instanceof rc $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new rf.b(this.a).a($$0);
         }
      }

      @Override
      public rn a() {
         return new rb(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<rn, qu> {
      protected h() {
         super(rf.this);
      }

      protected qu a() {
         return new qu();
      }

      protected qu a(String $$0, rn $$1, qu $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<rn> a(qu $$0, rn $$1) {
         if ($$1 == null || $$1 == qw.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof qu $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            qu $$3 = new qu(Maps.newHashMap($$2.i()));

            for (Entry<String, rn> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
