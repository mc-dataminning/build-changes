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

public record gjl(Map<alj, gjl.d> b, List<gjl.e> c) {
   public static final Codec<gjl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alj.a, gjl.d.b).optionalFieldOf("targets", Map.of()).forGetter(gjl::a),
               gjl.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gjl::b)
            )
            .apply($$0, gjl::new)
   );

   public Map<alj, gjl.d> a() {
      return this.b;
   }

   public List<gjl.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gjl.d {
      public static final Codec<gjl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayv.m.fieldOf("width").forGetter(gjl.a::a), ayv.m.fieldOf("height").forGetter(gjl.a::b)).apply($$0, gjl.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gjl.d {
      public static final Codec<gjl.b> a = Codec.unit(gjl.b::new);
   }

   public sealed interface c permits gjl.g, gjl.f {
      Codec<gjl.c> a = Codec.xor(gjl.g.b, gjl.f.b).xmap($$0 -> (gjl.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gjl.g $$3 -> Either.left($$3);
            case gjl.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alj> b();
   }

   public sealed interface d permits gjl.b, gjl.a {
      Codec<gjl.d> b = Codec.either(gjl.a.a, gjl.b.a).xmap($$0 -> (gjl.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gjl.a $$3 -> Either.left($$3);
            case gjl.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alj b, List<gjl.c> c, alj d, List<gjl.h> e) {
      private static final Codec<List<gjl.c>> f = gjl.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gjl.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gjl.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alj.a.fieldOf("program").forGetter(gjl.e::a),
                  f.optionalFieldOf("inputs", List.of()).forGetter(gjl.e::b),
                  alj.a.fieldOf("output").forGetter(gjl.e::c),
                  gjl.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gjl.e::d)
               )
               .apply($$0, gjl.e::new)
      );

      public alj a() {
         return this.b;
      }

      public List<gjl.c> b() {
         return this.c;
      }

      public alj c() {
         return this.d;
      }

      public List<gjl.h> d() {
         return this.e;
      }
   }

   public static record f(String c, alj d, boolean e, boolean f) implements gjl.c {
      public static final Codec<gjl.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gjl.f::a),
                  alj.a.fieldOf("target").forGetter(gjl.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gjl.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gjl.f::e)
               )
               .apply($$0, gjl.f::new)
      );

      @Override
      public Set<alj> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public alj c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, alj d, int e, int f, boolean g) implements gjl.c {
      public static final Codec<gjl.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gjl.g::a),
                  alj.a.fieldOf("location").forGetter(gjl.g::c),
                  ayv.m.fieldOf("width").forGetter(gjl.g::d),
                  ayv.m.fieldOf("height").forGetter(gjl.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gjl.g::f)
               )
               .apply($$0, gjl.g::new)
      );

      @Override
      public Set<alj> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public alj c() {
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
      public static final Codec<gjl.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gjl.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(gjl.h::b))
               .apply($$0, gjl.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
