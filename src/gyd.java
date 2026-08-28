import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gyd {
   Codec<gyd> a = gyd.d.d.dispatch(gyd::a, gyd.d::a);
   gyd b = new gyd.b();

   gyd.d a();

   public static record a(int d, int e, gyd.a.a f) implements gyd {
      public static final MapCodec<gyd.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayl.l.fieldOf("width").forGetter(gyd.a::b), ayl.l.fieldOf("height").forGetter(gyd.a::c), gyd.a.a.g.fieldOf("border").forGetter(gyd.a::d)
                  )
                  .apply($$0, gyd.a::new)
         )
         .validate(gyd.a::a);

      private static DataResult<gyd.a> a(gyd.a $$0) {
         gyd.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gyd.d a() {
         return gyd.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gyd.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gyd.a.a> e = ayl.l.flatComapMap($$0 -> new gyd.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gyd.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayl.k.fieldOf("left").forGetter(gyd.a.a::a),
                     ayl.k.fieldOf("top").forGetter(gyd.a.a::b),
                     ayl.k.fieldOf("right").forGetter(gyd.a.a::c),
                     ayl.k.fieldOf("bottom").forGetter(gyd.a.a::d)
                  )
                  .apply($$0, gyd.a.a::new)
         );
         static final Codec<gyd.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gyd {
      public static final MapCodec<gyd.b> c = MapCodec.unit(gyd.b::new);

      @Override
      public gyd.d a() {
         return gyd.d.a;
      }
   }

   public static record c(int d, int e) implements gyd {
      public static final MapCodec<gyd.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayl.l.fieldOf("width").forGetter(gyd.c::b), ayl.l.fieldOf("height").forGetter(gyd.c::c)).apply($$0, gyd.c::new)
      );

      @Override
      public gyd.d a() {
         return gyd.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azy {
      a("stretch", gyd.b.c),
      b("tile", gyd.c.c),
      c("nine_slice", gyd.a.c);

      public static final Codec<gyd.d> d = azy.a(gyd.d::values);
      private final String e;
      private final MapCodec<? extends gyd> f;

      private d(final String $$0, final MapCodec<? extends gyd> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gyd> a() {
         return this.f;
      }
   }
}
