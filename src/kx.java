import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kx(Optional<ji<cyy>> c) implements dk<cyx> {
   public static final Codec<kx> a = RecordCodecBuilder.create($$0 -> $$0.group(jt.a(mg.aT).optionalFieldOf("song").forGetter(kx::c)).apply($$0, kx::new));

   @Override
   public ki<cyx> a() {
      return kj.ae;
   }

   public boolean a(cyx $$0) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$1 = false;

         for (je<cyy> $$2 : this.c.get()) {
            Optional<ald<cyy>> $$3 = $$2.e();
            if (!$$3.isEmpty() && $$3.get() == $$0.a().c()) {
               $$1 = true;
               break;
            }
         }

         return $$1;
      }
   }

   public static kx b() {
      return new kx(Optional.empty());
   }
}
