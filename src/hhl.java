import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhl(hhp.b b, hhl.a c, @Nullable azy d) {
   public static final Codec<hhl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hhr.a.fieldOf("model").forGetter(hhl::a), hhl.a.b.forGetter(hhl::b)).apply($$0, hhl::new)
   );

   public hhl(hhp.b $$0, hhl.a $$1) {
      this($$0, $$1, null);
   }

   public hhl a(azy $$0) {
      return new hhl(this.b, this.c, $$0);
   }

   public hhp.b a() {
      return this.b;
   }

   public hhl.a b() {
      return this.c;
   }

   @Nullable
   public azy c() {
      return this.d;
   }

   public static record a(boolean c) {
      public static final hhl.a a = new hhl.a(true);
      public static final MapCodec<hhl.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hhl.a::a)).apply($$0, hhl.a::new)
      );

      public boolean a() {
         return this.c;
      }
   }
}
