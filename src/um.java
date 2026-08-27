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

public class um implements DynamicOps<uv> {
   public static final um a = new um();
   private static final String b = "";

   protected um() {
   }

   public uv a() {
      return ua.b;
   }

   public <U> U a(DynamicOps<U> $$0, uv $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((uo)$$1).i());
         case 2:
            return (U)$$0.createShort(((uo)$$1).h());
         case 3:
            return (U)$$0.createInt(((uo)$$1).g());
         case 4:
            return (U)$$0.createLong(((uo)$$1).f());
         case 5:
            return (U)$$0.createFloat(((uo)$$1).k());
         case 6:
            return (U)$$0.createDouble(((uo)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((tv)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.s_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((uc)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((uf)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(uv $$0) {
      return $$0 instanceof uo $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public uv a(Number $$0) {
      return tz.a($$0.doubleValue());
   }

   public uv a(byte $$0) {
      return tw.a($$0);
   }

   public uv a(short $$0) {
      return uq.a($$0);
   }

   public uv a(int $$0) {
      return ud.a($$0);
   }

   public uv a(long $$0) {
      return ug.a($$0);
   }

   public uv a(float $$0) {
      return ub.a($$0);
   }

   public uv a(double $$0) {
      return tz.a($$0);
   }

   public uv a(boolean $$0) {
      return tw.a($$0);
   }

   public DataResult<String> b(uv $$0) {
      return $$0 instanceof ut $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public uv a(String $$0) {
      return ut.a($$0);
   }

   public DataResult<uv> a(uv $$0, uv $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<uv> a(uv $$0, List<uv> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<uv> a(uv $$0, uv $$1, uv $$2) {
      if (!($$0 instanceof ty) && !($$0 instanceof ua)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof ut)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         ty $$3 = new ty();
         if ($$0 instanceof ty $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.s_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<uv> a(uv $$0, MapLike<uv> $$1) {
      if (!($$0 instanceof ty) && !($$0 instanceof ua)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ty $$2 = new ty();
         if ($$0 instanceof ty $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<uv> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            uv $$3 = (uv)$$2x.getFirst();
            if (!($$3 instanceof ut)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.s_(), (uv)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<uv, uv>>> c(uv $$0) {
      return $$0 instanceof ty $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<uv, uv>>> d(uv $$0) {
      return $$0 instanceof ty $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<uv>> e(uv $$0) {
      return $$0 instanceof ty $$1 ? DataResult.success(new MapLike<uv>() {
         @Nullable
         public uv a(uv $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public uv a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<uv, uv>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(um.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public uv a(Stream<Pair<uv, uv>> $$0) {
      ty $$1 = new ty();
      $$0.forEach($$1x -> $$1.a(((uv)$$1x.getFirst()).s_(), (uv)$$1x.getSecond()));
      return $$1;
   }

   private static uv a(ty $$0) {
      if ($$0.f() == 1) {
         uv $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<uv>> f(uv $$0) {
      if ($$0 instanceof ue $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((ty)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof tx<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<uv>>> g(uv $$0) {
      if ($$0 instanceof ue $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((ty)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof tx<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(uv $$0) {
      return $$0 instanceof tv $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public uv a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new tv($$2);
   }

   public DataResult<IntStream> i(uv $$0) {
      return $$0 instanceof uc $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public uv a(IntStream $$0) {
      return new uc($$0.toArray());
   }

   public DataResult<LongStream> j(uv $$0) {
      return $$0 instanceof uf $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public uv a(LongStream $$0) {
      return new uf($$0.toArray());
   }

   public uv b(Stream<uv> $$0) {
      return um.d.a.a($$0).a();
   }

   public uv a(uv $$0, String $$1) {
      if ($$0 instanceof ty $$2) {
         ty $$3 = new ty();
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

   public RecordBuilder<uv> mapBuilder() {
      return new um.h();
   }

   private static Optional<um.f> k(uv $$0) {
      if ($$0 instanceof ua) {
         return Optional.of(um.d.a);
      } else {
         if ($$0 instanceof tx<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(um.d.a);
            }

            if ($$1 instanceof ue $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(um.d.a);
                  case 10 -> Optional.of(new um.b($$2));
                  default -> Optional.of(new um.c($$2));
               };
            }

            if ($$1 instanceof tv $$3) {
               return Optional.of(new um.a($$3.e()));
            }

            if ($$1 instanceof uc $$4) {
               return Optional.of(new um.e($$4.g()));
            }

            if ($$1 instanceof uf $$5) {
               return Optional.of(new um.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements um.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public um.f a(uv $$0) {
         if ($$0 instanceof tw $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new um.b(this.a).a($$0);
         }
      }

      @Override
      public uv a() {
         return new tv(this.a.toByteArray());
      }
   }

   static class b implements um.f {
      private final ue a = new ue();

      public b() {
      }

      public b(Collection<uv> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ud.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tw.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ug.a($$0x))));
      }

      private static boolean a(ty $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static uv b(uv $$0) {
         if ($$0 instanceof ty $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static ty c(uv $$0) {
         ty $$1 = new ty();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public um.f a(uv $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public uv a() {
         return this.a;
      }
   }

   static class c implements um.f {
      private final ue a = new ue();

      c(uv $$0) {
         this.a.add($$0);
      }

      c(ue $$0) {
         this.a.addAll($$0);
      }

      @Override
      public um.f a(uv $$0) {
         if ($$0.b() != this.a.f()) {
            return new um.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public uv a() {
         return this.a;
      }
   }

   static class d implements um.f {
      public static final um.d a = new um.d();

      private d() {
      }

      @Override
      public um.f a(uv $$0) {
         if ($$0 instanceof ty $$1) {
            return new um.b().a($$1);
         } else if ($$0 instanceof tw $$2) {
            return new um.a($$2.i());
         } else if ($$0 instanceof ud $$3) {
            return new um.e($$3.g());
         } else {
            return (um.f)($$0 instanceof ug $$4 ? new um.g($$4.f()) : new um.c($$0));
         }
      }

      @Override
      public uv a() {
         return new ue();
      }
   }

   static class e implements um.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public um.f a(uv $$0) {
         if ($$0 instanceof ud $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new um.b(this.a).a($$0);
         }
      }

      @Override
      public uv a() {
         return new uc(this.a.toIntArray());
      }
   }

   interface f {
      um.f a(uv var1);

      default um.f a(Iterable<uv> $$0) {
         um.f $$1 = this;

         for (uv $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default um.f a(Stream<uv> $$0) {
         return this.a($$0::iterator);
      }

      uv a();
   }

   static class g implements um.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public um.f a(uv $$0) {
         if ($$0 instanceof ug $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new um.b(this.a).a($$0);
         }
      }

      @Override
      public uv a() {
         return new uf(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<uv, ty> {
      protected h() {
         super(um.this);
      }

      protected ty a() {
         return new ty();
      }

      protected ty a(String $$0, uv $$1, ty $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<uv> a(ty $$0, uv $$1) {
         if ($$1 == null || $$1 == ua.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof ty $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            ty $$3 = new ty(Maps.newHashMap($$2.i()));

            for (Entry<String, uv> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
