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

public class uk implements DynamicOps<ut> {
   public static final uk a = new uk();
   private static final String b = "";

   protected uk() {
   }

   public ut a() {
      return ty.b;
   }

   public <U> U a(DynamicOps<U> $$0, ut $$1) {
      return (U)(switch ($$1.b()) {
         case 0 -> (Object)$$0.empty();
         case 1 -> (Object)$$0.createByte(((um)$$1).i());
         case 2 -> (Object)$$0.createShort(((um)$$1).h());
         case 3 -> (Object)$$0.createInt(((um)$$1).g());
         case 4 -> (Object)$$0.createLong(((um)$$1).f());
         case 5 -> (Object)$$0.createFloat(((um)$$1).k());
         case 6 -> (Object)$$0.createDouble(((um)$$1).j());
         case 7 -> (Object)$$0.createByteList(ByteBuffer.wrap(((tt)$$1).e()));
         case 8 -> (Object)$$0.createString($$1.p_());
         case 9 -> (Object)this.convertList($$0, $$1);
         case 10 -> (Object)this.convertMap($$0, $$1);
         case 11 -> (Object)$$0.createIntList(Arrays.stream(((ua)$$1).g()));
         case 12 -> (Object)$$0.createLongList(Arrays.stream(((ud)$$1).g()));
         default -> throw new IllegalStateException("Unknown tag type: " + $$1);
      });
   }

