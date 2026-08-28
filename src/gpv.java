import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gpv implements gpm {
   public static final MapCodec<gpv> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayn.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gpv::new));
   private final ayn c;

   public gpv(ayn $$0) {
      this.c = $$0;
   }

   @Override
   public void a(atu $$0, gpm.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gpo a() {
      return gpp.c;
   }
}
