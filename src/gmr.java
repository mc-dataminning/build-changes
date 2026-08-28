import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gmr(akv b, akv c, List<gmr.a> d, List<gmr.b> e, gmo f) {
   public static final Codec<gmr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akv.a.fieldOf("vertex").forGetter(gmr::a),
               akv.a.fieldOf("fragment").forGetter(gmr::b),
               gmr.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gmr::c),
               gmr.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gmr::d),
               gmo.b.optionalFieldOf("defines", gmo.a).forGetter(gmr::e)
            )
            .apply($$0, gmr::new)
   );

   public akv a() {
      return this.b;
   }

   public akv b() {
      return this.c;
   }

   public List<gmr.a> c() {
      return this.d;
   }

   public List<gmr.b> d() {
      return this.e;
   }

   public gmo e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gmr.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gmr.a::a)).apply($$0, gmr.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gmr.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gmr.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gmr.b::b),
                     Codec.INT.fieldOf("count").forGetter(gmr.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gmr.b::d)
                  )
                  .apply($$0, gmr.b::new)
         )
         .validate(gmr.b::a);

      private static DataResult<gmr.b> a(gmr.b $$0) {
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
