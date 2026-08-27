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

public class uy implements DynamicOps<vh> {
   public static final uy a = new uy();
   private static final String b = "";

   protected uy() {
   }

   public vh a() {
      return um.b;
   }

   public <U> U a(DynamicOps<U> $$0, vh $$1) {
      switch ($$1.b()) {
         case 0:
            return (U)$$0.empty();
         case 1:
            return (U)$$0.createByte(((va)$$1).i());
         case 2:
            return (U)$$0.createShort(((va)$$1).h());
         case 3:
            return (U)$$0.createInt(((va)$$1).g());
         case 4:
            return (U)$$0.createLong(((va)$$1).f());
         case 5:
            return (U)$$0.createFloat(((va)$$1).k());
         case 6:
            return (U)$$0.createDouble(((va)$$1).j());
         case 7:
            return (U)$$0.createByteList(ByteBuffer.wrap(((uh)$$1).e()));
         case 8:
            return (U)$$0.createString($$1.s_());
         case 9:
            return (U)this.convertList($$0, $$1);
         case 10:
            return (U)this.convertMap($$0, $$1);
         case 11:
            return (U)$$0.createIntList(Arrays.stream(((uo)$$1).g()));
         case 12:
            return (U)$$0.createLongList(Arrays.stream(((ur)$$1).g()));
         default:
            throw new IllegalStateException("Unknown tag type: " + $$1);
      }
   }

   public DataResult<Number> a(vh $$0) {
      return $$0 instanceof va $$1 ? DataResult.success($$1.l()) : DataResult.error(() -> "Not a number");
   }

   public vh a(Number $$0) {
      return ul.a($$0.doubleValue());
   }

   public vh a(byte $$0) {
      return ui.a($$0);
   }

   public vh a(short $$0) {
      return vc.a($$0);
   }

   public vh a(int $$0) {
      return up.a($$0);
   }

   public vh a(long $$0) {
      return us.a($$0);
   }

   public vh a(float $$0) {
      return un.a($$0);
   }

   public vh a(double $$0) {
      return ul.a($$0);
   }

   public vh a(boolean $$0) {
      return ui.a($$0);
   }

   public DataResult<String> b(vh $$0) {
      return $$0 instanceof vf $$1 ? DataResult.success($$1.s_()) : DataResult.error(() -> "Not a string");
   }

   public vh a(String $$0) {
      return vf.a($$0);
   }

