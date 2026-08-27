import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class grh implements grc {
   public static final Codec<grh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, grh::new)
   );
   private final String c;
   private final String d;

   public grh(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aud $$0, grc.a $$1) {
      akm $$2 = new akm("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         akt $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gre a() {
      return grf.b;
   }
}
