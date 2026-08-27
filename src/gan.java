import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gan(String b, String c, boolean d) {
   public static final Codec<gan> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arh.v.fieldOf("region").forGetter(gan::b),
               arh.v.fieldOf("name").forGetter(gan::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gan::d)
            )
            .apply($$0, gan::new)
   );

   public tn a() {
      return tn.b(this.c + " (" + this.b + ")");
   }
}
