import java.util.BitSet;
import javax.annotation.Nullable;

public class yk implements vd<ww> {
   private final int a;
   private final int b;
   private final yl c;

   public yk(cpc $$0, eab $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new yl($$0, $$1, $$2, $$3);
   }

   public yk(so $$0) {
      this.a = $$0.m();
      this.b = $$0.m();
      this.c = new yl($$0, this.a, this.b);
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      this.c.a($$0);
   }

   public void a(ww $$0) {
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
