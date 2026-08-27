import java.util.BitSet;
import javax.annotation.Nullable;

public class wg implements uo<ur> {
   private final int a;
   private final int b;
   private final wh c;

   public wg(clt $$0, dwt $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new wh($$0, $$1, $$2, $$3);
   }

   public wg(sf $$0) {
      this.a = $$0.m();
      this.b = $$0.m();
      this.c = new wh($$0, this.a, this.b);
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      $$0.d(this.b);
      this.c.a($$0);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public wh d() {
      return this.c;
   }
}
