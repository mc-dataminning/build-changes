import java.util.List;
import javax.annotation.Nullable;

public record gtu(hns a, boolean b, hlc c) implements gto {
   public static gtu a(hnl $$0, alk $$1, hnr $$2) {
      hnu $$3 = $$0.a($$1);
      gtx $$4 = $$3.g();
      boolean $$5 = $$3.c();
      hlc $$6 = $$3.a($$4, $$0);
      hns $$7 = $$3.a($$4, $$0, $$2);
      return new gtu($$7, $$5, $$6);
   }

   @Override
   public List<gti> a(@Nullable jc $$0) {
      return this.a.a($$0);
   }

   public hns c() {
      return this.a;
   }

   @Override
   public boolean a() {
      return this.b;
   }

   @Override
   public hlc b() {
      return this.c;
   }
}
