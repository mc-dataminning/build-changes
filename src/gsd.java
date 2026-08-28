import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gsd {
   Codec<gsd> a = gsd.d.d.dispatch(gsd::a, gsd.d::a);
   gsd b = new gsd.b();

   gsd.d a();

   public static record a(int d, int e, gsd.a.a f) implements gsd {
      public static final MapCodec<gsd.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     axw.l.fieldOf("width").forGetter(gsd.a::b), axw.l.fieldOf("height").forGetter(gsd.a::c), gsd.a.a.g.fieldOf("border").forGetter(gsd.a::d)
                  )
                  .apply($$0, gsd.a::new)
         )
         .validate(gsd.a::a);

      private static DataResult<gsd.a> a(gsd.a $$0) {
         gsd.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gsd.d a() {
         return gsd.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gsd.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gsd.a.a> e = axw.l.flatComapMap($$0 -> new gsd.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gsd.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axw.k.fieldOf("left").forGetter(gsd.a.a::a),
                     axw.k.fieldOf("top").forGetter(gsd.a.a::b),
                     axw.k.fieldOf("right").forGetter(gsd.a.a::c),
                     axw.k.fieldOf("bottom").forGetter(gsd.a.a::d)
                  )
                  .apply($$0, gsd.a.a::new)
         );
         static final Codec<gsd.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gsd {
      public static final MapCodec<gsd.b> c = MapCodec.unit(gsd.b::new);

      @Override
      public gsd.d a() {
         return gsd.d.a;
      }
   }

   public static record c(int d, int e) implements gsd {
      public static final MapCodec<gsd.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axw.l.fieldOf("width").forGetter(gsd.c::b), axw.l.fieldOf("height").forGetter(gsd.c::c)).apply($$0, gsd.c::new)
      );

      @Override
      public gsd.d a() {
         return gsd.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azk {
      a("stretch", gsd.b.c),
      b("tile", gsd.c.c),
      c("nine_slice", gsd.a.c);

      public static final Codec<gsd.d> d = azk.a(gsd.d::values);
      private final String e;
      private final MapCodec<? extends gsd> f;

      private d(final String $$0, final MapCodec<? extends gsd> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gsd> a() {
         return this.f;
      }
   }
}
