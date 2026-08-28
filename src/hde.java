import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hde {
   Codec<hde> a = hde.d.d.dispatch(hde::a, hde.d::a);
   hde b = new hde.b();

   hde.d a();

   public static record a(int d, int e, hde.a.a f, boolean g) implements hde {
      public static final MapCodec<hde.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     azn.m.fieldOf("width").forGetter(hde.a::b),
                     azn.m.fieldOf("height").forGetter(hde.a::c),
                     hde.a.a.g.fieldOf("border").forGetter(hde.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hde.a::e)
                  )
                  .apply($$0, hde.a::new)
         )
         .validate(hde.a::a);

      private static DataResult<hde.a> a(hde.a $$0) {
         hde.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hde.d a() {
         return hde.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hde.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hde.a.a> e = azn.m.flatComapMap($$0 -> new hde.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hde.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     azn.l.fieldOf("left").forGetter(hde.a.a::a),
                     azn.l.fieldOf("top").forGetter(hde.a.a::b),
                     azn.l.fieldOf("right").forGetter(hde.a.a::c),
                     azn.l.fieldOf("bottom").forGetter(hde.a.a::d)
                  )
                  .apply($$0, hde.a.a::new)
         );
         static final Codec<hde.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hde {
      public static final MapCodec<hde.b> c = MapCodec.unit(hde.b::new);

      @Override
      public hde.d a() {
         return hde.d.a;
      }
   }

   public static record c(int d, int e) implements hde {
      public static final MapCodec<hde.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(azn.m.fieldOf("width").forGetter(hde.c::b), azn.m.fieldOf("height").forGetter(hde.c::c)).apply($$0, hde.c::new)
      );

      @Override
      public hde.d a() {
         return hde.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bba {
      a("stretch", hde.b.c),
      b("tile", hde.c.c),
      c("nine_slice", hde.a.c);

      public static final Codec<hde.d> d = bba.a(hde.d::values);
      private final String e;
      private final MapCodec<? extends hde> f;

      private d(final String $$0, final MapCodec<? extends hde> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hde> a() {
         return this.f;
      }
   }
}
