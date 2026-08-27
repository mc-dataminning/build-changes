import java.util.BitSet;
import javax.annotation.Nullable;

public class yk implements ve<wx> {
   private final int a;
   private final int b;
   private final yl c;

   public yk(cpi $$0, dzv $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new yl($$0, $$1, $$2, $$3);
   }

   public yk(so $$0) {
      this.a = $$0.n();
      this.b = $$0.n();
      this.c = new yl($$0, this.a, this.b);
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      this.c.a($$0);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public yl e() {
      return this.c;
   }
}
