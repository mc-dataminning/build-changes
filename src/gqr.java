import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gqr {
   Codec<gqr> a = gqr.d.d.dispatch(gqr::a, gqr.d::a);
   gqr b = new gqr.b();

   gqr.d a();

   public static record a(int d, int e, gqr.a.a f) implements gqr {
      public static final MapCodec<gqr.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayh.l.fieldOf("width").forGetter(gqr.a::b), ayh.l.fieldOf("height").forGetter(gqr.a::c), gqr.a.a.g.fieldOf("border").forGetter(gqr.a::d)
                  )
                  .apply($$0, gqr.a::new)
         )
         .validate(gqr.a::a);

      private static DataResult<gqr.a> a(gqr.a $$0) {
         gqr.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gqr.d a() {
         return gqr.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gqr.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gqr.a.a> e = ayh.l.flatComapMap($$0 -> new gqr.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gqr.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayh.k.fieldOf("left").forGetter(gqr.a.a::a),
                     ayh.k.fieldOf("top").forGetter(gqr.a.a::b),
                     ayh.k.fieldOf("right").forGetter(gqr.a.a::c),
                     ayh.k.fieldOf("bottom").forGetter(gqr.a.a::d)
                  )
                  .apply($$0, gqr.a.a::new)
         );
         static final Codec<gqr.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gqr {
      public static final MapCodec<gqr.b> c = MapCodec.unit(gqr.b::new);

      @Override
      public gqr.d a() {
         return gqr.d.a;
      }
   }

   public static record c(int d, int e) implements gqr {
      public static final MapCodec<gqr.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayh.l.fieldOf("width").forGetter(gqr.c::b), ayh.l.fieldOf("height").forGetter(gqr.c::c)).apply($$0, gqr.c::new)
      );

      @Override
      public gqr.d a() {
         return gqr.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azu {
      a("stretch", gqr.b.c),
      b("tile", gqr.c.c),
      c("nine_slice", gqr.a.c);

      public static final Codec<gqr.d> d = azu.a(gqr.d::values);
      private final String e;
      private final MapCodec<? extends gqr> f;

      private d(final String $$0, final MapCodec<? extends gqr> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gqr> a() {
         return this.f;
      }
   }
}
