import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gpd implements goy {
   public static final MapCodec<gpd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gpd::new)
   );
   private final String c;
   private final String d;

   public gpd(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aul $$0, goy.a $$1) {
      aku $$2 = new aku("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         alb $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gpa a() {
      return gpb.b;
   }
}
