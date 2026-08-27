import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface fzy {
   Codec<fzy> a = fzy.d.d.dispatch(fzy::a, fzy.d::a);
   fzy b = new fzy.b();

   fzy.d a();

   public static record a(int d, int e, fzy.a.a f) implements fzy {
      public static final Codec<fzy.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aqw.j.fieldOf("width").forGetter(fzy.a::b), aqw.j.fieldOf("height").forGetter(fzy.a::c), fzy.a.a.g.fieldOf("border").forGetter(fzy.a::d)
               )
               .apply($$0, fzy.a::new)
      );

      @Override
      public fzy.d a() {
         return fzy.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public fzy.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<fzy.a.a> e = aqw.j.flatComapMap($$0 -> new fzy.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<fzy.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     aqw.j.fieldOf("left").forGetter(fzy.a.a::a),
                     aqw.j.fieldOf("top").forGetter(fzy.a.a::b),
                     aqw.j.fieldOf("right").forGetter(fzy.a.a::c),
                     aqw.j.fieldOf("bottom").forGetter(fzy.a.a::d)
                  )
                  .apply($$0, fzy.a.a::new)
         );
         static final Codec<fzy.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (fzy.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements fzy {
      public static final Codec<fzy.b> c = Codec.unit(fzy.b::new);

      @Override
      public fzy.d a() {
         return fzy.d.a;
      }
   }

   public static record c(int d, int e) implements fzy {
      public static final Codec<fzy.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(aqw.j.fieldOf("width").forGetter(fzy.c::b), aqw.j.fieldOf("height").forGetter(fzy.c::c)).apply($$0, fzy.c::new)
      );

      @Override
      public fzy.d a() {
         return fzy.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements asf {
      a("stretch", fzy.b.c),
      b("tile", fzy.c.c),
      c("nine_slice", fzy.a.c);

      public static final Codec<fzy.d> d = asf.a(fzy.d::values);
      private final String e;
      private final Codec<? extends fzy> f;

      private d(String $$0, Codec<? extends fzy> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends fzy> a() {
         return this.f;
      }
   }
}
