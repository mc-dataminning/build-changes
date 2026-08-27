import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
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

public class rd implements DynamicOps<rl> {
   public static final rd a = new rd();
   private static final String b = "";

   protected rd() {
   }

   public rl a() {
      return qu.b;
   }

   public <U> U a(DynamicOps<U> $$0, rl $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((rf)$$1).i());
         case 2:
            return (U)$$0.createShort(((rf)$$1).h());
         case 3:
            return (U)$$0.createInt(((rf)$$1).g());
         case 4:
            return (U)$$0.createLong(((rf)$$1).f());
         case 5:
            return (U)$$0.createFloat(((rf)$$1).k());
         case 6:
            return (U)$$0.createDouble(((rf)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((qp)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.m_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((qw)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((qz)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(rl $$0) {
      return $$0 instanceof rf $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public rl a(Number $$0) {
      return qt.a($$0.doubleValue());
   }

   public rl a(byte $$0) {
      return qq.a($$0);
   }

   public rl a(short $$0) {
      return rg.a($$0);
   }

   public rl a(int $$0) {
      return qx.a($$0);
   }

   public rl a(long $$0) {
      return ra.a($$0);
   }

   public rl a(float $$0) {
      return qv.a($$0);
   }

   public rl a(double $$0) {
      return qt.a($$0);
   }

   public rl a(boolean $$0) {
      return qq.a($$0);
   }

   public DataResult<String> b(rl $$0) {
      return $$0 instanceof rj $$1 ? DataResult.success($$1.m_()) : DataResult.error(() -> "Not a string");
   }

   public rl a(String $$0) {
      return rj.a($$0);
   }

   public DataResult<rl> a(rl $$0, rl $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<rl> a(rl $$0, List<rl> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<rl> a(rl $$0, rl $$1, rl $$2) {
      if (!($$0 instanceof qs) && !($$0 instanceof qu)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof rj)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         qs $$3 = new qs();
         if ($$0 instanceof qs $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.m_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<rl> a(rl $$0, MapLike<rl> $$1) {
      if (!($$0 instanceof qs) && !($$0 instanceof qu)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         qs $$2 = new qs();
         if ($$0 instanceof qs $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<rl> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            rl $$3 = (rl)$$2x.getFirst();
            if (!($$3 instanceof rj)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.m_(), (rl)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<rl, rl>>> c(rl $$0) {
      return $$0 instanceof qs $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<rl, rl>>> d(rl $$0) {
      return $$0 instanceof qs $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<rl>> e(rl $$0) {
      return $$0 instanceof qs $$1 ? DataResult.success(new MapLike<rl>() {
         @Nullable
         public rl a(rl $$0) {
            return $$1.c($$0.m_());
         }

         @Nullable
         public rl a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<rl, rl>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(rd.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public rl a(Stream<Pair<rl, rl>> $$0) {
      qs $$1 = new qs();
      $$0.forEach($$1x -> $$1.a(((rl)$$1x.getFirst()).m_(), (rl)$$1x.getSecond()));
      return $$1;
   }

   private static rl a(qs $$0) {
      if ($$0.f() == 1) {
         rl $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<rl>> f(rl $$0) {
      if ($$0 instanceof qy $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((qs)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof qr<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<rl>>> g(rl $$0) {
      if ($$0 instanceof qy $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((qs)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof qr<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(rl $$0) {
      return $$0 instanceof qp $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public rl a(ByteBuffer $$0) {
      return new qp(DataFixUtils.toArray($$0));
   }

   public DataResult<IntStream> i(rl $$0) {
      return $$0 instanceof qw $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public rl a(IntStream $$0) {
      return new qw($$0.toArray());
   }

   public DataResult<LongStream> j(rl $$0) {
      return $$0 instanceof qz $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public rl a(LongStream $$0) {
      return new qz($$0.toArray());
   }

   public rl b(Stream<rl> $$0) {
      return rd.d.a.a($$0).a();
   }

   public rl a(rl $$0, String $$1) {
      if ($$0 instanceof qs $$2) {
         qs $$3 = new qs();
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

   public RecordBuilder<rl> mapBuilder() {
      return new rd.h();
   }

   private static Optional<rd.f> k(rl $$0) {
      if ($$0 instanceof qu) {
         return Optional.of(rd.d.a);
      } else {
         if ($$0 instanceof qr<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(rd.d.a);
            }

            if ($$1 instanceof qy $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(rd.d.a);
                  case 10 -> Optional.of(new rd.b($$2));
                  default -> Optional.of(new rd.c($$2));
               };
            }

            if ($$1 instanceof qp $$3) {
               return Optional.of(new rd.a($$3.e()));
            }

            if ($$1 instanceof qw $$4) {
               return Optional.of(new rd.e($$4.g()));
            }

            if ($$1 instanceof qz $$5) {
               return Optional.of(new rd.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements rd.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public rd.f a(rl $$0) {
         if ($$0 instanceof qq $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new rd.b(this.a).a($$0);
         }
      }

      @Override
      public rl a() {
         return new qp(this.a.toByteArray());
      }
   }

   static class b implements rd.f {
      private final qy a = new qy();

      public b() {
      }

      public b(Collection<rl> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(qx.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(qq.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ra.a($$0x))));
      }

      private static boolean a(qs $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static rl b(rl $$0) {
         if ($$0 instanceof qs $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static qs c(rl $$0) {
         qs $$1 = new qs();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public rd.f a(rl $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public rl a() {
         return this.a;
      }
   }

   static class c implements rd.f {
      private final qy a = new qy();

      c(rl $$0) {
         this.a.add($$0);
      }

      c(qy $$0) {
         this.a.addAll($$0);
      }

      @Override
      public rd.f a(rl $$0) {
         if ($$0.b() != this.a.f()) {
            return new rd.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public rl a() {
         return this.a;
      }
   }

   static class d implements rd.f {
      public static final rd.d a = new rd.d();

      private d() {
      }

      @Override
      public rd.f a(rl $$0) {
         if ($$0 instanceof qs $$1) {
            return new rd.b().a($$1);
         } else if ($$0 instanceof qq $$2) {
            return new rd.a($$2.i());
         } else if ($$0 instanceof qx $$3) {
            return new rd.e($$3.g());
         } else {
            return (rd.f)($$0 instanceof ra $$4 ? new rd.g($$4.f()) : new rd.c($$0));
         }
      }

      @Override
      public rl a() {
         return new qy();
      }
   }

   static class e implements rd.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public rd.f a(rl $$0) {
         if ($$0 instanceof qx $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new rd.b(this.a).a($$0);
         }
      }

      @Override
      public rl a() {
         return new qw(this.a.toIntArray());
      }
   }

   interface f {
      rd.f a(rl var1);

      default rd.f a(Iterable<rl> $$0) {
         rd.f $$1 = this;

         for (rl $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default rd.f a(Stream<rl> $$0) {
         return this.a($$0::iterator);
      }

      rl a();
   }

   static class g implements rd.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public rd.f a(rl $$0) {
         if ($$0 instanceof ra $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new rd.b(this.a).a($$0);
         }
      }

      @Override
      public rl a() {
         return new qz(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<rl, qs> {
      protected h() {
         super(rd.this);
      }

      protected qs a() {
         return new qs();
      }

      protected qs a(String $$0, rl $$1, qs $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<rl> a(qs $$0, rl $$1) {
         if ($$1 == null || $$1 == qu.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof qs $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            qs $$3 = new qs(Maps.newHashMap($$2.i()));

            for (Entry<String, rl> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
