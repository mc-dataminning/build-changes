import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gmb implements glw {
   public static final Codec<gmb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gmb::new)
   );
   private final String c;
   private final String d;

   public gmb(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ate $$0, glw.a $$1) {
      ajo $$2 = new ajo("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         ajv $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gly a() {
      return glz.b;
   }
}
