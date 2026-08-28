import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hii(String c, String d) implements hie {
   public static final MapCodec<hii> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter(hii::b), Codec.STRING.fieldOf("prefix").forGetter(hii::c)).apply($$0, hii::new)
   );

   @Override
   public void a(avb $$0, hie.a $$1) {
      akx $$2 = new akx("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         ale $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public MapCodec<hii> a() {
      return b;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }
}
