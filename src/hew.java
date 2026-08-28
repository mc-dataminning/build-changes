import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hew implements hen {
   public static final MapCodec<hew> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azi.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, hew::new));
   private final azi c;

   public hew(azi $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aup $$0, hen.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public hep a() {
      return heq.c;
   }
}
