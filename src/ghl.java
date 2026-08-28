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

public record ghl(Map<alc, ghl.d> b, List<ghl.e> c) {
   public static final Codec<ghl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(alc.a, ghl.d.b).optionalFieldOf("targets", Map.of()).forGetter(ghl::a),
               ghl.e.a.listOf().optionalFieldOf("passes", List.of()).forGetter(ghl::b)
            )
            .apply($$0, ghl::new)
   );

   public Map<alc, ghl.d> a() {
      return this.b;
   }

   public List<ghl.e> b() {
      return this.c;
   }

   public static record a(int c, int d) implements ghl.d {
      public static final Codec<ghl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aym.l.fieldOf("width").forGetter(ghl.a::a), aym.l.fieldOf("height").forGetter(ghl.a::b)).apply($$0, ghl.a::new)
      );

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }
   }

   public static record b() implements ghl.d {
      public static final Codec<ghl.b> a = Codec.unit(ghl.b::new);
   }

   public sealed interface c permits ghl.g, ghl.f {
      Codec<ghl.c> a = Codec.xor(ghl.g.b, ghl.f.b).xmap($$0 -> (ghl.c)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case ghl.g $$3 -> Either.left($$3);
            case ghl.f $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });

      String a();

      Set<alc> b();
   }

   public sealed interface d permits ghl.b, ghl.a {
      Codec<ghl.d> b = Codec.xor(ghl.b.a, ghl.a.a).xmap($$0 -> (ghl.d)$$0.map(Function.identity(), Function.identity()), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case ghl.b $$3 -> Either.left($$3);
            case ghl.a $$4 -> Either.right($$4);
            default -> throw new MatchException(null, null);
         };
      });
   }

   public static record e(alc b, List<ghl.c> c, alc d, List<ghl.h> e) {
      private static final Codec<List<ghl.c>> f = ghl.c.a.listOf().validate($$0 -> {
         Set<String> $$1 = new ObjectArraySet($$0.size());

         for (ghl.c $$2 : $$0) {
            if (!$$1.add($$2.a())) {
               return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
         }

         return DataResult.success($$0);
      });
      public static final Codec<ghl.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alc.a.fieldOf("program").forGetter(ghl.e::a),
                  f.optionalFieldOf("inputs", List.of()).forGetter(ghl.e::b),
                  alc.a.fieldOf("output").forGetter(ghl.e::c),
                  ghl.h.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(ghl.e::d)
               )
               .apply($$0, ghl.e::new)
      );

      public alc a() {
         return this.b;
      }

      public List<ghl.c> b() {
         return this.c;
      }

      public alc c() {
         return this.d;
      }

      public List<ghl.h> d() {
         return this.e;
      }
   }

   public static record f(String c, alc d, boolean e, boolean f) implements ghl.c {
      public static final Codec<ghl.f> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(ghl.f::a),
                  alc.a.fieldOf("target").forGetter(ghl.f::c),
                  Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(ghl.f::d),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(ghl.f::e)
               )
               .apply($$0, ghl.f::new)
      );

      @Override
      public Set<alc> b() {
         return Set.of(this.d);
      }

      @Override
      public String a() {
         return this.c;
      }

      public alc c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }
   }

   public static record g(String c, alc d, int e, int f, boolean g) implements ghl.c {
      public static final Codec<ghl.g> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("sampler_name").forGetter(ghl.g::a),
                  alc.a.fieldOf("location").forGetter(ghl.g::c),
                  aym.l.fieldOf("width").forGetter(ghl.g::d),
                  aym.l.fieldOf("height").forGetter(ghl.g::e),
                  Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(ghl.g::f)
               )
               .apply($$0, ghl.g::new)
      );

      @Override
      public Set<alc> b() {
         return Set.of();
      }

      @Override
      public String a() {
         return this.c;
      }

      public alc c() {
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
      public static final Codec<ghl.h> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ghl.h::a), Codec.FLOAT.sizeLimitedListOf(4).fieldOf("values").forGetter(ghl.h::b))
               .apply($$0, ghl.h::new)
      );

      public String a() {
         return this.b;
      }

      public List<Float> b() {
         return this.c;
      }
   }
}
