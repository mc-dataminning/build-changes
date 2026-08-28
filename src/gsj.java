import java.util.List;
import javax.annotation.Nullable;

public record gsj(hmh a, boolean b, hjq c) implements gsd {
   public static gsj a(hlz $$0, alg $$1, hmf $$2) {
      hmj $$3 = $$0.a($$1);
      gsl $$4 = $$3.g();
      boolean $$5 = $$3.c();
      hjq $$6 = $$3.a($$4, $$0);
      hmh $$7 = $$3.a($$4, $$0, $$2);
      return new gsj($$7, $$5, $$6);
   }

   @Override
   public List<grx> a(@Nullable eat $$0, @Nullable jb $$1, azv $$2) {
      return this.a.a($$1);
   }

   public hmh c() {
      return this.a;
   }

   @Override
   public boolean a() {
      return this.b;
   }

   @Override
   public hjq b() {
      return this.c;
   }
}
