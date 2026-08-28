import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface hms {
   Codec<hms> a = hms.d.d.dispatch(hms::a, hms.d::a);
   hms b = new hms.b();

   hms.d a();

   public static record a(int d, int e, hms.a.a f, boolean g) implements hms {
      public static final MapCodec<hms.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ayw.m.fieldOf("width").forGetter(hms.a::b),
                     ayw.m.fieldOf("height").forGetter(hms.a::c),
                     hms.a.a.g.fieldOf("border").forGetter(hms.a::d),
                     Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(hms.a::e)
                  )
                  .apply($$0, hms.a::new)
         )
         .validate(hms.a::a);

      private static DataResult<hms.a> a(hms.a $$0) {
         hms.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public hms.d a() {
         return hms.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public hms.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<hms.a.a> e = ayw.m.flatComapMap($$0 -> new hms.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<hms.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     ayw.l.fieldOf("left").forGetter(hms.a.a::a),
                     ayw.l.fieldOf("top").forGetter(hms.a.a::b),
                     ayw.l.fieldOf("right").forGetter(hms.a.a::c),
                     ayw.l.fieldOf("bottom").forGetter(hms.a.a::d)
                  )
                  .apply($$0, hms.a.a::new)
         );
         static final Codec<hms.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements hms {
      public static final MapCodec<hms.b> c = MapCodec.unit(hms.b::new);

      @Override
      public hms.d a() {
         return hms.d.a;
      }
   }

   public static record c(int d, int e) implements hms {
      public static final MapCodec<hms.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayw.m.fieldOf("width").forGetter(hms.c::b), ayw.m.fieldOf("height").forGetter(hms.c::c)).apply($$0, hms.c::new)
      );

      @Override
      public hms.d a() {
         return hms.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bam {
      a("stretch", hms.b.c),
      b("tile", hms.c.c),
      c("nine_slice", hms.a.c);

      public static final Codec<hms.d> d = bam.a(hms.d::values);
      private final String e;
      private final MapCodec<? extends hms> f;

      private d(final String $$0, final MapCodec<? extends hms> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends hms> a() {
         return this.f;
      }
   }
}
