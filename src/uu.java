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

public class uu implements DynamicOps<vd> {
   public static final uu a = new uu();
   private static final String b = "";

   protected uu() {
   }

   public vd a() {
      return ui.b;
   }

   public <U> U a(DynamicOps<U> $$0, vd $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((uw)$$1).i());
         case 2 -> (Object)$$0.createShort(((uw)$$1).h());
         case 3 -> (Object)$$0.createInt(((uw)$$1).g());
         case 4 -> (Object)$$0.createLong(((uw)$$1).f());
         case 5 -> (Object)$$0.createFloat(((uw)$$1).k());
         case 6 -> (Object)$$0.createDouble(((uw)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((ud)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.s_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((uk)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((un)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(vd $$0) {
      return $$0 instanceof uw $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public vd a(Number $$0) {
      return uh.a($$0.doubleValue());
   }

   public vd a(byte $$0) {
      return ue.a($$0);
   }

   public vd a(short $$0) {
      return uy.a($$0);
   }

   public vd a(int $$0) {
      return ul.a($$0);
   }

   public vd a(long $$0) {
      return uo.a($$0);
   }

   public vd a(float $$0) {
      return uj.a($$0);
   }

   public vd a(double $$0) {
      return uh.a($$0);
   }

   public vd a(boolean $$0) {
      return ue.a($$0);
   }

   public DataResult<String> b(vd $$0) {
      return $$0 instanceof vb $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public vd a(String $$0) {
      return vb.a($$0);
   }

   public DataResult<vd> a(vd $$0, vd $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vd> a(vd $$0, List<vd> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vd> a(vd $$0, vd $$1, vd $$2) {
      if (!($$0 instanceof ug) && !($$0 instanceof ui)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof vb)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         ug $$4 = $$0 instanceof ug $$3 ? $$3.h() : new ug();
         $$4.a($$1.s_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<vd> a(vd $$0, MapLike<vd> $$1) {
      if (!($$0 instanceof ug) && !($$0 instanceof ui)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ug $$3 = $$0 instanceof ug $$2 ? $$2.h() : new ug();
         List<vd> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            vd $$3x = (vd)$$2x.getFirst();
            if (!($$3x instanceof vb)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.s_(), (vd)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<vd> a(vd $$0, Map<vd, vd> $$1) {
      if (!($$0 instanceof ug) && !($$0 instanceof ui)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ug $$3 = $$0 instanceof ug $$2 ? $$2.h() : new ug();
         List<vd> $$4 = new ArrayList<>();

         for (Entry<vd, vd> $$5 : $$1.entrySet()) {
            vd $$6 = $$5.getKey();
            if ($$6 instanceof vb) {
               $$3.a($$6.s_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<vd, vd>>> c(vd $$0) {
      return $$0 instanceof ug $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (vd)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<vd, vd>>> d(vd $$0) {
      return $$0 instanceof ug $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, vd> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<vd>> e(vd $$0) {
      return $$0 instanceof ug $$1 ? DataResult.success(new MapLike<vd>() {
         @Nullable
         public vd a(vd $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public vd a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<vd, vd>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(uu.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public vd a(Stream<Pair<vd, vd>> $$0) {
      ug $$1 = new ug();
      $$0.forEach($$1x -> $$1.a(((vd)$$1x.getFirst()).s_(), (vd)$$1x.getSecond()));
      return $$1;
   }

   private static vd a(ug $$0) {
      if ($$0.f() == 1) {
         vd $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<vd>> f(vd $$0) {
      if ($$0 instanceof um $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((ug)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof uf<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<vd>>> g(vd $$0) {
      if ($$0 instanceof um $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (vd $$2x : $$1) {
               $$1x.accept(a((ug)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof uf<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(vd $$0) {
      return $$0 instanceof ud $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public vd a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new ud($$2);
   }

   public DataResult<IntStream> i(vd $$0) {
      return $$0 instanceof uk $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public vd a(IntStream $$0) {
      return new uk($$0.toArray());
   }

   public DataResult<LongStream> j(vd $$0) {
      return $$0 instanceof un $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public vd a(LongStream $$0) {
      return new un($$0.toArray());
   }

   public vd b(Stream<vd> $$0) {
      return uu.d.a.a($$0).a();
   }

   public vd a(vd $$0, String $$1) {
      if ($$0 instanceof ug $$2) {
         ug $$3 = $$2.h();
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

   public RecordBuilder<vd> mapBuilder() {
      return new uu.h();
   }

   private static Optional<uu.f> k(vd $$0) {
      if ($$0 instanceof ui) {
         return Optional.of(uu.d.a);
      } else {
         if ($$0 instanceof uf<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(uu.d.a);
            }

            if ($$1 instanceof um $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(uu.d.a);
                  case 10 -> Optional.of(new uu.b($$2));
                  default -> Optional.of(new uu.c($$2));
               };
            }

            if ($$1 instanceof ud $$3) {
               return Optional.of(new uu.a($$3.e()));
            }

            if ($$1 instanceof uk $$4) {
               return Optional.of(new uu.e($$4.g()));
            }

            if ($$1 instanceof un $$5) {
               return Optional.of(new uu.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements uu.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uu.f a(vd $$0) {
         if ($$0 instanceof ue $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new uu.b(this.a).a($$0);
         }
      }

      @Override
      public vd a() {
         return new ud(this.a.toByteArray());
      }
   }

   static class b implements uu.f {
      private final um a = new um();

      public b() {
      }

      public b(Collection<vd> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ul.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ue.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uo.a($$0x))));
      }

      private static boolean a(ug $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static vd b(vd $$0) {
         if ($$0 instanceof ug $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static ug c(vd $$0) {
         ug $$1 = new ug();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public uu.f a(vd $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public vd a() {
         return this.a;
      }
   }

   static class c implements uu.f {
      private final um a = new um();

      c(vd $$0) {
         this.a.add($$0);
      }

      c(um $$0) {
         this.a.addAll($$0);
      }

      @Override
      public uu.f a(vd $$0) {
         if ($$0.b() != this.a.f()) {
            return new uu.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public vd a() {
         return this.a;
      }
   }

   static class d implements uu.f {
      public static final uu.d a = new uu.d();

      private d() {
      }

      @Override
      public uu.f a(vd $$0) {
         if ($$0 instanceof ug $$1) {
            return new uu.b().a($$1);
         } else if ($$0 instanceof ue $$2) {
            return new uu.a($$2.i());
         } else if ($$0 instanceof ul $$3) {
            return new uu.e($$3.g());
         } else {
            return (uu.f)($$0 instanceof uo $$4 ? new uu.g($$4.f()) : new uu.c($$0));
         }
      }

      @Override
      public vd a() {
         return new um();
      }
   }

   static class e implements uu.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uu.f a(vd $$0) {
         if ($$0 instanceof ul $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new uu.b(this.a).a($$0);
         }
      }

      @Override
      public vd a() {
         return new uk(this.a.toIntArray());
      }
   }

   interface f {
      uu.f a(vd var1);

      default uu.f a(Iterable<vd> $$0) {
         uu.f $$1 = this;

         for (vd $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default uu.f a(Stream<vd> $$0) {
         return this.a($$0::iterator);
      }

      vd a();
   }

   static class g implements uu.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uu.f a(vd $$0) {
         if ($$0 instanceof uo $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new uu.b(this.a).a($$0);
         }
      }

      @Override
      public vd a() {
         return new un(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<vd, ug> {
      protected h() {
         super(uu.this);
      }

      protected ug a() {
         return new ug();
      }

      protected ug a(String $$0, vd $$1, ug $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<vd> a(ug $$0, vd $$1) {
         if ($$1 == null || $$1 == ui.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof ug $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            ug $$3 = $$2.h();

            for (Entry<String, vd> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
