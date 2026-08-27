import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gcd implements gby {
   public static final Codec<gcd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gcd::new)
   );
   private final String c;
   private final String d;

   public gcd(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aph $$0, gby.a $$1) {
      agb $$2 = new agb("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         agi $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gca a() {
      return gcb.b;
   }
}
