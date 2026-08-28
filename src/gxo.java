import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gxo implements gxf {
   public static final MapCodec<gxo> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azm.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gxo::new));
   private final azm c;

   public gxo(azm $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aut $$0, gxf.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gxh a() {
      return gxi.c;
   }
}
