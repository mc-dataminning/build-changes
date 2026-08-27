import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gge {
   Codec<gge> a = gge.d.d.dispatch(gge::a, gge.d::a);
   gge b = new gge.b();

   gge.d a();

   public static record a(int d, int e, gge.a.a f) implements gge {
      public static final Codec<gge.a> c = atw.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     atw.j.fieldOf("width").forGetter(gge.a::b), atw.j.fieldOf("height").forGetter(gge.a::c), gge.a.a.g.fieldOf("border").forGetter(gge.a::d)
                  )
                  .apply($$0, gge.a::new)
         ),
         gge.a::a
      );

      private static DataResult<gge.a> a(gge.a $$0) {
         gge.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gge.d a() {
         return gge.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gge.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gge.a.a> e = atw.j.flatComapMap($$0 -> new gge.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gge.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     atw.i.fieldOf("left").forGetter(gge.a.a::a),
                     atw.i.fieldOf("top").forGetter(gge.a.a::b),
                     atw.i.fieldOf("right").forGetter(gge.a.a::c),
                     atw.i.fieldOf("bottom").forGetter(gge.a.a::d)
                  )
                  .apply($$0, gge.a.a::new)
         );
         static final Codec<gge.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gge.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gge {
      public static final Codec<gge.b> c = Codec.unit(gge.b::new);

      @Override
      public gge.d a() {
         return gge.d.a;
      }
   }

   public static record c(int d, int e) implements gge {
      public static final Codec<gge.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(atw.j.fieldOf("width").forGetter(gge.c::b), atw.j.fieldOf("height").forGetter(gge.c::c)).apply($$0, gge.c::new)
      );

      @Override
      public gge.d a() {
         return gge.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements avk {
      a("stretch", gge.b.c),
      b("tile", gge.c.c),
      c("nine_slice", gge.a.c);

      public static final Codec<gge.d> d = avk.a(gge.d::values);
      private final String e;
      private final Codec<? extends gge> f;

      private d(String $$0, Codec<? extends gge> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gge> a() {
         return this.f;
      }
   }
}
