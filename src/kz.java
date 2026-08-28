import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kz(Optional<jk<daq>> e) implements dm<dap> {
   public static final Codec<kz> a = RecordCodecBuilder.create($$0 -> $$0.group(jv.a(mi.aV).optionalFieldOf("song").forGetter(kz::c)).apply($$0, kz::new));

   @Override
   public kk<dap> a() {
      return kl.ae;
   }

   public boolean a(dap $$0) {
      if (!this.e.isPresent()) {
         return true;
      } else {
         boolean $$1 = false;

         for (jg<daq> $$2 : this.e.get()) {
            Optional<alq<daq>> $$3 = $$2.e();
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

   public Optional<jk<daq>> c() {
      return this.e;
   }
}
