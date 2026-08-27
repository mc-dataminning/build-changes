import java.util.BitSet;
import javax.annotation.Nullable;

public class yd implements va<ws> {
   private final int a;
   private final int b;
   private final yc c;
   private final yh d;

   public yd(dhl $$0, dzw $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      cox $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new yc($$0);
      this.d = new yh($$4, $$1, $$2, $$3);
   }

   public yd(sl $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new yc($$0, this.a, this.b);
      this.d = new yh($$0, this.a, this.b);
   }

   @Override
   public void a(sl $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      this.c.a($$0);
      this.d.a($$0);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public yc e() {
      return this.c;
   }

   public yh f() {
      return this.d;
   }
}
