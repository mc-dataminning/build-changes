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

public class uo implements DynamicOps<ux> {
   public static final uo a = new uo();
   private static final String b = "";

   protected uo() {
   }

   public ux a() {
      return uc.b;
   }

   public <U> U a(DynamicOps<U> $$0, ux $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((uq)$$1).i());
         case 2 -> (Object)$$0.createShort(((uq)$$1).h());
         case 3 -> (Object)$$0.createInt(((uq)$$1).g());
         case 4 -> (Object)$$0.createLong(((uq)$$1).f());
         case 5 -> (Object)$$0.createFloat(((uq)$$1).k());
         case 6 -> (Object)$$0.createDouble(((uq)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((tx)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.s_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((ue)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((uh)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(ux $$0) {
      return $$0 instanceof uq $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public ux a(Number $$0) {
      return ub.a($$0.doubleValue());
   }

   public ux a(byte $$0) {
      return ty.a($$0);
   }

   public ux a(short $$0) {
      return us.a($$0);
   }

   public ux a(int $$0) {
      return uf.a($$0);
   }

   public ux a(long $$0) {
      return ui.a($$0);
   }

   public ux a(float $$0) {
      return ud.a($$0);
   }

   public ux a(double $$0) {
      return ub.a($$0);
   }

   public ux a(boolean $$0) {
      return ty.a($$0);
   }

   public DataResult<String> b(ux $$0) {
      return $$0 instanceof uv $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public ux a(String $$0) {
      return uv.a($$0);
   }

   public DataResult<ux> a(ux $$0, ux $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<ux> a(ux $$0, List<ux> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<ux> a(ux $$0, ux $$1, ux $$2) {
      if (!($$0 instanceof ua) && !($$0 instanceof uc)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof uv)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         ua $$4 = $$0 instanceof ua $$3 ? $$3.h() : new ua();
         $$4.a($$1.s_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<ux> a(ux $$0, MapLike<ux> $$1) {
      if (!($$0 instanceof ua) && !($$0 instanceof uc)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ua $$3 = $$0 instanceof ua $$2 ? $$2.h() : new ua();
         List<ux> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            ux $$3x = (ux)$$2x.getFirst();
            if (!($$3x instanceof uv)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.s_(), (ux)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<ux> a(ux $$0, Map<ux, ux> $$1) {
      if (!($$0 instanceof ua) && !($$0 instanceof uc)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ua $$3 = $$0 instanceof ua $$2 ? $$2.h() : new ua();
         List<ux> $$4 = new ArrayList<>();

         for (Entry<ux, ux> $$5 : $$1.entrySet()) {
            ux $$6 = $$5.getKey();
            if ($$6 instanceof uv) {
               $$3.a($$6.s_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<ux, ux>>> c(ux $$0) {
      return $$0 instanceof ua $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (ux)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<ux, ux>>> d(ux $$0) {
      return $$0 instanceof ua $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, ux> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<ux>> e(ux $$0) {
      return $$0 instanceof ua $$1 ? DataResult.success(new MapLike<ux>() {
         @Nullable
         public ux a(ux $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public ux a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<ux, ux>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(uo.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public ux a(Stream<Pair<ux, ux>> $$0) {
      ua $$1 = new ua();
      $$0.forEach($$1x -> $$1.a(((ux)$$1x.getFirst()).s_(), (ux)$$1x.getSecond()));
      return $$1;
   }

   private static ux a(ua $$0) {
      if ($$0.f() == 1) {
         ux $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<ux>> f(ux $$0) {
      if ($$0 instanceof ug $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((ua)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof tz<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<ux>>> g(ux $$0) {
      if ($$0 instanceof ug $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (ux $$2x : $$1) {
               $$1x.accept(a((ua)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof tz<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(ux $$0) {
      return $$0 instanceof tx $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public ux a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new tx($$2);
   }

   public DataResult<IntStream> i(ux $$0) {
      return $$0 instanceof ue $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public ux a(IntStream $$0) {
      return new ue($$0.toArray());
   }

   public DataResult<LongStream> j(ux $$0) {
      return $$0 instanceof uh $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public ux a(LongStream $$0) {
      return new uh($$0.toArray());
   }

   public ux b(Stream<ux> $$0) {
      return uo.d.a.a($$0).a();
   }

   public ux a(ux $$0, String $$1) {
      if ($$0 instanceof ua $$2) {
         ua $$3 = $$2.h();
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

   public RecordBuilder<ux> mapBuilder() {
      return new uo.h();
   }

   private static Optional<uo.f> k(ux $$0) {
      if ($$0 instanceof uc) {
         return Optional.of(uo.d.a);
      } else {
         if ($$0 instanceof tz<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(uo.d.a);
            }

            if ($$1 instanceof ug $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(uo.d.a);
                  case 10 -> Optional.of(new uo.b($$2));
                  default -> Optional.of(new uo.c($$2));
               };
            }

            if ($$1 instanceof tx $$3) {
               return Optional.of(new uo.a($$3.e()));
            }

            if ($$1 instanceof ue $$4) {
               return Optional.of(new uo.e($$4.g()));
            }

            if ($$1 instanceof uh $$5) {
               return Optional.of(new uo.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements uo.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uo.f a(ux $$0) {
         if ($$0 instanceof ty $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new uo.b(this.a).a($$0);
         }
      }

      @Override
      public ux a() {
         return new tx(this.a.toByteArray());
      }
   }

   static class b implements uo.f {
      private final ug a = new ug();

      public b() {
      }

      public b(Collection<ux> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(uf.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ty.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ui.a($$0x))));
      }

      private static boolean a(ua $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static ux b(ux $$0) {
         if ($$0 instanceof ua $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static ua c(ux $$0) {
         ua $$1 = new ua();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public uo.f a(ux $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public ux a() {
         return this.a;
      }
   }

   static class c implements uo.f {
      private final ug a = new ug();

      c(ux $$0) {
         this.a.add($$0);
      }

      c(ug $$0) {
         this.a.addAll($$0);
      }

      @Override
      public uo.f a(ux $$0) {
         if ($$0.b() != this.a.f()) {
            return new uo.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public ux a() {
         return this.a;
      }
   }

   static class d implements uo.f {
      public static final uo.d a = new uo.d();

      private d() {
      }

      @Override
      public uo.f a(ux $$0) {
         if ($$0 instanceof ua $$1) {
            return new uo.b().a($$1);
         } else if ($$0 instanceof ty $$2) {
            return new uo.a($$2.i());
         } else if ($$0 instanceof uf $$3) {
            return new uo.e($$3.g());
         } else {
            return (uo.f)($$0 instanceof ui $$4 ? new uo.g($$4.f()) : new uo.c($$0));
         }
      }

      @Override
      public ux a() {
         return new ug();
      }
   }

   static class e implements uo.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uo.f a(ux $$0) {
         if ($$0 instanceof uf $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new uo.b(this.a).a($$0);
         }
      }

      @Override
      public ux a() {
         return new ue(this.a.toIntArray());
      }
   }

   interface f {
      uo.f a(ux var1);

      default uo.f a(Iterable<ux> $$0) {
         uo.f $$1 = this;

         for (ux $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default uo.f a(Stream<ux> $$0) {
         return this.a($$0::iterator);
      }

      ux a();
   }

   static class g implements uo.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uo.f a(ux $$0) {
         if ($$0 instanceof ui $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new uo.b(this.a).a($$0);
         }
      }

      @Override
      public ux a() {
         return new uh(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<ux, ua> {
      protected h() {
         super(uo.this);
      }

      protected ua a() {
         return new ua();
      }

      protected ua a(String $$0, ux $$1, ua $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<ux> a(ua $$0, ux $$1) {
         if ($$1 == null || $$1 == uc.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof ua $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            ua $$3 = $$2.h();

            for (Entry<String, ux> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
