import java.util.BitSet;
import javax.annotation.Nullable;

public class yi implements vf<wy> {
   private final int a;
   private final int b;
   private final yh c;
   private final ym d;

   public yi(dhs $$0, ead $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      cpe $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new yh($$0);
      this.d = new ym($$4, $$1, $$2, $$3);
   }

   public yi(sq $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new yh($$0, this.a, this.b);
      this.d = new ym($$0, this.a, this.b);
   }

   @Override
   public void a(sq $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      this.c.a($$0);
      this.d.a($$0);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public yh e() {
      return this.c;
   }

   public ym f() {
      return this.d;
   }
}
