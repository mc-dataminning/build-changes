import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fyp implements fyk {
   public static final Codec<fyp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, fyp::new)
   );
   private final String c;
   private final String d;

   public fyp(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ank $$0, fyk.a $$1) {
      aei $$2 = new aei("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         aep $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public fym a() {
      return fyn.b;
   }
}
