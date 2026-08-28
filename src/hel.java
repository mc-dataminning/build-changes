import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hel(hep.b b, hel.a c, @Nullable azu d) {
   public static final Codec<hel> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(her.a.fieldOf("model").forGetter(hel::a), hel.a.b.forGetter(hel::b)).apply($$0, hel::new)
   );

   public hel(hep.b $$0, hel.a $$1) {
      this($$0, $$1, null);
   }

   public hel a(azu $$0) {
      return new hel(this.b, this.c, $$0);
   }

   public hep.b a() {
      return this.b;
   }

   public hel.a b() {
      return this.c;
   }

   @Nullable
   public azu c() {
      return this.d;
   }

   public static record a(boolean c) {
      public static final hel.a a = new hel.a(true);
      public static final MapCodec<hel.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hel.a::a)).apply($$0, hel.a::new)
      );

      public boolean a() {
         return this.c;
      }
   }
}
