import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class goe implements gnz {
   public static final MapCodec<goe> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, goe::new)
   );
   private final String c;
   private final String d;

   public goe(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(atx $$0, gnz.a $$1) {
      akg $$2 = new akg("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         akn $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gob a() {
      return goc.b;
   }
}
