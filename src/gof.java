import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gof(String b, String c, boolean d) {
   public static final Codec<gof> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.w.fieldOf("region").forGetter(gof::b),
               axh.w.fieldOf("name").forGetter(gof::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gof::d)
            )
            .apply($$0, gof::new)
   );

   public wu a() {
      return wu.b(this.c + " (" + this.b + ")");
   }
}
