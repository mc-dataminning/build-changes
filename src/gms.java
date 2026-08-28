import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gms(akv b, akv c, List<gms.a> d, List<gms.b> e, gmp f) {
   public static final Codec<gms> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akv.a.fieldOf("vertex").forGetter(gms::a),
               akv.a.fieldOf("fragment").forGetter(gms::b),
               gms.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gms::c),
               gms.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gms::d),
               gmp.b.optionalFieldOf("defines", gmp.a).forGetter(gms::e)
            )
            .apply($$0, gms::new)
   );

   public akv a() {
      return this.b;
   }

   public akv b() {
      return this.c;
   }

   public List<gms.a> c() {
      return this.d;
   }

   public List<gms.b> d() {
      return this.e;
   }

   public gmp e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gms.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gms.a::a)).apply($$0, gms.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gms.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gms.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gms.b::b),
                     Codec.INT.fieldOf("count").forGetter(gms.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gms.b::d)
                  )
                  .apply($$0, gms.b::new)
         )
         .validate(gms.b::a);

      private static DataResult<gms.b> a(gms.b $$0) {
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
