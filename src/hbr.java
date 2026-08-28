import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hbr implements hbi {
   public static final MapCodec<hbr> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ban.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, hbr::new));
   private final ban c;

   public hbr(ban $$0) {
      this.c = $$0;
   }

   @Override
   public void a(avv $$0, hbi.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public hbk a() {
      return hbl.c;
   }
}
