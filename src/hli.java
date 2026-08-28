import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hli {
   Codec<hli> a = hli.d.d.dispatch(hli::a, hli.d::a);
   hli b = new hli.b();

   hli.d a();

   public static record a(int d, int e, hli.a.a f, boolean g) implements hli {
      public static final MapCodec<hli.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayu.m.fieldOf("width").forGetter(hli.a::b),
                     ayu.m.fieldOf("height").forGetter(hli.a::c),
                     hli.a.a.g.fieldOf("border").forGetter(hli.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hli.a::e)
                  )
                  .apply($$0, hli.a::new)
         )
         .validate(hli.a::a);

      private static DataResult<hli.a> a(hli.a $$0) {
         hli.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hli.d a() {
         return hli.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hli.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hli.a.a> e = ayu.m.flatComapMap($$0 -> new hli.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hli.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayu.l.fieldOf("left").forGetter(hli.a.a::a),
                     ayu.l.fieldOf("top").forGetter(hli.a.a::b),
                     ayu.l.fieldOf("right").forGetter(hli.a.a::c),
                     ayu.l.fieldOf("bottom").forGetter(hli.a.a::d)
                  )
                  .apply($$0, hli.a.a::new)
         );
         static final Codec<hli.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hli {
      public static final MapCodec<hli.b> c = MapCodec.unit(hli.b::new);

      @Override
      public hli.d a() {
         return hli.d.a;
      }
   }

   public static record c(int d, int e) implements hli {
      public static final MapCodec<hli.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayu.m.fieldOf("width").forGetter(hli.c::b), ayu.m.fieldOf("height").forGetter(hli.c::c)).apply($$0, hli.c::new)
      );

      @Override
      public hli.d a() {
         return hli.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bak {
      a("stretch", hli.b.c),
      b("tile", hli.c.c),
      c("nine_slice", hli.a.c);

      public static final Codec<hli.d> d = bak.a(hli.d::values);
      private final String e;
      private final MapCodec<? extends hli> f;

      private d(final String $$0, final MapCodec<? extends hli> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hli> a() {
         return this.f;
      }
   }
}
