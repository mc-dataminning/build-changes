import java.util.BitSet;
import javax.annotation.Nullable;

public class yl implements vf<wy> {
   private final int a;
   private final int b;
   private final ym c;

   public yl(cpe $$0, ead $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new ym($$0, $$1, $$2, $$3);
   }

   public yl(sq $$0) {
      this.a = $$0.m();
      this.b = $$0.m();
      this.c = new ym($$0, this.a, this.b);
   }

   @Override
   public void a(sq $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      this.c.a($$0);
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

   public ym e() {
      return this.c;
   }
}
