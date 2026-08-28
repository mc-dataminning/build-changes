import com.mojang.serialization.Codec;
import java.util.Optional;

public record kz(jj<dbs> c) implements dl<dbu> {
   public static final Codec<kz> a = ju.a(mh.ae).xmap(kz::new, kz::b);

   @Override
   public kj<dbu> a() {
      return kk.R;
   }

   public boolean a(dbu $$0) {
      Optional<jf<dbs>> $$1 = $$0.e();
      return !$$1.isEmpty() && this.c.a($$1.get());
   }

   public static kt a(jj<dbs> $$0) {
      return new kz($$0);
   }

   public jj<dbs> b() {
      return this.c;
   }
}
