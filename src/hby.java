import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hby implements hbp {
   public static final MapCodec<hby> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ban.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, hby::new));
   private final ban c;

   public hby(ban $$0) {
      this.c = $$0;
   }

   @Override
   public void a(avv $$0, hbp.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public hbr a() {
      return hbs.c;
   }
}
