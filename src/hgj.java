import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hgj implements hgf {
   private final List<grx> a;
   private final Supplier<Vector3f[]> b;
   private final hgk c;

   public hgj(List<grx> $$0, hgk $$1) {
      this.a = $$0;
      this.c = $$1;
      this.b = Suppliers.memoize(() -> hfz.a(this.a));
   }

   @Override
   public void a(hgi $$0, czn $$1, hgg $$2, czl $$3, @Nullable gkq $$4, @Nullable bxj $$5, int $$6) {
      hgi.b $$7 = $$0.a();
      $$7.a(grl.i());
      this.c.a($$7, $$3);
      $$7.a(this.b);
      $$7.b().addAll(this.a);
   }
}
