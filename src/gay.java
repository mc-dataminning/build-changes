import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gay {
   Codec<gay> a = gay.d.d.dispatch(gay::a, gay.d::a);
   gay b = new gay.b();

   gay.d a();

   public static record a(int d, int e, gay.a.a f) implements gay {
      public static final Codec<gay.a> c = arh.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     arh.j.fieldOf("width").forGetter(gay.a::b), arh.j.fieldOf("height").forGetter(gay.a::c), gay.a.a.g.fieldOf("border").forGetter(gay.a::d)
                  )
                  .apply($$0, gay.a::new)
         ),
         gay.a::a
      );

      private static DataResult<gay.a> a(gay.a $$0) {
         gay.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gay.d a() {
         return gay.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gay.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gay.a.a> e = arh.j.flatComapMap($$0 -> new gay.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gay.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     arh.i.fieldOf("left").forGetter(gay.a.a::a),
                     arh.i.fieldOf("top").forGetter(gay.a.a::b),
                     arh.i.fieldOf("right").forGetter(gay.a.a::c),
                     arh.i.fieldOf("bottom").forGetter(gay.a.a::d)
                  )
                  .apply($$0, gay.a.a::new)
         );
         static final Codec<gay.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gay.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gay {
      public static final Codec<gay.b> c = Codec.unit(gay.b::new);

      @Override
      public gay.d a() {
         return gay.d.a;
      }
   }

   public static record c(int d, int e) implements gay {
      public static final Codec<gay.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(arh.j.fieldOf("width").forGetter(gay.c::b), arh.j.fieldOf("height").forGetter(gay.c::c)).apply($$0, gay.c::new)
      );

      @Override
      public gay.d a() {
         return gay.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements asr {
      a("stretch", gay.b.c),
      b("tile", gay.c.c),
      c("nine_slice", gay.a.c);

      public static final Codec<gay.d> d = asr.a(gay.d::values);
      private final String e;
      private final Codec<? extends gay> f;

      private d(String $$0, Codec<? extends gay> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gay> a() {
         return this.f;
      }
   }
}
