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

public record ggz(Map<alb, ggz.d> b, List<ggz.e> c) {
   public static final Codec<ggz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alb.a, ggz.d.b).optionalFieldOf("targets", Map.of()).forGetter(ggz::a),
               ggz.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(ggz::b)
            )
            .apply($$0, ggz::new)
   );

   public Map<alb, ggz.d> a() {
      return this.b;
   }

   public List<ggz.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements ggz.d {
      public static final Codec<ggz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayl.l.fieldOf("width").forGetter(ggz.a::a), ayl.l.fieldOf("height").forGetter(ggz.a::b)).apply($$0, ggz.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements ggz.d {
      public static final Codec<ggz.b> a = Codec.unit(ggz.b::new);
   }

   public sealed interface c permits ggz.g, ggz.f {
      Codec<ggz.c> a = Codec.xor(ggz.g.b, ggz.f.b).xmap($$0 -> (ggz.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case ggz.g $$3 -> Either.left($$3);
            case ggz.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alb> b();
   }

   public sealed interface d permits ggz.b, ggz.a {
      Codec<ggz.d> b = Codec.xor(ggz.b.a, ggz.a.a).xmap($$0 -> (ggz.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case ggz.b $$3 -> Either.left($$3);
            case ggz.a $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(String b, List<ggz.c> c, alb d, List<ggz.h> e) {
      private static final Codec<List<ggz.c>> f = ggz.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (ggz.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<ggz.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("name").forGetter(ggz.e::a),
                  f.optionalFieldOf("inputs", List.of()).forGetter(ggz.e::b),
                  alb.a.fieldOf("output").forGetter(ggz.e::c),
                  ggz.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(ggz.e::d)
               )
               .apply($$0, ggz.e::new)
      );

      public String a() {
         return this.b;
      }

      public List<ggz.c> b() {
         return this.c;
      }

      public alb c() {
         return this.d;
      }

      public List<ggz.h> d() {
         return this.e;
      }
   }

   public static record f(String c, alb d, boolean e, boolean f) implements ggz.c {
      public static final Codec<ggz.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(ggz.f::a),
                  alb.a.fieldOf("target").forGetter(ggz.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(ggz.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(ggz.f::e)
               )
               .apply($$0, ggz.f::new)
      );

      @Override
      public Set<alb> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public alb c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, alb d, int e, int f, boolean g) implements ggz.c {
      public static final Codec<ggz.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(ggz.g::a),
                  alb.a.fieldOf("location").forGetter(ggz.g::c),
                  ayl.l.fieldOf("width").forGetter(ggz.g::d),
                  ayl.l.fieldOf("height").forGetter(ggz.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(ggz.g::f)
               )
               .apply($$0, ggz.g::new)
      );

      @Override
      public Set<alb> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public alb c() {
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
      public static final Codec<ggz.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ggz.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(ggz.h::b))
               .apply($$0, ggz.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
