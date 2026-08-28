import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gyz {
   Codec<gyz> a = gyz.d.d.dispatch(gyz::a, gyz.d::a);
   gyz b = new gyz.b();

   gyz.d a();

   public static record a(int d, int e, gyz.a.a f) implements gyz {
      public static final MapCodec<gyz.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayo.l.fieldOf("width").forGetter(gyz.a::b), ayo.l.fieldOf("height").forGetter(gyz.a::c), gyz.a.a.g.fieldOf("border").forGetter(gyz.a::d)
                  )
                  .apply($$0, gyz.a::new)
         )
         .validate(gyz.a::a);

      private static DataResult<gyz.a> a(gyz.a $$0) {
         gyz.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gyz.d a() {
         return gyz.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gyz.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gyz.a.a> e = ayo.l.flatComapMap($$0 -> new gyz.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gyz.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayo.k.fieldOf("left").forGetter(gyz.a.a::a),
                     ayo.k.fieldOf("top").forGetter(gyz.a.a::b),
                     ayo.k.fieldOf("right").forGetter(gyz.a.a::c),
                     ayo.k.fieldOf("bottom").forGetter(gyz.a.a::d)
                  )
                  .apply($$0, gyz.a.a::new)
         );
         static final Codec<gyz.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gyz {
      public static final MapCodec<gyz.b> c = MapCodec.unit(gyz.b::new);

      @Override
      public gyz.d a() {
         return gyz.d.a;
      }
   }

   public static record c(int d, int e) implements gyz {
      public static final MapCodec<gyz.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayo.l.fieldOf("width").forGetter(gyz.c::b), ayo.l.fieldOf("height").forGetter(gyz.c::c)).apply($$0, gyz.c::new)
      );

      @Override
      public gyz.d a() {
         return gyz.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bab {
      a("stretch", gyz.b.c),
      b("tile", gyz.c.c),
      c("nine_slice", gyz.a.c);

      public static final Codec<gyz.d> d = bab.a(gyz.d::values);
      private final String e;
      private final MapCodec<? extends gyz> f;

      private d(final String $$0, final MapCodec<? extends gyz> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gyz> a() {
         return this.f;
      }
   }
}
