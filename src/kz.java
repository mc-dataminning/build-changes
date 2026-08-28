import com.mojang.serialization.Codec;
import java.util.Optional;

public record kz(jj<dbe> c) implements dl<dbg> {
   public static final Codec<kz> a = ju.a(mh.ae).xmap(kz::new, kz::b);

   @Override
   public kj<dbg> a() {
      return kk.R;
   }

   public boolean a(dbg $$0) {
      Optional<jf<dbe>> $$1 = $$0.e();
      return !$$1.isEmpty() && this.c.a($$1.get());
   }

   public static kt a(jj<dbe> $$0) {
      return new kz($$0);
   }

   public jj<dbe> b() {
      return this.c;
   }
}
