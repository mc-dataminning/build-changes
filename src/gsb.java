import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gsb {
   Codec<gsb> a = gsb.d.d.dispatch(gsb::a, gsb.d::a);
   gsb b = new gsb.b();

   gsb.d a();

   public static record a(int d, int e, gsb.a.a f) implements gsb {
      public static final MapCodec<gsb.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     axw.l.fieldOf("width").forGetter(gsb.a::b), axw.l.fieldOf("height").forGetter(gsb.a::c), gsb.a.a.g.fieldOf("border").forGetter(gsb.a::d)
                  )
                  .apply($$0, gsb.a::new)
         )
         .validate(gsb.a::a);

      private static DataResult<gsb.a> a(gsb.a $$0) {
         gsb.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gsb.d a() {
         return gsb.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gsb.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gsb.a.a> e = axw.l.flatComapMap($$0 -> new gsb.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gsb.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axw.k.fieldOf("left").forGetter(gsb.a.a::a),
                     axw.k.fieldOf("top").forGetter(gsb.a.a::b),
                     axw.k.fieldOf("right").forGetter(gsb.a.a::c),
                     axw.k.fieldOf("bottom").forGetter(gsb.a.a::d)
                  )
                  .apply($$0, gsb.a.a::new)
         );
         static final Codec<gsb.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gsb {
      public static final MapCodec<gsb.b> c = MapCodec.unit(gsb.b::new);

      @Override
      public gsb.d a() {
         return gsb.d.a;
      }
   }

   public static record c(int d, int e) implements gsb {
      public static final MapCodec<gsb.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axw.l.fieldOf("width").forGetter(gsb.c::b), axw.l.fieldOf("height").forGetter(gsb.c::c)).apply($$0, gsb.c::new)
      );

      @Override
      public gsb.d a() {
         return gsb.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azk {
      a("stretch", gsb.b.c),
      b("tile", gsb.c.c),
      c("nine_slice", gsb.a.c);

      public static final Codec<gsb.d> d = azk.a(gsb.d::values);
      private final String e;
      private final MapCodec<? extends gsb> f;

      private d(final String $$0, final MapCodec<? extends gsb> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gsb> a() {
         return this.f;
      }
   }
}
