import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gie(ale b, ale c, List<gie.a> d, List<gie.b> e, gib f) {
   public static final Codec<gie> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ale.a.fieldOf("vertex").forGetter(gie::a),
               ale.a.fieldOf("fragment").forGetter(gie::b),
               gie.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gie::c),
               gie.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gie::d),
               gib.b.optionalFieldOf("defines", gib.a).forGetter(gie::e)
            )
            .apply($$0, gie::new)
   );

   public ale a() {
      return this.b;
   }

   public ale b() {
      return this.c;
   }

   public List<gie.a> c() {
      return this.d;
   }

   public List<gie.b> d() {
      return this.e;
   }

   public gib e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gie.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gie.a::a)).apply($$0, gie.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gie.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gie.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gie.b::b),
                     Codec.INT.fieldOf("count").forGetter(gie.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gie.b::d)
                  )
                  .apply($$0, gie.b::new)
         )
         .validate(gie.b::a);

      private static DataResult<gie.b> a(gie.b $$0) {
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
