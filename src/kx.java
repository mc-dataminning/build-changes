import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kx(Optional<ji<cze>> c) implements dk<czd> {
   public static final Codec<kx> a = RecordCodecBuilder.create($$0 -> $$0.group(jt.a(mg.aU).optionalFieldOf("song").forGetter(kx::c)).apply($$0, kx::new));

   @Override
   public ki<czd> a() {
      return kj.ae;
   }

   public boolean a(czd $$0) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$1 = false;

         for (je<cze> $$2 : this.c.get()) {
            Optional<alf<cze>> $$3 = $$2.e();
            if (!$$3.isEmpty() && $$3.equals($$0.a().a())) {
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
