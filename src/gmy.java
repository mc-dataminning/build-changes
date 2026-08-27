import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gmy(String b, String c, boolean d) {
   public static final Codec<gmy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.w.fieldOf("region").forGetter(gmy::b),
               awu.w.fieldOf("name").forGetter(gmy::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gmy::d)
            )
            .apply($$0, gmy::new)
   );

   public wi a() {
      return wi.b(this.c + " (" + this.b + ")");
   }
}
