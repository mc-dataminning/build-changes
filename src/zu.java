import java.util.BitSet;
import javax.annotation.Nullable;

public class zu implements wo<yh> {
   private final int a;
   private final int b;
   private final zv c;

   public zu(crm $$0, ecm $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new zv($$0, $$1, $$2, $$3);
   }

   public zu(ty $$0) {
      this.a = $$0.n();
      this.b = $$0.n();
      this.c = new zv($$0, this.a, this.b);
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      this.c.a($$0);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public zv e() {
      return this.c;
   }
}
