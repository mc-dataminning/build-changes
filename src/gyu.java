import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gyu {
   Codec<gyu> a = gyu.d.d.dispatch(gyu::a, gyu.d::a);
   gyu b = new gyu.b();

   gyu.d a();

   public static record a(int d, int e, gyu.a.a f) implements gyu {
      public static final MapCodec<gyu.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aym.l.fieldOf("width").forGetter(gyu.a::b), aym.l.fieldOf("height").forGetter(gyu.a::c), gyu.a.a.g.fieldOf("border").forGetter(gyu.a::d)
                  )
                  .apply($$0, gyu.a::new)
         )
         .validate(gyu.a::a);

      private static DataResult<gyu.a> a(gyu.a $$0) {
         gyu.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gyu.d a() {
         return gyu.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gyu.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gyu.a.a> e = aym.l.flatComapMap($$0 -> new gyu.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gyu.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     aym.k.fieldOf("left").forGetter(gyu.a.a::a),
                     aym.k.fieldOf("top").forGetter(gyu.a.a::b),
                     aym.k.fieldOf("right").forGetter(gyu.a.a::c),
                     aym.k.fieldOf("bottom").forGetter(gyu.a.a::d)
                  )
                  .apply($$0, gyu.a.a::new)
         );
         static final Codec<gyu.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gyu {
      public static final MapCodec<gyu.b> c = MapCodec.unit(gyu.b::new);

      @Override
      public gyu.d a() {
         return gyu.d.a;
      }
   }

   public static record c(int d, int e) implements gyu {
      public static final MapCodec<gyu.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(aym.l.fieldOf("width").forGetter(gyu.c::b), aym.l.fieldOf("height").forGetter(gyu.c::c)).apply($$0, gyu.c::new)
      );

      @Override
      public gyu.d a() {
         return gyu.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azz {
      a("stretch", gyu.b.c),
      b("tile", gyu.c.c),
      c("nine_slice", gyu.a.c);

      public static final Codec<gyu.d> d = azz.a(gyu.d::values);
      private final String e;
      private final MapCodec<? extends gyu> f;

      private d(final String $$0, final MapCodec<? extends gyu> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gyu> a() {
         return this.f;
      }
   }
}
