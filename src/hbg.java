import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hbg(hbk.b b, hbg.a c) {
   public static final Codec<hbg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hbm.a.fieldOf("model").forGetter(hbg::a), hbg.a.b.forGetter(hbg::b)).apply($$0, hbg::new)
   );

   public hbk.b a() {
      return this.b;
   }

   public hbg.a b() {
      return this.c;
   }

   public static record a(boolean c) {
      public static final hbg.a a = new hbg.a(true);
      public static final MapCodec<hbg.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hbg.a::a)).apply($$0, hbg.a::new)
      );

      public boolean a() {
         return this.c;
      }
   }
}
