import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hal(ham d) {
   public static final hal a = new hal(ham.b);
   public static final Codec<hal> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ham.a.optionalFieldOf("scaling", ham.b).forGetter(hal::a)).apply($$0, hal::new)
   );
   public static final aud<hal> c = aud.a("gui", b);

   public ham a() {
      return this.d;
   }
}
