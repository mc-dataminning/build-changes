import java.util.List;
import javax.annotation.Nullable;

public record gts(hnq a, boolean b, hla c) implements gtm {
   public static gts a(hnj $$0, ali $$1, hnp $$2) {
      hns $$3 = $$0.a($$1);
      gtv $$4 = $$3.g();
      boolean $$5 = $$3.c();
      hla $$6 = $$3.a($$4, $$0);
      hnq $$7 = $$3.a($$4, $$0, $$2);
      return new gts($$7, $$5, $$6);
   }

   @Override
   public List<gtg> a(@Nullable jb $$0) {
      return this.a.a($$0);
   }

   public hnq c() {
      return this.a;
   }

   @Override
   public boolean a() {
      return this.b;
   }

   @Override
   public hla b() {
      return this.c;
   }
}
