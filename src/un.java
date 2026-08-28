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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class un implements DynamicOps<uy> {
   public static final un a = new un();

   private un() {
   }

   public uy a() {
      return ub.b;
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public <U> U a(DynamicOps<U> $$0, uy $$1) {
      Objects.requireNonNull($$1);
      Throwable var42;
      switch ($$1) {
         case ub $$2:
            return (U)$$0.empty();
         case tx var6:
            tx var54 = var6;

            try {
               var55 = var54.n();
            } catch (Throwable var33) {
               var42 = var33;
               boolean var61 = false;
               break;
            }

            byte var34 = var55;
            return (U)$$0.createByte(var34);
         case us var8:
            us var52 = var8;

            try {
               var53 = var52.n();
            } catch (Throwable var32) {
               var42 = var32;
               boolean var60 = false;
               break;
            }

            short var35 = var53;
            return (U)$$0.createShort(var35);
         case ue var10:
            ue var50 = var10;

            try {
               var51 = var50.n();
            } catch (Throwable var31) {
               var42 = var31;
               boolean var59 = false;
               break;
            }

            int var36 = var51;
            return (U)$$0.createInt(var36);
         case uh var12:
            uh var48 = var12;

            try {
               var49 = var48.n();
            } catch (Throwable var30) {
               var42 = var30;
               boolean var58 = false;
               break;
            }

            long var37 = var49;
            return (U)$$0.createLong(var37);
         case uc var15:
            uc var46 = var15;

            try {
               var47 = var46.n();
            } catch (Throwable var29) {
               var42 = var29;
               boolean var57 = false;
               break;
            }

            float var38 = var47;
            return (U)$$0.createFloat(var38);
         case ua var17:
            ua var44 = var17;

            try {
               var45 = var44.n();
            } catch (Throwable var28) {
               var42 = var28;
               boolean var56 = false;
               break;
            }

            double var39 = var45;
            return (U)$$0.createDouble(var39);
         case tw $$9:
            return (U)$$0.createByteList(ByteBuffer.wrap($$9.e()));
         case uw var21:
            uw var41 = var21;

            try {
               var43 = var41.k();
            } catch (Throwable var27) {
               var42 = var27;
               boolean var10001 = false;
               break;
            }

            String var40 = var43;
            return (U)$$0.createString(var40);
         case uf $$11:
            return (U)this.convertList($$0, $$11);
         case tz $$12:
            return (U)this.convertMap($$0, $$12);
         case ud $$13:
            return (U)$$0.createIntList(Arrays.stream($$13.g()));
         case ug $$14:
            return (U)$$0.createLongList(Arrays.stream($$14.g()));
         default:
            throw new MatchException(null, null);
      }

      Throwable var3 = var42;
      throw new MatchException(var3.toString(), var3);
   }

   public DataResult<Number> a(uy $$0) {
      return $$0.o().<DataResult<Number>>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Not a number"));
   }

   public uy a(Number $$0) {
      return ua.a($$0.doubleValue());
   }

   public uy a(byte $$0) {
      return tx.a($$0);
   }

   public uy a(short $$0) {
      return us.a($$0);
   }

   public uy a(int $$0) {
      return ue.a($$0);
   }

   public uy a(long $$0) {
      return uh.a($$0);
   }

   public uy a(float $$0) {
      return uc.a($$0);
   }

   public uy a(double $$0) {
      return ua.a($$0);
   }

   public uy a(boolean $$0) {
      return tx.a($$0);
   }

   public DataResult<String> b(uy $$0) {
      if ($$0 instanceof uw var2) {
         uw var10000 = var2;

         try {
            var6 = var10000.k();
         } catch (Throwable var5) {
            throw new MatchException(var5.toString(), var5);
         }

         String var4 = var6;
         return DataResult.success(var4);
      } else {
         return DataResult.error(() -> "Not a string");
      }
   }

   public uy a(String $$0) {
      return uw.a($$0);
   }

   public DataResult<uy> a(uy $$0, uy $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<uy> a(uy $$0, List<uy> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<uy> a(uy $$0, uy $$1, uy $$2) {
      if (!($$0 instanceof tz) && !($$0 instanceof ub)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if ($$1 instanceof uw $$6) {
         uw var10000 = $$6;

         try {
            var10 = var10000.k();
         } catch (Throwable var7) {
            throw new MatchException(var7.toString(), var7);
         }

         String $$5 = var10;
         tz $$6x = $$0 instanceof tz $$5x ? $$5x.k() : new tz();
         $$6x.a($$5, $$2);
         return DataResult.success($$6x);
      } else {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      }
   }

   public DataResult<uy> a(uy $$0, MapLike<uy> $$1) {
      if (!($$0 instanceof tz) && !($$0 instanceof ub)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         tz $$3 = $$0 instanceof tz $$2 ? $$2.k() : new tz();
         List<uy> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            uy $$3x = (uy)$$2x.getFirst();
            if ($$3x instanceof uw $$4x) {
               uw var10000 = $$4x;

               try {
                  var8 = var10000.k();
               } catch (Throwable var7) {
                  throw new MatchException(var7.toString(), var7);
               }

               String $$5 = var8;
               $$3.a($$5, (uy)$$2x.getSecond());
            } else {
               $$4.add($$3x);
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<uy> a(uy $$0, Map<uy, uy> $$1) {
      if (!($$0 instanceof tz) && !($$0 instanceof ub)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         tz $$3 = $$0 instanceof tz $$2 ? $$2.k() : new tz();
         List<uy> $$4 = new ArrayList<>();

         for (Entry<uy, uy> $$5 : $$1.entrySet()) {
            uy $$6 = $$5.getKey();
            if ($$6 instanceof uw) {
               uw var8 = (uw)$$6;
               uw var13 = var8;

               try {
                  var14 = var13.k();
               } catch (Throwable var11) {
                  throw new MatchException(var11.toString(), var11);
               }

               String var10 = var14;
               $$3.a(var10, $$5.getValue());
            } else {
               $$4.add($$6);
            }
         }

         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<Stream<Pair<uy, uy>>> c(uy $$0) {
      return $$0 instanceof tz $$1
         ? DataResult.success($$1.g().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (uy)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<uy, uy>>> d(uy $$0) {
      return $$0 instanceof tz $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, uy> $$2 : $$1.g()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<uy>> e(uy $$0) {
      return $$0 instanceof tz $$1 ? DataResult.success(new MapLike<uy>() {
         @Nullable
         public uy a(uy $$0) {
            if ($$0 instanceof uw var2) {
               uw var10000 = var2;

               try {
                  var6 = var10000.k();
               } catch (Throwable var5) {
                  throw new MatchException(var5.toString(), var5);
               }

               String var4 = var6;
               return $$1.a(var4);
            } else {
               throw new UnsupportedOperationException("Cannot get map entry with non-string key: " + $$0);
            }
         }

         @Nullable
         public uy a(String $$0) {
            return $$1.a($$0);
         }

         public Stream<Pair<uy, uy>> entries() {
            return $$1.g().stream().map($$0 -> Pair.of(un.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public uy a(Stream<Pair<uy, uy>> $$0) {
      tz $$1 = new tz();
      $$0.forEach($$1x -> {
         uy $$2 = (uy)$$1x.getFirst();
         uy $$3 = (uy)$$1x.getSecond();
         if ($$2 instanceof uw $$4) {
            uw var10000 = $$4;

            try {
               var8 = var10000.k();
            } catch (Throwable var7) {
               throw new MatchException(var7.toString(), var7);
            }

            String $$5 = var8;
            $$1.a($$5, $$3);
         } else {
            throw new UnsupportedOperationException("Cannot create map with non-string key: " + $$2);
         }
      });
      return $$1;
   }

   public DataResult<Stream<uy>> f(uy $$0) {
      return $$0 instanceof ty $$1 ? DataResult.success($$1.stream()) : DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<uy>>> g(uy $$0) {
      return $$0 instanceof ty $$1 ? DataResult.success($$1::forEach) : DataResult.error(() -> "Not a list: " + $$0);
   }

   public DataResult<ByteBuffer> h(uy $$0) {
      return $$0 instanceof tw $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public uy a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new tw($$2);
   }

   public DataResult<IntStream> i(uy $$0) {
      return $$0 instanceof ud $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public uy a(IntStream $$0) {
      return new ud($$0.toArray());
   }

   public DataResult<LongStream> j(uy $$0) {
      return $$0 instanceof ug $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public uy a(LongStream $$0) {
      return new ug($$0.toArray());
   }

   public uy b(Stream<uy> $$0) {
      return new uf($$0.toList());
   }

   public uy a(uy $$0, String $$1) {
      if ($$0 instanceof tz $$2) {
         tz $$3 = $$2.k();
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

   public RecordBuilder<uy> mapBuilder() {
      return new un.f();
   }

   private static Optional<un.d> k(uy $$0) {
      if ($$0 instanceof ub) {
         return Optional.of(new un.b());
      } else if ($$0 instanceof ty $$1) {
         if ($$1.isEmpty()) {
            return Optional.of(new un.b());
         } else {
            Objects.requireNonNull($$1);

            return switch ($$1) {
               case uf $$2 -> Optional.of(new un.b($$2));
               case tw $$3 -> Optional.of(new un.a($$3.e()));
               case ud $$4 -> Optional.of(new un.c($$4.g()));
               case ug $$5 -> Optional.of(new un.e($$5.g()));
               default -> throw new MatchException(null, null);
            };
         }
      } else {
         return Optional.empty();
      }
   }

   static class a implements un.d {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public un.d a(uy $$0) {
         if ($$0 instanceof tx $$1) {
            this.a.add($$1.j());
            return this;
         } else {
            return new un.b(this.a).a($$0);
         }
      }

      @Override
      public uy a() {
         return new tw(this.a.toByteArray());
      }
   }

   static class b implements un.d {
      private final uf a = new uf();

      b() {
      }

      b(uf $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(ue.a($$0x)));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(tx.a($$0x)));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(uh.a($$0x)));
      }

      @Override
      public un.d a(uy $$0) {
         this.a.add($$0);
         return this;
      }

      @Override
      public uy a() {
         return this.a;
      }
   }

   static class c implements un.d {
      private final IntArrayList a = new IntArrayList();

      public c(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public un.d a(uy $$0) {
         if ($$0 instanceof ue $$1) {
            this.a.add($$1.h());
            return this;
         } else {
            return new un.b(this.a).a($$0);
         }
      }

      @Override
      public uy a() {
         return new ud(this.a.toIntArray());
      }
   }

   interface d {
      un.d a(uy var1);

      default un.d a(Iterable<uy> $$0) {
         un.d $$1 = this;

         for (uy $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default un.d a(Stream<uy> $$0) {
         return this.a($$0::iterator);
      }

      uy a();
   }

   static class e implements un.d {
      private final LongArrayList a = new LongArrayList();

      public e(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public un.d a(uy $$0) {
         if ($$0 instanceof uh $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new un.b(this.a).a($$0);
         }
      }

      @Override
      public uy a() {
         return new ug(this.a.toLongArray());
      }
   }

   class f extends AbstractStringBuilder<uy, tz> {
      protected f() {
         super(un.this);
      }

      protected tz a() {
         return new tz();
      }

      protected tz a(String $$0, uy $$1, tz $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<uy> a(tz $$0, uy $$1) {
         if ($$1 == null || $$1 == ub.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof tz $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            tz $$3 = $$2.k();

            for (Entry<String, uy> $$4 : $$0.g()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
