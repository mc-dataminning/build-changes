import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gof {
   Codec<gof> a = gof.d.d.dispatch(gof::a, gof.d::a);
   gof b = new gof.b();

   gof.d a();

   public static record a(int d, int e, gof.a.a f) implements gof {
      public static final Codec<gof.a> c = axe.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axe.j.fieldOf("width").forGetter(gof.a::b), axe.j.fieldOf("height").forGetter(gof.a::c), gof.a.a.g.fieldOf("border").forGetter(gof.a::d)
                  )
                  .apply($$0, gof.a::new)
         ),
         gof.a::a
      );

      private static DataResult<gof.a> a(gof.a $$0) {
         gof.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gof.d a() {
         return gof.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gof.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gof.a.a> e = axe.j.flatComapMap($$0 -> new gof.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gof.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axe.i.fieldOf("left").forGetter(gof.a.a::a),
                     axe.i.fieldOf("top").forGetter(gof.a.a::b),
                     axe.i.fieldOf("right").forGetter(gof.a.a::c),
                     axe.i.fieldOf("bottom").forGetter(gof.a.a::d)
                  )
                  .apply($$0, gof.a.a::new)
         );
         static final Codec<gof.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gof.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gof {
      public static final Codec<gof.b> c = Codec.unit(gof.b::new);

      @Override
      public gof.d a() {
         return gof.d.a;
      }
   }

   public static record c(int d, int e) implements gof {
      public static final Codec<gof.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.j.fieldOf("width").forGetter(gof.c::b), axe.j.fieldOf("height").forGetter(gof.c::c)).apply($$0, gof.c::new)
      );

      @Override
      public gof.d a() {
         return gof.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements ayq {
      a("stretch", gof.b.c),
      b("tile", gof.c.c),
      c("nine_slice", gof.a.c);

      public static final Codec<gof.d> d = ayq.a(gof.d::values);
      private final String e;
      private final Codec<? extends gof> f;

      private d(String $$0, Codec<? extends gof> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gof> a() {
         return this.f;
      }
   }
}
