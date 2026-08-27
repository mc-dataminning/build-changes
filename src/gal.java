import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gal(String b, String c, boolean d) {
   public static final Codec<gal> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arg.v.fieldOf("region").forGetter(gal::b),
               arg.v.fieldOf("name").forGetter(gal::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gal::d)
            )
            .apply($$0, gal::new)
   );

   public tl a() {
      return tl.b(this.c + " (" + this.b + ")");
   }
}
