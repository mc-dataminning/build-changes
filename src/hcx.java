import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hcx {
   Codec<hcx> a = hcx.d.d.dispatch(hcx::a, hcx.d::a);
   hcx b = new hcx.b();

   hcx.d a();

   public static record a(int d, int e, hcx.a.a f, boolean g) implements hcx {
      public static final MapCodec<hcx.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     azn.m.fieldOf("width").forGetter(hcx.a::b),
                     azn.m.fieldOf("height").forGetter(hcx.a::c),
                     hcx.a.a.g.fieldOf("border").forGetter(hcx.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hcx.a::e)
                  )
                  .apply($$0, hcx.a::new)
         )
         .validate(hcx.a::a);

      private static DataResult<hcx.a> a(hcx.a $$0) {
         hcx.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hcx.d a() {
         return hcx.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hcx.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hcx.a.a> e = azn.m.flatComapMap($$0 -> new hcx.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hcx.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     azn.l.fieldOf("left").forGetter(hcx.a.a::a),
                     azn.l.fieldOf("top").forGetter(hcx.a.a::b),
                     azn.l.fieldOf("right").forGetter(hcx.a.a::c),
                     azn.l.fieldOf("bottom").forGetter(hcx.a.a::d)
                  )
                  .apply($$0, hcx.a.a::new)
         );
         static final Codec<hcx.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hcx {
      public static final MapCodec<hcx.b> c = MapCodec.unit(hcx.b::new);

      @Override
      public hcx.d a() {
         return hcx.d.a;
      }
   }

   public static record c(int d, int e) implements hcx {
      public static final MapCodec<hcx.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(azn.m.fieldOf("width").forGetter(hcx.c::b), azn.m.fieldOf("height").forGetter(hcx.c::c)).apply($$0, hcx.c::new)
      );

      @Override
      public hcx.d a() {
         return hcx.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bba {
      a("stretch", hcx.b.c),
      b("tile", hcx.c.c),
      c("nine_slice", hcx.a.c);

      public static final Codec<hcx.d> d = bba.a(hcx.d::values);
      private final String e;
      private final MapCodec<? extends hcx> f;

      private d(final String $$0, final MapCodec<? extends hcx> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hcx> a() {
         return this.f;
      }
   }
}
