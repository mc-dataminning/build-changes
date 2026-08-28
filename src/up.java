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

public class up implements DynamicOps<uy> {
   public static final up a = new up();
   private static final String b = "";

   protected up() {
   }

   public uy a() {
      return ud.b;
   }

   public <U> U a(DynamicOps<U> $$0, uy $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((ur)$$1).i());
         case 2 -> (Object)$$0.createShort(((ur)$$1).h());
         case 3 -> (Object)$$0.createInt(((ur)$$1).g());
         case 4 -> (Object)$$0.createLong(((ur)$$1).f());
         case 5 -> (Object)$$0.createFloat(((ur)$$1).k());
         case 6 -> (Object)$$0.createDouble(((ur)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((ty)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.s_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((uf)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((ui)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(uy $$0) {
      return $$0 instanceof ur $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public uy a(Number $$0) {
      return uc.a($$0.doubleValue());
   }

   public uy a(byte $$0) {
      return tz.a($$0);
   }

   public uy a(short $$0) {
      return ut.a($$0);
   }

   public uy a(int $$0) {
      return ug.a($$0);
   }

   public uy a(long $$0) {
      return uj.a($$0);
   }

   public uy a(float $$0) {
      return ue.a($$0);
   }

   public uy a(double $$0) {
      return uc.a($$0);
   }

   public uy a(boolean $$0) {
      return tz.a($$0);
   }

   public DataResult<String> b(uy $$0) {
      return $$0 instanceof uw $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public uy a(String $$0) {
      return uw.a($$0);
   }

   public DataResult<uy> a(uy $$0, uy $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<uy> a(uy $$0, List<uy> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<uy> a(uy $$0, uy $$1, uy $$2) {
      if (!($$0 instanceof ub) && !($$0 instanceof ud)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof uw)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         ub $$4 = $$0 instanceof ub $$3 ? $$3.h() : new ub();
         $$4.a($$1.s_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<uy> a(uy $$0, MapLike<uy> $$1) {
      if (!($$0 instanceof ub) && !($$0 instanceof ud)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ub $$3 = $$0 instanceof ub $$2 ? $$2.h() : new ub();
         List<uy> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            uy $$3x = (uy)$$2x.getFirst();
            if (!($$3x instanceof uw)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.s_(), (uy)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<uy> a(uy $$0, Map<uy, uy> $$1) {
      if (!($$0 instanceof ub) && !($$0 instanceof ud)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ub $$3 = $$0 instanceof ub $$2 ? $$2.h() : new ub();
         List<uy> $$4 = new ArrayList<>();

         for (Entry<uy, uy> $$5 : $$1.entrySet()) {
            uy $$6 = $$5.getKey();
            if ($$6 instanceof uw) {
               $$3.a($$6.s_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<uy, uy>>> c(uy $$0) {
      return $$0 instanceof ub $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (uy)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<uy, uy>>> d(uy $$0) {
      return $$0 instanceof ub $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, uy> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<uy>> e(uy $$0) {
      return $$0 instanceof ub $$1 ? DataResult.success(new MapLike<uy>() {
         @Nullable
         public uy a(uy $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public uy a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<uy, uy>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(up.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public uy a(Stream<Pair<uy, uy>> $$0) {
      ub $$1 = new ub();
      $$0.forEach($$1x -> $$1.a(((uy)$$1x.getFirst()).s_(), (uy)$$1x.getSecond()));
      return $$1;
   }

   private static uy a(ub $$0) {
      if ($$0.f() == 1) {
         uy $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<uy>> f(uy $$0) {
      if ($$0 instanceof uh $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((ub)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof ua<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<uy>>> g(uy $$0) {
      if ($$0 instanceof uh $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (uy $$2x : $$1) {
               $$1x.accept(a((ub)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof ua<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(uy $$0) {
      return $$0 instanceof ty $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public uy a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new ty($$2);
   }

   public DataResult<IntStream> i(uy $$0) {
      return $$0 instanceof uf $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public uy a(IntStream $$0) {
      return new uf($$0.toArray());
   }

   public DataResult<LongStream> j(uy $$0) {
      return $$0 instanceof ui $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public uy a(LongStream $$0) {
      return new ui($$0.toArray());
   }

   public uy b(Stream<uy> $$0) {
      return up.d.a.a($$0).a();
   }

   public uy a(uy $$0, String $$1) {
      if ($$0 instanceof ub $$2) {
         ub $$3 = $$2.h();
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

   public RecordBuilder<uy> mapBuilder() {
      return new up.h();
   }

   private static Optional<up.f> k(uy $$0) {
      if ($$0 instanceof ud) {
         return Optional.of(up.d.a);
      } else {
         if ($$0 instanceof ua<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(up.d.a);
            }

            if ($$1 instanceof uh $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(up.d.a);
                  case 10 -> Optional.of(new up.b($$2));
                  default -> Optional.of(new up.c($$2));
               };
            }

            if ($$1 instanceof ty $$3) {
               return Optional.of(new up.a($$3.e()));
            }

            if ($$1 instanceof uf $$4) {
               return Optional.of(new up.e($$4.g()));
            }

            if ($$1 instanceof ui $$5) {
               return Optional.of(new up.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements up.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public up.f a(uy $$0) {
         if ($$0 instanceof tz $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new up.b(this.a).a($$0);
         }
      }

      @Override
      public uy a() {
         return new ty(this.a.toByteArray());
      }
   }

   static class b implements up.f {
      private final uh a = new uh();

      public b() {
      }

      public b(Collection<uy> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ug.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tz.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uj.a($$0x))));
      }

      private static boolean a(ub $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static uy b(uy $$0) {
         if ($$0 instanceof ub $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static ub c(uy $$0) {
         ub $$1 = new ub();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public up.f a(uy $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public uy a() {
         return this.a;
      }
   }

   static class c implements up.f {
      private final uh a = new uh();

      c(uy $$0) {
         this.a.add($$0);
      }

      c(uh $$0) {
         this.a.addAll($$0);
      }

      @Override
      public up.f a(uy $$0) {
         if ($$0.b() != this.a.f()) {
            return new up.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public uy a() {
         return this.a;
      }
   }

   static class d implements up.f {
      public static final up.d a = new up.d();

      private d() {
      }

      @Override
      public up.f a(uy $$0) {
         if ($$0 instanceof ub $$1) {
            return new up.b().a($$1);
         } else if ($$0 instanceof tz $$2) {
            return new up.a($$2.i());
         } else if ($$0 instanceof ug $$3) {
            return new up.e($$3.g());
         } else {
            return (up.f)($$0 instanceof uj $$4 ? new up.g($$4.f()) : new up.c($$0));
         }
      }

      @Override
      public uy a() {
         return new uh();
      }
   }

   static class e implements up.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public up.f a(uy $$0) {
         if ($$0 instanceof ug $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new up.b(this.a).a($$0);
         }
      }

      @Override
      public uy a() {
         return new uf(this.a.toIntArray());
      }
   }

   interface f {
      up.f a(uy var1);

      default up.f a(Iterable<uy> $$0) {
         up.f $$1 = this;

         for (uy $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default up.f a(Stream<uy> $$0) {
         return this.a($$0::iterator);
      }

      uy a();
   }

   static class g implements up.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public up.f a(uy $$0) {
         if ($$0 instanceof uj $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new up.b(this.a).a($$0);
         }
      }

      @Override
      public uy a() {
         return new ui(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<uy, ub> {
      protected h() {
         super(up.this);
      }

      protected ub a() {
         return new ub();
      }

      protected ub a(String $$0, uy $$1, ub $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<uy> a(ub $$0, uy $$1) {
         if ($$1 == null || $$1 == ud.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof ub $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            ub $$3 = $$2.h();

            for (Entry<String, uy> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
