import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gls implements gln {
   public static final Codec<gls> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gls::new)
   );
   private final String c;
   private final String d;

   public gls(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(atc $$0, gln.a $$1) {
      ajm $$2 = new ajm("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         ajt $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public glp a() {
      return glq.b;
   }
}
