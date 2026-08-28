import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hgc {
   Codec<hgc> a = hgc.d.d.dispatch(hgc::a, hgc.d::a);
   hgc b = new hgc.b();

   hgc.d a();

   public static record a(int d, int e, hgc.a.a f, boolean g) implements hgc {
      public static final MapCodec<hgc.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayi.m.fieldOf("width").forGetter(hgc.a::b),
                     ayi.m.fieldOf("height").forGetter(hgc.a::c),
                     hgc.a.a.g.fieldOf("border").forGetter(hgc.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hgc.a::e)
                  )
                  .apply($$0, hgc.a::new)
         )
         .validate(hgc.a::a);

      private static DataResult<hgc.a> a(hgc.a $$0) {
         hgc.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hgc.d a() {
         return hgc.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hgc.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hgc.a.a> e = ayi.m.flatComapMap($$0 -> new hgc.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hgc.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayi.l.fieldOf("left").forGetter(hgc.a.a::a),
                     ayi.l.fieldOf("top").forGetter(hgc.a.a::b),
                     ayi.l.fieldOf("right").forGetter(hgc.a.a::c),
                     ayi.l.fieldOf("bottom").forGetter(hgc.a.a::d)
                  )
                  .apply($$0, hgc.a.a::new)
         );
         static final Codec<hgc.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hgc {
      public static final MapCodec<hgc.b> c = MapCodec.unit(hgc.b::new);

      @Override
      public hgc.d a() {
         return hgc.d.a;
      }
   }

   public static record c(int d, int e) implements hgc {
      public static final MapCodec<hgc.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayi.m.fieldOf("width").forGetter(hgc.c::b), ayi.m.fieldOf("height").forGetter(hgc.c::c)).apply($$0, hgc.c::new)
      );

      @Override
      public hgc.d a() {
         return hgc.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azv {
      a("stretch", hgc.b.c),
      b("tile", hgc.c.c),
      c("nine_slice", hgc.a.c);

      public static final Codec<hgc.d> d = azv.a(hgc.d::values);
      private final String e;
      private final MapCodec<? extends hgc> f;

      private d(final String $$0, final MapCodec<? extends hgc> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hgc> a() {
         return this.f;
      }
   }
}
