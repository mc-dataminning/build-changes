import java.util.List;
import javax.annotation.Nullable;

public record gse(hma a, boolean b, hjk c) implements gry {
   public static gse a(hls $$0, alg $$1, hly $$2) {
      hmc $$3 = $$0.a($$1);
      gsg $$4 = $$3.g();
      boolean $$5 = $$3.c();
      hjk $$6 = $$3.a($$4, $$0);
      hma $$7 = $$3.a($$4, $$0, $$2);
      return new gse($$7, $$5, $$6);
   }

   @Override
   public List<grs> a(@Nullable eao $$0, @Nullable jb $$1, azv $$2) {
      return this.a.a($$1);
   }

   public hma c() {
      return this.a;
   }

   @Override
   public boolean a() {
      return this.b;
   }

   @Override
   public hjk b() {
      return this.c;
   }
}
