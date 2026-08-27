import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gag(String b, String c, boolean d) {
   public static final Codec<gag> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arb.u.fieldOf("region").forGetter(gag::b),
               arb.u.fieldOf("name").forGetter(gag::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gag::d)
            )
            .apply($$0, gag::new)
   );

   public ti a() {
      return ti.b(this.c + " (" + this.b + ")");
   }
}
