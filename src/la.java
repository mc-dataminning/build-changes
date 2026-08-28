import com.mojang.serialization.Codec;
import java.util.Optional;

public record la(jk<dbu> e) implements dm<dbw> {
   public static final Codec<la> a = jv.a(mi.ae).xmap(la::new, la::b);

   @Override
   public kk<dbw> a() {
      return kl.R;
   }

   public boolean a(dbw $$0) {
      Optional<jg<dbu>> $$1 = $$0.e();
      return !$$1.isEmpty() && this.e.a($$1.get());
   }

   public static ku a(jk<dbu> $$0) {
      return new la($$0);
   }

   public jk<dbu> b() {
      return this.e;
   }
}
