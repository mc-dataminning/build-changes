import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gho implements ghf {
   public static final Codec<gho> b = RecordCodecBuilder.create($$0 -> $$0.group(awq.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gho::new));
   private final awq c;

   public gho(awq $$0) {
      this.c = $$0;
   }

   @Override
   public void a(asb $$0, ghf.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public ghh a() {
      return ghi.c;
   }
}
