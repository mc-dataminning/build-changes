import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gqp {
   Codec<gqp> a = gqp.d.d.dispatch(gqp::a, gqp.d::a);
   gqp b = new gqp.b();

   gqp.d a();

   public static record a(int d, int e, gqp.a.a f) implements gqp {
      public static final MapCodec<gqp.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayf.l.fieldOf("width").forGetter(gqp.a::b), ayf.l.fieldOf("height").forGetter(gqp.a::c), gqp.a.a.g.fieldOf("border").forGetter(gqp.a::d)
                  )
                  .apply($$0, gqp.a::new)
         )
         .validate(gqp.a::a);

      private static DataResult<gqp.a> a(gqp.a $$0) {
         gqp.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gqp.d a() {
         return gqp.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gqp.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gqp.a.a> e = ayf.l.flatComapMap($$0 -> new gqp.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gqp.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayf.k.fieldOf("left").forGetter(gqp.a.a::a),
                     ayf.k.fieldOf("top").forGetter(gqp.a.a::b),
                     ayf.k.fieldOf("right").forGetter(gqp.a.a::c),
                     ayf.k.fieldOf("bottom").forGetter(gqp.a.a::d)
                  )
                  .apply($$0, gqp.a.a::new)
         );
         static final Codec<gqp.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gqp {
      public static final MapCodec<gqp.b> c = MapCodec.unit(gqp.b::new);

      @Override
      public gqp.d a() {
         return gqp.d.a;
      }
   }

   public static record c(int d, int e) implements gqp {
      public static final MapCodec<gqp.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayf.l.fieldOf("width").forGetter(gqp.c::b), ayf.l.fieldOf("height").forGetter(gqp.c::c)).apply($$0, gqp.c::new)
      );

      @Override
      public gqp.d a() {
         return gqp.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azs {
      a("stretch", gqp.b.c),
      b("tile", gqp.c.c),
      c("nine_slice", gqp.a.c);

      public static final Codec<gqp.d> d = azs.a(gqp.d::values);
      private final String e;
      private final MapCodec<? extends gqp> f;

      private d(final String $$0, final MapCodec<? extends gqp> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gqp> a() {
         return this.f;
      }
   }
}
