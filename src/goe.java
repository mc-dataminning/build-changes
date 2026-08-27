import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record goe(gof d) {
   public static final goe a = new goe(gof.b);
   public static final Codec<goe> b = RecordCodecBuilder.create($$0 -> $$0.group(axe.a(gof.a, "scaling", gof.b).forGetter(goe::a)).apply($$0, goe::new));
   public static final aso<goe> c = aso.a("gui", b);

   public gof a() {
      return this.d;
   }
}
