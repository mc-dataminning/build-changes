import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgb(hgf.b b, hgb.a c, @Nullable azw d) {
   public static final Codec<hgb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hgh.a.fieldOf("model").forGetter(hgb::a), hgb.a.b.forGetter(hgb::b)).apply($$0, hgb::new)
   );

   public hgb(hgf.b $$0, hgb.a $$1) {
      this($$0, $$1, null);
   }

   public hgb a(azw $$0) {
      return new hgb(this.b, this.c, $$0);
   }

   public hgf.b a() {
      return this.b;
   }

   public hgb.a b() {
      return this.c;
   }

   @Nullable
   public azw c() {
      return this.d;
   }

   public static record a(boolean c) {
      public static final hgb.a a = new hgb.a(true);
      public static final MapCodec<hgb.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hgb.a::a)).apply($$0, hgb.a::new)
      );

      public boolean a() {
         return this.c;
      }
   }
}
