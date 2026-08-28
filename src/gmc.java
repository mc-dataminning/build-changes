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

public record gmc(Map<akv, gmc.d> b, List<gmc.e> c) {
   public static final Codec<gmc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(akv.a, gmc.d.b).optionalFieldOf("targets", Map.of()).forGetter(gmc::a),
               gmc.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gmc::b)
            )
            .apply($$0, gmc::new)
   );

   public Map<akv, gmc.d> a() {
      return this.b;
   }

   public List<gmc.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gmc.d {
      public static final Codec<gmc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayi.m.fieldOf("width").forGetter(gmc.a::a), ayi.m.fieldOf("height").forGetter(gmc.a::b)).apply($$0, gmc.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gmc.d {
      public static final Codec<gmc.b> a = Codec.unit(gmc.b::new);
   }

   public sealed interface c permits gmc.g, gmc.f {
      Codec<gmc.c> a = Codec.xor(gmc.g.b, gmc.f.b).xmap($$0 -> (gmc.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gmc.g $$3 -> Either.left($$3);
            case gmc.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<akv> b();
   }

   public sealed interface d permits gmc.b, gmc.a {
      Codec<gmc.d> b = Codec.either(gmc.a.a, gmc.b.a).xmap($$0 -> (gmc.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gmc.a $$3 -> Either.left($$3);
            case gmc.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(akv b, List<gmc.c> c, akv d, List<gmc.h> e) {
      private static final Codec<List<gmc.c>> f = gmc.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gmc.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gmc.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akv.a.fieldOf("program").forGetter(gmc.e::b),
                  f.optionalFieldOf("inputs", List.of()).forGetter(gmc.e::c),
                  akv.a.fieldOf("output").forGetter(gmc.e::d),
                  gmc.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gmc.e::e)
               )
               .apply($$0, gmc.e::new)
      );

      public gmp a() {
         return new gmp(this.b, ffr.e, gmn.a);
      }
   }

   public static record f(String c, akv d, boolean e, boolean f) implements gmc.c {
      public static final Codec<gmc.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gmc.f::a),
                  akv.a.fieldOf("target").forGetter(gmc.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gmc.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gmc.f::e)
               )
               .apply($$0, gmc.f::new)
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

   public static record g(String c, akv d, int e, int f, boolean g) implements gmc.c {
      public static final Codec<gmc.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gmc.g::a),
                  akv.a.fieldOf("location").forGetter(gmc.g::c),
                  ayi.m.fieldOf("width").forGetter(gmc.g::d),
                  ayi.m.fieldOf("height").forGetter(gmc.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gmc.g::f)
               )
               .apply($$0, gmc.g::new)
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
      public static final Codec<gmc.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gmc.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(gmc.h::b))
               .apply($$0, gmc.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
