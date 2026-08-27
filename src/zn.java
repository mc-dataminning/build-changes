import java.util.BitSet;
import javax.annotation.Nullable;

public class zn implements wk<yd> {
   private final int a;
   private final int b;
   private final zm c;
   private final zr d;

   public zn(djp $$0, ech $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      crh $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new zm($$0);
      this.d = new zr($$4, $$1, $$2, $$3);
   }

   public zn(tu $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new zm($$0, this.a, this.b);
      this.d = new zr($$0, this.a, this.b);
   }

   @Override
   public void a(tu $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      this.c.a($$0);
      this.d.a($$0);
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

   public zm e() {
      return this.c;
   }

   public zr f() {
      return this.d;
   }
}
