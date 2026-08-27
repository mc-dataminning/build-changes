import java.util.BitSet;
import javax.annotation.Nullable;

public class wd implements uo<ur> {
   private final int a;
   private final int b;
   private final wc c;
   private final wh d;

   public wd(dei $$0, dwt $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      clt $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new wc($$0);
      this.d = new wh($$4, $$1, $$2, $$3);
   }

   public wd(sf $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new wc($$0, this.a, this.b);
      this.d = new wh($$0, this.a, this.b);
   }

   @Override
   public void a(sf $$0) {
      $$0.writeInt(this.a);
      $$0.writeInt(this.b);
      this.c.a($$0);
      this.d.a($$0);
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

   public wc d() {
      return this.c;
   }

   public wh e() {
      return this.d;
   }
}
