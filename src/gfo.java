import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gfo implements gff {
   public static final Codec<gfo> b = RecordCodecBuilder.create($$0 -> $$0.group(auy.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gfo::new));
   private final auy c;

   public gfo(auy $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aqj $$0, gff.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gfh a() {
      return gfi.c;
   }
}
