import com.mojang.serialization.Codec;
import java.util.Optional;

public record kz(jj<dbh> c) implements dl<dbj> {
   public static final Codec<kz> a = ju.a(mh.ae).xmap(kz::new, kz::b);

   @Override
   public kj<dbj> a() {
      return kk.R;
   }

   public boolean a(dbj $$0) {
      Optional<jf<dbh>> $$1 = $$0.e();
      return !$$1.isEmpty() && this.c.a($$1.get());
   }

   public static kt a(jj<dbh> $$0) {
      return new kz($$0);
   }

   public jj<dbh> b() {
      return this.c;
   }
}
