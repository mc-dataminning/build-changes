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

public record ghq(Map<ale, ghq.d> b, List<ghq.e> c) {
   public static final Codec<ghq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(ale.a, ghq.d.b).optionalFieldOf("targets", Map.of()).forGetter(ghq::a),
               ghq.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(ghq::b)
            )
            .apply($$0, ghq::new)
   );

   public Map<ale, ghq.d> a() {
      return this.b;
   }

   public List<ghq.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements ghq.d {
      public static final Codec<ghq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayo.l.fieldOf("width").forGetter(ghq.a::a), ayo.l.fieldOf("height").forGetter(ghq.a::b)).apply($$0, ghq.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements ghq.d {
      public static final Codec<ghq.b> a = Codec.unit(ghq.b::new);
   }

   public sealed interface c permits ghq.g, ghq.f {
      Codec<ghq.c> a = Codec.xor(ghq.g.b, ghq.f.b).xmap($$0 -> (ghq.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case ghq.g $$3 -> Either.left($$3);
            case ghq.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<ale> b();
   }

   public sealed interface d permits ghq.b, ghq.a {
      Codec<ghq.d> b = Codec.xor(ghq.b.a, ghq.a.a).xmap($$0 -> (ghq.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case ghq.b $$3 -> Either.left($$3);
            case ghq.a $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(ale b, List<ghq.c> c, ale d, List<ghq.h> e) {
      private static final Codec<List<ghq.c>> f = ghq.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (ghq.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<ghq.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ale.a.fieldOf("program").forGetter(ghq.e::a),
                  f.optionalFieldOf("inputs", List.of()).forGetter(ghq.e::b),
                  ale.a.fieldOf("output").forGetter(ghq.e::c),
                  ghq.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(ghq.e::d)
               )
               .apply($$0, ghq.e::new)
      );

      public ale a() {
         return this.b;
      }

      public List<ghq.c> b() {
         return this.c;
      }

      public ale c() {
         return this.d;
      }

      public List<ghq.h> d() {
         return this.e;
      }
   }

   public static record f(String c, ale d, boolean e, boolean f) implements ghq.c {
      public static final Codec<ghq.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(ghq.f::a),
                  ale.a.fieldOf("target").forGetter(ghq.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(ghq.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(ghq.f::e)
               )
               .apply($$0, ghq.f::new)
      );

      @Override
      public Set<ale> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public ale c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, ale d, int e, int f, boolean g) implements ghq.c {
      public static final Codec<ghq.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(ghq.g::a),
                  ale.a.fieldOf("location").forGetter(ghq.g::c),
                  ayo.l.fieldOf("width").forGetter(ghq.g::d),
                  ayo.l.fieldOf("height").forGetter(ghq.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(ghq.g::f)
               )
               .apply($$0, ghq.g::new)
      );

      @Override
      public Set<ale> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public ale c() {
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
      public static final Codec<ghq.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ghq.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(ghq.h::b))
               .apply($$0, ghq.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
