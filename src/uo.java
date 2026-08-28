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

public class uo implements DynamicOps<va> {
   public static final uo a = new uo();

   private uo() {
   }

   public va a() {
      return uc.b;
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public <U> U a(DynamicOps<U> $$0, va $$1) {
      Objects.requireNonNull($$1);
      Throwable var42;
      switch ($$1) {
         case uc $$2:
            return (U)$$0.empty();
         case ty var6:
            ty var54 = var6;

            try {
               var55 = var54.n();
            } catch (Throwable var33) {
               var42 = var33;
               boolean var61 = false;
               break;
            }

            byte var34 = var55;
            return (U)$$0.createByte(var34);
         case ut var8:
            ut var52 = var8;

            try {
               var53 = var52.n();
            } catch (Throwable var32) {
               var42 = var32;
               boolean var60 = false;
               break;
            }

            short var35 = var53;
            return (U)$$0.createShort(var35);
         case uf var10:
            uf var50 = var10;

            try {
               var51 = var50.n();
            } catch (Throwable var31) {
               var42 = var31;
               boolean var59 = false;
               break;
            }

            int var36 = var51;
            return (U)$$0.createInt(var36);
         case ui var12:
            ui var48 = var12;

            try {
               var49 = var48.n();
            } catch (Throwable var30) {
               var42 = var30;
               boolean var58 = false;
               break;
            }

            long var37 = var49;
            return (U)$$0.createLong(var37);
         case ud var15:
            ud var46 = var15;

            try {
               var47 = var46.n();
            } catch (Throwable var29) {
               var42 = var29;
               boolean var57 = false;
               break;
            }

            float var38 = var47;
            return (U)$$0.createFloat(var38);
         case ub var17:
            ub var44 = var17;

            try {
               var45 = var44.n();
            } catch (Throwable var28) {
               var42 = var28;
               boolean var56 = false;
               break;
            }

            double var39 = var45;
            return (U)$$0.createDouble(var39);
         case tx $$9:
            return (U)$$0.createByteList(ByteBuffer.wrap($$9.e()));
         case uy var21:
            uy var41 = var21;

            try {
               var43 = var41.k();
            } catch (Throwable var27) {
               var42 = var27;
               boolean var10001 = false;
               break;
            }

            String var40 = var43;
            return (U)$$0.createString(var40);
         case ug $$11:
            return (U)this.convertList($$0, $$11);
         case ua $$12:
            return (U)this.convertMap($$0, $$12);
         case ue $$13:
            return (U)$$0.createIntList(Arrays.stream($$13.g()));
         case uh $$14:
            return (U)$$0.createLongList(Arrays.stream($$14.g()));
         default:
            throw new MatchException(null, null);
      }

      Throwable var3 = var42;
      throw new MatchException(var3.toString(), var3);
   }

   public DataResult<Number> a(va $$0) {
      return $$0.o().<DataResult<Number>>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Not a number"));
   }

   public va a(Number $$0) {
      return ub.a($$0.doubleValue());
   }

   public va a(byte $$0) {
      return ty.a($$0);
   }

   public va a(short $$0) {
      return ut.a($$0);
   }

   public va a(int $$0) {
      return uf.a($$0);
   }

   public va a(long $$0) {
      return ui.a($$0);
   }

   public va a(float $$0) {
      return ud.a($$0);
   }

   public va a(double $$0) {
      return ub.a($$0);
   }

   public va a(boolean $$0) {
      return ty.a($$0);
   }

   public DataResult<String> b(va $$0) {
      if ($$0 instanceof uy var2) {
         uy var10000 = var2;

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
      if (!($$0 instanceof ua) && !($$0 instanceof uc)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if ($$1 instanceof uy $$6) {
         uy var10000 = $$6;

         try {
            var10 = var10000.k();
         } catch (Throwable var7) {
            throw new MatchException(var7.toString(), var7);
         }

         String $$5 = var10;
         ua $$6x = $$0 instanceof ua $$5x ? $$5x.k() : new ua();
         $$6x.a($$5, $$2);
         return DataResult.success($$6x);
      } else {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      }
   }

   public DataResult<va> a(va $$0, MapLike<va> $$1) {
      if (!($$0 instanceof ua) && !($$0 instanceof uc)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ua $$3 = $$0 instanceof ua $$2 ? $$2.k() : new ua();
         List<va> $$4 = new ArrayList<>();
         $$1.entries().forEach($$2x -> {
            va $$3x = (va)$$2x.getFirst();
            if ($$3x instanceof uy $$4x) {
               uy var10000 = $$4x;

               try {
                  var8 = var10000.k();
               } catch (Throwable var7) {
                  throw new MatchException(var7.toString(), var7);
               }

               String $$5 = var8;
               $$3.a($$5, (va)$$2x.getSecond());
            } else {
               $$4.add($$3x);
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$3) : DataResult.success($$3);
      }
   }

   public DataResult<va> a(va $$0, Map<va, va> $$1) {
      if (!($$0 instanceof ua) && !($$0 instanceof uc)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         ua $$3 = $$0 instanceof ua $$2 ? $$2.k() : new ua();
         List<va> $$4 = new ArrayList<>();

         for (Entry<va, va> $$5 : $$1.entrySet()) {
            va $$6 = $$5.getKey();
            if ($$6 instanceof uy) {
               uy var8 = (uy)$$6;
               uy var13 = var8;

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

   public DataResult<Stream<Pair<va, va>>> c(va $$0) {
      return $$0 instanceof ua $$1
         ? DataResult.success($$1.g().stream().map($$0x -> Pair.of(this.a((String)$$0x.getKey()), (va)$$0x.getValue())))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<va, va>>> d(va $$0) {
      return $$0 instanceof ua $$1 ? DataResult.success((Consumer<BiConsumer>)$$1x -> {
         for (Entry<String, va> $$2 : $$1.g()) {
            $$1x.accept(this.a($$2.getKey()), $$2.getValue());
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<va>> e(va $$0) {
      return $$0 instanceof ua $$1 ? DataResult.success(new MapLike<va>() {
         @Nullable
         public va a(va $$0) {
            if ($$0 instanceof uy var2) {
               uy var10000 = var2;

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
         public va a(String $$0) {
            return $$1.a($$0);
         }

         public Stream<Pair<va, va>> entries() {
            return $$1.g().stream().map($$0 -> Pair.of(uo.this.a($$0.getKey()), $$0.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public va a(Stream<Pair<va, va>> $$0) {
      ua $$1 = new ua();
      $$0.forEach($$1x -> {
         va $$2 = (va)$$1x.getFirst();
         va $$3 = (va)$$1x.getSecond();
         if ($$2 instanceof uy $$4) {
            uy var10000 = $$4;

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

   public DataResult<Stream<va>> f(va $$0) {
      return $$0 instanceof tz $$1 ? DataResult.success($$1.stream()) : DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<va>>> g(va $$0) {
      return $$0 instanceof tz $$1 ? DataResult.success($$1::forEach) : DataResult.error(() -> "Not a list: " + $$0);
   }

   public DataResult<ByteBuffer> h(va $$0) {
      return $$0 instanceof tx $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public va a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new tx($$2);
   }

   public DataResult<IntStream> i(va $$0) {
      return $$0 instanceof ue $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public va a(IntStream $$0) {
      return new ue($$0.toArray());
   }

   public DataResult<LongStream> j(va $$0) {
      return $$0 instanceof uh $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public va a(LongStream $$0) {
      return new uh($$0.toArray());
   }

   public va b(Stream<va> $$0) {
      return new ug($$0.collect(ag.b()));
   }

   public va a(va $$0, String $$1) {
      if ($$0 instanceof ua $$2) {
         ua $$3 = $$2.k();
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

   public RecordBuilder<va> mapBuilder() {
      return new uo.f();
   }

   private static Optional<uo.d> k(va $$0) {
      if ($$0 instanceof uc) {
         return Optional.of(new uo.b());
      } else if ($$0 instanceof tz $$1) {
         if ($$1.isEmpty()) {
            return Optional.of(new uo.b());
         } else {
            Objects.requireNonNull($$1);

            return switch ($$1) {
               case ug $$2 -> Optional.of(new uo.b($$2));
               case tx $$3 -> Optional.of(new uo.a($$3.e()));
               case ue $$4 -> Optional.of(new uo.c($$4.g()));
               case uh $$5 -> Optional.of(new uo.e($$5.g()));
               default -> throw new MatchException(null, null);
            };
         }
      } else {
         return Optional.empty();
      }
   }

   static class a implements uo.d {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uo.d a(va $$0) {
         if ($$0 instanceof ty $$1) {
            this.a.add($$1.j());
            return this;
         } else {
            return new uo.b(this.a).a($$0);
         }
      }

      @Override
      public va a() {
         return new tx(this.a.toByteArray());
      }
   }

   static class b implements uo.d {
      private final ug a = new ug();

      b() {
      }

      b(ug $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(uf.a($$0x)));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(ty.a($$0x)));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(ui.a($$0x)));
      }

      @Override
      public uo.d a(va $$0) {
         this.a.add($$0);
         return this;
      }

      @Override
      public va a() {
         return this.a;
      }
   }

   static class c implements uo.d {
      private final IntArrayList a = new IntArrayList();

      public c(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uo.d a(va $$0) {
         if ($$0 instanceof uf $$1) {
            this.a.add($$1.h());
            return this;
         } else {
            return new uo.b(this.a).a($$0);
         }
      }

      @Override
      public va a() {
         return new ue(this.a.toIntArray());
      }
   }

   interface d {
      uo.d a(va var1);

      default uo.d a(Iterable<va> $$0) {
         uo.d $$1 = this;

         for (va $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default uo.d a(Stream<va> $$0) {
         return this.a($$0::iterator);
      }

      va a();
   }

   static class e implements uo.d {
      private final LongArrayList a = new LongArrayList();

      public e(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uo.d a(va $$0) {
         if ($$0 instanceof ui $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new uo.b(this.a).a($$0);
         }
      }

      @Override
      public va a() {
         return new uh(this.a.toLongArray());
      }
   }

   class f extends AbstractStringBuilder<va, ua> {
      protected f() {
         super(uo.this);
      }

      protected ua a() {
         return new ua();
      }

      protected ua a(String $$0, va $$1, ua $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<va> a(ua $$0, va $$1) {
         if ($$1 == null || $$1 == uc.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof ua $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            ua $$3 = $$2.k();

            for (Entry<String, va> $$4 : $$0.g()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
