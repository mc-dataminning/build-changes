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

public class sf implements DynamicOps<sn> {
   public static final sf a = new sf();
   private static final String b = "";

   protected sf() {
   }

   public sn a() {
      return rv.b;
   }

   public <U> U a(DynamicOps<U> $$0, sn $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((sh)$$1).i());
         case 2:
            return (U)$$0.createShort(((sh)$$1).h());
         case 3:
            return (U)$$0.createInt(((sh)$$1).g());
         case 4:
            return (U)$$0.createLong(((sh)$$1).f());
         case 5:
            return (U)$$0.createFloat(((sh)$$1).k());
         case 6:
            return (U)$$0.createDouble(((sh)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((rq)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.s_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((rx)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((sa)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(sn $$0) {
      return $$0 instanceof sh $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public sn a(Number $$0) {
      return ru.a($$0.doubleValue());
   }

   public sn a(byte $$0) {
      return rr.a($$0);
   }

   public sn a(short $$0) {
      return si.a($$0);
   }

   public sn a(int $$0) {
      return ry.a($$0);
   }

   public sn a(long $$0) {
      return sb.a($$0);
   }

   public sn a(float $$0) {
      return rw.a($$0);
   }

   public sn a(double $$0) {
      return ru.a($$0);
   }

   public sn a(boolean $$0) {
      return rr.a($$0);
   }

   public DataResult<String> b(sn $$0) {
      return $$0 instanceof sl $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public sn a(String $$0) {
      return sl.a($$0);
   }

   public DataResult<sn> a(sn $$0, sn $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<sn> a(sn $$0, List<sn> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<sn> a(sn $$0, sn $$1, sn $$2) {
      if (!($$0 instanceof rt) && !($$0 instanceof rv)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof sl)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         rt $$3 = new rt();
         if ($$0 instanceof rt $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.s_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<sn> a(sn $$0, MapLike<sn> $$1) {
      if (!($$0 instanceof rt) && !($$0 instanceof rv)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         rt $$2 = new rt();
         if ($$0 instanceof rt $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<sn> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            sn $$3 = (sn)$$2x.getFirst();
            if (!($$3 instanceof sl)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.s_(), (sn)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<sn, sn>>> c(sn $$0) {
      return $$0 instanceof rt $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<sn, sn>>> d(sn $$0) {
      return $$0 instanceof rt $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<sn>> e(sn $$0) {
      return $$0 instanceof rt $$1 ? DataResult.success(new MapLike<sn>() {
         @Nullable
         public sn a(sn $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public sn a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<sn, sn>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(sf.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public sn a(Stream<Pair<sn, sn>> $$0) {
      rt $$1 = new rt();
      $$0.forEach($$1x -> $$1.a(((sn)$$1x.getFirst()).s_(), (sn)$$1x.getSecond()));
      return $$1;
   }

   private static sn a(rt $$0) {
      if ($$0.f() == 1) {
         sn $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<sn>> f(sn $$0) {
      if ($$0 instanceof rz $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((rt)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof rs<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<sn>>> g(sn $$0) {
      if ($$0 instanceof rz $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((rt)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof rs<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(sn $$0) {
      return $$0 instanceof rq $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public sn a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new rq($$2);
   }

   public DataResult<IntStream> i(sn $$0) {
      return $$0 instanceof rx $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public sn a(IntStream $$0) {
      return new rx($$0.toArray());
   }

   public DataResult<LongStream> j(sn $$0) {
      return $$0 instanceof sa $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public sn a(LongStream $$0) {
      return new sa($$0.toArray());
   }

   public sn b(Stream<sn> $$0) {
      return sf.d.a.a($$0).a();
   }

   public sn a(sn $$0, String $$1) {
      if ($$0 instanceof rt $$2) {
         rt $$3 = new rt();
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

   public RecordBuilder<sn> mapBuilder() {
      return new sf.h();
   }

   private static Optional<sf.f> k(sn $$0) {
      if ($$0 instanceof rv) {
         return Optional.of(sf.d.a);
      } else {
         if ($$0 instanceof rs<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(sf.d.a);
            }

            if ($$1 instanceof rz $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(sf.d.a);
                  case 10 -> Optional.of(new sf.b($$2));
                  default -> Optional.of(new sf.c($$2));
               };
            }

            if ($$1 instanceof rq $$3) {
               return Optional.of(new sf.a($$3.e()));
            }

            if ($$1 instanceof rx $$4) {
               return Optional.of(new sf.e($$4.g()));
            }

            if ($$1 instanceof sa $$5) {
               return Optional.of(new sf.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements sf.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sf.f a(sn $$0) {
         if ($$0 instanceof rr $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new sf.b(this.a).a($$0);
         }
      }

      @Override
      public sn a() {
         return new rq(this.a.toByteArray());
      }
   }

   static class b implements sf.f {
      private final rz a = new rz();

      public b() {
      }

      public b(Collection<sn> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ry.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(rr.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sb.a($$0x))));
      }

      private static boolean a(rt $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static sn b(sn $$0) {
         if ($$0 instanceof rt $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static rt c(sn $$0) {
         rt $$1 = new rt();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public sf.f a(sn $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public sn a() {
         return this.a;
      }
   }

   static class c implements sf.f {
      private final rz a = new rz();

      c(sn $$0) {
         this.a.add($$0);
      }

      c(rz $$0) {
         this.a.addAll($$0);
      }

      @Override
      public sf.f a(sn $$0) {
         if ($$0.b() != this.a.f()) {
            return new sf.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public sn a() {
         return this.a;
      }
   }

   static class d implements sf.f {
      public static final sf.d a = new sf.d();

      private d() {
      }

      @Override
      public sf.f a(sn $$0) {
         if ($$0 instanceof rt $$1) {
            return new sf.b().a($$1);
         } else if ($$0 instanceof rr $$2) {
            return new sf.a($$2.i());
         } else if ($$0 instanceof ry $$3) {
            return new sf.e($$3.g());
         } else {
            return (sf.f)($$0 instanceof sb $$4 ? new sf.g($$4.f()) : new sf.c($$0));
         }
      }

      @Override
      public sn a() {
         return new rz();
      }
   }

   static class e implements sf.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sf.f a(sn $$0) {
         if ($$0 instanceof ry $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new sf.b(this.a).a($$0);
         }
      }

      @Override
      public sn a() {
         return new rx(this.a.toIntArray());
      }
   }

   interface f {
      sf.f a(sn var1);

      default sf.f a(Iterable<sn> $$0) {
         sf.f $$1 = this;

         for (sn $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default sf.f a(Stream<sn> $$0) {
         return this.a($$0::iterator);
      }

      sn a();
   }

   static class g implements sf.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sf.f a(sn $$0) {
         if ($$0 instanceof sb $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new sf.b(this.a).a($$0);
         }
      }

      @Override
      public sn a() {
         return new sa(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<sn, rt> {
      protected h() {
         super(sf.this);
      }

      protected rt a() {
         return new rt();
      }

      protected rt a(String $$0, sn $$1, rt $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<sn> a(rt $$0, sn $$1) {
         if ($$1 == null || $$1 == rv.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof rt $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            rt $$3 = new rt(Maps.newHashMap($$2.i()));

            for (Entry<String, sn> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
