import java.util.BitSet;
import javax.annotation.Nullable;

public class zh implements wb<xu> {
   private final int a;
   private final int b;
   private final zi c;

   public zh(cqg $$0, eat $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new zi($$0, $$1, $$2, $$3);
   }

   public zh(tl $$0) {
      this.a = $$0.n();
      this.b = $$0.n();
      this.c = new zi($$0, this.a, this.b);
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      this.c.a($$0);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public zi e() {
      return this.c;
   }
}
