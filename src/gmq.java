import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gmq(akv b, akv c, List<gmq.a> d, List<gmq.b> e, gmn f) {
   public static final Codec<gmq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akv.a.fieldOf("vertex").forGetter(gmq::a),
               akv.a.fieldOf("fragment").forGetter(gmq::b),
               gmq.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gmq::c),
               gmq.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gmq::d),
               gmn.b.optionalFieldOf("defines", gmn.a).forGetter(gmq::e)
            )
            .apply($$0, gmq::new)
   );

   public akv a() {
      return this.b;
   }

   public akv b() {
      return this.c;
   }

   public List<gmq.a> c() {
      return this.d;
   }

   public List<gmq.b> d() {
      return this.e;
   }

   public gmn e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gmq.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gmq.a::a)).apply($$0, gmq.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gmq.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gmq.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gmq.b::b),
                     Codec.INT.fieldOf("count").forGetter(gmq.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gmq.b::d)
                  )
                  .apply($$0, gmq.b::new)
         )
         .validate(gmq.b::a);

      private static DataResult<gmq.b> a(gmq.b $$0) {
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
