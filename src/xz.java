import java.util.BitSet;
import javax.annotation.Nullable;

public class xz implements uw<wo> {
   private final int a;
   private final int b;
   private final xy c;
   private final yd d;

   public xz(dhf $$0, dzq $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      cor $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new xy($$0);
      this.d = new yd($$4, $$1, $$2, $$3);
   }

   public xz(sh $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new xy($$0, this.a, this.b);
      this.d = new yd($$0, this.a, this.b);
   }

   @Override
   public void a(sh $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      this.c.a($$0);
      this.d.a($$0);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public xy e() {
      return this.c;
   }

   public yd f() {
      return this.d;
   }
}
