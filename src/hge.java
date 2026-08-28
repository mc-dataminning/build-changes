import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hge {
   Codec<hge> a = hge.d.d.dispatch(hge::a, hge.d::a);
   hge b = new hge.b();

   hge.d a();

   public static record a(int d, int e, hge.a.a f, boolean g) implements hge {
      public static final MapCodec<hge.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayh.m.fieldOf("width").forGetter(hge.a::b),
                     ayh.m.fieldOf("height").forGetter(hge.a::c),
                     hge.a.a.g.fieldOf("border").forGetter(hge.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hge.a::e)
                  )
                  .apply($$0, hge.a::new)
         )
         .validate(hge.a::a);

      private static DataResult<hge.a> a(hge.a $$0) {
         hge.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hge.d a() {
         return hge.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hge.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hge.a.a> e = ayh.m.flatComapMap($$0 -> new hge.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hge.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayh.l.fieldOf("left").forGetter(hge.a.a::a),
                     ayh.l.fieldOf("top").forGetter(hge.a.a::b),
                     ayh.l.fieldOf("right").forGetter(hge.a.a::c),
                     ayh.l.fieldOf("bottom").forGetter(hge.a.a::d)
                  )
                  .apply($$0, hge.a.a::new)
         );
         static final Codec<hge.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hge {
      public static final MapCodec<hge.b> c = MapCodec.unit(hge.b::new);

      @Override
      public hge.d a() {
         return hge.d.a;
      }
   }

   public static record c(int d, int e) implements hge {
      public static final MapCodec<hge.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayh.m.fieldOf("width").forGetter(hge.c::b), ayh.m.fieldOf("height").forGetter(hge.c::c)).apply($$0, hge.c::new)
      );

      @Override
      public hge.d a() {
         return hge.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azu {
      a("stretch", hge.b.c),
      b("tile", hge.c.c),
      c("nine_slice", hge.a.c);

      public static final Codec<hge.d> d = azu.a(hge.d::values);
      private final String e;
      private final MapCodec<? extends hge> f;

      private d(final String $$0, final MapCodec<? extends hge> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hge> a() {
         return this.f;
      }
   }
}
