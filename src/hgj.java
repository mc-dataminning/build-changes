import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hgj {
   Codec<hgj> a = hgj.d.d.dispatch(hgj::a, hgj.d::a);
   hgj b = new hgj.b();

   hgj.d a();

   public static record a(int d, int e, hgj.a.a f, boolean g) implements hgj {
      public static final MapCodec<hgj.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayi.m.fieldOf("width").forGetter(hgj.a::b),
                     ayi.m.fieldOf("height").forGetter(hgj.a::c),
                     hgj.a.a.g.fieldOf("border").forGetter(hgj.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hgj.a::e)
                  )
                  .apply($$0, hgj.a::new)
         )
         .validate(hgj.a::a);

      private static DataResult<hgj.a> a(hgj.a $$0) {
         hgj.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hgj.d a() {
         return hgj.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hgj.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hgj.a.a> e = ayi.m.flatComapMap($$0 -> new hgj.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hgj.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayi.l.fieldOf("left").forGetter(hgj.a.a::a),
                     ayi.l.fieldOf("top").forGetter(hgj.a.a::b),
                     ayi.l.fieldOf("right").forGetter(hgj.a.a::c),
                     ayi.l.fieldOf("bottom").forGetter(hgj.a.a::d)
                  )
                  .apply($$0, hgj.a.a::new)
         );
         static final Codec<hgj.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hgj {
      public static final MapCodec<hgj.b> c = MapCodec.unit(hgj.b::new);

      @Override
      public hgj.d a() {
         return hgj.d.a;
      }
   }

   public static record c(int d, int e) implements hgj {
      public static final MapCodec<hgj.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayi.m.fieldOf("width").forGetter(hgj.c::b), ayi.m.fieldOf("height").forGetter(hgj.c::c)).apply($$0, hgj.c::new)
      );

      @Override
      public hgj.d a() {
         return hgj.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azv {
      a("stretch", hgj.b.c),
      b("tile", hgj.c.c),
      c("nine_slice", hgj.a.c);

      public static final Codec<hgj.d> d = azv.a(hgj.d::values);
      private final String e;
      private final MapCodec<? extends hgj> f;

      private d(final String $$0, final MapCodec<? extends hgj> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hgj> a() {
         return this.f;
      }
   }
}
