import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kz(Optional<jk<dag>> e) implements dm<daf> {
   public static final Codec<kz> a = RecordCodecBuilder.create($$0 -> $$0.group(jv.a(mi.aV).optionalFieldOf("song").forGetter(kz::c)).apply($$0, kz::new));

   @Override
   public kk<daf> a() {
      return kl.ae;
   }

   public boolean a(daf $$0) {
      if (!this.e.isPresent()) {
         return true;
      } else {
         boolean $$1 = false;

         for (jg<dag> $$2 : this.e.get()) {
            Optional<alj<dag>> $$3 = $$2.e();
            if (!$$3.isEmpty() && $$3.equals($$0.a().a())) {
               $$1 = true;
               break;
            }
         }

         return $$1;
      }
   }

   public static kz b() {
      return new kz(Optional.empty());
   }

   public Optional<jk<dag>> c() {
      return this.e;
   }
}
