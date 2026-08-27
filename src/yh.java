import java.util.BitSet;
import javax.annotation.Nullable;

public class yh implements ve<wx> {
   private final int a;
   private final int b;
   private final yg c;
   private final yl d;

   public yh(dhk $$0, dzv $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      cpi $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new yg($$0);
      this.d = new yl($$4, $$1, $$2, $$3);
   }

   public yh(so $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new yg($$0, this.a, this.b);
      this.d = new yl($$0, this.a, this.b);
   }

   @Override
   public void a(so $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      this.c.a($$0);
      this.d.a($$0);
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

   public yg e() {
      return this.c;
   }

   public yl f() {
      return this.d;
   }
}
