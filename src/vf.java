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

public class vf implements DynamicOps<vo> {
   public static final vf a = new vf();
   private static final String b = "";

   protected vf() {
   }

   public vo a() {
      return ut.b;
   }

   public <U> U a(DynamicOps<U> $$0, vo $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((vh)$$1).i());
         case 2:
            return (U)$$0.createShort(((vh)$$1).h());
         case 3:
            return (U)$$0.createInt(((vh)$$1).g());
         case 4:
            return (U)$$0.createLong(((vh)$$1).f());
         case 5:
            return (U)$$0.createFloat(((vh)$$1).k());
         case 6:
            return (U)$$0.createDouble(((vh)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((uo)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.s_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((uv)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((uy)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(vo $$0) {
      return $$0 instanceof vh $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public vo a(Number $$0) {
      return us.a($$0.doubleValue());
   }

   public vo a(byte $$0) {
      return up.a($$0);
   }

   public vo a(short $$0) {
      return vj.a($$0);
   }

   public vo a(int $$0) {
      return uw.a($$0);
   }

   public vo a(long $$0) {
      return uz.a($$0);
   }

   public vo a(float $$0) {
      return uu.a($$0);
   }

   public vo a(double $$0) {
      return us.a($$0);
   }

   public vo a(boolean $$0) {
      return up.a($$0);
   }

   public DataResult<String> b(vo $$0) {
      return $$0 instanceof vm $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public vo a(String $$0) {
      return vm.a($$0);
   }

   public DataResult<vo> a(vo $$0, vo $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vo> a(vo $$0, List<vo> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vo> a(vo $$0, vo $$1, vo $$2) {
      if (!($$0 instanceof ur) && !($$0 instanceof ut)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof vm)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         ur $$3 = new ur();
         if ($$0 instanceof ur $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.s_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<vo> a(vo $$0, MapLike<vo> $$1) {
      if (!($$0 instanceof ur) && !($$0 instanceof ut)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ur $$2 = new ur();
         if ($$0 instanceof ur $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<vo> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            vo $$3 = (vo)$$2x.getFirst();
            if (!($$3 instanceof vm)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.s_(), (vo)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<vo, vo>>> c(vo $$0) {
      return $$0 instanceof ur $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<vo, vo>>> d(vo $$0) {
      return $$0 instanceof ur $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<vo>> e(vo $$0) {
      return $$0 instanceof ur $$1 ? DataResult.success(new MapLike<vo>() {
         @Nullable
         public vo a(vo $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public vo a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<vo, vo>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(vf.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public vo a(Stream<Pair<vo, vo>> $$0) {
      ur $$1 = new ur();
      $$0.forEach($$1x -> $$1.a(((vo)$$1x.getFirst()).s_(), (vo)$$1x.getSecond()));
      return $$1;
   }

   private static vo a(ur $$0) {
      if ($$0.f() == 1) {
         vo $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<vo>> f(vo $$0) {
      if ($$0 instanceof ux $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((ur)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof uq<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<vo>>> g(vo $$0) {
      if ($$0 instanceof ux $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((ur)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof uq<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(vo $$0) {
      return $$0 instanceof uo $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public vo a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new uo($$2);
   }

   public DataResult<IntStream> i(vo $$0) {
      return $$0 instanceof uv $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public vo a(IntStream $$0) {
      return new uv($$0.toArray());
   }

   public DataResult<LongStream> j(vo $$0) {
      return $$0 instanceof uy $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public vo a(LongStream $$0) {
      return new uy($$0.toArray());
   }

   public vo b(Stream<vo> $$0) {
      return vf.d.a.a($$0).a();
   }

   public vo a(vo $$0, String $$1) {
      if ($$0 instanceof ur $$2) {
         ur $$3 = new ur();
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

   public RecordBuilder<vo> mapBuilder() {
      return new vf.h();
   }

   private static Optional<vf.f> k(vo $$0) {
      if ($$0 instanceof ut) {
         return Optional.of(vf.d.a);
      } else {
         if ($$0 instanceof uq<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(vf.d.a);
            }

            if ($$1 instanceof ux $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(vf.d.a);
                  case 10 -> Optional.of(new vf.b($$2));
                  default -> Optional.of(new vf.c($$2));
               };
            }

            if ($$1 instanceof uo $$3) {
               return Optional.of(new vf.a($$3.e()));
            }

            if ($$1 instanceof uv $$4) {
               return Optional.of(new vf.e($$4.g()));
            }

            if ($$1 instanceof uy $$5) {
               return Optional.of(new vf.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements vf.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public vf.f a(vo $$0) {
         if ($$0 instanceof up $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new vf.b(this.a).a($$0);
         }
      }

      @Override
      public vo a() {
         return new uo(this.a.toByteArray());
      }
   }

   static class b implements vf.f {
      private final ux a = new ux();

      public b() {
      }

      public b(Collection<vo> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uw.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(up.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uz.a($$0x))));
      }

      private static boolean a(ur $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static vo b(vo $$0) {
         if ($$0 instanceof ur $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static ur c(vo $$0) {
         ur $$1 = new ur();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public vf.f a(vo $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public vo a() {
         return this.a;
      }
   }

   static class c implements vf.f {
      private final ux a = new ux();

      c(vo $$0) {
         this.a.add($$0);
      }

      c(ux $$0) {
         this.a.addAll($$0);
      }

      @Override
      public vf.f a(vo $$0) {
         if ($$0.b() != this.a.f()) {
            return new vf.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public vo a() {
         return this.a;
      }
   }

   static class d implements vf.f {
      public static final vf.d a = new vf.d();

      private d() {
      }

      @Override
      public vf.f a(vo $$0) {
         if ($$0 instanceof ur $$1) {
            return new vf.b().a($$1);
         } else if ($$0 instanceof up $$2) {
            return new vf.a($$2.i());
         } else if ($$0 instanceof uw $$3) {
            return new vf.e($$3.g());
         } else {
            return (vf.f)($$0 instanceof uz $$4 ? new vf.g($$4.f()) : new vf.c($$0));
         }
      }

      @Override
      public vo a() {
         return new ux();
      }
   }

   static class e implements vf.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public vf.f a(vo $$0) {
         if ($$0 instanceof uw $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new vf.b(this.a).a($$0);
         }
      }

      @Override
      public vo a() {
         return new uv(this.a.toIntArray());
      }
   }

   interface f {
      vf.f a(vo var1);

      default vf.f a(Iterable<vo> $$0) {
         vf.f $$1 = this;

         for (vo $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default vf.f a(Stream<vo> $$0) {
         return this.a($$0::iterator);
      }

      vo a();
   }

   static class g implements vf.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public vf.f a(vo $$0) {
         if ($$0 instanceof uz $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new vf.b(this.a).a($$0);
         }
      }

      @Override
      public vo a() {
         return new uy(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<vo, ur> {
      protected h() {
         super(vf.this);
      }

      protected ur a() {
         return new ur();
      }

      protected ur a(String $$0, vo $$1, ur $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<vo> a(ur $$0, vo $$1) {
         if ($$1 == null || $$1 == ut.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof ur $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            ur $$3 = new ur(Maps.newHashMap($$2.i()));

            for (Entry<String, vo> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
