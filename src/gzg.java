import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gzg implements gyx {
   public static final MapCodec<gzg> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azw.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gzg::new));
   private final azw c;

   public gzg(azw $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ave $$0, gyx.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gyz a() {
      return gza.c;
   }
}
