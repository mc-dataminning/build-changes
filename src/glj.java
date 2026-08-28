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

public record glj(Map<alz, glj.d> b, List<glj.e> c) {
   public static final Codec<glj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alz.a, glj.d.b).optionalFieldOf("targets", Map.of()).forGetter(glj::a),
               glj.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(glj::b)
            )
            .apply($$0, glj::new)
   );

   public Map<alz, glj.d> a() {
      return this.b;
   }

   public List<glj.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements glj.d {
      public static final Codec<glj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(azn.m.fieldOf("width").forGetter(glj.a::a), azn.m.fieldOf("height").forGetter(glj.a::b)).apply($$0, glj.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements glj.d {
      public static final Codec<glj.b> a = Codec.unit(glj.b::new);
   }

   public sealed interface c permits glj.g, glj.f {
      Codec<glj.c> a = Codec.xor(glj.g.b, glj.f.b).xmap($$0 -> (glj.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case glj.g $$3 -> Either.left($$3);
            case glj.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alz> b();
   }

   public sealed interface d permits glj.b, glj.a {
      Codec<glj.d> b = Codec.either(glj.a.a, glj.b.a).xmap($$0 -> (glj.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case glj.a $$3 -> Either.left($$3);
            case glj.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alz b, List<glj.c> c, alz d, List<glj.h> e) {
      private static final Codec<List<glj.c>> f = glj.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (glj.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<glj.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alz.a.fieldOf("program").forGetter(glj.e::a),
                  f.optionalFieldOf("inputs", List.of()).forGetter(glj.e::b),
                  alz.a.fieldOf("output").forGetter(glj.e::c),
                  glj.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(glj.e::d)
               )
               .apply($$0, glj.e::new)
      );

      public alz a() {
         return this.b;
      }

      public List<glj.c> b() {
         return this.c;
      }

      public alz c() {
         return this.d;
      }

      public List<glj.h> d() {
         return this.e;
      }
   }

   public static record f(String c, alz d, boolean e, boolean f) implements glj.c {
      public static final Codec<glj.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(glj.f::a),
                  alz.a.fieldOf("target").forGetter(glj.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(glj.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(glj.f::e)
               )
               .apply($$0, glj.f::new)
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

   public static record g(String c, alz d, int e, int f, boolean g) implements glj.c {
      public static final Codec<glj.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(glj.g::a),
                  alz.a.fieldOf("location").forGetter(glj.g::c),
                  azn.m.fieldOf("width").forGetter(glj.g::d),
                  azn.m.fieldOf("height").forGetter(glj.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(glj.g::f)
               )
               .apply($$0, glj.g::new)
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
      public static final Codec<glj.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(glj.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(glj.h::b))
               .apply($$0, glj.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
