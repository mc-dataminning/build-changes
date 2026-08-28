import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfj(hfn.b b, hfj.a c, @Nullable azw d) {
   public static final Codec<hfj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hfp.a.fieldOf("model").forGetter(hfj::a), hfj.a.b.forGetter(hfj::b)).apply($$0, hfj::new)
   );

   public hfj(hfn.b $$0, hfj.a $$1) {
      this($$0, $$1, null);
   }

   public hfj a(azw $$0) {
      return new hfj(this.b, this.c, $$0);
   }

   public hfn.b a() {
      return this.b;
   }

   public hfj.a b() {
      return this.c;
   }

   @Nullable
   public azw c() {
      return this.d;
   }

   public static record a(boolean c) {
      public static final hfj.a a = new hfj.a(true);
      public static final MapCodec<hfj.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hfj.a::a)).apply($$0, hfj.a::new)
      );

      public boolean a() {
         return this.c;
      }
   }
}
