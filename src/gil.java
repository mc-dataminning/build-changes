import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import java.util.function.Function;

public interface gil {
   Codec<gil> a = gil.d.d.dispatch(gil::a, gil.d::a);
   gil b = new gil.b();

   gil.d a();

   public static record a(int d, int e, gil.a.a f) implements gil {
      public static final Codec<gil.a> c = avp.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     avp.j.fieldOf("width").forGetter(gil.a::b), avp.j.fieldOf("height").forGetter(gil.a::c), gil.a.a.g.fieldOf("border").forGetter(gil.a::d)
                  )
                  .apply($$0, gil.a::new)
         ),
         gil.a::a
      );

      private static DataResult<gil.a> a(gil.a $$0) {
         gil.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public gil.d a() {
         return gil.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public gil.a.a d() {
         return this.f;
      }

      public static record a(int a, int b, int c, int d) {
         private static final Codec<gil.a.a> e = avp.j.flatComapMap($$0 -> new gil.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<gil.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     avp.i.fieldOf("left").forGetter(gil.a.a::a),
                     avp.i.fieldOf("top").forGetter(gil.a.a::b),
                     avp.i.fieldOf("right").forGetter(gil.a.a::c),
                     avp.i.fieldOf("bottom").forGetter(gil.a.a::d)
                  )
                  .apply($$0, gil.a.a::new)
         );
         static final Codec<gil.a.a> g = Codec.either(e, f)
            .xmap($$0 -> (gil.a.a)$$0.map(Function.identity(), Function.identity()), $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public static record b() implements gil {
      public static final Codec<gil.b> c = Codec.unit(gil.b::new);

      @Override
      public gil.d a() {
         return gil.d.a;
      }
   }

   public static record c(int d, int e) implements gil {
      public static final Codec<gil.c> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(avp.j.fieldOf("width").forGetter(gil.c::b), avp.j.fieldOf("height").forGetter(gil.c::c)).apply($$0, gil.c::new)
      );

      @Override
      public gil.d a() {
         return gil.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements axc {
      a("stretch", gil.b.c),
      b("tile", gil.c.c),
      c("nine_slice", gil.a.c);

      public static final Codec<gil.d> d = axc.a(gil.d::values);
      private final String e;
      private final Codec<? extends gil> f;

      private d(String $$0, Codec<? extends gil> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public Codec<? extends gil> a() {
         return this.f;
      }
   }
}
