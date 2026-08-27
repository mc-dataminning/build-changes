import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gmf implements glw {
   public static final Codec<gmf> b = RecordCodecBuilder.create($$0 -> $$0.group(axu.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gmf::new));
   private final axu c;

   public gmf(axu $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ate $$0, glw.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gly a() {
      return glz.c;
   }
}
