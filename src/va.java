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

public class va implements DynamicOps<vj> {
   public static final va a = new va();
   private static final String b = "";

   protected va() {
   }

   public vj a() {
      return uo.b;
   }

   public <U> U a(DynamicOps<U> $$0, vj $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((vc)$$1).i());
         case 2 -> (Object)$$0.createShort(((vc)$$1).h());
         case 3 -> (Object)$$0.createInt(((vc)$$1).g());
         case 4 -> (Object)$$0.createLong(((vc)$$1).f());
         case 5 -> (Object)$$0.createFloat(((vc)$$1).k());
         case 6 -> (Object)$$0.createDouble(((vc)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((uj)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.u_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((uq)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((ut)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(vj $$0) {
      return $$0 instanceof vc $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public vj a(Number $$0) {
      return un.a($$0.doubleValue());
   }

   public vj a(byte $$0) {
      return uk.a($$0);
   }

   public vj a(short $$0) {
      return ve.a($$0);
   }

   public vj a(int $$0) {
      return ur.a($$0);
   }

   public vj a(long $$0) {
      return uu.a($$0);
   }

   public vj a(float $$0) {
      return up.a($$0);
   }

   public vj a(double $$0) {
      return un.a($$0);
   }

   public vj a(boolean $$0) {
      return uk.a($$0);
   }

   public DataResult<String> b(vj $$0) {
      return $$0 instanceof vh $$1 ? DataResult.success($$1.u_()) : DataResult.error(() -> "Not a string");
   }

   public vj a(String $$0) {
      return vh.a($$0);
   }

   public DataResult<vj> a(vj $$0, vj $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vj> a(vj $$0, List<vj> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vj> a(vj $$0, vj $$1, vj $$2) {
      if (!($$0 instanceof um) && !($$0 instanceof uo)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof vh)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         um $$4 = $$0 instanceof um $$3 ? $$3.h() : new um();
         $$4.a($$1.u_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<vj> a(vj $$0, MapLike<vj> $$1) {
      if (!($$0 instanceof um) && !($$0 instanceof uo)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         um $$3 = $$0 instanceof um $$2 ? $$2.h() : new um();
         List<vj> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            vj $$3x = (vj)$$2x.getFirst();
            if (!($$3x instanceof vh)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.u_(), (vj)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<vj> a(vj $$0, Map<vj, vj> $$1) {
      if (!($$0 instanceof um) && !($$0 instanceof uo)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         um $$3 = $$0 instanceof um $$2 ? $$2.h() : new um();
         List<vj> $$4 = new ArrayList<>();

         for (Entry<vj, vj> $$5 : $$1.entrySet()) {
            vj $$6 = $$5.getKey();
            if ($$6 instanceof vh) {
               $$3.a($$6.u_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<vj, vj>>> c(vj $$0) {
      return $$0 instanceof um $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (vj)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<vj, vj>>> d(vj $$0) {
      return $$0 instanceof um $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, vj> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<vj>> e(vj $$0) {
      return $$0 instanceof um $$1 ? DataResult.success(new MapLike<vj>() {
         @Nullable
         public vj a(vj $$0) {
            return $$1.c($$0.u_());
         }

         @Nullable
         public vj a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<vj, vj>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(va.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public vj a(Stream<Pair<vj, vj>> $$0) {
      um $$1 = new um();
      $$0.forEach($$1x -> $$1.a(((vj)$$1x.getFirst()).u_(), (vj)$$1x.getSecond()));
      return $$1;
   }

   private static vj a(um $$0) {
      if ($$0.f() == 1) {
         vj $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<vj>> f(vj $$0) {
      if ($$0 instanceof us $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((um)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof ul<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<vj>>> g(vj $$0) {
      if ($$0 instanceof us $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (vj $$2x : $$1) {
               $$1x.accept(a((um)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof ul<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(vj $$0) {
      return $$0 instanceof uj $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public vj a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new uj($$2);
   }

   public DataResult<IntStream> i(vj $$0) {
      return $$0 instanceof uq $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public vj a(IntStream $$0) {
      return new uq($$0.toArray());
   }

   public DataResult<LongStream> j(vj $$0) {
      return $$0 instanceof ut $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public vj a(LongStream $$0) {
      return new ut($$0.toArray());
   }

   public vj b(Stream<vj> $$0) {
      return va.d.a.a($$0).a();
   }

   public vj a(vj $$0, String $$1) {
      if ($$0 instanceof um $$2) {
         um $$3 = $$2.h();
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

   public RecordBuilder<vj> mapBuilder() {
      return new va.h();
   }

   private static Optional<va.f> k(vj $$0) {
      if ($$0 instanceof uo) {
         return Optional.of(va.d.a);
      } else {
         if ($$0 instanceof ul<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(va.d.a);
            }

            if ($$1 instanceof us $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(va.d.a);
                  case 10 -> Optional.of(new va.b($$2));
                  default -> Optional.of(new va.c($$2));
               };
            }

            if ($$1 instanceof uj $$3) {
               return Optional.of(new va.a($$3.e()));
            }

            if ($$1 instanceof uq $$4) {
               return Optional.of(new va.e($$4.g()));
            }

            if ($$1 instanceof ut $$5) {
               return Optional.of(new va.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements va.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public va.f a(vj $$0) {
         if ($$0 instanceof uk $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new va.b(this.a).a($$0);
         }
      }

      @Override
      public vj a() {
         return new uj(this.a.toByteArray());
      }
   }

   static class b implements va.f {
      private final us a = new us();

      public b() {
      }

      public b(Collection<vj> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ur.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uk.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uu.a($$0x))));
      }

      private static boolean a(um $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static vj b(vj $$0) {
         if ($$0 instanceof um $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static um c(vj $$0) {
         um $$1 = new um();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public va.f a(vj $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public vj a() {
         return this.a;
      }
   }

   static class c implements va.f {
      private final us a = new us();

      c(vj $$0) {
         this.a.add($$0);
      }

      c(us $$0) {
         this.a.addAll($$0);
      }

      @Override
      public va.f a(vj $$0) {
         if ($$0.b() != this.a.f()) {
            return new va.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public vj a() {
         return this.a;
      }
   }

   static class d implements va.f {
      public static final va.d a = new va.d();

      private d() {
      }

      @Override
      public va.f a(vj $$0) {
         if ($$0 instanceof um $$1) {
            return new va.b().a($$1);
         } else if ($$0 instanceof uk $$2) {
            return new va.a($$2.i());
         } else if ($$0 instanceof ur $$3) {
            return new va.e($$3.g());
         } else {
            return (va.f)($$0 instanceof uu $$4 ? new va.g($$4.f()) : new va.c($$0));
         }
      }

      @Override
      public vj a() {
         return new us();
      }
   }

   static class e implements va.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public va.f a(vj $$0) {
         if ($$0 instanceof ur $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new va.b(this.a).a($$0);
         }
      }

      @Override
      public vj a() {
         return new uq(this.a.toIntArray());
      }
   }

   interface f {
      va.f a(vj var1);

      default va.f a(Iterable<vj> $$0) {
         va.f $$1 = this;

         for (vj $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default va.f a(Stream<vj> $$0) {
         return this.a($$0::iterator);
      }

      vj a();
   }

   static class g implements va.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public va.f a(vj $$0) {
         if ($$0 instanceof uu $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new va.b(this.a).a($$0);
         }
      }

      @Override
      public vj a() {
         return new ut(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<vj, um> {
      protected h() {
         super(va.this);
      }

      protected um a() {
         return new um();
      }

      protected um a(String $$0, vj $$1, um $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<vj> a(um $$0, vj $$1) {
         if ($$1 == null || $$1 == uo.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof um $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            um $$3 = $$2.h();

            for (Entry<String, vj> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
