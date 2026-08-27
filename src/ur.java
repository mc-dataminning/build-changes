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

public class ur implements DynamicOps<va> {
   public static final ur a = new ur();
   private static final String b = "";

   protected ur() {
   }

   public va a() {
      return uf.b;
   }

   public <U> U a(DynamicOps<U> $$0, va $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((ut)$$1).i());
         case 2:
            return (U)$$0.createShort(((ut)$$1).h());
         case 3:
            return (U)$$0.createInt(((ut)$$1).g());
         case 4:
            return (U)$$0.createLong(((ut)$$1).f());
         case 5:
            return (U)$$0.createFloat(((ut)$$1).k());
         case 6:
            return (U)$$0.createDouble(((ut)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((ua)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.s_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((uh)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((uk)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(va $$0) {
      return $$0 instanceof ut $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public va a(Number $$0) {
      return ue.a($$0.doubleValue());
   }

   public va a(byte $$0) {
      return ub.a($$0);
   }

   public va a(short $$0) {
      return uv.a($$0);
   }

   public va a(int $$0) {
      return ui.a($$0);
   }

   public va a(long $$0) {
      return ul.a($$0);
   }

   public va a(float $$0) {
      return ug.a($$0);
   }

   public va a(double $$0) {
      return ue.a($$0);
   }

   public va a(boolean $$0) {
      return ub.a($$0);
   }

   public DataResult<String> b(va $$0) {
      return $$0 instanceof uy $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public va a(String $$0) {
      return uy.a($$0);
   }

   public DataResult<va> a(va $$0, va $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<va> a(va $$0, List<va> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<va> a(va $$0, va $$1, va $$2) {
      if (!($$0 instanceof ud) && !($$0 instanceof uf)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof uy)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         ud $$3 = new ud();
         if ($$0 instanceof ud $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.s_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<va> a(va $$0, MapLike<va> $$1) {
      if (!($$0 instanceof ud) && !($$0 instanceof uf)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ud $$2 = new ud();
         if ($$0 instanceof ud $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<va> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            va $$3 = (va)$$2x.getFirst();
            if (!($$3 instanceof uy)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.s_(), (va)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<va, va>>> c(va $$0) {
      return $$0 instanceof ud $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<va, va>>> d(va $$0) {
      return $$0 instanceof ud $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<va>> e(va $$0) {
      return $$0 instanceof ud $$1 ? DataResult.success(new MapLike<va>() {
         @Nullable
         public va a(va $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public va a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<va, va>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(ur.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public va a(Stream<Pair<va, va>> $$0) {
      ud $$1 = new ud();
      $$0.forEach($$1x -> $$1.a(((va)$$1x.getFirst()).s_(), (va)$$1x.getSecond()));
      return $$1;
   }

   private static va a(ud $$0) {
      if ($$0.f() == 1) {
         va $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<va>> f(va $$0) {
      if ($$0 instanceof uj $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((ud)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof uc<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<va>>> g(va $$0) {
      if ($$0 instanceof uj $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((ud)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof uc<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(va $$0) {
      return $$0 instanceof ua $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public va a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new ua($$2);
   }

   public DataResult<IntStream> i(va $$0) {
      return $$0 instanceof uh $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public va a(IntStream $$0) {
      return new uh($$0.toArray());
   }

   public DataResult<LongStream> j(va $$0) {
      return $$0 instanceof uk $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public va a(LongStream $$0) {
      return new uk($$0.toArray());
   }

   public va b(Stream<va> $$0) {
      return ur.d.a.a($$0).a();
   }

   public va a(va $$0, String $$1) {
      if ($$0 instanceof ud $$2) {
         ud $$3 = new ud();
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

   public RecordBuilder<va> mapBuilder() {
      return new ur.h();
   }

   private static Optional<ur.f> k(va $$0) {
      if ($$0 instanceof uf) {
         return Optional.of(ur.d.a);
      } else {
         if ($$0 instanceof uc<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(ur.d.a);
            }

            if ($$1 instanceof uj $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(ur.d.a);
                  case 10 -> Optional.of(new ur.b($$2));
                  default -> Optional.of(new ur.c($$2));
               };
            }

            if ($$1 instanceof ua $$3) {
               return Optional.of(new ur.a($$3.e()));
            }

            if ($$1 instanceof uh $$4) {
               return Optional.of(new ur.e($$4.g()));
            }

            if ($$1 instanceof uk $$5) {
               return Optional.of(new ur.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements ur.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ur.f a(va $$0) {
         if ($$0 instanceof ub $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new ur.b(this.a).a($$0);
         }
      }

      @Override
      public va a() {
         return new ua(this.a.toByteArray());
      }
   }

   static class b implements ur.f {
      private final uj a = new uj();

      public b() {
      }

      public b(Collection<va> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ui.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ub.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ul.a($$0x))));
      }

      private static boolean a(ud $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static va b(va $$0) {
         if ($$0 instanceof ud $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static ud c(va $$0) {
         ud $$1 = new ud();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public ur.f a(va $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public va a() {
         return this.a;
      }
   }

   static class c implements ur.f {
      private final uj a = new uj();

      c(va $$0) {
         this.a.add($$0);
      }

      c(uj $$0) {
         this.a.addAll($$0);
      }

      @Override
      public ur.f a(va $$0) {
         if ($$0.b() != this.a.f()) {
            return new ur.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public va a() {
         return this.a;
      }
   }

   static class d implements ur.f {
      public static final ur.d a = new ur.d();

      private d() {
      }

      @Override
      public ur.f a(va $$0) {
         if ($$0 instanceof ud $$1) {
            return new ur.b().a($$1);
         } else if ($$0 instanceof ub $$2) {
            return new ur.a($$2.i());
         } else if ($$0 instanceof ui $$3) {
            return new ur.e($$3.g());
         } else {
            return (ur.f)($$0 instanceof ul $$4 ? new ur.g($$4.f()) : new ur.c($$0));
         }
      }

      @Override
      public va a() {
         return new uj();
      }
   }

   static class e implements ur.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ur.f a(va $$0) {
         if ($$0 instanceof ui $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new ur.b(this.a).a($$0);
         }
      }

      @Override
      public va a() {
         return new uh(this.a.toIntArray());
      }
   }

   interface f {
      ur.f a(va var1);

      default ur.f a(Iterable<va> $$0) {
         ur.f $$1 = this;

         for (va $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default ur.f a(Stream<va> $$0) {
         return this.a($$0::iterator);
      }

      va a();
   }

   static class g implements ur.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ur.f a(va $$0) {
         if ($$0 instanceof ul $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new ur.b(this.a).a($$0);
         }
      }

      @Override
      public va a() {
         return new uk(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<va, ud> {
      protected h() {
         super(ur.this);
      }

      protected ud a() {
         return new ud();
      }

      protected ud a(String $$0, va $$1, ud $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<va> a(ud $$0, va $$1) {
         if ($$1 == null || $$1 == uf.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof ud $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            ud $$3 = new ud(Maps.newHashMap($$2.i()));

            for (Entry<String, va> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
