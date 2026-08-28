import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ghz(alc b, alc c, List<ghz.a> d, List<ghz.b> e, ghw f) {
   public static final Codec<ghz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alc.a.fieldOf("vertex").forGetter(ghz::a),
               alc.a.fieldOf("fragment").forGetter(ghz::b),
               ghz.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(ghz::c),
               ghz.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(ghz::d),
               ghw.b.optionalFieldOf("defines", ghw.a).forGetter(ghz::e)
            )
            .apply($$0, ghz::new)
   );

   public alc a() {
      return this.b;
   }

   public alc b() {
      return this.c;
   }

   public List<ghz.a> c() {
      return this.d;
   }

   public List<ghz.b> d() {
      return this.e;
   }

   public ghw e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<ghz.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ghz.a::a)).apply($$0, ghz.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<ghz.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(ghz.b::a),
                     Codec.STRING.fieldOf("type").forGetter(ghz.b::b),
                     Codec.INT.fieldOf("count").forGetter(ghz.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(ghz.b::d)
                  )
                  .apply($$0, ghz.b::new)
         )
         .validate(ghz.b::a);

      private static DataResult<ghz.b> a(ghz.b $$0) {
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
