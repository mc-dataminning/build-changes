import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record haw(hax d) {
   public static final haw a = new haw(hax.b);
   public static final Codec<haw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hax.a.optionalFieldOf("scaling", hax.b).forGetter(haw::a)).apply($$0, haw::new)
   );
   public static final auc<haw> c = auc.a("gui", b);

   public hax a() {
      return this.d;
   }
}
