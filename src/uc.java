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

public class uc implements DynamicOps<ul> {
   public static final uc a = new uc();
   private static final String b = "";

   protected uc() {
   }

   public ul a() {
      return tq.b;
   }

   public <U> U a(DynamicOps<U> $$0, ul $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((ue)$$1).i());
         case 2:
            return (U)$$0.createShort(((ue)$$1).h());
         case 3:
            return (U)$$0.createInt(((ue)$$1).g());
         case 4:
            return (U)$$0.createLong(((ue)$$1).f());
         case 5:
            return (U)$$0.createFloat(((ue)$$1).k());
         case 6:
            return (U)$$0.createDouble(((ue)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((tl)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.s_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((ts)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((tv)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(ul $$0) {
      return $$0 instanceof ue $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public ul a(Number $$0) {
      return tp.a($$0.doubleValue());
   }

   public ul a(byte $$0) {
      return tm.a($$0);
   }

   public ul a(short $$0) {
      return ug.a($$0);
   }

   public ul a(int $$0) {
      return tt.a($$0);
   }

   public ul a(long $$0) {
      return tw.a($$0);
   }

   public ul a(float $$0) {
      return tr.a($$0);
   }

   public ul a(double $$0) {
      return tp.a($$0);
   }

   public ul a(boolean $$0) {
      return tm.a($$0);
   }

   public DataResult<String> b(ul $$0) {
      return $$0 instanceof uj $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public ul a(String $$0) {
      return uj.a($$0);
   }

   public DataResult<ul> a(ul $$0, ul $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<ul> a(ul $$0, List<ul> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<ul> a(ul $$0, ul $$1, ul $$2) {
      if (!($$0 instanceof to) && !($$0 instanceof tq)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof uj)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         to $$3 = new to();
         if ($$0 instanceof to $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.s_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<ul> a(ul $$0, MapLike<ul> $$1) {
      if (!($$0 instanceof to) && !($$0 instanceof tq)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         to $$2 = new to();
         if ($$0 instanceof to $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<ul> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            ul $$3 = (ul)$$2x.getFirst();
            if (!($$3 instanceof uj)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.s_(), (ul)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<ul, ul>>> c(ul $$0) {
      return $$0 instanceof to $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<ul, ul>>> d(ul $$0) {
      return $$0 instanceof to $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<ul>> e(ul $$0) {
      return $$0 instanceof to $$1 ? DataResult.success(new MapLike<ul>() {
         @Nullable
         public ul a(ul $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public ul a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<ul, ul>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(uc.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public ul a(Stream<Pair<ul, ul>> $$0) {
      to $$1 = new to();
      $$0.forEach($$1x -> $$1.a(((ul)$$1x.getFirst()).s_(), (ul)$$1x.getSecond()));
      return $$1;
   }

   private static ul a(to $$0) {
      if ($$0.f() == 1) {
         ul $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<ul>> f(ul $$0) {
      if ($$0 instanceof tu $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((to)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof tn<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<ul>>> g(ul $$0) {
      if ($$0 instanceof tu $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((to)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof tn<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(ul $$0) {
      return $$0 instanceof tl $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public ul a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new tl($$2);
   }

   public DataResult<IntStream> i(ul $$0) {
      return $$0 instanceof ts $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public ul a(IntStream $$0) {
      return new ts($$0.toArray());
   }

   public DataResult<LongStream> j(ul $$0) {
      return $$0 instanceof tv $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public ul a(LongStream $$0) {
      return new tv($$0.toArray());
   }

   public ul b(Stream<ul> $$0) {
      return uc.d.a.a($$0).a();
   }

   public ul a(ul $$0, String $$1) {
      if ($$0 instanceof to $$2) {
         to $$3 = new to();
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

   public RecordBuilder<ul> mapBuilder() {
      return new uc.h();
   }

   private static Optional<uc.f> k(ul $$0) {
      if ($$0 instanceof tq) {
         return Optional.of(uc.d.a);
      } else {
         if ($$0 instanceof tn<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(uc.d.a);
            }

            if ($$1 instanceof tu $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(uc.d.a);
                  case 10 -> Optional.of(new uc.b($$2));
                  default -> Optional.of(new uc.c($$2));
               };
            }

            if ($$1 instanceof tl $$3) {
               return Optional.of(new uc.a($$3.e()));
            }

            if ($$1 instanceof ts $$4) {
               return Optional.of(new uc.e($$4.g()));
            }

            if ($$1 instanceof tv $$5) {
               return Optional.of(new uc.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements uc.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uc.f a(ul $$0) {
         if ($$0 instanceof tm $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new uc.b(this.a).a($$0);
         }
      }

      @Override
      public ul a() {
         return new tl(this.a.toByteArray());
      }
   }

   static class b implements uc.f {
      private final tu a = new tu();

      public b() {
      }

      public b(Collection<ul> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tt.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tm.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tw.a($$0x))));
      }

      private static boolean a(to $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static ul b(ul $$0) {
         if ($$0 instanceof to $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static to c(ul $$0) {
         to $$1 = new to();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public uc.f a(ul $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public ul a() {
         return this.a;
      }
   }

   static class c implements uc.f {
      private final tu a = new tu();

      c(ul $$0) {
         this.a.add($$0);
      }

      c(tu $$0) {
         this.a.addAll($$0);
      }

      @Override
      public uc.f a(ul $$0) {
         if ($$0.b() != this.a.f()) {
            return new uc.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public ul a() {
         return this.a;
      }
   }

   static class d implements uc.f {
      public static final uc.d a = new uc.d();

      private d() {
      }

      @Override
      public uc.f a(ul $$0) {
         if ($$0 instanceof to $$1) {
            return new uc.b().a($$1);
         } else if ($$0 instanceof tm $$2) {
            return new uc.a($$2.i());
         } else if ($$0 instanceof tt $$3) {
            return new uc.e($$3.g());
         } else {
            return (uc.f)($$0 instanceof tw $$4 ? new uc.g($$4.f()) : new uc.c($$0));
         }
      }

      @Override
      public ul a() {
         return new tu();
      }
   }

   static class e implements uc.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uc.f a(ul $$0) {
         if ($$0 instanceof tt $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new uc.b(this.a).a($$0);
         }
      }

      @Override
      public ul a() {
         return new ts(this.a.toIntArray());
      }
   }

   interface f {
      uc.f a(ul var1);

      default uc.f a(Iterable<ul> $$0) {
         uc.f $$1 = this;

         for (ul $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default uc.f a(Stream<ul> $$0) {
         return this.a($$0::iterator);
      }

      ul a();
   }

   static class g implements uc.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uc.f a(ul $$0) {
         if ($$0 instanceof tw $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new uc.b(this.a).a($$0);
         }
      }

      @Override
      public ul a() {
         return new tv(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<ul, to> {
      protected h() {
         super(uc.this);
      }

      protected to a() {
         return new to();
      }

      protected to a(String $$0, ul $$1, to $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<ul> a(to $$0, ul $$1) {
         if ($$1 == null || $$1 == tq.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof to $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            to $$3 = new to(Maps.newHashMap($$2.i()));

            for (Entry<String, ul> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
