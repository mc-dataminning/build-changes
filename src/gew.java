import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gew implements ger {
   public static final Codec<gew> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gew::new)
   );
   private final String c;
   private final String d;

   public gew(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aqi $$0, ger.a $$1) {
      agz $$2 = new agz("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         ahg $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public get a() {
      return geu.b;
   }
}
