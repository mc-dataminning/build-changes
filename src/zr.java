import java.util.BitSet;
import javax.annotation.Nullable;

public class zr implements wo<yh> {
   private final int a;
   private final int b;
   private final zq c;
   private final zv d;

   public zr(dju $$0, ecm $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      crm $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new zq($$0);
      this.d = new zv($$4, $$1, $$2, $$3);
   }

   public zr(ty $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new zq($$0, this.a, this.b);
      this.d = new zv($$0, this.a, this.b);
   }

   @Override
   public void a(ty $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      this.c.a($$0);
      this.d.a($$0);
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

   public zq e() {
      return this.c;
   }

   public zv f() {
      return this.d;
   }
}
