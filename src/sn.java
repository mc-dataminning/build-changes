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

public class sn implements DynamicOps<sw> {
   public static final sn a = new sn();
   private static final String b = "";

   protected sn() {
   }

   public sw a() {
      return sb.b;
   }

   public <U> U a(DynamicOps<U> $$0, sw $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((sp)$$1).i());
         case 2:
            return (U)$$0.createShort(((sp)$$1).h());
         case 3:
            return (U)$$0.createInt(((sp)$$1).g());
         case 4:
            return (U)$$0.createLong(((sp)$$1).f());
         case 5:
            return (U)$$0.createFloat(((sp)$$1).k());
         case 6:
            return (U)$$0.createDouble(((sp)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((rw)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.s_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((sd)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((sg)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(sw $$0) {
      return $$0 instanceof sp $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public sw a(Number $$0) {
      return sa.a($$0.doubleValue());
   }

   public sw a(byte $$0) {
      return rx.a($$0);
   }

   public sw a(short $$0) {
      return sr.a($$0);
   }

   public sw a(int $$0) {
      return se.a($$0);
   }

   public sw a(long $$0) {
      return sh.a($$0);
   }

   public sw a(float $$0) {
      return sc.a($$0);
   }

   public sw a(double $$0) {
      return sa.a($$0);
   }

   public sw a(boolean $$0) {
      return rx.a($$0);
   }

   public DataResult<String> b(sw $$0) {
      return $$0 instanceof su $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public sw a(String $$0) {
      return su.a($$0);
   }

   public DataResult<sw> a(sw $$0, sw $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<sw> a(sw $$0, List<sw> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<sw> a(sw $$0, sw $$1, sw $$2) {
      if (!($$0 instanceof rz) && !($$0 instanceof sb)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof su)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         rz $$3 = new rz();
         if ($$0 instanceof rz $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.s_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<sw> a(sw $$0, MapLike<sw> $$1) {
      if (!($$0 instanceof rz) && !($$0 instanceof sb)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         rz $$2 = new rz();
         if ($$0 instanceof rz $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<sw> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            sw $$3 = (sw)$$2x.getFirst();
            if (!($$3 instanceof su)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.s_(), (sw)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<sw, sw>>> c(sw $$0) {
      return $$0 instanceof rz $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<sw, sw>>> d(sw $$0) {
      return $$0 instanceof rz $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<sw>> e(sw $$0) {
      return $$0 instanceof rz $$1 ? DataResult.success(new MapLike<sw>() {
         @Nullable
         public sw a(sw $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public sw a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<sw, sw>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(sn.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public sw a(Stream<Pair<sw, sw>> $$0) {
      rz $$1 = new rz();
      $$0.forEach($$1x -> $$1.a(((sw)$$1x.getFirst()).s_(), (sw)$$1x.getSecond()));
      return $$1;
   }

   private static sw a(rz $$0) {
      if ($$0.f() == 1) {
         sw $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<sw>> f(sw $$0) {
      if ($$0 instanceof sf $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((rz)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof ry<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<sw>>> g(sw $$0) {
      if ($$0 instanceof sf $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((rz)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof ry<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(sw $$0) {
      return $$0 instanceof rw $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public sw a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new rw($$2);
   }

   public DataResult<IntStream> i(sw $$0) {
      return $$0 instanceof sd $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public sw a(IntStream $$0) {
      return new sd($$0.toArray());
   }

   public DataResult<LongStream> j(sw $$0) {
      return $$0 instanceof sg $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public sw a(LongStream $$0) {
      return new sg($$0.toArray());
   }

   public sw b(Stream<sw> $$0) {
      return sn.d.a.a($$0).a();
   }

   public sw a(sw $$0, String $$1) {
      if ($$0 instanceof rz $$2) {
         rz $$3 = new rz();
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

   public RecordBuilder<sw> mapBuilder() {
      return new sn.h();
   }

   private static Optional<sn.f> k(sw $$0) {
      if ($$0 instanceof sb) {
         return Optional.of(sn.d.a);
      } else {
         if ($$0 instanceof ry<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(sn.d.a);
            }

            if ($$1 instanceof sf $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(sn.d.a);
                  case 10 -> Optional.of(new sn.b($$2));
                  default -> Optional.of(new sn.c($$2));
               };
            }

            if ($$1 instanceof rw $$3) {
               return Optional.of(new sn.a($$3.e()));
            }

            if ($$1 instanceof sd $$4) {
               return Optional.of(new sn.e($$4.g()));
            }

            if ($$1 instanceof sg $$5) {
               return Optional.of(new sn.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements sn.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sn.f a(sw $$0) {
         if ($$0 instanceof rx $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new sn.b(this.a).a($$0);
         }
      }

      @Override
      public sw a() {
         return new rw(this.a.toByteArray());
      }
   }

   static class b implements sn.f {
      private final sf a = new sf();

      public b() {
      }

      public b(Collection<sw> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(se.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(rx.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(sh.a($$0x))));
      }

      private static boolean a(rz $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static sw b(sw $$0) {
         if ($$0 instanceof rz $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static rz c(sw $$0) {
         rz $$1 = new rz();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public sn.f a(sw $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public sw a() {
         return this.a;
      }
   }

   static class c implements sn.f {
      private final sf a = new sf();

      c(sw $$0) {
         this.a.add($$0);
      }

      c(sf $$0) {
         this.a.addAll($$0);
      }

      @Override
      public sn.f a(sw $$0) {
         if ($$0.b() != this.a.f()) {
            return new sn.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public sw a() {
         return this.a;
      }
   }

   static class d implements sn.f {
      public static final sn.d a = new sn.d();

      private d() {
      }

      @Override
      public sn.f a(sw $$0) {
         if ($$0 instanceof rz $$1) {
            return new sn.b().a($$1);
         } else if ($$0 instanceof rx $$2) {
            return new sn.a($$2.i());
         } else if ($$0 instanceof se $$3) {
            return new sn.e($$3.g());
         } else {
            return (sn.f)($$0 instanceof sh $$4 ? new sn.g($$4.f()) : new sn.c($$0));
         }
      }

      @Override
      public sw a() {
         return new sf();
      }
   }

   static class e implements sn.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sn.f a(sw $$0) {
         if ($$0 instanceof se $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new sn.b(this.a).a($$0);
         }
      }

      @Override
      public sw a() {
         return new sd(this.a.toIntArray());
      }
   }

   interface f {
      sn.f a(sw var1);

      default sn.f a(Iterable<sw> $$0) {
         sn.f $$1 = this;

         for (sw $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default sn.f a(Stream<sw> $$0) {
         return this.a($$0::iterator);
      }

      sw a();
   }

   static class g implements sn.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public sn.f a(sw $$0) {
         if ($$0 instanceof sh $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new sn.b(this.a).a($$0);
         }
      }

      @Override
      public sw a() {
         return new sg(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<sw, rz> {
      protected h() {
         super(sn.this);
      }

      protected rz a() {
         return new rz();
      }

      protected rz a(String $$0, sw $$1, rz $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<sw> a(rz $$0, sw $$1) {
         if ($$1 == null || $$1 == sb.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof rz $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            rz $$3 = new rz(Maps.newHashMap($$2.i()));

            for (Entry<String, sw> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
