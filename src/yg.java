import java.util.BitSet;
import javax.annotation.Nullable;

public class yg implements vd<ww> {
   private final int a;
   private final int b;
   private final yf c;
   private final yk d;

   public yg(dhq $$0, eab $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      cpc $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new yf($$0);
      this.d = new yk($$4, $$1, $$2, $$3);
   }

   public yg(so $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new yf($$0, this.a, this.b);
      this.d = new yk($$0, this.a, this.b);
   }

   @Override
   public void a(so $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      this.c.a($$0);
      this.d.a($$0);
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

   public yf e() {
      return this.c;
   }

   public yk f() {
      return this.d;
   }
}
