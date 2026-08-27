import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gbh(String b, String c, boolean d) {
   public static final Codec<gbh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asg.v.fieldOf("region").forGetter(gbh::b),
               asg.v.fieldOf("name").forGetter(gbh::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gbh::d)
            )
            .apply($$0, gbh::new)
   );

   public ui a() {
      return ui.b(this.c + " (" + this.b + ")");
   }
}
