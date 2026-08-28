import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ky(Optional<jj<czq>> c) implements dl<czp> {
   public static final Codec<ky> a = RecordCodecBuilder.create($$0 -> $$0.group(ju.a(mh.aV).optionalFieldOf("song").forGetter(ky::c)).apply($$0, ky::new));

   @Override
   public kj<czp> a() {
      return kk.ae;
   }

   public boolean a(czp $$0) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$1 = false;

         for (jf<czq> $$2 : this.c.get()) {
            Optional<alf<czq>> $$3 = $$2.e();
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
