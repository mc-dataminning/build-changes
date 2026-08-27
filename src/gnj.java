import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gnj {
   Codec<gnj> a = gnj.d.d.dispatch(gnj::a, gnj.d::a);
   gnj b = new gnj.b();

   gnj.d a();

   public static record a(int d, int e, gnj.a.a f) implements gnj {
      public static final Codec<gnj.a> c = awu.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     awu.j.fieldOf("width").forGetter(gnj.a::b), awu.j.fieldOf("height").forGetter(gnj.a::c), gnj.a.a.g.fieldOf("border").forGetter(gnj.a::d)
                  )
                  .apply($$0, gnj.a::new)
         ),
         gnj.a::a
      );

      private static DataResult<gnj.a> a(gnj.a $$0) {
         gnj.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gnj.d a() {
         return gnj.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gnj.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gnj.a.a> e = awu.j.flatComapMap($$0 -> new gnj.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gnj.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     awu.i.fieldOf("left").forGetter(gnj.a.a::a),
                     awu.i.fieldOf("top").forGetter(gnj.a.a::b),
                     awu.i.fieldOf("right").forGetter(gnj.a.a::c),
                     awu.i.fieldOf("bottom").forGetter(gnj.a.a::d)
                  )
                  .apply($$0, gnj.a.a::new)
         );
         static final Codec<gnj.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gnj.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gnj {
      public static final Codec<gnj.b> c = Codec.unit(gnj.b::new);

      @Override
      public gnj.d a() {
         return gnj.d.a;
      }
   }

   public static record c(int d, int e) implements gnj {
      public static final Codec<gnj.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(awu.j.fieldOf("width").forGetter(gnj.c::b), awu.j.fieldOf("height").forGetter(gnj.c::c)).apply($$0, gnj.c::new)
      );

      @Override
      public gnj.d a() {
         return gnj.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements ayg {
      a("stretch", gnj.b.c),
      b("tile", gnj.c.c),
      c("nine_slice", gnj.a.c);

      public static final Codec<gnj.d> d = ayg.a(gnj.d::values);
      private final String e;
      private final Codec<? extends gnj> f;

      private d(String $$0, Codec<? extends gnj> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gnj> a() {
         return this.f;
      }
   }
}
