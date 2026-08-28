import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gqq {
   Codec<gqq> a = gqq.d.d.dispatch(gqq::a, gqq.d::a);
   gqq b = new gqq.b();

   gqq.d a();

   public static record a(int d, int e, gqq.a.a f) implements gqq {
      public static final MapCodec<gqq.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayg.l.fieldOf("width").forGetter(gqq.a::b), ayg.l.fieldOf("height").forGetter(gqq.a::c), gqq.a.a.g.fieldOf("border").forGetter(gqq.a::d)
                  )
                  .apply($$0, gqq.a::new)
         )
         .validate(gqq.a::a);

      private static DataResult<gqq.a> a(gqq.a $$0) {
         gqq.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gqq.d a() {
         return gqq.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gqq.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gqq.a.a> e = ayg.l.flatComapMap($$0 -> new gqq.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gqq.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayg.k.fieldOf("left").forGetter(gqq.a.a::a),
                     ayg.k.fieldOf("top").forGetter(gqq.a.a::b),
                     ayg.k.fieldOf("right").forGetter(gqq.a.a::c),
                     ayg.k.fieldOf("bottom").forGetter(gqq.a.a::d)
                  )
                  .apply($$0, gqq.a.a::new)
         );
         static final Codec<gqq.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gqq {
      public static final MapCodec<gqq.b> c = MapCodec.unit(gqq.b::new);

      @Override
      public gqq.d a() {
         return gqq.d.a;
      }
   }

   public static record c(int d, int e) implements gqq {
      public static final MapCodec<gqq.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayg.l.fieldOf("width").forGetter(gqq.c::b), ayg.l.fieldOf("height").forGetter(gqq.c::c)).apply($$0, gqq.c::new)
      );

      @Override
      public gqq.d a() {
         return gqq.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azt {
      a("stretch", gqq.b.c),
      b("tile", gqq.c.c),
      c("nine_slice", gqq.a.c);

      public static final Codec<gqq.d> d = azt.a(gqq.d::values);
      private final String e;
      private final MapCodec<? extends gqq> f;

      private d(final String $$0, final MapCodec<? extends gqq> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gqq> a() {
         return this.f;
      }
   }
}
