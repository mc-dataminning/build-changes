import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gqt(alg b, alg c, List<gqt.a> d, List<gqt.b> e, gqq f) {
   public static final Codec<gqt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alg.a.fieldOf("vertex").forGetter(gqt::a),
               alg.a.fieldOf("fragment").forGetter(gqt::b),
               gqt.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gqt::c),
               gqt.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gqt::d),
               gqq.b.optionalFieldOf("defines", gqq.a).forGetter(gqt::e)
            )
            .apply($$0, gqt::new)
   );

   public alg a() {
      return this.b;
   }

   public alg b() {
      return this.c;
   }

   public List<gqt.a> c() {
      return this.d;
   }

   public List<gqt.b> d() {
      return this.e;
   }

   public gqq e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gqt.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gqt.a::a)).apply($$0, gqt.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gqt.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gqt.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gqt.b::b),
                     Codec.INT.fieldOf("count").forGetter(gqt.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gqt.b::d)
                  )
                  .apply($$0, gqt.b::new)
         )
         .validate(gqt.b::a);

      private static DataResult<gqt.b> a(gqt.b $$0) {
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
