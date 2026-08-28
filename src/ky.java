import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ky(Optional<jj<dae>> c) implements dl<dad> {
   public static final Codec<ky> a = RecordCodecBuilder.create($$0 -> $$0.group(ju.a(mh.aV).optionalFieldOf("song").forGetter(ky::c)).apply($$0, ky::new));

   @Override
   public kj<dad> a() {
      return kk.ae;
   }

   public boolean a(dad $$0) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$1 = false;

         for (jf<dae> $$2 : this.c.get()) {
            Optional<alh<dae>> $$3 = $$2.e();
            if (!$$3.isEmpty() && $$3.equals($$0.a().a())) {
               $$1 = true;
               break;
            }
         }

         return $$1;
      }
   }

   public static ky b() {
      return new ky(Optional.empty());
   }
}
