import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gci implements gcd {
   public static final Codec<gci> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gci::new)
   );
   private final String c;
   private final String d;

   public gci(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(apl $$0, gcd.a $$1) {
      agf $$2 = new agf("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         agm $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gcf a() {
      return gcg.b;
   }
}
