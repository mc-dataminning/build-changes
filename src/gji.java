import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gji implements gjd {
   public static final Codec<gji> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gji::new)
   );
   private final String c;
   private final String d;

   public gji(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aso $$0, gjd.a $$1) {
      aja $$2 = new aja("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         ajh $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gjf a() {
      return gjg.b;
   }
}
