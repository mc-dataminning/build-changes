import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ub implements tq {
   private String a = "";
   @Nullable
   private tt b;
   private final Deque<Consumer<tt>> c = new ArrayDeque<>();

   @Nullable
   public tt d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(tt $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public tq.b a() {
      this.a(sy.b);
      return tq.b.a;
   }

   @Override
   public tq.b a(String $$0) {
      this.a(tr.a($$0));
      return tq.b.a;
   }

   @Override
   public tq.b a(byte $$0) {
      this.a(su.a($$0));
      return tq.b.a;
   }

   @Override
   public tq.b a(short $$0) {
      this.a(to.a($$0));
      return tq.b.a;
   }

   @Override
   public tq.b a(int $$0) {
      this.a(tb.a($$0));
      return tq.b.a;
   }

   @Override
   public tq.b a(long $$0) {
      this.a(te.a($$0));
      return tq.b.a;
   }

   @Override
   public tq.b a(float $$0) {
      this.a(sz.a($$0));
      return tq.b.a;
   }

   @Override
   public tq.b a(double $$0) {
      this.a(sx.a($$0));
      return tq.b.a;
   }

   @Override
   public tq.b a(byte[] $$0) {
      this.a(new st($$0));
      return tq.b.a;
   }

   @Override
   public tq.b a(int[] $$0) {
      this.a(new ta($$0));
      return tq.b.a;
   }

   @Override
   public tq.b a(long[] $$0) {
      this.a(new td($$0));
      return tq.b.a;
   }

   @Override
   public tq.b a(tv<?> $$0, int $$1) {
      return tq.b.a;
   }

   @Override
   public tq.a b(tv<?> $$0, int $$1) {
      this.c($$0);
      return tq.a.a;
   }

   @Override
   public tq.a a(tv<?> $$0) {
      return tq.a.a;
   }

   @Override
   public tq.a a(tv<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return tq.a.a;
   }

   private void c(tv<?> $$0) {
      if ($$0 == tc.a) {
         tc $$1 = new tc();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == sw.b) {
         sw $$2 = new sw();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public tq.b b() {
      this.c.removeLast();
      return tq.b.a;
   }

   @Override
   public tq.b b(tv<?> $$0) {
      if ($$0 == tc.a) {
         tc $$1 = new tc();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == sw.b) {
         sw $$2 = new sw();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return tq.b.a;
   }
}
