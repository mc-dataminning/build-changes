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

public record gjc(Map<all, gjc.d> b, List<gjc.e> c) {
   public static final Codec<gjc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(all.a, gjc.d.b).optionalFieldOf("targets", Map.of()).forGetter(gjc::a),
               gjc.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gjc::b)
            )
            .apply($$0, gjc::new)
   );

   public Map<all, gjc.d> a() {
      return this.b;
   }

   public List<gjc.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gjc.d {
      public static final Codec<gjc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayw.m.fieldOf("width").forGetter(gjc.a::a), ayw.m.fieldOf("height").forGetter(gjc.a::b)).apply($$0, gjc.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gjc.d {
      public static final Codec<gjc.b> a = Codec.unit(gjc.b::new);
   }

   public sealed interface c permits gjc.g, gjc.f {
      Codec<gjc.c> a = Codec.xor(gjc.g.b, gjc.f.b).xmap($$0 -> (gjc.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gjc.g $$3 -> Either.left($$3);
            case gjc.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<all> b();
   }

   public sealed interface d permits gjc.b, gjc.a {
      Codec<gjc.d> b = Codec.either(gjc.a.a, gjc.b.a).xmap($$0 -> (gjc.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gjc.a $$3 -> Either.left($$3);
            case gjc.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(all b, List<gjc.c> c, all d, List<gjc.h> e) {
      private static final Codec<List<gjc.c>> f = gjc.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gjc.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gjc.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  all.a.fieldOf("program").forGetter(gjc.e::a),
                  f.optionalFieldOf("inputs", List.of()).forGetter(gjc.e::b),
                  all.a.fieldOf("output").forGetter(gjc.e::c),
                  gjc.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gjc.e::d)
               )
               .apply($$0, gjc.e::new)
      );

      public all a() {
         return this.b;
      }

      public List<gjc.c> b() {
         return this.c;
      }

      public all c() {
         return this.d;
      }

      public List<gjc.h> d() {
         return this.e;
      }
   }

   public static record f(String c, all d, boolean e, boolean f) implements gjc.c {
      public static final Codec<gjc.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gjc.f::a),
                  all.a.fieldOf("target").forGetter(gjc.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gjc.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gjc.f::e)
               )
               .apply($$0, gjc.f::new)
      );

      @Override
      public Set<all> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public all c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, all d, int e, int f, boolean g) implements gjc.c {
      public static final Codec<gjc.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gjc.g::a),
                  all.a.fieldOf("location").forGetter(gjc.g::c),
                  ayw.m.fieldOf("width").forGetter(gjc.g::d),
                  ayw.m.fieldOf("height").forGetter(gjc.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gjc.g::f)
               )
               .apply($$0, gjc.g::new)
      );

      @Override
      public Set<all> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public all c() {
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
      public static final Codec<gjc.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gjc.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(gjc.h::b))
               .apply($$0, gjc.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
