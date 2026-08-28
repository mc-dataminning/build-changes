import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hln(azz c) implements hlf {
   public static final MapCodec<hln> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azz.a.fieldOf("pattern").forGetter(hln::b)).apply($$0, hln::new));

   @Override
   public void a(avf $$0, hlf.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public MapCodec<hln> a() {
      return b;
   }

   public azz b() {
      return this.c;
   }
}
