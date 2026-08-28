import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface gri {
   Codec<gri> a = gri.d.d.dispatch(gri::a, gri.d::a);
   gri b = new gri.b();

   gri.d a();

   public static record a(int d, int e, gri.a.a f) implements gri {
      public static final MapCodec<gri.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     axo.l.fieldOf("width").forGetter(gri.a::b), axo.l.fieldOf("height").forGetter(gri.a::c), gri.a.a.g.fieldOf("border").forGetter(gri.a::d)
                  )
                  .apply($$0, gri.a::new)
         )
         .validate(gri.a::a);

      private static DataResult<gri.a> a(gri.a $$0) {
         gri.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gri.d a() {
         return gri.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gri.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gri.a.a> e = axo.l.flatComapMap($$0 -> new gri.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gri.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axo.k.fieldOf("left").forGetter(gri.a.a::a),
                     axo.k.fieldOf("top").forGetter(gri.a.a::b),
                     axo.k.fieldOf("right").forGetter(gri.a.a::c),
                     axo.k.fieldOf("bottom").forGetter(gri.a.a::d)
                  )
                  .apply($$0, gri.a.a::new)
         );
         static final Codec<gri.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gri {
      public static final MapCodec<gri.b> c = MapCodec.unit(gri.b::new);

      @Override
      public gri.d a() {
         return gri.d.a;
      }
   }

   public static record c(int d, int e) implements gri {
      public static final MapCodec<gri.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axo.l.fieldOf("width").forGetter(gri.c::b), axo.l.fieldOf("height").forGetter(gri.c::c)).apply($$0, gri.c::new)
      );

      @Override
      public gri.d a() {
         return gri.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azc {
      a("stretch", gri.b.c),
      b("tile", gri.c.c),
      c("nine_slice", gri.a.c);

      public static final Codec<gri.d> d = azc.a(gri.d::values);
      private final String e;
      private final MapCodec<? extends gri> f;

      private d(final String $$0, final MapCodec<? extends gri> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends gri> a() {
         return this.f;
      }
   }
}
