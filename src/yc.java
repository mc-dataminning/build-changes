import java.util.BitSet;
import javax.annotation.Nullable;

public class yc implements uw<wo> {
   private final int a;
   private final int b;
   private final yd c;

   public yc(cor $$0, dzq $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new yd($$0, $$1, $$2, $$3);
   }

   public yc(sh $$0) {
      this.a = $$0.m();
      this.b = $$0.m();
      this.c = new yd($$0, this.a, this.b);
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      this.c.a($$0);
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

   public yd e() {
      return this.c;
   }
}
