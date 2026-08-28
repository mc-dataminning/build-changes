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

public class vg implements DynamicOps<vp> {
   public static final vg a = new vg();
   private static final String b = "";

   protected vg() {
   }

   public vp a() {
      return uu.b;
   }

   public <U> U a(DynamicOps<U> $$0, vp $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((vi)$$1).i());
         case 2 -> (Object)$$0.createShort(((vi)$$1).h());
         case 3 -> (Object)$$0.createInt(((vi)$$1).g());
         case 4 -> (Object)$$0.createLong(((vi)$$1).f());
         case 5 -> (Object)$$0.createFloat(((vi)$$1).k());
         case 6 -> (Object)$$0.createDouble(((vi)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((up)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.s_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((uw)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((uz)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(vp $$0) {
      return $$0 instanceof vi $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public vp a(Number $$0) {
      return ut.a($$0.doubleValue());
   }

   public vp a(byte $$0) {
      return uq.a($$0);
   }

   public vp a(short $$0) {
      return vk.a($$0);
   }

   public vp a(int $$0) {
      return ux.a($$0);
   }

   public vp a(long $$0) {
      return va.a($$0);
   }

   public vp a(float $$0) {
      return uv.a($$0);
   }

   public vp a(double $$0) {
      return ut.a($$0);
   }

   public vp a(boolean $$0) {
      return uq.a($$0);
   }

   public DataResult<String> b(vp $$0) {
      return $$0 instanceof vn $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public vp a(String $$0) {
      return vn.a($$0);
   }

   public DataResult<vp> a(vp $$0, vp $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vp> a(vp $$0, List<vp> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vp> a(vp $$0, vp $$1, vp $$2) {
      if (!($$0 instanceof us) && !($$0 instanceof uu)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof vn)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         us $$4 = $$0 instanceof us $$3 ? $$3.h() : new us();
         $$4.a($$1.s_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<vp> a(vp $$0, MapLike<vp> $$1) {
      if (!($$0 instanceof us) && !($$0 instanceof uu)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         us $$3 = $$0 instanceof us $$2 ? $$2.h() : new us();
         List<vp> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            vp $$3x = (vp)$$2x.getFirst();
            if (!($$3x instanceof vn)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.s_(), (vp)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<vp> a(vp $$0, Map<vp, vp> $$1) {
      if (!($$0 instanceof us) && !($$0 instanceof uu)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         us $$3 = $$0 instanceof us $$2 ? $$2.h() : new us();
         List<vp> $$4 = new ArrayList<>();

         for (Entry<vp, vp> $$5 : $$1.entrySet()) {
            vp $$6 = $$5.getKey();
            if ($$6 instanceof vn) {
               $$3.a($$6.s_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<vp, vp>>> c(vp $$0) {
      return $$0 instanceof us $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (vp)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<vp, vp>>> d(vp $$0) {
      return $$0 instanceof us $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, vp> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<vp>> e(vp $$0) {
      return $$0 instanceof us $$1 ? DataResult.success(new MapLike<vp>() {
         @Nullable
         public vp a(vp $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public vp a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<vp, vp>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(vg.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public vp a(Stream<Pair<vp, vp>> $$0) {
      us $$1 = new us();
      $$0.forEach($$1x -> $$1.a(((vp)$$1x.getFirst()).s_(), (vp)$$1x.getSecond()));
      return $$1;
   }

   private static vp a(us $$0) {
      if ($$0.f() == 1) {
         vp $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<vp>> f(vp $$0) {
      if ($$0 instanceof uy $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((us)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof ur<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<vp>>> g(vp $$0) {
      if ($$0 instanceof uy $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (vp $$2x : $$1) {
               $$1x.accept(a((us)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof ur<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(vp $$0) {
      return $$0 instanceof up $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public vp a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new up($$2);
   }

   public DataResult<IntStream> i(vp $$0) {
      return $$0 instanceof uw $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public vp a(IntStream $$0) {
      return new uw($$0.toArray());
   }

   public DataResult<LongStream> j(vp $$0) {
      return $$0 instanceof uz $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public vp a(LongStream $$0) {
      return new uz($$0.toArray());
   }

   public vp b(Stream<vp> $$0) {
      return vg.d.a.a($$0).a();
   }

   public vp a(vp $$0, String $$1) {
      if ($$0 instanceof us $$2) {
         us $$3 = $$2.h();
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

   public RecordBuilder<vp> mapBuilder() {
      return new vg.h();
   }

   private static Optional<vg.f> k(vp $$0) {
      if ($$0 instanceof uu) {
         return Optional.of(vg.d.a);
      } else {
         if ($$0 instanceof ur<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(vg.d.a);
            }

            if ($$1 instanceof uy $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(vg.d.a);
                  case 10 -> Optional.of(new vg.b($$2));
                  default -> Optional.of(new vg.c($$2));
               };
            }

            if ($$1 instanceof up $$3) {
               return Optional.of(new vg.a($$3.e()));
            }

            if ($$1 instanceof uw $$4) {
               return Optional.of(new vg.e($$4.g()));
            }

            if ($$1 instanceof uz $$5) {
               return Optional.of(new vg.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements vg.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public vg.f a(vp $$0) {
         if ($$0 instanceof uq $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new vg.b(this.a).a($$0);
         }
      }

      @Override
      public vp a() {
         return new up(this.a.toByteArray());
      }
   }

   static class b implements vg.f {
      private final uy a = new uy();

      public b() {
      }

      public b(Collection<vp> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ux.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uq.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(va.a($$0x))));
      }

      private static boolean a(us $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static vp b(vp $$0) {
         if ($$0 instanceof us $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static us c(vp $$0) {
         us $$1 = new us();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public vg.f a(vp $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public vp a() {
         return this.a;
      }
   }

   static class c implements vg.f {
      private final uy a = new uy();

      c(vp $$0) {
         this.a.add($$0);
      }

      c(uy $$0) {
         this.a.addAll($$0);
      }

      @Override
      public vg.f a(vp $$0) {
         if ($$0.b() != this.a.f()) {
            return new vg.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public vp a() {
         return this.a;
      }
   }

   static class d implements vg.f {
      public static final vg.d a = new vg.d();

      private d() {
      }

      @Override
      public vg.f a(vp $$0) {
         if ($$0 instanceof us $$1) {
            return new vg.b().a($$1);
         } else if ($$0 instanceof uq $$2) {
            return new vg.a($$2.i());
         } else if ($$0 instanceof ux $$3) {
            return new vg.e($$3.g());
         } else {
            return (vg.f)($$0 instanceof va $$4 ? new vg.g($$4.f()) : new vg.c($$0));
         }
      }

      @Override
      public vp a() {
         return new uy();
      }
   }

   static class e implements vg.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public vg.f a(vp $$0) {
         if ($$0 instanceof ux $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new vg.b(this.a).a($$0);
         }
      }

      @Override
      public vp a() {
         return new uw(this.a.toIntArray());
      }
   }

   interface f {
      vg.f a(vp var1);

      default vg.f a(Iterable<vp> $$0) {
         vg.f $$1 = this;

         for (vp $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default vg.f a(Stream<vp> $$0) {
         return this.a($$0::iterator);
      }

      vp a();
   }

   static class g implements vg.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public vg.f a(vp $$0) {
         if ($$0 instanceof va $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new vg.b(this.a).a($$0);
         }
      }

      @Override
      public vp a() {
         return new uz(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<vp, us> {
      protected h() {
         super(vg.this);
      }

      protected us a() {
         return new us();
      }

      protected us a(String $$0, vp $$1, us $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<vp> a(us $$0, vp $$1) {
         if ($$1 == null || $$1 == uu.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof us $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            us $$3 = $$2.h();

            for (Entry<String, vp> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
