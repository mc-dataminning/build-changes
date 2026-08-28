import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hbh(hbl.b b, hbh.a c) {
   public static final Codec<hbh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hbn.a.fieldOf("model").forGetter(hbh::a), hbh.a.b.forGetter(hbh::b)).apply($$0, hbh::new)
   );

   public hbl.b a() {
      return this.b;
   }

   public hbh.a b() {
      return this.c;
   }

   public static record a(boolean c) {
      public static final hbh.a a = new hbh.a(true);
      public static final MapCodec<hbh.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hbh.a::a)).apply($$0, hbh.a::new)
      );

      public boolean a() {
         return this.c;
      }
   }
}
