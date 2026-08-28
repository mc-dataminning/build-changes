import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hhv implements hhr {
   private final List<gti> a;
   private final Supplier<Vector3f[]> b;
   private final hhw c;

   public hhv(List<gti> $$0, hhw $$1) {
      this.a = $$0;
      this.c = $$1;
      this.b = Suppliers.memoize(() -> hhl.a(this.a));
   }

   @Override
   public void a(hhu $$0, daa $$1, hhs $$2, czy $$3, @Nullable gmd $$4, @Nullable bxw $$5, int $$6) {
      hhu.b $$7 = $$0.a();
      $$7.a(gsw.i());
      this.c.a($$7, $$3);
      $$7.a(this.b);
      $$7.b().addAll(this.a);
   }
}
