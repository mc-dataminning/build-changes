import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gra {
   Codec<gra> a = gra.d.d.dispatch(gra::a, gra.d::a);
   gra b = new gra.b();

   gra.d a();

   public static record a(int d, int e, gra.a.a f) implements gra {
      public static final MapCodec<gra.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     axm.l.fieldOf("width").forGetter(gra.a::b), axm.l.fieldOf("height").forGetter(gra.a::c), gra.a.a.g.fieldOf("border").forGetter(gra.a::d)
                  )
                  .apply($$0, gra.a::new)
         )
         .validate(gra.a::a);

      private static DataResult<gra.a> a(gra.a $$0) {
         gra.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gra.d a() {
         return gra.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gra.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gra.a.a> e = axm.l.flatComapMap($$0 -> new gra.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gra.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axm.k.fieldOf("left").forGetter(gra.a.a::a),
                     axm.k.fieldOf("top").forGetter(gra.a.a::b),
                     axm.k.fieldOf("right").forGetter(gra.a.a::c),
                     axm.k.fieldOf("bottom").forGetter(gra.a.a::d)
                  )
                  .apply($$0, gra.a.a::new)
         );
         static final Codec<gra.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gra {
      public static final MapCodec<gra.b> c = MapCodec.unit(gra.b::new);

      @Override
      public gra.d a() {
         return gra.d.a;
      }
   }

   public static record c(int d, int e) implements gra {
      public static final MapCodec<gra.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axm.l.fieldOf("width").forGetter(gra.c::b), axm.l.fieldOf("height").forGetter(gra.c::c)).apply($$0, gra.c::new)
      );

      @Override
      public gra.d a() {
         return gra.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements ayz {
      a("stretch", gra.b.c),
      b("tile", gra.c.c),
      c("nine_slice", gra.a.c);

      public static final Codec<gra.d> d = ayz.a(gra.d::values);
      private final String e;
      private final MapCodec<? extends gra> f;

      private d(final String $$0, final MapCodec<? extends gra> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gra> a() {
         return this.f;
      }
   }
}
