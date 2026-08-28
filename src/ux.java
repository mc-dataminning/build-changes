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

public class ux implements DynamicOps<vg> {
   public static final ux a = new ux();
   private static final String b = "";

   protected ux() {
   }

   public vg a() {
      return ul.b;
   }

   public <U> U a(DynamicOps<U> $$0, vg $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((uz)$$1).i());
         case 2 -> (Object)$$0.createShort(((uz)$$1).h());
         case 3 -> (Object)$$0.createInt(((uz)$$1).g());
         case 4 -> (Object)$$0.createLong(((uz)$$1).f());
         case 5 -> (Object)$$0.createFloat(((uz)$$1).k());
         case 6 -> (Object)$$0.createDouble(((uz)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((ug)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.s_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((un)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((uq)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(vg $$0) {
      return $$0 instanceof uz $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public vg a(Number $$0) {
      return uk.a($$0.doubleValue());
   }

   public vg a(byte $$0) {
      return uh.a($$0);
   }

   public vg a(short $$0) {
      return vb.a($$0);
   }

   public vg a(int $$0) {
      return uo.a($$0);
   }

   public vg a(long $$0) {
      return ur.a($$0);
   }

   public vg a(float $$0) {
      return um.a($$0);
   }

   public vg a(double $$0) {
      return uk.a($$0);
   }

   public vg a(boolean $$0) {
      return uh.a($$0);
   }

   public DataResult<String> b(vg $$0) {
      return $$0 instanceof ve $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public vg a(String $$0) {
      return ve.a($$0);
   }

   public DataResult<vg> a(vg $$0, vg $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vg> a(vg $$0, List<vg> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vg> a(vg $$0, vg $$1, vg $$2) {
      if (!($$0 instanceof uj) && !($$0 instanceof ul)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof ve)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         uj $$4 = $$0 instanceof uj $$3 ? $$3.h() : new uj();
         $$4.a($$1.s_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<vg> a(vg $$0, MapLike<vg> $$1) {
      if (!($$0 instanceof uj) && !($$0 instanceof ul)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         uj $$3 = $$0 instanceof uj $$2 ? $$2.h() : new uj();
         List<vg> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            vg $$3x = (vg)$$2x.getFirst();
            if (!($$3x instanceof ve)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.s_(), (vg)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<vg> a(vg $$0, Map<vg, vg> $$1) {
      if (!($$0 instanceof uj) && !($$0 instanceof ul)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         uj $$3 = $$0 instanceof uj $$2 ? $$2.h() : new uj();
         List<vg> $$4 = new ArrayList<>();

         for (Entry<vg, vg> $$5 : $$1.entrySet()) {
            vg $$6 = $$5.getKey();
            if ($$6 instanceof ve) {
               $$3.a($$6.s_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<vg, vg>>> c(vg $$0) {
      return $$0 instanceof uj $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (vg)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<vg, vg>>> d(vg $$0) {
      return $$0 instanceof uj $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, vg> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<vg>> e(vg $$0) {
      return $$0 instanceof uj $$1 ? DataResult.success(new MapLike<vg>() {
         @Nullable
         public vg a(vg $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public vg a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<vg, vg>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(ux.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public vg a(Stream<Pair<vg, vg>> $$0) {
      uj $$1 = new uj();
      $$0.forEach($$1x -> $$1.a(((vg)$$1x.getFirst()).s_(), (vg)$$1x.getSecond()));
      return $$1;
   }

   private static vg a(uj $$0) {
      if ($$0.f() == 1) {
         vg $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<vg>> f(vg $$0) {
      if ($$0 instanceof up $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((uj)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof ui<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<vg>>> g(vg $$0) {
      if ($$0 instanceof up $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (vg $$2x : $$1) {
               $$1x.accept(a((uj)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof ui<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(vg $$0) {
      return $$0 instanceof ug $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public vg a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new ug($$2);
   }

   public DataResult<IntStream> i(vg $$0) {
      return $$0 instanceof un $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public vg a(IntStream $$0) {
      return new un($$0.toArray());
   }

   public DataResult<LongStream> j(vg $$0) {
      return $$0 instanceof uq $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public vg a(LongStream $$0) {
      return new uq($$0.toArray());
   }

   public vg b(Stream<vg> $$0) {
      return ux.d.a.a($$0).a();
   }

   public vg a(vg $$0, String $$1) {
      if ($$0 instanceof uj $$2) {
         uj $$3 = $$2.h();
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

   public RecordBuilder<vg> mapBuilder() {
      return new ux.h();
   }

   private static Optional<ux.f> k(vg $$0) {
      if ($$0 instanceof ul) {
         return Optional.of(ux.d.a);
      } else {
         if ($$0 instanceof ui<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(ux.d.a);
            }

            if ($$1 instanceof up $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(ux.d.a);
                  case 10 -> Optional.of(new ux.b($$2));
                  default -> Optional.of(new ux.c($$2));
               };
            }

            if ($$1 instanceof ug $$3) {
               return Optional.of(new ux.a($$3.e()));
            }

            if ($$1 instanceof un $$4) {
               return Optional.of(new ux.e($$4.g()));
            }

            if ($$1 instanceof uq $$5) {
               return Optional.of(new ux.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements ux.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ux.f a(vg $$0) {
         if ($$0 instanceof uh $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new ux.b(this.a).a($$0);
         }
      }

      @Override
      public vg a() {
         return new ug(this.a.toByteArray());
      }
   }

   static class b implements ux.f {
      private final up a = new up();

      public b() {
      }

      public b(Collection<vg> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uo.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uh.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ur.a($$0x))));
      }

      private static boolean a(uj $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static vg b(vg $$0) {
         if ($$0 instanceof uj $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static uj c(vg $$0) {
         uj $$1 = new uj();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public ux.f a(vg $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public vg a() {
         return this.a;
      }
   }

   static class c implements ux.f {
      private final up a = new up();

      c(vg $$0) {
         this.a.add($$0);
      }

      c(up $$0) {
         this.a.addAll($$0);
      }

      @Override
      public ux.f a(vg $$0) {
         if ($$0.b() != this.a.f()) {
            return new ux.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public vg a() {
         return this.a;
      }
   }

   static class d implements ux.f {
      public static final ux.d a = new ux.d();

      private d() {
      }

      @Override
      public ux.f a(vg $$0) {
         if ($$0 instanceof uj $$1) {
            return new ux.b().a($$1);
         } else if ($$0 instanceof uh $$2) {
            return new ux.a($$2.i());
         } else if ($$0 instanceof uo $$3) {
            return new ux.e($$3.g());
         } else {
            return (ux.f)($$0 instanceof ur $$4 ? new ux.g($$4.f()) : new ux.c($$0));
         }
      }

      @Override
      public vg a() {
         return new up();
      }
   }

   static class e implements ux.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ux.f a(vg $$0) {
         if ($$0 instanceof uo $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new ux.b(this.a).a($$0);
         }
      }

      @Override
      public vg a() {
         return new un(this.a.toIntArray());
      }
   }

   interface f {
      ux.f a(vg var1);

      default ux.f a(Iterable<vg> $$0) {
         ux.f $$1 = this;

         for (vg $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default ux.f a(Stream<vg> $$0) {
         return this.a($$0::iterator);
      }

      vg a();
   }

   static class g implements ux.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ux.f a(vg $$0) {
         if ($$0 instanceof ur $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new ux.b(this.a).a($$0);
         }
      }

      @Override
      public vg a() {
         return new uq(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<vg, uj> {
      protected h() {
         super(ux.this);
      }

      protected uj a() {
         return new uj();
      }

      protected uj a(String $$0, vg $$1, uj $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<vg> a(uj $$0, vg $$1) {
         if ($$1 == null || $$1 == ul.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof uj $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            uj $$3 = $$2.h();

            for (Entry<String, vg> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
