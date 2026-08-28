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

public record glp(Map<alz, glp.d> b, List<glp.e> c) {
   public static final Codec<glp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alz.a, glp.d.b).optionalFieldOf("targets", Map.of()).forGetter(glp::a),
               glp.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(glp::b)
            )
            .apply($$0, glp::new)
   );

   public Map<alz, glp.d> a() {
      return this.b;
   }

   public List<glp.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements glp.d {
      public static final Codec<glp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(azn.m.fieldOf("width").forGetter(glp.a::a), azn.m.fieldOf("height").forGetter(glp.a::b)).apply($$0, glp.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements glp.d {
      public static final Codec<glp.b> a = Codec.unit(glp.b::new);
   }

   public sealed interface c permits glp.g, glp.f {
      Codec<glp.c> a = Codec.xor(glp.g.b, glp.f.b).xmap($$0 -> (glp.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case glp.g $$3 -> Either.left($$3);
            case glp.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alz> b();
   }

   public sealed interface d permits glp.b, glp.a {
      Codec<glp.d> b = Codec.either(glp.a.a, glp.b.a).xmap($$0 -> (glp.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case glp.a $$3 -> Either.left($$3);
            case glp.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alz b, List<glp.c> c, alz d, List<glp.h> e) {
      private static final Codec<List<glp.c>> f = glp.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (glp.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<glp.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alz.a.fieldOf("program").forGetter(glp.e::a),
                  f.optionalFieldOf("inputs", List.of()).forGetter(glp.e::b),
                  alz.a.fieldOf("output").forGetter(glp.e::c),
                  glp.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(glp.e::d)
               )
               .apply($$0, glp.e::new)
      );

      public alz a() {
         return this.b;
      }

      public List<glp.c> b() {
         return this.c;
      }

      public alz c() {
         return this.d;
      }

      public List<glp.h> d() {
         return this.e;
      }
   }

   public static record f(String c, alz d, boolean e, boolean f) implements glp.c {
      public static final Codec<glp.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(glp.f::a),
                  alz.a.fieldOf("target").forGetter(glp.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(glp.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(glp.f::e)
               )
               .apply($$0, glp.f::new)
      );

      @Override
      public Set<alz> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public alz c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, alz d, int e, int f, boolean g) implements glp.c {
      public static final Codec<glp.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(glp.g::a),
                  alz.a.fieldOf("location").forGetter(glp.g::c),
                  azn.m.fieldOf("width").forGetter(glp.g::d),
                  azn.m.fieldOf("height").forGetter(glp.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(glp.g::f)
               )
               .apply($$0, glp.g::new)
      );

      @Override
      public Set<alz> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public alz c() {
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
      public static final Codec<glp.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(glp.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(glp.h::b))
               .apply($$0, glp.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
