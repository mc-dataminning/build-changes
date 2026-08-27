import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class glw implements gln {
   public static final Codec<glw> b = RecordCodecBuilder.create($$0 -> $$0.group(axs.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, glw::new));
   private final axs c;

   public glw(axs $$0) {
      this.c = $$0;
   }

   @Override
   public void a(atc $$0, gln.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public glp a() {
      return glq.c;
   }
}
