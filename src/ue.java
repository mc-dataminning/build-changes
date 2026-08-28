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

public class ue implements DynamicOps<un> {
   public static final ue a = new ue();
   private static final String b = "";

   protected ue() {
   }

   public un a() {
      return ts.b;
   }

   public <U> U a(DynamicOps<U> $$0, un $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((ug)$$1).i());
         case 2 -> (Object)$$0.createShort(((ug)$$1).h());
         case 3 -> (Object)$$0.createInt(((ug)$$1).g());
         case 4 -> (Object)$$0.createLong(((ug)$$1).f());
         case 5 -> (Object)$$0.createFloat(((ug)$$1).k());
         case 6 -> (Object)$$0.createDouble(((ug)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((tn)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.u_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((tu)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((tx)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(un $$0) {
      return $$0 instanceof ug $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public un a(Number $$0) {
      return tr.a($$0.doubleValue());
   }

   public un a(byte $$0) {
      return to.a($$0);
   }

   public un a(short $$0) {
      return ui.a($$0);
   }

   public un a(int $$0) {
      return tv.a($$0);
   }

   public un a(long $$0) {
      return ty.a($$0);
   }

   public un a(float $$0) {
      return tt.a($$0);
   }

   public un a(double $$0) {
      return tr.a($$0);
   }

   public un a(boolean $$0) {
      return to.a($$0);
   }

   public DataResult<String> b(un $$0) {
      return $$0 instanceof ul $$1 ? DataResult.success($$1.u_()) : DataResult.error(() -> "Not a string");
   }

   public un a(String $$0) {
      return ul.a($$0);
   }

   public DataResult<un> a(un $$0, un $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<un> a(un $$0, List<un> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<un> a(un $$0, un $$1, un $$2) {
      if (!($$0 instanceof tq) && !($$0 instanceof ts)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof ul)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         tq $$4 = $$0 instanceof tq $$3 ? $$3.h() : new tq();
         $$4.a($$1.u_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<un> a(un $$0, MapLike<un> $$1) {
      if (!($$0 instanceof tq) && !($$0 instanceof ts)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         tq $$3 = $$0 instanceof tq $$2 ? $$2.h() : new tq();
         List<un> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            un $$3x = (un)$$2x.getFirst();
            if (!($$3x instanceof ul)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.u_(), (un)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<un> a(un $$0, Map<un, un> $$1) {
      if (!($$0 instanceof tq) && !($$0 instanceof ts)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         tq $$3 = $$0 instanceof tq $$2 ? $$2.h() : new tq();
         List<un> $$4 = new ArrayList<>();

         for (Entry<un, un> $$5 : $$1.entrySet()) {
            un $$6 = $$5.getKey();
            if ($$6 instanceof ul) {
               $$3.a($$6.u_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<un, un>>> c(un $$0) {
      return $$0 instanceof tq $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (un)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<un, un>>> d(un $$0) {
      return $$0 instanceof tq $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, un> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<un>> e(un $$0) {
      return $$0 instanceof tq $$1 ? DataResult.success(new MapLike<un>() {
         @Nullable
         public un a(un $$0) {
            return $$1.c($$0.u_());
         }

         @Nullable
         public un a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<un, un>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(ue.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public un a(Stream<Pair<un, un>> $$0) {
      tq $$1 = new tq();
      $$0.forEach($$1x -> $$1.a(((un)$$1x.getFirst()).u_(), (un)$$1x.getSecond()));
      return $$1;
   }

   private static un a(tq $$0) {
      if ($$0.f() == 1) {
         un $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<un>> f(un $$0) {
      if ($$0 instanceof tw $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((tq)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof tp<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<un>>> g(un $$0) {
      if ($$0 instanceof tw $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (un $$2x : $$1) {
               $$1x.accept(a((tq)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof tp<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(un $$0) {
      return $$0 instanceof tn $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public un a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new tn($$2);
   }

   public DataResult<IntStream> i(un $$0) {
      return $$0 instanceof tu $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public un a(IntStream $$0) {
      return new tu($$0.toArray());
   }

   public DataResult<LongStream> j(un $$0) {
      return $$0 instanceof tx $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public un a(LongStream $$0) {
      return new tx($$0.toArray());
   }

   public un b(Stream<un> $$0) {
      return ue.d.a.a($$0).a();
   }

   public un a(un $$0, String $$1) {
      if ($$0 instanceof tq $$2) {
         tq $$3 = $$2.h();
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

   public RecordBuilder<un> mapBuilder() {
      return new ue.h();
   }

   private static Optional<ue.f> k(un $$0) {
      if ($$0 instanceof ts) {
         return Optional.of(ue.d.a);
      } else {
         if ($$0 instanceof tp<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(ue.d.a);
            }

            if ($$1 instanceof tw $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(ue.d.a);
                  case 10 -> Optional.of(new ue.b($$2));
                  default -> Optional.of(new ue.c($$2));
               };
            }

            if ($$1 instanceof tn $$3) {
               return Optional.of(new ue.a($$3.e()));
            }

            if ($$1 instanceof tu $$4) {
               return Optional.of(new ue.e($$4.g()));
            }

            if ($$1 instanceof tx $$5) {
               return Optional.of(new ue.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements ue.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ue.f a(un $$0) {
         if ($$0 instanceof to $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new ue.b(this.a).a($$0);
         }
      }

      @Override
      public un a() {
         return new tn(this.a.toByteArray());
      }
   }

   static class b implements ue.f {
      private final tw a = new tw();

      public b() {
      }

      public b(Collection<un> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tv.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(to.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ty.a($$0x))));
      }

      private static boolean a(tq $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static un b(un $$0) {
         if ($$0 instanceof tq $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static tq c(un $$0) {
         tq $$1 = new tq();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public ue.f a(un $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public un a() {
         return this.a;
      }
   }

   static class c implements ue.f {
      private final tw a = new tw();

      c(un $$0) {
         this.a.add($$0);
      }

      c(tw $$0) {
         this.a.addAll($$0);
      }

      @Override
      public ue.f a(un $$0) {
         if ($$0.b() != this.a.f()) {
            return new ue.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public un a() {
         return this.a;
      }
   }

   static class d implements ue.f {
      public static final ue.d a = new ue.d();

      private d() {
      }

      @Override
      public ue.f a(un $$0) {
         if ($$0 instanceof tq $$1) {
            return new ue.b().a($$1);
         } else if ($$0 instanceof to $$2) {
            return new ue.a($$2.i());
         } else if ($$0 instanceof tv $$3) {
            return new ue.e($$3.g());
         } else {
            return (ue.f)($$0 instanceof ty $$4 ? new ue.g($$4.f()) : new ue.c($$0));
         }
      }

      @Override
      public un a() {
         return new tw();
      }
   }

   static class e implements ue.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ue.f a(un $$0) {
         if ($$0 instanceof tv $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new ue.b(this.a).a($$0);
         }
      }

      @Override
      public un a() {
         return new tu(this.a.toIntArray());
      }
   }

   interface f {
      ue.f a(un var1);

      default ue.f a(Iterable<un> $$0) {
         ue.f $$1 = this;

         for (un $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default ue.f a(Stream<un> $$0) {
         return this.a($$0::iterator);
      }

      un a();
   }

   static class g implements ue.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public ue.f a(un $$0) {
         if ($$0 instanceof ty $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new ue.b(this.a).a($$0);
         }
      }

      @Override
      public un a() {
         return new tx(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<un, tq> {
      protected h() {
         super(ue.this);
      }

      protected tq a() {
         return new tq();
      }

      protected tq a(String $$0, un $$1, tq $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<un> a(tq $$0, un $$1) {
         if ($$1 == null || $$1 == ts.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof tq $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            tq $$3 = $$2.h();

            for (Entry<String, un> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
