import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gam {
   Codec<gam> a = gam.d.d.dispatch(gam::a, gam.d::a);
   gam b = new gam.b();

   gam.d a();

   public static record a(int d, int e, gam.a.a f) implements gam {
      public static final Codec<gam.a> c = aqy.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     aqy.j.fieldOf("width").forGetter(gam.a::b), aqy.j.fieldOf("height").forGetter(gam.a::c), gam.a.a.g.fieldOf("border").forGetter(gam.a::d)
                  )
                  .apply($$0, gam.a::new)
         ),
         gam.a::a
      );

      private static DataResult<gam.a> a(gam.a $$0) {
         gam.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gam.d a() {
         return gam.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gam.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gam.a.a> e = aqy.j.flatComapMap($$0 -> new gam.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gam.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     aqy.i.fieldOf("left").forGetter(gam.a.a::a),
                     aqy.i.fieldOf("top").forGetter(gam.a.a::b),
                     aqy.i.fieldOf("right").forGetter(gam.a.a::c),
                     aqy.i.fieldOf("bottom").forGetter(gam.a.a::d)
                  )
                  .apply($$0, gam.a.a::new)
         );
         static final Codec<gam.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gam.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gam {
      public static final Codec<gam.b> c = Codec.unit(gam.b::new);

      @Override
      public gam.d a() {
         return gam.d.a;
      }
   }

   public static record c(int d, int e) implements gam {
      public static final Codec<gam.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(aqy.j.fieldOf("width").forGetter(gam.c::b), aqy.j.fieldOf("height").forGetter(gam.c::c)).apply($$0, gam.c::new)
      );

      @Override
      public gam.d a() {
         return gam.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements ash {
      a("stretch", gam.b.c),
      b("tile", gam.c.c),
      c("nine_slice", gam.a.c);

      public static final Codec<gam.d> d = ash.a(gam.d::values);
      private final String e;
      private final Codec<? extends gam> f;

      private d(String $$0, Codec<? extends gam> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gam> a() {
         return this.f;
      }
   }
}
