import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hbw implements hbn {
   public static final MapCodec<hbw> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ban.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, hbw::new));
   private final ban c;

   public hbw(ban $$0) {
      this.c = $$0;
   }

   @Override
   public void a(avv $$0, hbn.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public hbp a() {
      return hbq.c;
   }
}
