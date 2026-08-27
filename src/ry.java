import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ry implements rn {
   private String a = "";
   @Nullable
   private rq b;
   private final Deque<Consumer<rq>> c = new ArrayDeque<>();

   @Nullable
   public rq d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(rq $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public rn.b a() {
      this.a(qy.b);
      return rn.b.a;
   }

   @Override
   public rn.b a(String $$0) {
      this.a(ro.a($$0));
      return rn.b.a;
   }

   @Override
   public rn.b a(byte $$0) {
      this.a(qu.a($$0));
      return rn.b.a;
   }

   @Override
   public rn.b a(short $$0) {
      this.a(rl.a($$0));
      return rn.b.a;
   }

   @Override
   public rn.b a(int $$0) {
      this.a(rb.a($$0));
      return rn.b.a;
   }

   @Override
   public rn.b a(long $$0) {
      this.a(re.a($$0));
      return rn.b.a;
   }

   @Override
   public rn.b a(float $$0) {
      this.a(qz.a($$0));
      return rn.b.a;
   }

   @Override
   public rn.b a(double $$0) {
      this.a(qx.a($$0));
      return rn.b.a;
   }

   @Override
   public rn.b a(byte[] $$0) {
      this.a(new qt($$0));
      return rn.b.a;
   }

   @Override
   public rn.b a(int[] $$0) {
      this.a(new ra($$0));
      return rn.b.a;
   }

   @Override
   public rn.b a(long[] $$0) {
      this.a(new rd($$0));
      return rn.b.a;
   }

   @Override
   public rn.b a(rs<?> $$0, int $$1) {
      return rn.b.a;
   }

   @Override
   public rn.a b(rs<?> $$0, int $$1) {
      this.c($$0);
      return rn.a.a;
   }

   @Override
   public rn.a a(rs<?> $$0) {
      return rn.a.a;
   }

   @Override
   public rn.a a(rs<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return rn.a.a;
   }

   private void c(rs<?> $$0) {
      if ($$0 == rc.a) {
         rc $$1 = new rc();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == qw.b) {
         qw $$2 = new qw();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public rn.b b() {
      this.c.removeLast();
      return rn.b.a;
   }

   @Override
   public rn.b b(rs<?> $$0) {
      if ($$0 == rc.a) {
         rc $$1 = new rc();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == qw.b) {
         qw $$2 = new qw();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return rn.b.a;
   }
}
