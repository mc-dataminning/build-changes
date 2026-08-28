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

public record gll(Map<alp, gll.d> b, List<gll.e> c) {
   public static final Codec<gll> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alp.a, gll.d.b).optionalFieldOf("targets", Map.of()).forGetter(gll::a),
               gll.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(gll::b)
            )
            .apply($$0, gll::new)
   );

   public Map<alp, gll.d> a() {
      return this.b;
   }

   public List<gll.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements gll.d {
      public static final Codec<gll.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(azd.m.fieldOf("width").forGetter(gll.a::a), azd.m.fieldOf("height").forGetter(gll.a::b)).apply($$0, gll.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements gll.d {
      public static final Codec<gll.b> a = Codec.unit(gll.b::new);
   }

   public sealed interface c permits gll.g, gll.f {
      Codec<gll.c> a = Codec.xor(gll.g.b, gll.f.b).xmap($$0 -> (gll.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gll.g $$3 -> Either.left($$3);
            case gll.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alp> b();
   }

   public sealed interface d permits gll.b, gll.a {
      Codec<gll.d> b = Codec.either(gll.a.a, gll.b.a).xmap($$0 -> (gll.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gll.a $$3 -> Either.left($$3);
            case gll.b $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alp b, List<gll.c> c, alp d, List<gll.h> e) {
      private static final Codec<List<gll.c>> f = gll.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (gll.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<gll.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alp.a.fieldOf("program").forGetter(gll.e::b),
                  f.optionalFieldOf("inputs", List.of()).forGetter(gll.e::c),
                  alp.a.fieldOf("output").forGetter(gll.e::d),
                  gll.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gll.e::e)
               )
               .apply($$0, gll.e::new)
      );

      public gly a() {
         return new gly(this.b, fgj.e, glw.a);
      }
   }

   public static record f(String c, alp d, boolean e, boolean f) implements gll.c {
      public static final Codec<gll.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gll.f::a),
                  alp.a.fieldOf("target").forGetter(gll.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(gll.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gll.f::e)
               )
               .apply($$0, gll.f::new)
      );

      @Override
      public Set<alp> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public alp c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, alp d, int e, int f, boolean g) implements gll.c {
      public static final Codec<gll.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(gll.g::a),
                  alp.a.fieldOf("location").forGetter(gll.g::c),
                  azd.m.fieldOf("width").forGetter(gll.g::d),
                  azd.m.fieldOf("height").forGetter(gll.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(gll.g::f)
               )
               .apply($$0, gll.g::new)
      );

      @Override
      public Set<alp> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public alp c() {
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
      public static final Codec<gll.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gll.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(gll.h::b))
               .apply($$0, gll.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
