import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhn(hhr.b b, hhn.a c, @Nullable baa d) {
   public static final Codec<hhn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hht.a.fieldOf("model").forGetter(hhn::a), hhn.a.b.forGetter(hhn::b)).apply($$0, hhn::new)
   );

   public hhn(hhr.b $$0, hhn.a $$1) {
      this($$0, $$1, null);
   }

   public hhn a(baa $$0) {
      return new hhn(this.b, this.c, $$0);
   }

   public hhr.b a() {
      return this.b;
   }

   public hhn.a b() {
      return this.c;
   }

   @Nullable
   public baa c() {
      return this.d;
   }

   public static record a(boolean c) {
      public static final hhn.a a = new hhn.a(true);
      public static final MapCodec<hhn.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hhn.a::a)).apply($$0, hhn.a::new)
      );

      public boolean a() {
         return this.c;
      }
   }
}
