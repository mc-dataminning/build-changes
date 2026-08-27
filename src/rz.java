import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class rz implements ro {
   private String a = "";
   @Nullable
   private rr b;
   private final Deque<Consumer<rr>> c = new ArrayDeque<>();

   @Nullable
   public rr d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(rr $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public ro.b a() {
      this.a(ra.b);
      return ro.b.a;
   }

   @Override
   public ro.b a(String $$0) {
      this.a(rp.a($$0));
      return ro.b.a;
   }

   @Override
   public ro.b a(byte $$0) {
      this.a(qw.a($$0));
      return ro.b.a;
   }

   @Override
   public ro.b a(short $$0) {
      this.a(rm.a($$0));
      return ro.b.a;
   }

   @Override
   public ro.b a(int $$0) {
      this.a(rd.a($$0));
      return ro.b.a;
   }

   @Override
   public ro.b a(long $$0) {
      this.a(rg.a($$0));
      return ro.b.a;
   }

   @Override
   public ro.b a(float $$0) {
      this.a(rb.a($$0));
      return ro.b.a;
   }

   @Override
   public ro.b a(double $$0) {
      this.a(qz.a($$0));
      return ro.b.a;
   }

   @Override
   public ro.b a(byte[] $$0) {
      this.a(new qv($$0));
      return ro.b.a;
   }

   @Override
   public ro.b a(int[] $$0) {
      this.a(new rc($$0));
      return ro.b.a;
   }

   @Override
   public ro.b a(long[] $$0) {
      this.a(new rf($$0));
      return ro.b.a;
   }

   @Override
   public ro.b a(rt<?> $$0, int $$1) {
      return ro.b.a;
   }

   @Override
   public ro.a b(rt<?> $$0, int $$1) {
      this.c($$0);
      return ro.a.a;
   }

   @Override
   public ro.a a(rt<?> $$0) {
      return ro.a.a;
   }

   @Override
   public ro.a a(rt<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return ro.a.a;
   }

   private void c(rt<?> $$0) {
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
   public ro.b b() {
      this.c.removeLast();
      return ro.b.a;
   }

   @Override
   public ro.b b(rt<?> $$0) {
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

      return ro.b.a;
   }
}
