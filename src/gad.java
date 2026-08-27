import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gad {
   Codec<gad> a = gad.d.d.dispatch(gad::a, gad.d::a);
   gad b = new gad.b();

   gad.d a();

   public static record a(int d, int e, gad.a.a f) implements gad {
      public static final Codec<gad.a> c = aqy.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     aqy.j.fieldOf("width").forGetter(gad.a::b), aqy.j.fieldOf("height").forGetter(gad.a::c), gad.a.a.g.fieldOf("border").forGetter(gad.a::d)
                  )
                  .apply($$0, gad.a::new)
         ),
         gad.a::a
      );

      private static DataResult<gad.a> a(gad.a $$0) {
         gad.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gad.d a() {
         return gad.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gad.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gad.a.a> e = aqy.j.flatComapMap($$0 -> new gad.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gad.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     aqy.i.fieldOf("left").forGetter(gad.a.a::a),
                     aqy.i.fieldOf("top").forGetter(gad.a.a::b),
                     aqy.i.fieldOf("right").forGetter(gad.a.a::c),
                     aqy.i.fieldOf("bottom").forGetter(gad.a.a::d)
                  )
                  .apply($$0, gad.a.a::new)
         );
         static final Codec<gad.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gad.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gad {
      public static final Codec<gad.b> c = Codec.unit(gad.b::new);

      @Override
      public gad.d a() {
         return gad.d.a;
      }
   }

   public static record c(int d, int e) implements gad {
      public static final Codec<gad.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(aqy.j.fieldOf("width").forGetter(gad.c::b), aqy.j.fieldOf("height").forGetter(gad.c::c)).apply($$0, gad.c::new)
      );

      @Override
      public gad.d a() {
         return gad.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements ash {
      a("stretch", gad.b.c),
      b("tile", gad.c.c),
      c("nine_slice", gad.a.c);

      public static final Codec<gad.d> d = ash.a(gad.d::values);
      private final String e;
      private final Codec<? extends gad> f;

      private d(String $$0, Codec<? extends gad> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gad> a() {
         return this.f;
      }
   }
}
