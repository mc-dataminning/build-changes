import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gpl implements gpc {
   public static final MapCodec<gpl> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azh.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gpl::new));
   private final azh c;

   public gpl(azh $$0) {
      this.c = $$0;
   }

   @Override
   public void a(auo $$0, gpc.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gpe a() {
      return gpf.c;
   }
}
