import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gfk implements gff {
   public static final Codec<gfk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gfk::new)
   );
   private final String c;
   private final String d;

   public gfk(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aqj $$0, gff.a $$1) {
      aha $$2 = new aha("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         ahh $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gfh a() {
      return gfi.b;
   }
}
