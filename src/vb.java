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

public class vb implements DynamicOps<vk> {
   public static final vb a = new vb();
   private static final String b = "";

   protected vb() {
   }

   public vk a() {
      return up.b;
   }

   public <U> U a(DynamicOps<U> $$0, vk $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((vd)$$1).i());
         case 2 -> (Object)$$0.createShort(((vd)$$1).h());
         case 3 -> (Object)$$0.createInt(((vd)$$1).g());
         case 4 -> (Object)$$0.createLong(((vd)$$1).f());
         case 5 -> (Object)$$0.createFloat(((vd)$$1).k());
         case 6 -> (Object)$$0.createDouble(((vd)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((uk)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.s_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((ur)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((uu)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(vk $$0) {
      return $$0 instanceof vd $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public vk a(Number $$0) {
      return uo.a($$0.doubleValue());
   }

   public vk a(byte $$0) {
      return ul.a($$0);
   }

   public vk a(short $$0) {
      return vf.a($$0);
   }

   public vk a(int $$0) {
      return us.a($$0);
   }

   public vk a(long $$0) {
      return uv.a($$0);
   }

   public vk a(float $$0) {
      return uq.a($$0);
   }

   public vk a(double $$0) {
      return uo.a($$0);
   }

   public vk a(boolean $$0) {
      return ul.a($$0);
   }

   public DataResult<String> b(vk $$0) {
      return $$0 instanceof vi $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public vk a(String $$0) {
      return vi.a($$0);
   }

   public DataResult<vk> a(vk $$0, vk $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vk> a(vk $$0, List<vk> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vk> a(vk $$0, vk $$1, vk $$2) {
      if (!($$0 instanceof un) && !($$0 instanceof up)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof vi)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         un $$4 = $$0 instanceof un $$3 ? $$3.h() : new un();
         $$4.a($$1.s_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<vk> a(vk $$0, MapLike<vk> $$1) {
      if (!($$0 instanceof un) && !($$0 instanceof up)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         un $$3 = $$0 instanceof un $$2 ? $$2.h() : new un();
         List<vk> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            vk $$3x = (vk)$$2x.getFirst();
            if (!($$3x instanceof vi)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.s_(), (vk)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<vk> a(vk $$0, Map<vk, vk> $$1) {
      if (!($$0 instanceof un) && !($$0 instanceof up)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         un $$3 = $$0 instanceof un $$2 ? $$2.h() : new un();
         List<vk> $$4 = new ArrayList<>();

         for (Entry<vk, vk> $$5 : $$1.entrySet()) {
            vk $$6 = $$5.getKey();
            if ($$6 instanceof vi) {
               $$3.a($$6.s_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<vk, vk>>> c(vk $$0) {
      return $$0 instanceof un $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (vk)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<vk, vk>>> d(vk $$0) {
      return $$0 instanceof un $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, vk> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<vk>> e(vk $$0) {
      return $$0 instanceof un $$1 ? DataResult.success(new MapLike<vk>() {
         @Nullable
         public vk a(vk $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public vk a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<vk, vk>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(vb.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public vk a(Stream<Pair<vk, vk>> $$0) {
      un $$1 = new un();
      $$0.forEach($$1x -> $$1.a(((vk)$$1x.getFirst()).s_(), (vk)$$1x.getSecond()));
      return $$1;
   }

   private static vk a(un $$0) {
      if ($$0.f() == 1) {
         vk $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<vk>> f(vk $$0) {
      if ($$0 instanceof ut $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((un)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof um<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<vk>>> g(vk $$0) {
      if ($$0 instanceof ut $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (vk $$2x : $$1) {
               $$1x.accept(a((un)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof um<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(vk $$0) {
      return $$0 instanceof uk $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public vk a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new uk($$2);
   }

   public DataResult<IntStream> i(vk $$0) {
      return $$0 instanceof ur $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public vk a(IntStream $$0) {
      return new ur($$0.toArray());
   }

   public DataResult<LongStream> j(vk $$0) {
      return $$0 instanceof uu $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public vk a(LongStream $$0) {
      return new uu($$0.toArray());
   }

   public vk b(Stream<vk> $$0) {
      return vb.d.a.a($$0).a();
   }

   public vk a(vk $$0, String $$1) {
      if ($$0 instanceof un $$2) {
         un $$3 = $$2.h();
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

   public RecordBuilder<vk> mapBuilder() {
      return new vb.h();
   }

   private static Optional<vb.f> k(vk $$0) {
      if ($$0 instanceof up) {
         return Optional.of(vb.d.a);
      } else {
         if ($$0 instanceof um<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(vb.d.a);
            }

            if ($$1 instanceof ut $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(vb.d.a);
                  case 10 -> Optional.of(new vb.b($$2));
                  default -> Optional.of(new vb.c($$2));
               };
            }

            if ($$1 instanceof uk $$3) {
               return Optional.of(new vb.a($$3.e()));
            }

            if ($$1 instanceof ur $$4) {
               return Optional.of(new vb.e($$4.g()));
            }

            if ($$1 instanceof uu $$5) {
               return Optional.of(new vb.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements vb.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public vb.f a(vk $$0) {
         if ($$0 instanceof ul $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new vb.b(this.a).a($$0);
         }
      }

      @Override
      public vk a() {
         return new uk(this.a.toByteArray());
      }
   }

   static class b implements vb.f {
      private final ut a = new ut();

      public b() {
      }

      public b(Collection<vk> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(us.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ul.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uv.a($$0x))));
      }

      private static boolean a(un $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static vk b(vk $$0) {
         if ($$0 instanceof un $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static un c(vk $$0) {
         un $$1 = new un();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public vb.f a(vk $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public vk a() {
         return this.a;
      }
   }

   static class c implements vb.f {
      private final ut a = new ut();

      c(vk $$0) {
         this.a.add($$0);
      }

      c(ut $$0) {
         this.a.addAll($$0);
      }

      @Override
      public vb.f a(vk $$0) {
         if ($$0.b() != this.a.f()) {
            return new vb.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public vk a() {
         return this.a;
      }
   }

   static class d implements vb.f {
      public static final vb.d a = new vb.d();

      private d() {
      }

      @Override
      public vb.f a(vk $$0) {
         if ($$0 instanceof un $$1) {
            return new vb.b().a($$1);
         } else if ($$0 instanceof ul $$2) {
            return new vb.a($$2.i());
         } else if ($$0 instanceof us $$3) {
            return new vb.e($$3.g());
         } else {
            return (vb.f)($$0 instanceof uv $$4 ? new vb.g($$4.f()) : new vb.c($$0));
         }
      }

      @Override
      public vk a() {
         return new ut();
      }
   }

   static class e implements vb.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public vb.f a(vk $$0) {
         if ($$0 instanceof us $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new vb.b(this.a).a($$0);
         }
      }

      @Override
      public vk a() {
         return new ur(this.a.toIntArray());
      }
   }

   interface f {
      vb.f a(vk var1);

      default vb.f a(Iterable<vk> $$0) {
         vb.f $$1 = this;

         for (vk $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default vb.f a(Stream<vk> $$0) {
         return this.a($$0::iterator);
      }

      vk a();
   }

   static class g implements vb.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public vb.f a(vk $$0) {
         if ($$0 instanceof uv $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new vb.b(this.a).a($$0);
         }
      }

      @Override
      public vk a() {
         return new uu(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<vk, un> {
      protected h() {
         super(vb.this);
      }

      protected un a() {
         return new un();
      }

      protected un a(String $$0, vk $$1, un $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<vk> a(un $$0, vk $$1) {
         if ($$1 == null || $$1 == up.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof un $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            un $$3 = $$2.h();

            for (Entry<String, vk> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
