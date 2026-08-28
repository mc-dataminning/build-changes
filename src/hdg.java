import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hdg(hdk.b b, hdg.a c) {
   public static final Codec<hdg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hdm.a.fieldOf("model").forGetter(hdg::a), hdg.a.b.forGetter(hdg::b)).apply($$0, hdg::new)
   );

   public hdk.b a() {
      return this.b;
   }

   public hdg.a b() {
      return this.c;
   }

   public static record a(boolean c) {
      public static final hdg.a a = new hdg.a(true);
      public static final MapCodec<hdg.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hdg.a::a)).apply($$0, hdg.a::new)
      );

      public boolean a() {
         return this.c;
      }
   }
}
