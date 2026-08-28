import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhb(hhf.b b, hhb.a c, @Nullable baj d) {
   public static final Codec<hhb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hhh.a.fieldOf("model").forGetter(hhb::a), hhb.a.b.forGetter(hhb::b)).apply($$0, hhb::new)
   );

   public hhb(hhf.b $$0, hhb.a $$1) {
      this($$0, $$1, null);
   }

   public hhb a(baj $$0) {
      return new hhb(this.b, this.c, $$0);
   }

   public hhf.b a() {
      return this.b;
   }

   public hhb.a b() {
      return this.c;
   }

   @Nullable
   public baj c() {
      return this.d;
   }

   public static record a(boolean c) {
      public static final hhb.a a = new hhb.a(true);
      public static final MapCodec<hhb.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hhb.a::a)).apply($$0, hhb.a::new)
      );

      public boolean a() {
         return this.c;
      }
   }
}
