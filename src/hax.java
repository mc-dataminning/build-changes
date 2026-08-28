import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hax {
   Codec<hax> a = hax.d.d.dispatch(hax::a, hax.d::a);
   hax b = new hax.b();

   hax.d a();

   public static record a(int d, int e, hax.a.a f, boolean g) implements hax {
      public static final MapCodec<hax.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayv.m.fieldOf("width").forGetter(hax.a::b),
                     ayv.m.fieldOf("height").forGetter(hax.a::c),
                     hax.a.a.g.fieldOf("border").forGetter(hax.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hax.a::e)
                  )
                  .apply($$0, hax.a::new)
         )
         .validate(hax.a::a);

      private static DataResult<hax.a> a(hax.a $$0) {
         hax.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hax.d a() {
         return hax.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hax.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hax.a.a> e = ayv.m.flatComapMap($$0 -> new hax.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hax.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayv.l.fieldOf("left").forGetter(hax.a.a::a),
                     ayv.l.fieldOf("top").forGetter(hax.a.a::b),
                     ayv.l.fieldOf("right").forGetter(hax.a.a::c),
                     ayv.l.fieldOf("bottom").forGetter(hax.a.a::d)
                  )
                  .apply($$0, hax.a.a::new)
         );
         static final Codec<hax.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hax {
      public static final MapCodec<hax.b> c = MapCodec.unit(hax.b::new);

      @Override
      public hax.d a() {
         return hax.d.a;
      }
   }

   public static record c(int d, int e) implements hax {
      public static final MapCodec<hax.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayv.m.fieldOf("width").forGetter(hax.c::b), ayv.m.fieldOf("height").forGetter(hax.c::c)).apply($$0, hax.c::new)
      );

      @Override
      public hax.d a() {
         return hax.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bai {
      a("stretch", hax.b.c),
      b("tile", hax.c.c),
      c("nine_slice", hax.a.c);

      public static final Codec<hax.d> d = bai.a(hax.d::values);
      private final String e;
      private final MapCodec<? extends hax> f;

      private d(final String $$0, final MapCodec<? extends hax> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hax> a() {
         return this.f;
      }
   }
}
