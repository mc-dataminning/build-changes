import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hhj implements hhf {
   private final List<gst> a;
   private final Supplier<Vector3f[]> b;
   private final hhk c;

   public hhj(List<gst> $$0, hhk $$1) {
      this.a = $$0;
      this.c = $$1;
      this.b = Suppliers.memoize(() -> hgz.a(this.a));
   }

   @Override
   public void a(hhi $$0, dak $$1, hhg $$2, dai $$3, @Nullable glo $$4, @Nullable byf $$5, int $$6) {
      hhi.b $$7 = $$0.a();
      $$7.a(gsh.i());
      this.c.a($$7, $$3);
      $$7.a(this.b);
      $$7.b().addAll(this.a);
   }
}
