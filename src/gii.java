import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gii implements gid {
   public static final Codec<gii> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gii::new)
   );
   private final String c;
   private final String d;

   public gii(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(asf $$0, gid.a $$1) {
      aiv $$2 = new aiv("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         ajc $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gif a() {
      return gig.b;
   }
}
