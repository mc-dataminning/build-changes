import java.util.BitSet;
import javax.annotation.Nullable;

public class ya implements ux<wp> {
   private final int a;
   private final int b;
   private final xz c;
   private final ye d;

   public ya(dhg $$0, dzr $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      cos $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new xz($$0);
      this.d = new ye($$4, $$1, $$2, $$3);
   }

   public ya(si $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new xz($$0, this.a, this.b);
      this.d = new ye($$0, this.a, this.b);
   }

   @Override
   public void a(si $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      this.c.a($$0);
      this.d.a($$0);
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

   public xz e() {
      return this.c;
   }

   public ye f() {
      return this.d;
   }
}
