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

public class ua implements DynamicOps<uj> {
   public static final ua a = new ua();
   private static final String b = "";

   protected ua() {
   }

   public uj a() {
      return to.b;
   }

   public <U> U a(DynamicOps<U> $$0, uj $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((uc)$$1).i());
         case 2:
            return (U)$$0.createShort(((uc)$$1).h());
         case 3:
            return (U)$$0.createInt(((uc)$$1).g());
         case 4:
            return (U)$$0.createLong(((uc)$$1).f());
         case 5:
            return (U)$$0.createFloat(((uc)$$1).k());
         case 6:
            return (U)$$0.createDouble(((uc)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((tj)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.s_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((tq)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((tt)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(uj $$0) {
      return $$0 instanceof uc $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public uj a(Number $$0) {
      return tn.a($$0.doubleValue());
   }

   public uj a(byte $$0) {
      return tk.a($$0);
   }

   public uj a(short $$0) {
      return ue.a($$0);
   }

   public uj a(int $$0) {
      return tr.a($$0);
   }

   public uj a(long $$0) {
      return tu.a($$0);
   }

   public uj a(float $$0) {
      return tp.a($$0);
   }

   public uj a(double $$0) {
      return tn.a($$0);
   }

   public uj a(boolean $$0) {
      return tk.a($$0);
   }

   public DataResult<String> b(uj $$0) {
      return $$0 instanceof uh $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public uj a(String $$0) {
      return uh.a($$0);
   }

   public DataResult<uj> a(uj $$0, uj $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<uj> a(uj $$0, List<uj> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<uj> a(uj $$0, uj $$1, uj $$2) {
      if (!($$0 instanceof tm) && !($$0 instanceof to)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof uh)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         tm $$3 = new tm();
         if ($$0 instanceof tm $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.s_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<uj> a(uj $$0, MapLike<uj> $$1) {
      if (!($$0 instanceof tm) && !($$0 instanceof to)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         tm $$2 = new tm();
         if ($$0 instanceof tm $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<uj> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            uj $$3 = (uj)$$2x.getFirst();
            if (!($$3 instanceof uh)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.s_(), (uj)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<uj, uj>>> c(uj $$0) {
      return $$0 instanceof tm $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<uj, uj>>> d(uj $$0) {
      return $$0 instanceof tm $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<uj>> e(uj $$0) {
      return $$0 instanceof tm $$1 ? DataResult.success(new MapLike<uj>() {
         @Nullable
         public uj a(uj $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public uj a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<uj, uj>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(ua.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public uj a(Stream<Pair<uj, uj>> $$0) {
      tm $$1 = new tm();
      $$0.forEach($$1x -> $$1.a(((uj)$$1x.getFirst()).s_(), (uj)$$1x.getSecond()));
      return $$1;
   }

   private static uj a(tm $$0) {
      if ($$0.f() == 1) {
         uj $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<uj>> f(uj $$0) {
      if ($$0 instanceof ts $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((tm)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof tl<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<uj>>> g(uj $$0) {
      if ($$0 instanceof ts $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((tm)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof tl<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(uj $$0) {
      return $$0 instanceof tj $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public uj a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new tj($$2);
   }

   public DataResult<IntStream> i(uj $$0) {
      return $$0 instanceof tq $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public uj a(IntStream $$0) {
      return new tq($$0.toArray());
   }

   public DataResult<LongStream> j(uj $$0) {
      return $$0 instanceof tt $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public uj a(LongStream $$0) {
      return new tt($$0.toArray());
   }

   public uj b(Stream<uj> $$0) {
      return ua.d.a.a($$0).a();
   }

   public uj a(uj $$0, String $$1) {
      if ($$0 instanceof tm $$2) {
         tm $$3 = new tm();
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

   public RecordBuilder<uj> mapBuilder() {
      return new ua.h();
   }

   private static Optional<ua.f> k(uj $$0) {
      if ($$0 instanceof to) {
         return Optional.of(ua.d.a);
      } else {
         if ($$0 instanceof tl<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(ua.d.a);
            }

            if ($$1 instanceof ts $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(ua.d.a);
                  case 10 -> Optional.of(new ua.b($$2));
                  default -> Optional.of(new ua.c($$2));
               };
            }

            if ($$1 instanceof tj $$3) {
               return Optional.of(new ua.a($$3.e()));
            }

            if ($$1 instanceof tq $$4) {
               return Optional.of(new ua.e($$4.g()));
            }

            if ($$1 instanceof tt $$5) {
               return Optional.of(new ua.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements ua.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ua.f a(uj $$0) {
         if ($$0 instanceof tk $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new ua.b(this.a).a($$0);
         }
      }

      @Override
      public uj a() {
         return new tj(this.a.toByteArray());
      }
   }

   static class b implements ua.f {
      private final ts a = new ts();

      public b() {
      }

      public b(Collection<uj> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tr.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tk.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tu.a($$0x))));
      }

      private static boolean a(tm $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static uj b(uj $$0) {
         if ($$0 instanceof tm $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static tm c(uj $$0) {
         tm $$1 = new tm();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public ua.f a(uj $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public uj a() {
         return this.a;
      }
   }

   static class c implements ua.f {
      private final ts a = new ts();

      c(uj $$0) {
         this.a.add($$0);
      }

      c(ts $$0) {
         this.a.addAll($$0);
      }

      @Override
      public ua.f a(uj $$0) {
         if ($$0.b() != this.a.f()) {
            return new ua.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public uj a() {
         return this.a;
      }
   }

   static class d implements ua.f {
      public static final ua.d a = new ua.d();

      private d() {
      }

      @Override
      public ua.f a(uj $$0) {
         if ($$0 instanceof tm $$1) {
            return new ua.b().a($$1);
         } else if ($$0 instanceof tk $$2) {
            return new ua.a($$2.i());
         } else if ($$0 instanceof tr $$3) {
            return new ua.e($$3.g());
         } else {
            return (ua.f)($$0 instanceof tu $$4 ? new ua.g($$4.f()) : new ua.c($$0));
         }
      }

      @Override
      public uj a() {
         return new ts();
      }
   }

   static class e implements ua.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ua.f a(uj $$0) {
         if ($$0 instanceof tr $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new ua.b(this.a).a($$0);
         }
      }

      @Override
      public uj a() {
         return new tq(this.a.toIntArray());
      }
   }

   interface f {
      ua.f a(uj var1);

      default ua.f a(Iterable<uj> $$0) {
         ua.f $$1 = this;

         for (uj $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default ua.f a(Stream<uj> $$0) {
         return this.a($$0::iterator);
      }

      uj a();
   }

   static class g implements ua.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ua.f a(uj $$0) {
         if ($$0 instanceof tu $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new ua.b(this.a).a($$0);
         }
      }

      @Override
      public uj a() {
         return new tt(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<uj, tm> {
      protected h() {
         super(ua.this);
      }

      protected tm a() {
         return new tm();
      }

      protected tm a(String $$0, uj $$1, tm $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<uj> a(tm $$0, uj $$1) {
         if ($$1 == null || $$1 == to.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof tm $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            tm $$3 = new tm(Maps.newHashMap($$2.i()));

            for (Entry<String, uj> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
