import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gaj implements gae {
   public static final Codec<gaj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gaj::new)
   );
   private final String c;
   private final String d;

   public gaj(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aot $$0, gae.a $$1) {
      afp $$2 = new afp("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         afw $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gag a() {
      return gah.b;
   }
}
