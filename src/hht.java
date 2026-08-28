import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hht implements hhp {
   private final List<gtg> a;
   private final Supplier<Vector3f[]> b;
   private final hhu c;

   public hht(List<gtg> $$0, hhu $$1) {
      this.a = $$0;
      this.c = $$1;
      this.b = Suppliers.memoize(() -> hhj.a(this.a));
   }

   @Override
   public void a(hhs $$0, czy $$1, hhq $$2, czw $$3, @Nullable gmb $$4, @Nullable bxu $$5, int $$6) {
      hhs.b $$7 = $$0.a();
      $$7.a(gsu.i());
      this.c.a($$7, $$3);
      $$7.a(this.b);
      $$7.b().addAll(this.a);
   }
}
