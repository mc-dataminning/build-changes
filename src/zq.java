import java.util.BitSet;
import javax.annotation.Nullable;

public class zq implements wk<yd> {
   private final int a;
   private final int b;
   private final zr c;

   public zq(crh $$0, ech $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new zr($$0, $$1, $$2, $$3);
   }

   public zq(tu $$0) {
      this.a = $$0.n();
      this.b = $$0.n();
      this.c = new zr($$0, this.a, this.b);
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      this.c.a($$0);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public zr e() {
      return this.c;
   }
}
