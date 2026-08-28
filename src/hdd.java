import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hdd {
   Codec<hdd> a = hdd.d.d.dispatch(hdd::a, hdd.d::a);
   hdd b = new hdd.b();

   hdd.d a();

   public static record a(int d, int e, hdd.a.a f, boolean g) implements hdd {
      public static final MapCodec<hdd.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     azn.m.fieldOf("width").forGetter(hdd.a::b),
                     azn.m.fieldOf("height").forGetter(hdd.a::c),
                     hdd.a.a.g.fieldOf("border").forGetter(hdd.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hdd.a::e)
                  )
                  .apply($$0, hdd.a::new)
         )
         .validate(hdd.a::a);

      private static DataResult<hdd.a> a(hdd.a $$0) {
         hdd.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hdd.d a() {
         return hdd.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hdd.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hdd.a.a> e = azn.m.flatComapMap($$0 -> new hdd.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hdd.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     azn.l.fieldOf("left").forGetter(hdd.a.a::a),
                     azn.l.fieldOf("top").forGetter(hdd.a.a::b),
                     azn.l.fieldOf("right").forGetter(hdd.a.a::c),
                     azn.l.fieldOf("bottom").forGetter(hdd.a.a::d)
                  )
                  .apply($$0, hdd.a.a::new)
         );
         static final Codec<hdd.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hdd {
      public static final MapCodec<hdd.b> c = MapCodec.unit(hdd.b::new);

      @Override
      public hdd.d a() {
         return hdd.d.a;
      }
   }

   public static record c(int d, int e) implements hdd {
      public static final MapCodec<hdd.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(azn.m.fieldOf("width").forGetter(hdd.c::b), azn.m.fieldOf("height").forGetter(hdd.c::c)).apply($$0, hdd.c::new)
      );

      @Override
      public hdd.d a() {
         return hdd.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bba {
      a("stretch", hdd.b.c),
      b("tile", hdd.c.c),
      c("nine_slice", hdd.a.c);

      public static final Codec<hdd.d> d = bba.a(hdd.d::values);
      private final String e;
      private final MapCodec<? extends hdd> f;

      private d(final String $$0, final MapCodec<? extends hdd> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hdd> a() {
         return this.f;
      }
   }
}