   public DataResult<Number> a(ut $$0) {
      return $$0 instanceof um $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public ut a(Number $$0) {
      return tx.a($$0.doubleValue());
   }

   public ut a(byte $$0) {
      return tu.a($$0);
   }

   public ut a(short $$0) {
      return uo.a($$0);
   }

   public ut a(int $$0) {
      return ub.a($$0);
   }

   public ut a(long $$0) {
      return ue.a($$0);
   }

   public ut a(float $$0) {
      return tz.a($$0);
   }

   public ut a(double $$0) {
      return tx.a($$0);
   }

   public ut a(boolean $$0) {
      return tu.a($$0);
   }

   public DataResult<String> b(ut $$0) {
      return $$0 instanceof ur $$1 ? DataResult.success($$1.p_()) : DataResult.error(() -> "Not a string");
   }

   public ut a(String $$0) {
      return ur.a($$0);
   }

   public DataResult<ut> a(ut $$0, ut $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<ut> a(ut $$0, List<ut> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<ut> a(ut $$0, ut $$1, ut $$2) {
      if (!($$0 instanceof tw) && !($$0 instanceof ty)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof ur)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         tw $$4 = $$0 instanceof tw $$3 ? $$3.h() : new tw();
         $$4.a($$1.p_(), $$2);
         return DataResult.success($$4);
      }
   }

   public DataResult<ut> a(ut $$0, MapLike<ut> $$1) {
      if (!($$0 instanceof tw) && !($$0 instanceof ty)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         tw $$3 = $$0 instanceof tw $$2 ? $$2.h() : new tw();
         List<ut> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            ut $$3x = (ut)$$2x.getFirst();
            if (!($$3x instanceof ur)) {
               $$4.add($$3x);
            } else {
               $$3.a($$3x.p_(), (ut)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<ut> a(ut $$0, Map<ut, ut> $$1) {
      if (!($$0 instanceof tw) && !($$0 instanceof ty)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         tw $$3 = $$0 instanceof tw $$2 ? $$2.h() : new tw();
         List<ut> $$4 = new ArrayList<>();

         for (Entry<ut, ut> $$5 : $$1.entrySet()) {
            ut $$6 = $$5.getKey();
            if ($$6 instanceof ur) {
               $$3.a($$6.p_(), $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<ut, ut>>> c(ut $$0) {
      return $$0 instanceof tw $$1
         ? DataResult.success($$1.j().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (ut)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<ut, ut>>> d(ut $$0) {
      return $$0 instanceof tw $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, ut> $$2 : $$1.j()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<ut>> e(ut $$0) {
      return $$0 instanceof tw $$1 ? DataResult.success(new MapLike<ut>() {
         @Nullable
         public ut a(ut $$0) {
            return $$1.c($$0.p_());
         }

         @Nullable
         public ut a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<ut, ut>> entries() {
            return $$1.j().stream().map($$0 -> Pair.of(uk.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public ut a(Stream<Pair<ut, ut>> $$0) {
      tw $$1 = new tw();
      $$0.forEach($$1x -> $$1.a(((ut)$$1x.getFirst()).p_(), (ut)$$1x.getSecond()));
      return $$1;
   }

   private static ut a(tw $$0) {
      if ($$0.f() == 1) {
         ut $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<ut>> f(ut $$0) {
      if ($$0 instanceof uc $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((tw)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof tv<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<ut>>> g(ut $$0) {
      if ($$0 instanceof uc $$1) {
         return $$1.f() == 10 ? DataResult.success((Consumer<Consumer>)$$1x -> {
            for (ut $$2x : $$1) {
               $$1x.accept(a((tw)$$2x));
            }
         }) : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof tv<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(ut $$0) {
      return $$0 instanceof tt $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public ut a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new tt($$2);
   }

   public DataResult<IntStream> i(ut $$0) {
      return $$0 instanceof ua $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public ut a(IntStream $$0) {
      return new ua($$0.toArray());
   }

   public DataResult<LongStream> j(ut $$0) {
      return $$0 instanceof ud $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public ut a(LongStream $$0) {
      return new ud($$0.toArray());
   }

   public ut b(Stream<ut> $$0) {
      return uk.d.a.a($$0).a();
   }

   public ut a(ut $$0, String $$1) {
      if ($$0 instanceof tw $$2) {
         tw $$3 = $$2.h();
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

   public RecordBuilder<ut> mapBuilder() {
      return new uk.h();
   }

   private static Optional<uk.f> k(ut $$0) {
      if ($$0 instanceof ty) {
         return Optional.of(uk.d.a);
      } else {
         if ($$0 instanceof tv<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(uk.d.a);
            }

            if ($$1 instanceof uc $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(uk.d.a);
                  case 10 -> Optional.of(new uk.b($$2));
                  default -> Optional.of(new uk.c($$2));
               };
            }

            if ($$1 instanceof tt $$3) {
               return Optional.of(new uk.a($$3.e()));
            }

            if ($$1 instanceof ua $$4) {
               return Optional.of(new uk.e($$4.g()));
            }

            if ($$1 instanceof ud $$5) {
               return Optional.of(new uk.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements uk.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uk.f a(ut $$0) {
         if ($$0 instanceof tu $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new uk.b(this.a).a($$0);
         }
      }

      @Override
      public ut a() {
         return new tt(this.a.toByteArray());
      }
   }

   static class b implements uk.f {
      private final uc a = new uc();

      public b() {
      }

      public b(Collection<ut> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ub.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(tu.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ue.a($$0x))));
      }

      private static boolean a(tw $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static ut b(ut $$0) {
         if ($$0 instanceof tw $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static tw c(ut $$0) {
         tw $$1 = new tw();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public uk.f a(ut $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public ut a() {
         return this.a;
      }
   }

   static class c implements uk.f {
      private final uc a = new uc();

      c(ut $$0) {
         this.a.add($$0);
      }

      c(uc $$0) {
         this.a.addAll($$0);
      }

      @Override
      public uk.f a(ut $$0) {
         if ($$0.b() != this.a.f()) {
            return new uk.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public ut a() {
         return this.a;
      }
   }

   static class d implements uk.f {
      public static final uk.d a = new uk.d();

      private d() {
      }

      @Override
      public uk.f a(ut $$0) {
         if ($$0 instanceof tw $$1) {
            return new uk.b().a($$1);
         } else if ($$0 instanceof tu $$2) {
            return new uk.a($$2.i());
         } else if ($$0 instanceof ub $$3) {
            return new uk.e($$3.g());
         } else {
            return (uk.f)($$0 instanceof ue $$4 ? new uk.g($$4.f()) : new uk.c($$0));
         }
      }

      @Override
      public ut a() {
         return new uc();
      }
   }

   static class e implements uk.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uk.f a(ut $$0) {
         if ($$0 instanceof ub $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new uk.b(this.a).a($$0);
         }
      }

      @Override
      public ut a() {
         return new ua(this.a.toIntArray());
      }
   }

   interface f {
      uk.f a(ut var1);

      default uk.f a(Iterable<ut> $$0) {
         uk.f $$1 = this;

         for (ut $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default uk.f a(Stream<ut> $$0) {
         return this.a($$0::iterator);
      }

      ut a();
   }

   static class g implements uk.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uk.f a(ut $$0) {
         if ($$0 instanceof ue $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new uk.b(this.a).a($$0);
         }
      }

      @Override
      public ut a() {
         return new ud(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<ut, tw> {
      protected h() {
         super(uk.this);
      }

      protected tw a() {
         return new tw();
      }

      protected tw a(String $$0, ut $$1, tw $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<ut> a(tw $$0, ut $$1) {
         if ($$1 == null || $$1 == ty.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof tw $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            tw $$3 = $$2.h();

            for (Entry<String, ut> $$4 : $$0.j()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
