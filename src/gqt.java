import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gqt {
   Codec<gqt> a = gqt.d.d.dispatch(gqt::a, gqt.d::a);
   gqt b = new gqt.b();

   gqt.d a();

   public static record a(int d, int e, gqt.a.a f) implements gqt {
      public static final MapCodec<gqt.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayh.l.fieldOf("width").forGetter(gqt.a::b), ayh.l.fieldOf("height").forGetter(gqt.a::c), gqt.a.a.g.fieldOf("border").forGetter(gqt.a::d)
                  )
                  .apply($$0, gqt.a::new)
         )
         .validate(gqt.a::a);

      private static DataResult<gqt.a> a(gqt.a $$0) {
         gqt.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gqt.d a() {
         return gqt.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gqt.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gqt.a.a> e = ayh.l.flatComapMap($$0 -> new gqt.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gqt.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayh.k.fieldOf("left").forGetter(gqt.a.a::a),
                     ayh.k.fieldOf("top").forGetter(gqt.a.a::b),
                     ayh.k.fieldOf("right").forGetter(gqt.a.a::c),
                     ayh.k.fieldOf("bottom").forGetter(gqt.a.a::d)
                  )
                  .apply($$0, gqt.a.a::new)
         );
         static final Codec<gqt.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gqt {
      public static final MapCodec<gqt.b> c = MapCodec.unit(gqt.b::new);

      @Override
      public gqt.d a() {
         return gqt.d.a;
      }
   }

   public static record c(int d, int e) implements gqt {
      public static final MapCodec<gqt.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayh.l.fieldOf("width").forGetter(gqt.c::b), ayh.l.fieldOf("height").forGetter(gqt.c::c)).apply($$0, gqt.c::new)
      );

      @Override
      public gqt.d a() {
         return gqt.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azu {
      a("stretch", gqt.b.c),
      b("tile", gqt.c.c),
      c("nine_slice", gqt.a.c);

      public static final Codec<gqt.d> d = azu.a(gqt.d::values);
      private final String e;
      private final MapCodec<? extends gqt> f;

      private d(final String $$0, final MapCodec<? extends gqt> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gqt> a() {
         return this.f;
      }
   }
}
