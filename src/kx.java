import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kx(Optional<ji<czj>> c) implements dk<czi> {
   public static final Codec<kx> a = RecordCodecBuilder.create($$0 -> $$0.group(jt.a(mg.aV).optionalFieldOf("song").forGetter(kx::c)).apply($$0, kx::new));

   @Override
   public ki<czi> a() {
      return kj.ae;
   }

   public boolean a(czi $$0) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$1 = false;

         for (je<czj> $$2 : this.c.get()) {
            Optional<alf<czj>> $$3 = $$2.e();
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
