import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gqs {
   Codec<gqs> a = gqs.d.d.dispatch(gqs::a, gqs.d::a);
   gqs b = new gqs.b();

   gqs.d a();

   public static record a(int d, int e, gqs.a.a f) implements gqs {
      public static final MapCodec<gqs.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayh.l.fieldOf("width").forGetter(gqs.a::b), ayh.l.fieldOf("height").forGetter(gqs.a::c), gqs.a.a.g.fieldOf("border").forGetter(gqs.a::d)
                  )
                  .apply($$0, gqs.a::new)
         )
         .validate(gqs.a::a);

      private static DataResult<gqs.a> a(gqs.a $$0) {
         gqs.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gqs.d a() {
         return gqs.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gqs.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gqs.a.a> e = ayh.l.flatComapMap($$0 -> new gqs.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gqs.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayh.k.fieldOf("left").forGetter(gqs.a.a::a),
                     ayh.k.fieldOf("top").forGetter(gqs.a.a::b),
                     ayh.k.fieldOf("right").forGetter(gqs.a.a::c),
                     ayh.k.fieldOf("bottom").forGetter(gqs.a.a::d)
                  )
                  .apply($$0, gqs.a.a::new)
         );
         static final Codec<gqs.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gqs {
      public static final MapCodec<gqs.b> c = MapCodec.unit(gqs.b::new);

      @Override
      public gqs.d a() {
         return gqs.d.a;
      }
   }

   public static record c(int d, int e) implements gqs {
      public static final MapCodec<gqs.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayh.l.fieldOf("width").forGetter(gqs.c::b), ayh.l.fieldOf("height").forGetter(gqs.c::c)).apply($$0, gqs.c::new)
      );

      @Override
      public gqs.d a() {
         return gqs.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azu {
      a("stretch", gqs.b.c),
      b("tile", gqs.c.c),
      c("nine_slice", gqs.a.c);

      public static final Codec<gqs.d> d = azu.a(gqs.d::values);
      private final String e;
      private final MapCodec<? extends gqs> f;

      private d(final String $$0, final MapCodec<? extends gqs> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gqs> a() {
         return this.f;
      }
   }
}
