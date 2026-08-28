import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfb(hff.b b, hfb.a c, @Nullable azw d) {
   public static final Codec<hfb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hfh.a.fieldOf("model").forGetter(hfb::a), hfb.a.b.forGetter(hfb::b)).apply($$0, hfb::new)
   );

   public hfb(hff.b $$0, hfb.a $$1) {
      this($$0, $$1, null);
   }

   public hfb a(azw $$0) {
      return new hfb(this.b, this.c, $$0);
   }

   public hff.b a() {
      return this.b;
   }

   public hfb.a b() {
      return this.c;
   }

   @Nullable
   public azw c() {
      return this.d;
   }

   public static record a(boolean c) {
      public static final hfb.a a = new hfb.a(true);
      public static final MapCodec<hfb.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hfb.a::a)).apply($$0, hfb.a::new)
      );

      public boolean a() {
         return this.c;
      }
   }
}
