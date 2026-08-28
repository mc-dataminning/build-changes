import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hgf implements hfw {
   public static final MapCodec<hgf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azi.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, hgf::new));
   private final azi c;

   public hgf(azi $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aup $$0, hfw.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public hfy a() {
      return hfz.c;
   }
}
