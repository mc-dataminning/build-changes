import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fyy implements fyp {
   public static final Codec<fyy> b = RecordCodecBuilder.create($$0 -> $$0.group(arv.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, fyy::new));
   private final arv c;

   public fyy(arv $$0) {
      this.c = $$0;
   }

   @Override
   public void a(anm $$0, fyp.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public fyr a() {
      return fys.c;
   }
}
