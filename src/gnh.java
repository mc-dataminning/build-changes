import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gnh implements gnc {
   public static final Codec<gnh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gnh::new)
   );
   private final String c;
   private final String d;

   public gnh(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(atr $$0, gnc.a $$1) {
      aka $$2 = new aka("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         akh $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gne a() {
      return gnf.b;
   }
}
