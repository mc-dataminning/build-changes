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
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class uz implements DynamicOps<vi> {
   public static final uz a = new uz();
   private static final String b = "";

   protected uz() {
   }

   public vi a() {
      return un.b;
   }

   public <U> U a(DynamicOps<U> $$0, vi $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((vb)$$1).i());
         case 2 -> (Object)$$0.createShort(((vb)$$1).h());
         case 3 -> (Object)$$0.createInt(((vb)$$1).g());
         case 4 -> (Object)$$0.createLong(((vb)$$1).f());
         case 5 -> (Object)$$0.createFloat(((vb)$$1).k());
         case 6 -> (Object)$$0.createDouble(((vb)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((ui)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.t_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((up)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((us)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(vi $$0) {
      return $$0 instanceof vb $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public vi a(Number $$0) {
      return um.a($$0.doubleValue());
   }

   public vi a(byte $$0) {
      return uj.a($$0);
   }

   public vi a(short $$0) {
      return vd.a($$0);
   }

   public vi a(int $$0) {
      return uq.a($$0);
   }

   public vi a(long $$0) {
      return ut.a($$0);
   }

   public vi a(float $$0) {
      return uo.a($$0);
   }

   public vi a(double $$0) {
      return um.a($$0);
   }

   public vi a(boolean $$0) {
      return uj.a($$0);
   }

   public DataResult<String> b(vi $$0) {
      return $$0 instanceof vg $$1 ? DataResult.success($$1.t_()) : DataResult.error(() -> "Not a string");
   }

   public vi a(String $$0) {
      return vg.a($$0);
   }

   public DataResult<vi> a(vi $$0, vi $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vi> a(vi $$0, List<vi> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vi> a(vi $$0, vi $$1, vi $$2) {
      if (!($$0 instanceof ul) && !($$0 instanceof un)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof vg)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         ul $$4 = $$0 instanceof ul $$3 ? $$3.h() : new ul();
         $$4.a($$1.t_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<vi> a(vi $$0, MapLike<vi> $$1) {
      if (!($$0 instanceof ul) && !($$0 instanceof un)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ul $$3 = $$0 instanceof ul $$2 ? $$2.h() : new ul();
         List<vi> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            vi $$3x = (vi)$$2x.getFirst();
            if (!($$3x instanceof vg)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.t_(), (vi)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<vi> a(vi $$0, Map<vi, vi> $$1) {
      if (!($$0 instanceof ul) && !($$0 instanceof un)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ul $$3 = $$0 instanceof ul $$2 ? $$2.h() : new ul();
         List<vi> $$4 = new ArrayList<>();

         for (Entry<vi, vi> $$5 : $$1.entrySet()) {
            vi $$6 = $$5.getKey();
            if ($$6 instanceof vg) {
               $$3.a($$6.t_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<vi, vi>>> c(vi $$0) {
      return $$0 instanceof ul $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (vi)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<vi, vi>>> d(vi $$0) {
      return $$0 instanceof ul $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, vi> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<vi>> e(vi $$0) {
      return $$0 instanceof ul $$1 ? DataResult.success(new MapLike<vi>() {
         @Nullable
         public vi a(vi $$0) {
            return $$1.c($$0.t_());
         }

         @Nullable
         public vi a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<vi, vi>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(uz.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public vi a(Stream<Pair<vi, vi>> $$0) {
      ul $$1 = new ul();
      $$0.forEach($$1x -> $$1.a(((vi)$$1x.getFirst()).t_(), (vi)$$1x.getSecond()));
      return $$1;
   }

   private static vi a(ul $$0) {
      if ($$0.f() == 1) {
         vi $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<vi>> f(vi $$0) {
      if ($$0 instanceof ur $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((ul)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof uk<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<vi>>> g(vi $$0) {
      if ($$0 instanceof ur $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (vi $$2x : $$1) {
               $$1x.accept(a((ul)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof uk<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(vi $$0) {
      return $$0 instanceof ui $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public vi a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new ui($$2);
   }

   public DataResult<IntStream> i(vi $$0) {
      return $$0 instanceof up $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public vi a(IntStream $$0) {
      return new up($$0.toArray());
   }

   public DataResult<LongStream> j(vi $$0) {
      return $$0 instanceof us $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public vi a(LongStream $$0) {
      return new us($$0.toArray());
   }

   public vi b(Stream<vi> $$0) {
      return uz.d.a.a($$0).a();
   }

   public vi a(vi $$0, String $$1) {
      if ($$0 instanceof ul $$2) {
         ul $$3 = $$2.h();
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

   public RecordBuilder<vi> mapBuilder() {
      return new uz.h();
   }

   private static Optional<uz.f> k(vi $$0) {
      if ($$0 instanceof un) {
         return Optional.of(uz.d.a);
      } else {
         if ($$0 instanceof uk<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(uz.d.a);
            }

            if ($$1 instanceof ur $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(uz.d.a);
                  case 10 -> Optional.of(new uz.b($$2));
                  default -> Optional.of(new uz.c($$2));
               };
            }

            if ($$1 instanceof ui $$3) {
               return Optional.of(new uz.a($$3.e()));
            }

            if ($$1 instanceof up $$4) {
               return Optional.of(new uz.e($$4.g()));
            }

            if ($$1 instanceof us $$5) {
               return Optional.of(new uz.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements uz.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uz.f a(vi $$0) {
         if ($$0 instanceof uj $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new uz.b(this.a).a($$0);
         }
      }

      @Override
      public vi a() {
         return new ui(this.a.toByteArray());
      }
   }

   static class b implements uz.f {
      private final ur a = new ur();

      public b() {
      }

      public b(Collection<vi> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uq.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uj.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ut.a($$0x))));
      }

      private static boolean a(ul $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static vi b(vi $$0) {
         if ($$0 instanceof ul $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static ul c(vi $$0) {
         ul $$1 = new ul();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public uz.f a(vi $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public vi a() {
         return this.a;
      }
   }

   static class c implements uz.f {
      private final ur a = new ur();

      c(vi $$0) {
         this.a.add($$0);
      }

      c(ur $$0) {
         this.a.addAll($$0);
      }

      @Override
      public uz.f a(vi $$0) {
         if ($$0.b() != this.a.f()) {
            return new uz.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public vi a() {
         return this.a;
      }
   }

   static class d implements uz.f {
      public static final uz.d a = new uz.d();

      private d() {
      }

      @Override
      public uz.f a(vi $$0) {
         if ($$0 instanceof ul $$1) {
            return new uz.b().a($$1);
         } else if ($$0 instanceof uj $$2) {
            return new uz.a($$2.i());
         } else if ($$0 instanceof uq $$3) {
            return new uz.e($$3.g());
         } else {
            return (uz.f)($$0 instanceof ut $$4 ? new uz.g($$4.f()) : new uz.c($$0));
         }
      }

      @Override
      public vi a() {
         return new ur();
      }
   }

   static class e implements uz.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uz.f a(vi $$0) {
         if ($$0 instanceof uq $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new uz.b(this.a).a($$0);
         }
      }

      @Override
      public vi a() {
         return new up(this.a.toIntArray());
      }
   }

   interface f {
      uz.f a(vi var1);

      default uz.f a(Iterable<vi> $$0) {
         uz.f $$1 = this;

         for (vi $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default uz.f a(Stream<vi> $$0) {
         return this.a($$0::iterator);
      }

      vi a();
   }

   static class g implements uz.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uz.f a(vi $$0) {
         if ($$0 instanceof ut $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new uz.b(this.a).a($$0);
         }
      }

      @Override
      public vi a() {
         return new us(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<vi, ul> {
      protected h() {
         super(uz.this);
      }

      protected ul a() {
         return new ul();
      }

      protected ul a(String $$0, vi $$1, ul $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<vi> a(ul $$0, vi $$1) {
         if ($$1 == null || $$1 == un.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof ul $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            ul $$3 = $$2.h();

            for (Entry<String, vi> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
