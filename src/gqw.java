import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

public record gqw(Map<alg, gqw.d> b, List<gqw.e> c) {
   public static final Codec<gqw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alg.a, gqw.d.b).optionalFieldOf("targets", Map.of()).forGetter(gqw::a),
               gqw.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gqw::b)
            )
            .apply($$0, gqw::new)
   );

   public Map<alg, gqw.d> a() {
      return this.b;
   }

   public List<gqw.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gqw.d {
      public static final Codec<gqw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayu.m.fieldOf("width").forGetter(gqw.a::a), ayu.m.fieldOf("height").forGetter(gqw.a::b)).apply($$0, gqw.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gqw.d {
      public static final Codec<gqw.b> a = Codec.unit(gqw.b::new);
   }

   public sealed interface c permits gqw.g, gqw.f {
      Codec<gqw.c> a = Codec.xor(gqw.g.b, gqw.f.b).xmap($$0 -> (gqw.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gqw.g $$3 -> Either.left($$3);
            case gqw.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alg> b();
   }

   public sealed interface d permits gqw.b, gqw.a {
      Codec<gqw.d> b = Codec.either(gqw.a.a, gqw.b.a).xmap($$0 -> (gqw.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gqw.a $$3 -> Either.left($$3);
            case gqw.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alg b, alg c, List<gqw.c> d, alg e, List<gqw.h> f) {
      private static final Codec<List<gqw.c>> g = gqw.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gqw.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gqw.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("vertex_shader").forGetter(gqw.e::b),
                  alg.a.fieldOf("fragment_shader").forGetter(gqw.e::c),
                  g.optionalFieldOf("inputs", List.of()).forGetter(gqw.e::d),
                  alg.a.fieldOf("output").forGetter(gqw.e::e),
                  gqw.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gqw.e::f)
               )
               .apply($$0, gqw.e::new)
      );

      public Stream<alg> a() {
         Stream<alg> $$0 = this.d.stream().flatMap($$0x -> $$0x.b().stream());
         return Stream.concat($$0, Stream.of(this.e));
      }
   }

   public static record f(String c, alg d, boolean e, boolean f) implements gqw.c {
      public static final Codec<gqw.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gqw.f::a),
                  alg.a.fieldOf("target").forGetter(gqw.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gqw.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gqw.f::e)
               )
               .apply($$0, gqw.f::new)
      );

      @Override
      public Set<alg> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public alg c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, alg d, int e, int f, boolean g) implements gqw.c {
      public static final Codec<gqw.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gqw.g::a),
                  alg.a.fieldOf("location").forGetter(gqw.g::c),
                  ayu.m.fieldOf("width").forGetter(gqw.g::d),
                  ayu.m.fieldOf("height").forGetter(gqw.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gqw.g::f)
               )
               .apply($$0, gqw.g::new)
      );

      @Override
      public Set<alg> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public alg c() {
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

   public static record h(String b, String c, Optional<List<Float>> d) {
      public static final Codec<gqw.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(gqw.h::a),
                  Codec.STRING.fieldOf("type").forGetter(gqw.h::b),
                  Codec.FLOAT.sizeLimitedListOf(4).optionalFieldOf("values").forGetter(gqw.h::c)
               )
               .apply($$0, gqw.h::new)
      );

      public String a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public Optional<List<Float>> c() {
         return this.d;
      }
   }
}
