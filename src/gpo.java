import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gpo implements gpf {
   public static final MapCodec<gpo> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azi.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gpo::new));
   private final azi c;

   public gpo(azi $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aup $$0, gpf.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gph a() {
      return gpi.c;
   }
}