   public DataResult<vh> a(vh $$0, vh $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vh> a(vh $$0, List<vh> $$1) {
      return k($$0).map($$1x -> DataResult.success($$1x.a($$1).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + $$0, $$0));
   }

   public DataResult<vh> a(vh $$0, vh $$1, vh $$2) {
      if (!($$0 instanceof uk) && !($$0 instanceof um)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else if (!($$1 instanceof vf)) {
         return DataResult.error(() -> "key is not a string: " + $$1, $$0);
      } else {
         uk $$3 = new uk();
         if ($$0 instanceof uk $$4) {
            $$4.e().forEach($$2x -> $$3.a($$2x, $$4.c($$2x)));
         }

         $$3.a($$1.s_(), $$2);
         return DataResult.success($$3);
      }
   }

   public DataResult<vh> a(vh $$0, MapLike<vh> $$1) {
      if (!($$0 instanceof uk) && !($$0 instanceof um)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + $$0, $$0);
      } else {
         uk $$2 = new uk();
         if ($$0 instanceof uk $$3) {
            $$3.e().forEach($$2x -> $$2.a($$2x, $$3.c($$2x)));
         }

         List<vh> $$4 = Lists.newArrayList();
         $$1.entries().forEach($$2x -> {
            vh $$3 = (vh)$$2x.getFirst();
            if (!($$3 instanceof vf)) {
               $$4.add($$3);
            } else {
               $$2.a($$3.s_(), (vh)$$2x.getSecond());
            }
         });
         return !$$4.isEmpty() ? DataResult.error(() -> "some keys are not strings: " + $$4, $$2) : DataResult.success($$2);
      }
   }

   public DataResult<Stream<Pair<vh, vh>>> c(vh $$0) {
      return $$0 instanceof uk $$1
         ? DataResult.success($$1.e().stream().map($$1x -> Pair.of(this.a($$1x), $$1.c($$1x))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<vh, vh>>> d(vh $$0) {
      return $$0 instanceof uk $$1
         ? DataResult.success((Consumer<BiConsumer>)$$1x -> $$1.e().forEach($$2 -> $$1x.accept(this.a($$2), $$1.c($$2))))
         : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<MapLike<vh>> e(vh $$0) {
      return $$0 instanceof uk $$1 ? DataResult.success(new MapLike<vh>() {
         @Nullable
         public vh a(vh $$0) {
            return $$1.c($$0.s_());
         }

         @Nullable
         public vh a(String $$0) {
            return $$1.c($$0);
         }

         public Stream<Pair<vh, vh>> entries() {
            return $$1.e().stream().map($$1xx -> Pair.of(uy.this.a($$1xx), $$1.c($$1xx)));
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public vh a(Stream<Pair<vh, vh>> $$0) {
      uk $$1 = new uk();
      $$0.forEach($$1x -> $$1.a(((vh)$$1x.getFirst()).s_(), (vh)$$1x.getSecond()));
      return $$1;
   }

   private static vh a(uk $$0) {
      if ($$0.f() == 1) {
         vh $$1 = $$0.c("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   public DataResult<Stream<vh>> f(vh $$0) {
      if ($$0 instanceof uq $$1) {
         return $$1.f() == 10 ? DataResult.success($$1.stream().map($$0x -> a((uk)$$0x))) : DataResult.success($$1.stream());
      } else {
         return $$0 instanceof uj<?> $$2 ? DataResult.success($$2.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not a list");
      }
   }

   public DataResult<Consumer<Consumer<vh>>> g(vh $$0) {
      if ($$0 instanceof uq $$1) {
         return $$1.f() == 10
            ? DataResult.success((Consumer<Consumer>)$$1x -> $$1.forEach($$1xx -> $$1.accept(a((uk)$$1xx))))
            : DataResult.success($$1::forEach);
      } else {
         return $$0 instanceof uj<?> $$2 ? DataResult.success($$2::forEach) : DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<ByteBuffer> h(vh $$0) {
      return $$0 instanceof uh $$1 ? DataResult.success(ByteBuffer.wrap($$1.e())) : super.getByteBuffer($$0);
   }

   public vh a(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      byte[] $$2 = new byte[$$0.capacity()];
      $$1.get(0, $$2, 0, $$2.length);
      return new uh($$2);
   }

   public DataResult<IntStream> i(vh $$0) {
      return $$0 instanceof uo $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getIntStream($$0);
   }

   public vh a(IntStream $$0) {
      return new uo($$0.toArray());
   }

   public DataResult<LongStream> j(vh $$0) {
      return $$0 instanceof ur $$1 ? DataResult.success(Arrays.stream($$1.g())) : super.getLongStream($$0);
   }

   public vh a(LongStream $$0) {
      return new ur($$0.toArray());
   }

   public vh b(Stream<vh> $$0) {
      return uy.d.a.a($$0).a();
   }

   public vh a(vh $$0, String $$1) {
      if ($$0 instanceof uk $$2) {
         uk $$3 = new uk();
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

   public RecordBuilder<vh> mapBuilder() {
      return new uy.h();
   }

   private static Optional<uy.f> k(vh $$0) {
      if ($$0 instanceof um) {
         return Optional.of(uy.d.a);
      } else {
         if ($$0 instanceof uj<?> $$1) {
            if ($$1.isEmpty()) {
               return Optional.of(uy.d.a);
            }

            if ($$1 instanceof uq $$2) {
               return switch ($$2.f()) {
                  case 0 -> Optional.of(uy.d.a);
                  case 10 -> Optional.of(new uy.b($$2));
                  default -> Optional.of(new uy.c($$2));
               };
            }

            if ($$1 instanceof uh $$3) {
               return Optional.of(new uy.a($$3.e()));
            }

            if ($$1 instanceof uo $$4) {
               return Optional.of(new uy.e($$4.g()));
            }

            if ($$1 instanceof ur $$5) {
               return Optional.of(new uy.g($$5.g()));
            }
         }

         return Optional.empty();
      }
   }

   static class a implements uy.f {
      private final ByteArrayList a = new ByteArrayList();

      public a(byte $$0) {
         this.a.add($$0);
      }

      public a(byte[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uy.f a(vh $$0) {
         if ($$0 instanceof ui $$1) {
            this.a.add($$1.i());
            return this;
         } else {
            return new uy.b(this.a).a($$0);
         }
      }

      @Override
      public vh a() {
         return new uh(this.a.toByteArray());
      }
   }

   static class b implements uy.f {
      private final uq a = new uq();

      public b() {
      }

      public b(Collection<vh> $$0) {
         this.a.addAll($$0);
      }

      public b(IntArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(up.a($$0x))));
      }

      public b(ByteArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(ui.a($$0x))));
      }

      public b(LongArrayList $$0) {
         $$0.forEach($$0x -> this.a.add(c(us.a($$0x))));
      }

      private static boolean a(uk $$0) {
         return $$0.f() == 1 && $$0.e("");
      }

      private static vh b(vh $$0) {
         if ($$0 instanceof uk $$1 && !a($$1)) {
            return $$1;
         }

         return c($$0);
      }

      private static uk c(vh $$0) {
         uk $$1 = new uk();
         $$1.a("", $$0);
         return $$1;
      }

      @Override
      public uy.f a(vh $$0) {
         this.a.add(b($$0));
         return this;
      }

      @Override
      public vh a() {
         return this.a;
      }
   }

   static class c implements uy.f {
      private final uq a = new uq();

      c(vh $$0) {
         this.a.add($$0);
      }

      c(uq $$0) {
         this.a.addAll($$0);
      }

      @Override
      public uy.f a(vh $$0) {
         if ($$0.b() != this.a.f()) {
            return new uy.b().a(this.a).a($$0);
         } else {
            this.a.add($$0);
            return this;
         }
      }

      @Override
      public vh a() {
         return this.a;
      }
   }

   static class d implements uy.f {
      public static final uy.d a = new uy.d();

      private d() {
      }

      @Override
      public uy.f a(vh $$0) {
         if ($$0 instanceof uk $$1) {
            return new uy.b().a($$1);
         } else if ($$0 instanceof ui $$2) {
            return new uy.a($$2.i());
         } else if ($$0 instanceof up $$3) {
            return new uy.e($$3.g());
         } else {
            return (uy.f)($$0 instanceof us $$4 ? new uy.g($$4.f()) : new uy.c($$0));
         }
      }

      @Override
      public vh a() {
         return new uq();
      }
   }

   static class e implements uy.f {
      private final IntArrayList a = new IntArrayList();

      public e(int $$0) {
         this.a.add($$0);
      }

      public e(int[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uy.f a(vh $$0) {
         if ($$0 instanceof up $$1) {
            this.a.add($$1.g());
            return this;
         } else {
            return new uy.b(this.a).a($$0);
         }
      }

      @Override
      public vh a() {
         return new uo(this.a.toIntArray());
      }
   }

   interface f {
      uy.f a(vh var1);

      default uy.f a(Iterable<vh> $$0) {
         uy.f $$1 = this;

         for (vh $$2 : $$0) {
            $$1 = $$1.a($$2);
         }

         return $$1;
      }

      default uy.f a(Stream<vh> $$0) {
         return this.a($$0::iterator);
      }

      vh a();
   }

   static class g implements uy.f {
      private final LongArrayList a = new LongArrayList();

      public g(long $$0) {
         this.a.add($$0);
      }

      public g(long[] $$0) {
         this.a.addElements(0, $$0);
      }

      @Override
      public uy.f a(vh $$0) {
         if ($$0 instanceof us $$1) {
            this.a.add($$1.f());
            return this;
         } else {
            return new uy.b(this.a).a($$0);
         }
      }

      @Override
      public vh a() {
         return new ur(this.a.toLongArray());
      }
   }

   class h extends AbstractStringBuilder<vh, uk> {
      protected h() {
         super(uy.this);
      }

      protected uk a() {
         return new uk();
      }

      protected uk a(String $$0, vh $$1, uk $$2) {
         $$2.a($$0, $$1);
         return $$2;
      }

      protected DataResult<vh> a(uk $$0, vh $$1) {
         if ($$1 == null || $$1 == um.b) {
            return DataResult.success($$0);
         } else if (!($$1 instanceof uk $$2)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + $$1, $$1);
         } else {
            uk $$3 = new uk(Maps.newHashMap($$2.i()));

            for (Entry<String, vh> $$4 : $$0.i().entrySet()) {
               $$3.a($$4.getKey(), $$4.getValue());
            }

            return DataResult.success($$3);
         }
      }
   }
}
