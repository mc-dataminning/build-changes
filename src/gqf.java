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
import java.util.stream.Stream;

public record gqf(Map<alg, gqf.d> b, List<gqf.e> c) {
   public static final Codec<gqf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alg.a, gqf.d.b).optionalFieldOf("targets", Map.of()).forGetter(gqf::a),
               gqf.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gqf::b)
            )
            .apply($$0, gqf::new)
   );

   public Map<alg, gqf.d> a() {
      return this.b;
   }

   public List<gqf.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gqf.d {
      public static final Codec<gqf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayu.m.fieldOf("width").forGetter(gqf.a::a), ayu.m.fieldOf("height").forGetter(gqf.a::b)).apply($$0, gqf.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gqf.d {
      public static final Codec<gqf.b> a = Codec.unit(gqf.b::new);
   }

   public sealed interface c permits gqf.g, gqf.f {
      Codec<gqf.c> a = Codec.xor(gqf.g.b, gqf.f.b).xmap($$0 -> (gqf.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gqf.g $$3 -> Either.left($$3);
            case gqf.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alg> b();
   }

   public sealed interface d permits gqf.b, gqf.a {
      Codec<gqf.d> b = Codec.either(gqf.a.a, gqf.b.a).xmap($$0 -> (gqf.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gqf.a $$3 -> Either.left($$3);
            case gqf.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alg b, List<gqf.c> c, alg d, List<gqf.h> e) {
      private static final Codec<List<gqf.c>> f = gqf.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gqf.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gqf.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("program").forGetter(gqf.e::c),
                  f.optionalFieldOf("inputs", List.of()).forGetter(gqf.e::d),
                  alg.a.fieldOf("output").forGetter(gqf.e::e),
                  gqf.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gqf.e::f)
               )
               .apply($$0, gqf.e::new)
      );

      public gqs a() {
         return new gqs(this.b, fjh.e, gqq.a);
      }

      public Stream<alg> b() {
         Stream<alg> $$0 = this.c.stream().flatMap($$0x -> $$0x.b().stream());
         return Stream.concat($$0, Stream.of(this.d));
      }

      public alg c() {
         return this.b;
      }

      public List<gqf.c> d() {
         return this.c;
      }

      public alg e() {
         return this.d;
      }

      public List<gqf.h> f() {
         return this.e;
      }
   }

   public static record f(String c, alg d, boolean e, boolean f) implements gqf.c {
      public static final Codec<gqf.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gqf.f::a),
                  alg.a.fieldOf("target").forGetter(gqf.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gqf.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gqf.f::e)
               )
               .apply($$0, gqf.f::new)
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

   public static record g(String c, alg d, int e, int f, boolean g) implements gqf.c {
      public static final Codec<gqf.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gqf.g::a),
                  alg.a.fieldOf("location").forGetter(gqf.g::c),
                  ayu.m.fieldOf("width").forGetter(gqf.g::d),
                  ayu.m.fieldOf("height").forGetter(gqf.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gqf.g::f)
               )
               .apply($$0, gqf.g::new)
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

   public static record h(String b, List<Float> c) {
      public static final Codec<gqf.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gqf.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(gqf.h::b))
               .apply($$0, gqf.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
