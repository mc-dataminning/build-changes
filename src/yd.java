import java.util.BitSet;
import javax.annotation.Nullable;

public class yd implements ux<wp> {
   private final int a;
   private final int b;
   private final ye c;

   public yd(cot $$0, dzs $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new ye($$0, $$1, $$2, $$3);
   }

   public yd(si $$0) {
      this.a = $$0.m();
      this.b = $$0.m();
      this.c = new ye($$0, this.a, this.b);
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      this.c.a($$0);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public ye e() {
      return this.c;
   }
}
