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

public class vl implements DynamicOps<vu> {
   public static final vl a = new vl();
   private static final String b = "";

   protected vl() {
   }

   public vu a() {
      return uz.b;
   }

   public <U> U a(DynamicOps<U> $$0, vu $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((vn)$$1).i());
         case 2 -> (Object)$$0.createShort(((vn)$$1).h());
         case 3 -> (Object)$$0.createInt(((vn)$$1).g());
         case 4 -> (Object)$$0.createLong(((vn)$$1).f());
         case 5 -> (Object)$$0.createFloat(((vn)$$1).k());
         case 6 -> (Object)$$0.createDouble(((vn)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((uu)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.u_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((vb)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((ve)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(vu $$0) {
      return $$0 instanceof vn $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public vu a(Number $$0) {
      return uy.a($$0.doubleValue());
   }

   public vu a(byte $$0) {
      return uv.a($$0);
   }

   public vu a(short $$0) {
      return vp.a($$0);
   }

   public vu a(int $$0) {
      return vc.a($$0);
   }

   public vu a(long $$0) {
      return vf.a($$0);
   }

   public vu a(float $$0) {
      return va.a($$0);
   }

   public vu a(double $$0) {
      return uy.a($$0);
   }

   public vu a(boolean $$0) {
      return uv.a($$0);
   }

   public DataResult<String> b(vu $$0) {
      return $$0 instanceof vs $$1 ? DataResult.success($$1.u_()) : DataResult.error(() -> "Not a string");
   }

   public vu a(String $$0) {
      return vs.a($$0);
   }

   public DataResult<vu> a(vu $$0, vu $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vu> a(vu $$0, List<vu> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vu> a(vu $$0, vu $$1, vu $$2) {
      if (!($$0 instanceof ux) && !($$0 instanceof uz)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof vs)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         ux $$4 = $$0 instanceof ux $$3 ? $$3.h() : new ux();
         $$4.a($$1.u_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<vu> a(vu $$0, MapLike<vu> $$1) {
      if (!($$0 instanceof ux) && !($$0 instanceof uz)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ux $$3 = $$0 instanceof ux $$2 ? $$2.h() : new ux();
         List<vu> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            vu $$3x = (vu)$$2x.getFirst();
            if (!($$3x instanceof vs)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.u_(), (vu)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<vu> a(vu $$0, Map<vu, vu> $$1) {
      if (!($$0 instanceof ux) && !($$0 instanceof uz)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ux $$3 = $$0 instanceof ux $$2 ? $$2.h() : new ux();
         List<vu> $$4 = new ArrayList<>();

         for (Entry<vu, vu> $$5 : $$1.entrySet()) {
            vu $$6 = $$5.getKey();
            if ($$6 instanceof vs) {
               $$3.a($$6.u_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<vu, vu>>> c(vu $$0) {
      return $$0 instanceof ux $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (vu)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<vu, vu>>> d(vu $$0) {
      return $$0 instanceof ux $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, vu> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<vu>> e(vu $$0) {
      return $$0 instanceof ux $$1 ? DataResult.success(new MapLike<vu>() {
         @Nullable
         public vu a(vu $$0) {
            return $$1.c($$0.u_());
         }

         @Nullable
         public vu a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<vu, vu>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(vl.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public vu a(Stream<Pair<vu, vu>> $$0) {
      ux $$1 = new ux();
      $$0.forEach($$1x -> $$1.a(((vu)$$1x.getFirst()).u_(), (vu)$$1x.getSecond()));
      return $$1;
   }

   private static vu a(ux $$0) {
      if ($$0.f() == 1) {
         vu $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<vu>> f(vu $$0) {
      if ($$0 instanceof vd $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((ux)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof uw<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<vu>>> g(vu $$0) {
      if ($$0 instanceof vd $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (vu $$2x : $$1) {
               $$1x.accept(a((ux)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof uw<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(vu $$0) {
      return $$0 instanceof uu $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public vu a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new uu($$2);
   }

   public DataResult<IntStream> i(vu $$0) {
      return $$0 instanceof vb $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public vu a(IntStream $$0) {
      return new vb($$0.toArray());
   }

   public DataResult<LongStream> j(vu $$0) {
      return $$0 instanceof ve $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public vu a(LongStream $$0) {
      return new ve($$0.toArray());
   }

   public vu b(Stream<vu> $$0) {
      return vl.d.a.a($$0).a();
   }

   public vu a(vu $$0, String $$1) {
      if ($$0 instanceof ux $$2) {
         ux $$3 = $$2.h();
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

   public RecordBuilder<vu> mapBuilder() {
      return new vl.h();
   }

   private static Optional<vl.f> k(vu $$0) {
      if ($$0 instanceof uz) {
         return Optional.of(vl.d.a);
      } else {
         if ($$0 instanceof uw<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(vl.d.a);
            }

            if ($$1 instanceof vd $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(vl.d.a);
                  case 10 -> Optional.of(new vl.b($$2));
                  default -> Optional.of(new vl.c($$2));
               };
            }

            if ($$1 instanceof uu $$3) {
               return Optional.of(new vl.a($$3.e()));
            }

            if ($$1 instanceof vb $$4) {
               return Optional.of(new vl.e($$4.g()));
            }

            if ($$1 instanceof ve $$5) {
               return Optional.of(new vl.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements vl.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public vl.f a(vu $$0) {
         if ($$0 instanceof uv $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new vl.b(this.a).a($$0);
         }
      }

      @Override
      public vu a() {
         return new uu(this.a.toByteArray());
      }
   }

   static class b implements vl.f {
      private final vd a = new vd();

      public b() {
      }

      public b(Collection<vu> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(vc.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uv.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(vf.a($$0x))));
      }

      private static boolean a(ux $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static vu b(vu $$0) {
         if ($$0 instanceof ux $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static ux c(vu $$0) {
         ux $$1 = new ux();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public vl.f a(vu $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public vu a() {
         return this.a;
      }
   }

   static class c implements vl.f {
      private final vd a = new vd();

      c(vu $$0) {
         this.a.add($$0);
      }

      c(vd $$0) {
         this.a.addAll($$0);
      }

      @Override
      public vl.f a(vu $$0) {
         if ($$0.b() != this.a.f()) {
            return new vl.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public vu a() {
         return this.a;
      }
   }

   static class d implements vl.f {
      public static final vl.d a = new vl.d();

      private d() {
      }

      @Override
      public vl.f a(vu $$0) {
         if ($$0 instanceof ux $$1) {
            return new vl.b().a($$1);
         } else if ($$0 instanceof uv $$2) {
            return new vl.a($$2.i());
         } else if ($$0 instanceof vc $$3) {
            return new vl.e($$3.g());
         } else {
            return (vl.f)($$0 instanceof vf $$4 ? new vl.g($$4.f()) : new vl.c($$0));
         }
      }

      @Override
      public vu a() {
         return new vd();
      }
   }

   static class e implements vl.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public vl.f a(vu $$0) {
         if ($$0 instanceof vc $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new vl.b(this.a).a($$0);
         }
      }

      @Override
      public vu a() {
         return new vb(this.a.toIntArray());
      }
   }

   interface f {
      vl.f a(vu var1);

      default vl.f a(Iterable<vu> $$0) {
         vl.f $$1 = this;

         for (vu $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default vl.f a(Stream<vu> $$0) {
         return this.a($$0::iterator);
      }

      vu a();
   }

   static class g implements vl.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public vl.f a(vu $$0) {
         if ($$0 instanceof vf $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new vl.b(this.a).a($$0);
         }
      }

      @Override
      public vu a() {
         return new ve(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<vu, ux> {
      protected h() {
         super(vl.this);
      }

      protected ux a() {
         return new ux();
      }

      protected ux a(String $$0, vu $$1, ux $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<vu> a(ux $$0, vu $$1) {
         if ($$1 == null || $$1 == uz.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof ux $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            ux $$3 = $$2.h();

            for (Entry<String, vu> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
