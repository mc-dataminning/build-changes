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

public class ut implements DynamicOps<vc> {
   public static final ut a = new ut();
   private static final String b = "";

   protected ut() {
   }

   public vc a() {
      return uh.b;
   }

   public <U> U a(DynamicOps<U> $$0, vc $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((uv)$$1).i());
         case 2 -> (Object)$$0.createShort(((uv)$$1).h());
         case 3 -> (Object)$$0.createInt(((uv)$$1).g());
         case 4 -> (Object)$$0.createLong(((uv)$$1).f());
         case 5 -> (Object)$$0.createFloat(((uv)$$1).k());
         case 6 -> (Object)$$0.createDouble(((uv)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((uc)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.r_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((uj)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((um)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(vc $$0) {
      return $$0 instanceof uv $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public vc a(Number $$0) {
      return ug.a($$0.doubleValue());
   }

   public vc a(byte $$0) {
      return ud.a($$0);
   }

   public vc a(short $$0) {
      return ux.a($$0);
   }

   public vc a(int $$0) {
      return uk.a($$0);
   }

   public vc a(long $$0) {
      return un.a($$0);
   }

   public vc a(float $$0) {
      return ui.a($$0);
   }

   public vc a(double $$0) {
      return ug.a($$0);
   }

   public vc a(boolean $$0) {
      return ud.a($$0);
   }

   public DataResult<String> b(vc $$0) {
      return $$0 instanceof va $$1 ? DataResult.success($$1.r_()) : DataResult.error(() -> "Not a string");
   }

   public vc a(String $$0) {
      return va.a($$0);
   }

   public DataResult<vc> a(vc $$0, vc $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vc> a(vc $$0, List<vc> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vc> a(vc $$0, vc $$1, vc $$2) {
      if (!($$0 instanceof uf) && !($$0 instanceof uh)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof va)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         uf $$4 = $$0 instanceof uf $$3 ? $$3.h() : new uf();
         $$4.a($$1.r_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<vc> a(vc $$0, MapLike<vc> $$1) {
      if (!($$0 instanceof uf) && !($$0 instanceof uh)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         uf $$3 = $$0 instanceof uf $$2 ? $$2.h() : new uf();
         List<vc> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            vc $$3x = (vc)$$2x.getFirst();
            if (!($$3x instanceof va)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.r_(), (vc)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<vc> a(vc $$0, Map<vc, vc> $$1) {
      if (!($$0 instanceof uf) && !($$0 instanceof uh)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         uf $$3 = $$0 instanceof uf $$2 ? $$2.h() : new uf();
         List<vc> $$4 = new ArrayList<>();

         for (Entry<vc, vc> $$5 : $$1.entrySet()) {
            vc $$6 = $$5.getKey();
            if ($$6 instanceof va) {
               $$3.a($$6.r_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<vc, vc>>> c(vc $$0) {
      return $$0 instanceof uf $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (vc)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<vc, vc>>> d(vc $$0) {
      return $$0 instanceof uf $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, vc> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<vc>> e(vc $$0) {
      return $$0 instanceof uf $$1 ? DataResult.success(new MapLike<vc>() {
         @Nullable
         public vc a(vc $$0) {
            return $$1.c($$0.r_());
         }

         @Nullable
         public vc a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<vc, vc>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(ut.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public vc a(Stream<Pair<vc, vc>> $$0) {
      uf $$1 = new uf();
      $$0.forEach($$1x -> $$1.a(((vc)$$1x.getFirst()).r_(), (vc)$$1x.getSecond()));
      return $$1;
   }

   private static vc a(uf $$0) {
      if ($$0.f() == 1) {
         vc $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<vc>> f(vc $$0) {
      if ($$0 instanceof ul $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((uf)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof ue<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<vc>>> g(vc $$0) {
      if ($$0 instanceof ul $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (vc $$2x : $$1) {
               $$1x.accept(a((uf)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof ue<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(vc $$0) {
      return $$0 instanceof uc $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public vc a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new uc($$2);
   }

   public DataResult<IntStream> i(vc $$0) {
      return $$0 instanceof uj $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public vc a(IntStream $$0) {
      return new uj($$0.toArray());
   }

   public DataResult<LongStream> j(vc $$0) {
      return $$0 instanceof um $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public vc a(LongStream $$0) {
      return new um($$0.toArray());
   }

   public vc b(Stream<vc> $$0) {
      return ut.d.a.a($$0).a();
   }

   public vc a(vc $$0, String $$1) {
      if ($$0 instanceof uf $$2) {
         uf $$3 = $$2.h();
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

   public RecordBuilder<vc> mapBuilder() {
      return new ut.h();
   }

   private static Optional<ut.f> k(vc $$0) {
      if ($$0 instanceof uh) {
         return Optional.of(ut.d.a);
      } else {
         if ($$0 instanceof ue<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(ut.d.a);
            }

            if ($$1 instanceof ul $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(ut.d.a);
                  case 10 -> Optional.of(new ut.b($$2));
                  default -> Optional.of(new ut.c($$2));
               };
            }

            if ($$1 instanceof uc $$3) {
               return Optional.of(new ut.a($$3.e()));
            }

            if ($$1 instanceof uj $$4) {
               return Optional.of(new ut.e($$4.g()));
            }

            if ($$1 instanceof um $$5) {
               return Optional.of(new ut.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements ut.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ut.f a(vc $$0) {
         if ($$0 instanceof ud $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new ut.b(this.a).a($$0);
         }
      }

      @Override
      public vc a() {
         return new uc(this.a.toByteArray());
      }
   }

   static class b implements ut.f {
      private final ul a = new ul();

      public b() {
      }

      public b(Collection<vc> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uk.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ud.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(un.a($$0x))));
      }

      private static boolean a(uf $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static vc b(vc $$0) {
         if ($$0 instanceof uf $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static uf c(vc $$0) {
         uf $$1 = new uf();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public ut.f a(vc $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public vc a() {
         return this.a;
      }
   }

   static class c implements ut.f {
      private final ul a = new ul();

      c(vc $$0) {
         this.a.add($$0);
      }

      c(ul $$0) {
         this.a.addAll($$0);
      }

      @Override
      public ut.f a(vc $$0) {
         if ($$0.b() != this.a.f()) {
            return new ut.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public vc a() {
         return this.a;
      }
   }

   static class d implements ut.f {
      public static final ut.d a = new ut.d();

      private d() {
      }

      @Override
      public ut.f a(vc $$0) {
         if ($$0 instanceof uf $$1) {
            return new ut.b().a($$1);
         } else if ($$0 instanceof ud $$2) {
            return new ut.a($$2.i());
         } else if ($$0 instanceof uk $$3) {
            return new ut.e($$3.g());
         } else {
            return (ut.f)($$0 instanceof un $$4 ? new ut.g($$4.f()) : new ut.c($$0));
         }
      }

      @Override
      public vc a() {
         return new ul();
      }
   }

   static class e implements ut.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ut.f a(vc $$0) {
         if ($$0 instanceof uk $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new ut.b(this.a).a($$0);
         }
      }

      @Override
      public vc a() {
         return new uj(this.a.toIntArray());
      }
   }

   interface f {
      ut.f a(vc var1);

      default ut.f a(Iterable<vc> $$0) {
         ut.f $$1 = this;

         for (vc $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default ut.f a(Stream<vc> $$0) {
         return this.a($$0::iterator);
      }

      vc a();
   }

   static class g implements ut.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ut.f a(vc $$0) {
         if ($$0 instanceof un $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new ut.b(this.a).a($$0);
         }
      }

      @Override
      public vc a() {
         return new um(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<vc, uf> {
      protected h() {
         super(ut.this);
      }

      protected uf a() {
         return new uf();
      }

      protected uf a(String $$0, vc $$1, uf $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<vc> a(uf $$0, vc $$1) {
         if ($$1 == null || $$1 == uh.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof uf $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            uf $$3 = $$2.h();

            for (Entry<String, vc> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
