import com.mojang.serialization.Codec;
import java.util.Optional;

public record la(jk<dce> e) implements dm<dcg> {
   public static final Codec<la> a = jv.a(mi.ae).xmap(la::new, la::b);

   @Override
   public kk<dcg> a() {
      return kl.R;
   }

   public boolean a(dcg $$0) {
      Optional<jg<dce>> $$1 = $$0.e();
      return !$$1.isEmpty() && this.e.a($$1.get());
   }

   public static ku a(jk<dce> $$0) {
      return new la($$0);
   }

   public jk<dce> b() {
      return this.e;
   }
}
