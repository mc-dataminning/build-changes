import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gjm implements gjd {
   public static final Codec<gjm> b = RecordCodecBuilder.create($$0 -> $$0.group(axe.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gjm::new));
   private final axe c;

   public gjm(axe $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aso $$0, gjd.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gjf a() {
      return gjg.c;
   }
}
