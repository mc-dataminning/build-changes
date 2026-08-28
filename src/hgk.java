import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hgk {
   Codec<hgk> a = hgk.d.d.dispatch(hgk::a, hgk.d::a);
   hgk b = new hgk.b();

   hgk.d a();

   public static record a(int d, int e, hgk.a.a f, boolean g) implements hgk {
      public static final MapCodec<hgk.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayi.m.fieldOf("width").forGetter(hgk.a::b),
                     ayi.m.fieldOf("height").forGetter(hgk.a::c),
                     hgk.a.a.g.fieldOf("border").forGetter(hgk.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hgk.a::e)
                  )
                  .apply($$0, hgk.a::new)
         )
         .validate(hgk.a::a);

      private static DataResult<hgk.a> a(hgk.a $$0) {
         hgk.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hgk.d a() {
         return hgk.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hgk.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hgk.a.a> e = ayi.m.flatComapMap($$0 -> new hgk.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hgk.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayi.l.fieldOf("left").forGetter(hgk.a.a::a),
                     ayi.l.fieldOf("top").forGetter(hgk.a.a::b),
                     ayi.l.fieldOf("right").forGetter(hgk.a.a::c),
                     ayi.l.fieldOf("bottom").forGetter(hgk.a.a::d)
                  )
                  .apply($$0, hgk.a.a::new)
         );
         static final Codec<hgk.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hgk {
      public static final MapCodec<hgk.b> c = MapCodec.unit(hgk.b::new);

      @Override
      public hgk.d a() {
         return hgk.d.a;
      }
   }

   public static record c(int d, int e) implements hgk {
      public static final MapCodec<hgk.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayi.m.fieldOf("width").forGetter(hgk.c::b), ayi.m.fieldOf("height").forGetter(hgk.c::c)).apply($$0, hgk.c::new)
      );

      @Override
      public hgk.d a() {
         return hgk.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azv {
      a("stretch", hgk.b.c),
      b("tile", hgk.c.c),
      c("nine_slice", hgk.a.c);

      public static final Codec<hgk.d> d = azv.a(hgk.d::values);
      private final String e;
      private final MapCodec<? extends hgk> f;

      private d(final String $$0, final MapCodec<? extends hgk> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hgk> a() {
         return this.f;
      }
   }
}
