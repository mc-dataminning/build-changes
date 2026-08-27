import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gfx {
   Codec<gfx> a = gfx.d.d.dispatch(gfx::a, gfx.d::a);
   gfx b = new gfx.b();

   gfx.d a();

   public static record a(int d, int e, gfx.a.a f) implements gfx {
      public static final Codec<gfx.a> c = atq.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     atq.j.fieldOf("width").forGetter(gfx.a::b), atq.j.fieldOf("height").forGetter(gfx.a::c), gfx.a.a.g.fieldOf("border").forGetter(gfx.a::d)
                  )
                  .apply($$0, gfx.a::new)
         ),
         gfx.a::a
      );

      private static DataResult<gfx.a> a(gfx.a $$0) {
         gfx.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gfx.d a() {
         return gfx.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gfx.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gfx.a.a> e = atq.j.flatComapMap($$0 -> new gfx.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gfx.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     atq.i.fieldOf("left").forGetter(gfx.a.a::a),
                     atq.i.fieldOf("top").forGetter(gfx.a.a::b),
                     atq.i.fieldOf("right").forGetter(gfx.a.a::c),
                     atq.i.fieldOf("bottom").forGetter(gfx.a.a::d)
                  )
                  .apply($$0, gfx.a.a::new)
         );
         static final Codec<gfx.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gfx.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gfx {
      public static final Codec<gfx.b> c = Codec.unit(gfx.b::new);

      @Override
      public gfx.d a() {
         return gfx.d.a;
      }
   }

   public static record c(int d, int e) implements gfx {
      public static final Codec<gfx.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.j.fieldOf("width").forGetter(gfx.c::b), atq.j.fieldOf("height").forGetter(gfx.c::c)).apply($$0, gfx.c::new)
      );

      @Override
      public gfx.d a() {
         return gfx.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements ave {
      a("stretch", gfx.b.c),
      b("tile", gfx.c.c),
      c("nine_slice", gfx.a.c);

      public static final Codec<gfx.d> d = ave.a(gfx.d::values);
      private final String e;
      private final Codec<? extends gfx> f;

      private d(String $$0, Codec<? extends gfx> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gfx> a() {
         return this.f;
      }
   }
}
