import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gjz(alj b, alj c, List<gjz.a> d, List<gjz.b> e, gjw f) {
   public static final Codec<gjz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alj.a.fieldOf("vertex").forGetter(gjz::a),
               alj.a.fieldOf("fragment").forGetter(gjz::b),
               gjz.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gjz::c),
               gjz.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gjz::d),
               gjw.b.optionalFieldOf("defines", gjw.a).forGetter(gjz::e)
            )
            .apply($$0, gjz::new)
   );

   public alj a() {
      return this.b;
   }

   public alj b() {
      return this.c;
   }

   public List<gjz.a> c() {
      return this.d;
   }

   public List<gjz.b> d() {
      return this.e;
   }

   public gjw e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gjz.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gjz.a::a)).apply($$0, gjz.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gjz.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gjz.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gjz.b::b),
                     Codec.INT.fieldOf("count").forGetter(gjz.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gjz.b::d)
                  )
                  .apply($$0, gjz.b::new)
         )
         .validate(gjz.b::a);

      private static DataResult<gjz.b> a(gjz.b $$0) {
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
