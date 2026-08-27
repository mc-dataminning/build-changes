import java.util.BitSet;
import javax.annotation.Nullable;

public class zy implements wu<yo> {
   private final int a;
   private final int b;
   private final zx c;
   private final aac d;

   public zy(dkw $$0, edo $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      csf $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new zx($$0);
      this.d = new aac($$4, $$1, $$2, $$3);
   }

   public zy(ue $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new zx($$0, this.a, this.b);
      this.d = new aac($$0, this.a, this.b);
   }

   @Override
   public void a(ue $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      this.c.a($$0);
      this.d.a($$0);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public zx e() {
      return this.c;
   }

   public aac f() {
      return this.d;
   }
}
