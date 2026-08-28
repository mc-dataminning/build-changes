import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hkg {
   Codec<hkg> a = hkg.d.d.dispatch(hkg::a, hkg.d::a);
   hkg b = new hkg.b();

   hkg.d a();

   public static record a(int d, int e, hkg.a.a f, boolean g) implements hkg {
      public static final MapCodec<hkg.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayu.m.fieldOf("width").forGetter(hkg.a::b),
                     ayu.m.fieldOf("height").forGetter(hkg.a::c),
                     hkg.a.a.g.fieldOf("border").forGetter(hkg.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hkg.a::e)
                  )
                  .apply($$0, hkg.a::new)
         )
         .validate(hkg.a::a);

      private static DataResult<hkg.a> a(hkg.a $$0) {
         hkg.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hkg.d a() {
         return hkg.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hkg.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hkg.a.a> e = ayu.m.flatComapMap($$0 -> new hkg.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hkg.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayu.l.fieldOf("left").forGetter(hkg.a.a::a),
                     ayu.l.fieldOf("top").forGetter(hkg.a.a::b),
                     ayu.l.fieldOf("right").forGetter(hkg.a.a::c),
                     ayu.l.fieldOf("bottom").forGetter(hkg.a.a::d)
                  )
                  .apply($$0, hkg.a.a::new)
         );
         static final Codec<hkg.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hkg {
      public static final MapCodec<hkg.b> c = MapCodec.unit(hkg.b::new);

      @Override
      public hkg.d a() {
         return hkg.d.a;
      }
   }

   public static record c(int d, int e) implements hkg {
      public static final MapCodec<hkg.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayu.m.fieldOf("width").forGetter(hkg.c::b), ayu.m.fieldOf("height").forGetter(hkg.c::c)).apply($$0, hkg.c::new)
      );

      @Override
      public hkg.d a() {
         return hkg.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bak {
      a("stretch", hkg.b.c),
      b("tile", hkg.c.c),
      c("nine_slice", hkg.a.c);

      public static final Codec<hkg.d> d = bak.a(hkg.d::values);
      private final String e;
      private final MapCodec<? extends hkg> f;

      private d(final String $$0, final MapCodec<? extends hkg> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hkg> a() {
         return this.f;
      }
   }
}
