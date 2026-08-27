import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class rv implements rk {
   private String a = "";
   @Nullable
   private rn b;
   private final Deque<Consumer<rn>> c = new ArrayDeque<>();

   @Nullable
   public rn d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(rn $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public rk.b a() {
      this.a(qw.b);
      return rk.b.a;
   }

   @Override
   public rk.b a(String $$0) {
      this.a(rl.a($$0));
      return rk.b.a;
   }

   @Override
   public rk.b a(byte $$0) {
      this.a(qs.a($$0));
      return rk.b.a;
   }

   @Override
   public rk.b a(short $$0) {
      this.a(ri.a($$0));
      return rk.b.a;
   }

   @Override
   public rk.b a(int $$0) {
      this.a(qz.a($$0));
      return rk.b.a;
   }

   @Override
   public rk.b a(long $$0) {
      this.a(rc.a($$0));
      return rk.b.a;
   }

   @Override
   public rk.b a(float $$0) {
      this.a(qx.a($$0));
      return rk.b.a;
   }

   @Override
   public rk.b a(double $$0) {
      this.a(qv.a($$0));
      return rk.b.a;
   }

   @Override
   public rk.b a(byte[] $$0) {
      this.a(new qr($$0));
      return rk.b.a;
   }

   @Override
   public rk.b a(int[] $$0) {
      this.a(new qy($$0));
      return rk.b.a;
   }

   @Override
   public rk.b a(long[] $$0) {
      this.a(new rb($$0));
      return rk.b.a;
   }

   @Override
   public rk.b a(rp<?> $$0, int $$1) {
      return rk.b.a;
   }

   @Override
   public rk.a b(rp<?> $$0, int $$1) {
      this.c($$0);
      return rk.a.a;
   }

   @Override
   public rk.a a(rp<?> $$0) {
      return rk.a.a;
   }

   @Override
   public rk.a a(rp<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return rk.a.a;
   }

   private void c(rp<?> $$0) {
      if ($$0 == ra.a) {
         ra $$1 = new ra();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == qu.b) {
         qu $$2 = new qu();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public rk.b b() {
      this.c.removeLast();
      return rk.b.a;
   }

   @Override
   public rk.b b(rp<?> $$0) {
      if ($$0 == ra.a) {
         ra $$1 = new ra();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == qu.b) {
         qu $$2 = new qu();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return rk.b.a;
   }
}
