import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fvh implements fuz {
   public static final Codec<fvh> b = RecordCodecBuilder.create($$0 -> $$0.group(apg.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, fvh::new));
   private final apg c;

   public fvh(apg $$0) {
      this.c = $$0;
   }

   @Override
   public void a(akx $$0, fuz.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public fva a() {
      return fvb.c;
   }
}
