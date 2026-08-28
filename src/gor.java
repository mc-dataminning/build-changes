import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gor(ald b, ald c, List<gor.a> d, List<gor.b> e, goo f) {
   public static final Codec<gor> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ald.a.fieldOf("vertex").forGetter(gor::a),
               ald.a.fieldOf("fragment").forGetter(gor::b),
               gor.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gor::c),
               gor.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gor::d),
               goo.b.optionalFieldOf("defines", goo.a).forGetter(gor::e)
            )
            .apply($$0, gor::new)
   );

   public ald a() {
      return this.b;
   }

   public ald b() {
      return this.c;
   }

   public List<gor.a> c() {
      return this.d;
   }

   public List<gor.b> d() {
      return this.e;
   }

   public goo e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gor.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gor.a::a)).apply($$0, gor.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gor.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gor.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gor.b::b),
                     Codec.INT.fieldOf("count").forGetter(gor.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gor.b::d)
                  )
                  .apply($$0, gor.b::new)
         )
         .validate(gor.b::a);

      private static DataResult<gor.b> a(gor.b $$0) {
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
