import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class sa implements rp {
   private String a = "";
   @Nullable
   private rs b;
   private final Deque<Consumer<rs>> c = new ArrayDeque<>();

   @Nullable
   public rs d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(rs $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public rp.b a() {
      this.a(ra.b);
      return rp.b.a;
   }

   @Override
   public rp.b a(String $$0) {
      this.a(rq.a($$0));
      return rp.b.a;
   }

   @Override
   public rp.b a(byte $$0) {
      this.a(qw.a($$0));
      return rp.b.a;
   }

   @Override
   public rp.b a(short $$0) {
      this.a(rn.a($$0));
      return rp.b.a;
   }

   @Override
   public rp.b a(int $$0) {
      this.a(rd.a($$0));
      return rp.b.a;
   }

   @Override
   public rp.b a(long $$0) {
      this.a(rg.a($$0));
      return rp.b.a;
   }

   @Override
   public rp.b a(float $$0) {
      this.a(rb.a($$0));
      return rp.b.a;
   }

   @Override
   public rp.b a(double $$0) {
      this.a(qz.a($$0));
      return rp.b.a;
   }

   @Override
   public rp.b a(byte[] $$0) {
      this.a(new qv($$0));
      return rp.b.a;
   }

   @Override
   public rp.b a(int[] $$0) {
      this.a(new rc($$0));
      return rp.b.a;
   }

   @Override
   public rp.b a(long[] $$0) {
      this.a(new rf($$0));
      return rp.b.a;
   }

   @Override
   public rp.b a(ru<?> $$0, int $$1) {
      return rp.b.a;
   }

   @Override
   public rp.a b(ru<?> $$0, int $$1) {
      this.c($$0);
      return rp.a.a;
   }

   @Override
   public rp.a a(ru<?> $$0) {
      return rp.a.a;
   }

   @Override
   public rp.a a(ru<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return rp.a.a;
   }

   private void c(ru<?> $$0) {
      if ($$0 == re.a) {
         re $$1 = new re();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == qy.b) {
         qy $$2 = new qy();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public rp.b b() {
      this.c.removeLast();
      return rp.b.a;
   }

   @Override
   public rp.b b(ru<?> $$0) {
      if ($$0 == re.a) {
         re $$1 = new re();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == qy.b) {
         qy $$2 = new qy();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return rp.b.a;
   }
}
