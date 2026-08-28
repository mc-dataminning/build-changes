import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class uv implements uk {
   private String a = "";
   @Nullable
   private un b;
   private final Deque<Consumer<un>> c = new ArrayDeque<>();

   @Nullable
   public un d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(un $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public uk.b a() {
      this.a(ts.b);
      return uk.b.a;
   }

   @Override
   public uk.b a(String $$0) {
      this.a(ul.a($$0));
      return uk.b.a;
   }

   @Override
   public uk.b a(byte $$0) {
      this.a(to.a($$0));
      return uk.b.a;
   }

   @Override
   public uk.b a(short $$0) {
      this.a(ui.a($$0));
      return uk.b.a;
   }

   @Override
   public uk.b a(int $$0) {
      this.a(tv.a($$0));
      return uk.b.a;
   }

   @Override
   public uk.b a(long $$0) {
      this.a(ty.a($$0));
      return uk.b.a;
   }

   @Override
   public uk.b a(float $$0) {
      this.a(tt.a($$0));
      return uk.b.a;
   }

   @Override
   public uk.b a(double $$0) {
      this.a(tr.a($$0));
      return uk.b.a;
   }

   @Override
   public uk.b a(byte[] $$0) {
      this.a(new tn($$0));
      return uk.b.a;
   }

   @Override
   public uk.b a(int[] $$0) {
      this.a(new tu($$0));
      return uk.b.a;
   }

   @Override
   public uk.b a(long[] $$0) {
      this.a(new tx($$0));
      return uk.b.a;
   }

   @Override
   public uk.b a(up<?> $$0, int $$1) {
      return uk.b.a;
   }

   @Override
   public uk.a b(up<?> $$0, int $$1) {
      this.c($$0);
      return uk.a.a;
   }

   @Override
   public uk.a a(up<?> $$0) {
      return uk.a.a;
   }

   @Override
   public uk.a a(up<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return uk.a.a;
   }

   private void c(up<?> $$0) {
      if ($$0 == tw.a) {
         tw $$1 = new tw();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == tq.b) {
         tq $$2 = new tq();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public uk.b b() {
      this.c.removeLast();
      return uk.b.a;
   }

   @Override
   public uk.b b(up<?> $$0) {
      if ($$0 == tw.a) {
         tw $$1 = new tw();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == tq.b) {
         tq $$2 = new tq();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return uk.b.a;
   }
}
