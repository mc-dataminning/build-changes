import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hbi(hbm.b b, hbi.a c) {
   public static final Codec<hbi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hbo.a.fieldOf("model").forGetter(hbi::a), hbi.a.b.forGetter(hbi::b)).apply($$0, hbi::new)
   );

   public hbm.b a() {
      return this.b;
   }

   public hbi.a b() {
      return this.c;
   }

   public static record a(boolean c) {
      public static final hbi.a a = new hbi.a(true);
      public static final MapCodec<hbi.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hbi.a::a)).apply($$0, hbi.a::new)
      );

      public boolean a() {
         return this.c;
      }
   }
}
