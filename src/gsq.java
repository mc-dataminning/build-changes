import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gsq {
   Codec<gsq> a = gsq.d.d.dispatch(gsq::a, gsq.d::a);
   gsq b = new gsq.b();

   gsq.d a();

   public static record a(int d, int e, gsq.a.a f) implements gsq {
      public static final Codec<gsq.a> c = axu.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axu.j.fieldOf("width").forGetter(gsq.a::b), axu.j.fieldOf("height").forGetter(gsq.a::c), gsq.a.a.g.fieldOf("border").forGetter(gsq.a::d)
                  )
                  .apply($$0, gsq.a::new)
         ),
         gsq.a::a
      );

      private static DataResult<gsq.a> a(gsq.a $$0) {
         gsq.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gsq.d a() {
         return gsq.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gsq.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gsq.a.a> e = axu.j.flatComapMap($$0 -> new gsq.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gsq.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     axu.i.fieldOf("left").forGetter(gsq.a.a::a),
                     axu.i.fieldOf("top").forGetter(gsq.a.a::b),
                     axu.i.fieldOf("right").forGetter(gsq.a.a::c),
                     axu.i.fieldOf("bottom").forGetter(gsq.a.a::d)
                  )
                  .apply($$0, gsq.a.a::new)
         );
         static final Codec<gsq.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gsq.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gsq {
      public static final Codec<gsq.b> c = Codec.unit(gsq.b::new);

      @Override
      public gsq.d a() {
         return gsq.d.a;
      }
   }

   public static record c(int d, int e) implements gsq {
      public static final Codec<gsq.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.j.fieldOf("width").forGetter(gsq.c::b), axu.j.fieldOf("height").forGetter(gsq.c::c)).apply($$0, gsq.c::new)
      );

      @Override
      public gsq.d a() {
         return gsq.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements azg {
      a("stretch", gsq.b.c),
      b("tile", gsq.c.c),
      c("nine_slice", gsq.a.c);

      public static final Codec<gsq.d> d = azg.a(gsq.d::values);
      private final String e;
      private final Codec<? extends gsq> f;

      private d(String $$0, Codec<? extends gsq> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gsq> a() {
         return this.f;
      }
   }
}
