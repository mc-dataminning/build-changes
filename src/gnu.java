import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gnu(String b, String c, boolean d) {
   public static final Codec<gnu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.w.fieldOf("region").forGetter(gnu::b),
               axe.w.fieldOf("name").forGetter(gnu::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gnu::d)
            )
            .apply($$0, gnu::new)
   );

   public ws a() {
      return ws.b(this.c + " (" + this.b + ")");
   }
}
