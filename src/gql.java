import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gql(alg b, alg c, List<gql.a> d, List<gql.b> e, gqi f) {
   public static final Codec<gql> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alg.a.fieldOf("vertex").forGetter(gql::a),
               alg.a.fieldOf("fragment").forGetter(gql::b),
               gql.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gql::c),
               gql.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gql::d),
               gqi.b.optionalFieldOf("defines", gqi.a).forGetter(gql::e)
            )
            .apply($$0, gql::new)
   );

   public alg a() {
      return this.b;
   }

   public alg b() {
      return this.c;
   }

   public List<gql.a> c() {
      return this.d;
   }

   public List<gql.b> d() {
      return this.e;
   }

   public gqi e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gql.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gql.a::a)).apply($$0, gql.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gql.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gql.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gql.b::b),
                     Codec.INT.fieldOf("count").forGetter(gql.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gql.b::d)
                  )
                  .apply($$0, gql.b::new)
         )
         .validate(gql.b::a);

      private static DataResult<gql.b> a(gql.b $$0) {
         int $$1 = $$0.d;
         int $$2 = $$0.e.size();
         return $$2 != $$1 && $$2 > 1
            ? DataResult.error(() -> "Invalid amount of uniform values specified (expected " + $$1 + ", found " + $$2 + ")")
            : DataResult.success($$0);
      }

      public String a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public List<Float> d() {
         return this.e;
      }
   }
}
