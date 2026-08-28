import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hmx(boolean e, boolean f) {
   public static final boolean a = false;
   public static final boolean b = false;
   public static final Codec<hmx> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("blur", false).forGetter(hmx::a), Codec.BOOL.optionalFieldOf("clamp", false).forGetter(hmx::b))
            .apply($$0, hmx::new)
   );
   public static final aue<hmx> d = new aue<>("texture", c);

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.f;
   }
}
