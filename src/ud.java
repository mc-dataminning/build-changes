import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ud implements ts {
   private String a = "";
   @Nullable
   private tv b;
   private final Deque<Consumer<tv>> c = new ArrayDeque<>();

   @Nullable
   public tv d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(tv $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public ts.b a() {
      this.a(ta.b);
      return ts.b.a;
   }

   @Override
   public ts.b a(String $$0) {
      this.a(tt.a($$0));
      return ts.b.a;
   }

   @Override
   public ts.b a(byte $$0) {
      this.a(sw.a($$0));
      return ts.b.a;
   }

   @Override
   public ts.b a(short $$0) {
      this.a(tq.a($$0));
      return ts.b.a;
   }

   @Override
   public ts.b a(int $$0) {
      this.a(td.a($$0));
      return ts.b.a;
   }

   @Override
   public ts.b a(long $$0) {
      this.a(tg.a($$0));
      return ts.b.a;
   }

   @Override
   public ts.b a(float $$0) {
      this.a(tb.a($$0));
      return ts.b.a;
   }

   @Override
   public ts.b a(double $$0) {
      this.a(sz.a($$0));
      return ts.b.a;
   }

   @Override
   public ts.b a(byte[] $$0) {
      this.a(new sv($$0));
      return ts.b.a;
   }

   @Override
   public ts.b a(int[] $$0) {
      this.a(new tc($$0));
      return ts.b.a;
   }

   @Override
   public ts.b a(long[] $$0) {
      this.a(new tf($$0));
      return ts.b.a;
   }

   @Override
   public ts.b a(tx<?> $$0, int $$1) {
      return ts.b.a;
   }

   @Override
   public ts.a b(tx<?> $$0, int $$1) {
      this.c($$0);
      return ts.a.a;
   }

   @Override
   public ts.a a(tx<?> $$0) {
      return ts.a.a;
   }

   @Override
   public ts.a a(tx<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return ts.a.a;
   }

   private void c(tx<?> $$0) {
      if ($$0 == te.a) {
         te $$1 = new te();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == sy.b) {
         sy $$2 = new sy();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public ts.b b() {
      this.c.removeLast();
      return ts.b.a;
   }

   @Override
   public ts.b b(tx<?> $$0) {
      if ($$0 == te.a) {
         te $$1 = new te();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == sy.b) {
         sy $$2 = new sy();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return ts.b.a;
   }
}
