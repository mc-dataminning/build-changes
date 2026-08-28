import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hgd implements hfz {
   private final List<grs> a;
   private final Supplier<Vector3f[]> b;
   private final hge c;

   public hgd(List<grs> $$0, hge $$1) {
      this.a = $$0;
      this.c = $$1;
      this.b = Suppliers.memoize(() -> hft.a(this.a));
   }

   @Override
   public void a(hgc $$0, czk $$1, hga $$2, czi $$3, @Nullable gkl $$4, @Nullable bxj $$5, int $$6) {
      hgc.b $$7 = $$0.a();
      $$7.a(grg.i());
      this.c.a($$7, $$3);
      $$7.a(this.b);
      $$7.b().addAll(this.a);
   }
}
