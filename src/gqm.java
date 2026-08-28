import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gqm {
   Codec<gqm> a = gqm.d.d.dispatch(gqm::a, gqm.d::a);
   gqm b = new gqm.b();

   gqm.d a();

   public static record a(int d, int e, gqm.a.a f) implements gqm {
      public static final MapCodec<gqm.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayc.l.fieldOf("width").forGetter(gqm.a::b), ayc.l.fieldOf("height").forGetter(gqm.a::c), gqm.a.a.g.fieldOf("border").forGetter(gqm.a::d)
                  )
                  .apply($$0, gqm.a::new)
         )
         .validate(gqm.a::a);

      private static DataResult<gqm.a> a(gqm.a $$0) {
         gqm.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gqm.d a() {
         return gqm.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gqm.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gqm.a.a> e = ayc.l.flatComapMap($$0 -> new gqm.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gqm.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayc.k.fieldOf("left").forGetter(gqm.a.a::a),
                     ayc.k.fieldOf("top").forGetter(gqm.a.a::b),
                     ayc.k.fieldOf("right").forGetter(gqm.a.a::c),
                     ayc.k.fieldOf("bottom").forGetter(gqm.a.a::d)
                  )
                  .apply($$0, gqm.a.a::new)
         );
         static final Codec<gqm.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gqm {
      public static final MapCodec<gqm.b> c = MapCodec.unit(gqm.b::new);

      @Override
      public gqm.d a() {
         return gqm.d.a;
      }
   }

   public static record c(int d, int e) implements gqm {
      public static final MapCodec<gqm.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayc.l.fieldOf("width").forGetter(gqm.c::b), ayc.l.fieldOf("height").forGetter(gqm.c::c)).apply($$0, gqm.c::new)
      );

      @Override
      public gqm.d a() {
         return gqm.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azp {
      a("stretch", gqm.b.c),
      b("tile", gqm.c.c),
      c("nine_slice", gqm.a.c);

      public static final Codec<gqm.d> d = azp.a(gqm.d::values);
      private final String e;
      private final MapCodec<? extends gqm> f;

      private d(final String $$0, final MapCodec<? extends gqm> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gqm> a() {
         return this.f;
      }
   }
}
