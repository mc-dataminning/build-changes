import java.util.BitSet;
import javax.annotation.Nullable;

public class ze implements wb<xu> {
   private final int a;
   private final int b;
   private final zd c;
   private final zi d;

   public ze(dii $$0, eat $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      cqg $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new zd($$0);
      this.d = new zi($$4, $$1, $$2, $$3);
   }

   public ze(tl $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new zd($$0, this.a, this.b);
      this.d = new zi($$0, this.a, this.b);
   }

   @Override
   public void a(tl $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      this.c.a($$0);
      this.d.a($$0);
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

   public zd e() {
      return this.c;
   }

   public zi f() {
      return this.d;
   }
}
