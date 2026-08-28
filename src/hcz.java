import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hcz {
   Codec<hcz> a = hcz.d.d.dispatch(hcz::a, hcz.d::a);
   hcz b = new hcz.b();

   hcz.d a();

   public static record a(int d, int e, hcz.a.a f, boolean g) implements hcz {
      public static final MapCodec<hcz.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     azd.m.fieldOf("width").forGetter(hcz.a::b),
                     azd.m.fieldOf("height").forGetter(hcz.a::c),
                     hcz.a.a.g.fieldOf("border").forGetter(hcz.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hcz.a::e)
                  )
                  .apply($$0, hcz.a::new)
         )
         .validate(hcz.a::a);

      private static DataResult<hcz.a> a(hcz.a $$0) {
         hcz.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hcz.d a() {
         return hcz.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hcz.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hcz.a.a> e = azd.m.flatComapMap($$0 -> new hcz.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hcz.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     azd.l.fieldOf("left").forGetter(hcz.a.a::a),
                     azd.l.fieldOf("top").forGetter(hcz.a.a::b),
                     azd.l.fieldOf("right").forGetter(hcz.a.a::c),
                     azd.l.fieldOf("bottom").forGetter(hcz.a.a::d)
                  )
                  .apply($$0, hcz.a.a::new)
         );
         static final Codec<hcz.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hcz {
      public static final MapCodec<hcz.b> c = MapCodec.unit(hcz.b::new);

      @Override
      public hcz.d a() {
         return hcz.d.a;
      }
   }

   public static record c(int d, int e) implements hcz {
      public static final MapCodec<hcz.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(azd.m.fieldOf("width").forGetter(hcz.c::b), azd.m.fieldOf("height").forGetter(hcz.c::c)).apply($$0, hcz.c::new)
      );

      @Override
      public hcz.d a() {
         return hcz.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements baq {
      a("stretch", hcz.b.c),
      b("tile", hcz.c.c),
      c("nine_slice", hcz.a.c);

      public static final Codec<hcz.d> d = baq.a(hcz.d::values);
      private final String e;
      private final MapCodec<? extends hcz> f;

      private d(final String $$0, final MapCodec<? extends hcz> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hcz> a() {
         return this.f;
      }
   }
}
