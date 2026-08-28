import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hfg implements hex {
   public static final MapCodec<hfg> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azi.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, hfg::new));
   private final azi c;

   public hfg(azi $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aup $$0, hex.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public hez a() {
      return hfa.c;
   }
}
