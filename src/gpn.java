import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gpn implements gpe {
   public static final MapCodec<gpn> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azi.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gpn::new));
   private final azi c;

   public gpn(azi $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aup $$0, gpe.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gpg a() {
      return gph.c;
   }
}
