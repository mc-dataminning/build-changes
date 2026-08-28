import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hgl {
   Codec<hgl> a = hgl.d.d.dispatch(hgl::a, hgl.d::a);
   hgl b = new hgl.b();

   hgl.d a();

   public static record a(int d, int e, hgl.a.a f, boolean g) implements hgl {
      public static final MapCodec<hgl.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayi.m.fieldOf("width").forGetter(hgl.a::b),
                     ayi.m.fieldOf("height").forGetter(hgl.a::c),
                     hgl.a.a.g.fieldOf("border").forGetter(hgl.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hgl.a::e)
                  )
                  .apply($$0, hgl.a::new)
         )
         .validate(hgl.a::a);

      private static DataResult<hgl.a> a(hgl.a $$0) {
         hgl.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hgl.d a() {
         return hgl.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hgl.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hgl.a.a> e = ayi.m.flatComapMap($$0 -> new hgl.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hgl.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayi.l.fieldOf("left").forGetter(hgl.a.a::a),
                     ayi.l.fieldOf("top").forGetter(hgl.a.a::b),
                     ayi.l.fieldOf("right").forGetter(hgl.a.a::c),
                     ayi.l.fieldOf("bottom").forGetter(hgl.a.a::d)
                  )
                  .apply($$0, hgl.a.a::new)
         );
         static final Codec<hgl.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hgl {
      public static final MapCodec<hgl.b> c = MapCodec.unit(hgl.b::new);

      @Override
      public hgl.d a() {
         return hgl.d.a;
      }
   }

   public static record c(int d, int e) implements hgl {
      public static final MapCodec<hgl.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayi.m.fieldOf("width").forGetter(hgl.c::b), ayi.m.fieldOf("height").forGetter(hgl.c::c)).apply($$0, hgl.c::new)
      );

      @Override
      public hgl.d a() {
         return hgl.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azv {
      a("stretch", hgl.b.c),
      b("tile", hgl.c.c),
      c("nine_slice", hgl.a.c);

      public static final Codec<hgl.d> d = azv.a(hgl.d::values);
      private final String e;
      private final MapCodec<? extends hgl> f;

      private d(final String $$0, final MapCodec<? extends hgl> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hgl> a() {
         return this.f;
      }
   }
}
