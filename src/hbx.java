import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hbx implements hbo {
   public static final MapCodec<hbx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ban.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, hbx::new));
   private final ban c;

   public hbx(ban $$0) {
      this.c = $$0;
   }

   @Override
   public void a(avv $$0, hbo.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public hbq a() {
      return hbr.c;
   }
}
