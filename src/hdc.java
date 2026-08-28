import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hdc {
   Codec<hdc> a = hdc.d.d.dispatch(hdc::a, hdc.d::a);
   hdc b = new hdc.b();

   hdc.d a();

   public static record a(int d, int e, hdc.a.a f, boolean g) implements hdc {
      public static final MapCodec<hdc.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     azn.m.fieldOf("width").forGetter(hdc.a::b),
                     azn.m.fieldOf("height").forGetter(hdc.a::c),
                     hdc.a.a.g.fieldOf("border").forGetter(hdc.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hdc.a::e)
                  )
                  .apply($$0, hdc.a::new)
         )
         .validate(hdc.a::a);

      private static DataResult<hdc.a> a(hdc.a $$0) {
         hdc.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hdc.d a() {
         return hdc.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hdc.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hdc.a.a> e = azn.m.flatComapMap($$0 -> new hdc.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hdc.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     azn.l.fieldOf("left").forGetter(hdc.a.a::a),
                     azn.l.fieldOf("top").forGetter(hdc.a.a::b),
                     azn.l.fieldOf("right").forGetter(hdc.a.a::c),
                     azn.l.fieldOf("bottom").forGetter(hdc.a.a::d)
                  )
                  .apply($$0, hdc.a.a::new)
         );
         static final Codec<hdc.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hdc {
      public static final MapCodec<hdc.b> c = MapCodec.unit(hdc.b::new);

      @Override
      public hdc.d a() {
         return hdc.d.a;
      }
   }

   public static record c(int d, int e) implements hdc {
      public static final MapCodec<hdc.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(azn.m.fieldOf("width").forGetter(hdc.c::b), azn.m.fieldOf("height").forGetter(hdc.c::c)).apply($$0, hdc.c::new)
      );

      @Override
      public hdc.d a() {
         return hdc.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bba {
      a("stretch", hdc.b.c),
      b("tile", hdc.c.c),
      c("nine_slice", hdc.a.c);

      public static final Codec<hdc.d> d = bba.a(hdc.d::values);
      private final String e;
      private final MapCodec<? extends hdc> f;

      private d(final String $$0, final MapCodec<? extends hdc> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hdc> a() {
         return this.f;
      }
   }
}
