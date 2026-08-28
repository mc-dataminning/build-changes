import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;

public record gme(Map<akv, gme.d> b, List<gme.e> c) {
   public static final Codec<gme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(akv.a, gme.d.b).optionalFieldOf("targets", Map.of()).forGetter(gme::a),
               gme.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gme::b)
            )
            .apply($$0, gme::new)
   );

   public Map<akv, gme.d> a() {
      return this.b;
   }

   public List<gme.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gme.d {
      public static final Codec<gme.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayi.m.fieldOf("width").forGetter(gme.a::a), ayi.m.fieldOf("height").forGetter(gme.a::b)).apply($$0, gme.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gme.d {
      public static final Codec<gme.b> a = Codec.unit(gme.b::new);
   }

   public sealed interface c permits gme.g, gme.f {
      Codec<gme.c> a = Codec.xor(gme.g.b, gme.f.b).xmap($$0 -> (gme.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gme.g $$3 -> Either.left($$3);
            case gme.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<akv> b();
   }

   public sealed interface d permits gme.b, gme.a {
      Codec<gme.d> b = Codec.either(gme.a.a, gme.b.a).xmap($$0 -> (gme.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gme.a $$3 -> Either.left($$3);
            case gme.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(akv b, List<gme.c> c, akv d, List<gme.h> e) {
      private static final Codec<List<gme.c>> f = gme.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gme.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gme.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akv.a.fieldOf("program").forGetter(gme.e::b),
                  f.optionalFieldOf("inputs", List.of()).forGetter(gme.e::c),
                  akv.a.fieldOf("output").forGetter(gme.e::d),
                  gme.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gme.e::e)
               )
               .apply($$0, gme.e::new)
      );

      public gmr a() {
         return new gmr(this.b, fft.e, gmp.a);
      }
   }

   public static record f(String c, akv d, boolean e, boolean f) implements gme.c {
      public static final Codec<gme.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gme.f::a),
                  akv.a.fieldOf("target").forGetter(gme.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gme.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gme.f::e)
               )
               .apply($$0, gme.f::new)
      );

      @Override
      public Set<akv> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public akv c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, akv d, int e, int f, boolean g) implements gme.c {
      public static final Codec<gme.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gme.g::a),
                  akv.a.fieldOf("location").forGetter(gme.g::c),
                  ayi.m.fieldOf("width").forGetter(gme.g::d),
                  ayi.m.fieldOf("height").forGetter(gme.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gme.g::f)
               )
               .apply($$0, gme.g::new)
      );

      @Override
      public Set<akv> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public akv c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public int e() {
         return this.f;
      }

      public boolean f() {
         return this.g;
      }
   }

   public static record h(String b, List<Float> c) {
      public static final Codec<gme.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gme.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(gme.h::b))
               .apply($$0, gme.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
