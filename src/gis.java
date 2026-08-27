import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gis {
   Codec<gis> a = gis.d.d.dispatch(gis::a, gis.d::a);
   gis b = new gis.b();

   gis.d a();

   public static record a(int d, int e, gis.a.a f) implements gis {
      public static final Codec<gis.a> c = avq.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     avq.j.fieldOf("width").forGetter(gis.a::b), avq.j.fieldOf("height").forGetter(gis.a::c), gis.a.a.g.fieldOf("border").forGetter(gis.a::d)
                  )
                  .apply($$0, gis.a::new)
         ),
         gis.a::a
      );

      private static DataResult<gis.a> a(gis.a $$0) {
         gis.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gis.d a() {
         return gis.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gis.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gis.a.a> e = avq.j.flatComapMap($$0 -> new gis.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gis.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     avq.i.fieldOf("left").forGetter(gis.a.a::a),
                     avq.i.fieldOf("top").forGetter(gis.a.a::b),
                     avq.i.fieldOf("right").forGetter(gis.a.a::c),
                     avq.i.fieldOf("bottom").forGetter(gis.a.a::d)
                  )
                  .apply($$0, gis.a.a::new)
         );
         static final Codec<gis.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gis.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gis {
      public static final Codec<gis.b> c = Codec.unit(gis.b::new);

      @Override
      public gis.d a() {
         return gis.d.a;
      }
   }

   public static record c(int d, int e) implements gis {
      public static final Codec<gis.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(avq.j.fieldOf("width").forGetter(gis.c::b), avq.j.fieldOf("height").forGetter(gis.c::c)).apply($$0, gis.c::new)
      );

      @Override
      public gis.d a() {
         return gis.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements axc {
      a("stretch", gis.b.c),
      b("tile", gis.c.c),
      c("nine_slice", gis.a.c);

      public static final Codec<gis.d> d = axc.a(gis.d::values);
      private final String e;
      private final Codec<? extends gis> f;

      private d(String $$0, Codec<? extends gis> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gis> a() {
         return this.f;
      }
   }
}
