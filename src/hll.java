import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hll(String c, String d) implements hlh {
   public static final MapCodec<hll> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter(hll::b), Codec.STRING.fieldOf("prefix").forGetter(hll::c)).apply($$0, hll::new)
   );

   @Override
   public void a(avh $$0, hlh.a $$1) {
      ald $$2 = new ald("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         alk $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public MapCodec<hll> a() {
      return b;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }
}
