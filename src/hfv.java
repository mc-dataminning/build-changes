import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfv(hfz.b b, hfv.a c, @Nullable azw d) {
   public static final Codec<hfv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hgb.a.fieldOf("model").forGetter(hfv::a), hfv.a.b.forGetter(hfv::b)).apply($$0, hfv::new)
   );

   public hfv(hfz.b $$0, hfv.a $$1) {
      this($$0, $$1, null);
   }

   public hfv a(azw $$0) {
      return new hfv(this.b, this.c, $$0);
   }

   public hfz.b a() {
      return this.b;
   }

   public hfv.a b() {
      return this.c;
   }

   @Nullable
   public azw c() {
      return this.d;
   }

   public static record a(boolean c) {
      public static final hfv.a a = new hfv.a(true);
      public static final MapCodec<hfv.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hfv.a::a)).apply($$0, hfv.a::new)
      );

      public boolean a() {
         return this.c;
      }
   }
}
