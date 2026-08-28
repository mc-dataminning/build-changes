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

public record glq(Map<alz, glq.d> b, List<glq.e> c) {
   public static final Codec<glq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alz.a, glq.d.b).optionalFieldOf("targets", Map.of()).forGetter(glq::a),
               glq.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(glq::b)
            )
            .apply($$0, glq::new)
   );

   public Map<alz, glq.d> a() {
      return this.b;
   }

   public List<glq.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements glq.d {
      public static final Codec<glq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(azn.m.fieldOf("width").forGetter(glq.a::a), azn.m.fieldOf("height").forGetter(glq.a::b)).apply($$0, glq.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements glq.d {
      public static final Codec<glq.b> a = Codec.unit(glq.b::new);
   }

   public sealed interface c permits glq.g, glq.f {
      Codec<glq.c> a = Codec.xor(glq.g.b, glq.f.b).xmap($$0 -> (glq.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case glq.g $$3 -> Either.left($$3);
            case glq.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alz> b();
   }

   public sealed interface d permits glq.b, glq.a {
      Codec<glq.d> b = Codec.either(glq.a.a, glq.b.a).xmap($$0 -> (glq.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case glq.a $$3 -> Either.left($$3);
            case glq.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alz b, List<glq.c> c, alz d, List<glq.h> e) {
      private static final Codec<List<glq.c>> f = glq.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (glq.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<glq.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alz.a.fieldOf("program").forGetter(glq.e::a),
                  f.optionalFieldOf("inputs", List.of()).forGetter(glq.e::b),
                  alz.a.fieldOf("output").forGetter(glq.e::c),
                  glq.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(glq.e::d)
               )
               .apply($$0, glq.e::new)
      );

      public alz a() {
         return this.b;
      }

      public List<glq.c> b() {
         return this.c;
      }

      public alz c() {
         return this.d;
      }

      public List<glq.h> d() {
         return this.e;
      }
   }

   public static record f(String c, alz d, boolean e, boolean f) implements glq.c {
      public static final Codec<glq.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(glq.f::a),
                  alz.a.fieldOf("target").forGetter(glq.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(glq.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(glq.f::e)
               )
               .apply($$0, glq.f::new)
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

   public static record g(String c, alz d, int e, int f, boolean g) implements glq.c {
      public static final Codec<glq.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(glq.g::a),
                  alz.a.fieldOf("location").forGetter(glq.g::c),
                  azn.m.fieldOf("width").forGetter(glq.g::d),
                  azn.m.fieldOf("height").forGetter(glq.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(glq.g::f)
               )
               .apply($$0, glq.g::new)
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
      public static final Codec<glq.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(glq.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(glq.h::b))
               .apply($$0, glq.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
