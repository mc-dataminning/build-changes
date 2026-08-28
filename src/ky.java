import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ky(Optional<jj<czt>> c) implements dl<czs> {
   public static final Codec<ky> a = RecordCodecBuilder.create($$0 -> $$0.group(ju.a(mh.aV).optionalFieldOf("song").forGetter(ky::c)).apply($$0, ky::new));

   @Override
   public kj<czs> a() {
      return kk.ae;
   }

   public boolean a(czs $$0) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$1 = false;

         for (jf<czt> $$2 : this.c.get()) {
            Optional<alf<czt>> $$3 = $$2.e();
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
