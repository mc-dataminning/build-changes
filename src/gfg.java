import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gfg {
   Codec<gfg> a = gfg.d.d.dispatch(gfg::a, gfg.d::a);
   gfg b = new gfg.b();

   gfg.d a();

   public static record a(int d, int e, gfg.a.a f) implements gfg {
      public static final Codec<gfg.a> c = atg.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     atg.j.fieldOf("width").forGetter(gfg.a::b), atg.j.fieldOf("height").forGetter(gfg.a::c), gfg.a.a.g.fieldOf("border").forGetter(gfg.a::d)
                  )
                  .apply($$0, gfg.a::new)
         ),
         gfg.a::a
      );

      private static DataResult<gfg.a> a(gfg.a $$0) {
         gfg.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gfg.d a() {
         return gfg.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gfg.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gfg.a.a> e = atg.j.flatComapMap($$0 -> new gfg.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gfg.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     atg.i.fieldOf("left").forGetter(gfg.a.a::a),
                     atg.i.fieldOf("top").forGetter(gfg.a.a::b),
                     atg.i.fieldOf("right").forGetter(gfg.a.a::c),
                     atg.i.fieldOf("bottom").forGetter(gfg.a.a::d)
                  )
                  .apply($$0, gfg.a.a::new)
         );
         static final Codec<gfg.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gfg.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gfg {
      public static final Codec<gfg.b> c = Codec.unit(gfg.b::new);

      @Override
      public gfg.d a() {
         return gfg.d.a;
      }
   }

   public static record c(int d, int e) implements gfg {
      public static final Codec<gfg.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(atg.j.fieldOf("width").forGetter(gfg.c::b), atg.j.fieldOf("height").forGetter(gfg.c::c)).apply($$0, gfg.c::new)
      );

      @Override
      public gfg.d a() {
         return gfg.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements aut {
      a("stretch", gfg.b.c),
      b("tile", gfg.c.c),
      c("nine_slice", gfg.a.c);

      public static final Codec<gfg.d> d = aut.a(gfg.d::values);
      private final String e;
      private final Codec<? extends gfg> f;

      private d(String $$0, Codec<? extends gfg> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gfg> a() {
         return this.f;
      }
   }
}
