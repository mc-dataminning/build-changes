import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gaw {
   Codec<gaw> a = gaw.d.d.dispatch(gaw::a, gaw.d::a);
   gaw b = new gaw.b();

   gaw.d a();

   public static record a(int d, int e, gaw.a.a f) implements gaw {
      public static final Codec<gaw.a> c = arf.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     arf.j.fieldOf("width").forGetter(gaw.a::b), arf.j.fieldOf("height").forGetter(gaw.a::c), gaw.a.a.g.fieldOf("border").forGetter(gaw.a::d)
                  )
                  .apply($$0, gaw.a::new)
         ),
         gaw.a::a
      );

      private static DataResult<gaw.a> a(gaw.a $$0) {
         gaw.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gaw.d a() {
         return gaw.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gaw.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gaw.a.a> e = arf.j.flatComapMap($$0 -> new gaw.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gaw.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     arf.i.fieldOf("left").forGetter(gaw.a.a::a),
                     arf.i.fieldOf("top").forGetter(gaw.a.a::b),
                     arf.i.fieldOf("right").forGetter(gaw.a.a::c),
                     arf.i.fieldOf("bottom").forGetter(gaw.a.a::d)
                  )
                  .apply($$0, gaw.a.a::new)
         );
         static final Codec<gaw.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gaw.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gaw {
      public static final Codec<gaw.b> c = Codec.unit(gaw.b::new);

      @Override
      public gaw.d a() {
         return gaw.d.a;
      }
   }

   public static record c(int d, int e) implements gaw {
      public static final Codec<gaw.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(arf.j.fieldOf("width").forGetter(gaw.c::b), arf.j.fieldOf("height").forGetter(gaw.c::c)).apply($$0, gaw.c::new)
      );

      @Override
      public gaw.d a() {
         return gaw.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements asp {
      a("stretch", gaw.b.c),
      b("tile", gaw.c.c),
      c("nine_slice", gaw.a.c);

      public static final Codec<gaw.d> d = asp.a(gaw.d::values);
      private final String e;
      private final Codec<? extends gaw> f;

      private d(String $$0, Codec<? extends gaw> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gaw> a() {
         return this.f;
      }
   }
}
