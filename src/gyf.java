import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gyf implements gxw {
   public static final MapCodec<gyf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azs.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gyf::new));
   private final azs c;

   public gyf(azs $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ava $$0, gxw.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gxy a() {
      return gxz.c;
   }
}
