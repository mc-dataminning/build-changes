import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gbq implements gbl {
   public static final Codec<gbq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gbq::new)
   );
   private final String c;
   private final String d;

   public gbq(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(apd $$0, gbl.a $$1) {
      afz $$2 = new afz("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         agg $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gbn a() {
      return gbo.b;
   }
}
