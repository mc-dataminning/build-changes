import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record gnq(aku b, aku c, List<gnq.a> d, List<gnq.b> e, gnn f) {
   public static final Codec<gnq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aku.a.fieldOf("vertex").forGetter(gnq::a),
               aku.a.fieldOf("fragment").forGetter(gnq::b),
               gnq.a.a.listOf().optionalFieldOf("samplers", List.of()).forGetter(gnq::c),
               gnq.b.a.listOf().optionalFieldOf("uniforms", List.of()).forGetter(gnq::d),
               gnn.b.optionalFieldOf("defines", gnn.a).forGetter(gnq::e)
            )
            .apply($$0, gnq::new)
   );

   public aku a() {
      return this.b;
   }

   public aku b() {
      return this.c;
   }

   public List<gnq.a> c() {
      return this.d;
   }

   public List<gnq.b> d() {
      return this.e;
   }

   public gnn e() {
      return this.f;
   }

   public static record a(String b) {
      public static final Codec<gnq.a> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(gnq.a::a)).apply($$0, gnq.a::new));

      public String a() {
         return this.b;
      }
   }

   public static record b(String b, String c, int d, List<Float> e) {
      public static final Codec<gnq.b> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     Codec.STRING.fieldOf("name").forGetter(gnq.b::a),
                     Codec.STRING.fieldOf("type").forGetter(gnq.b::b),
                     Codec.INT.fieldOf("count").forGetter(gnq.b::c),
                     Codec.FLOAT.listOf().fieldOf("values").forGetter(gnq.b::d)
                  )
                  .apply($$0, gnq.b::new)
         )
         .validate(gnq.b::a);

      private static DataResult<gnq.b> a(gnq.b $$0) {
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
