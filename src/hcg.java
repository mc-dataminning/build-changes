import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hcg(hck.b b, hcg.a c) {
   public static final Codec<hcg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hcm.a.fieldOf("model").forGetter(hcg::a), hcg.a.b.forGetter(hcg::b)).apply($$0, hcg::new)
   );

   public hck.b a() {
      return this.b;
   }

   public hcg.a b() {
      return this.c;
   }

   public static record a(boolean c) {
      public static final hcg.a a = new hcg.a(true);
      public static final MapCodec<hcg.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hcg.a::a)).apply($$0, hcg.a::new)
      );

      public boolean a() {
         return this.c;
      }
   }
}
