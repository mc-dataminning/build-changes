import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class uf implements tu {
   private String a = "";
   @Nullable
   private tx b;
   private final Deque<Consumer<tx>> c = new ArrayDeque<>();

   @Nullable
   public tx d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(tx $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public tu.b a() {
      this.a(tc.b);
      return tu.b.a;
   }

   @Override
   public tu.b a(String $$0) {
      this.a(tv.a($$0));
      return tu.b.a;
   }

   @Override
   public tu.b a(byte $$0) {
      this.a(sy.a($$0));
      return tu.b.a;
   }

   @Override
   public tu.b a(short $$0) {
      this.a(ts.a($$0));
      return tu.b.a;
   }

   @Override
   public tu.b a(int $$0) {
      this.a(tf.a($$0));
      return tu.b.a;
   }

   @Override
   public tu.b a(long $$0) {
      this.a(ti.a($$0));
      return tu.b.a;
   }

   @Override
   public tu.b a(float $$0) {
      this.a(td.a($$0));
      return tu.b.a;
   }

   @Override
   public tu.b a(double $$0) {
      this.a(tb.a($$0));
      return tu.b.a;
   }

   @Override
   public tu.b a(byte[] $$0) {
      this.a(new sx($$0));
      return tu.b.a;
   }

   @Override
   public tu.b a(int[] $$0) {
      this.a(new te($$0));
      return tu.b.a;
   }

   @Override
   public tu.b a(long[] $$0) {
      this.a(new th($$0));
      return tu.b.a;
   }

   @Override
   public tu.b a(tz<?> $$0, int $$1) {
      return tu.b.a;
   }

   @Override
   public tu.a b(tz<?> $$0, int $$1) {
      this.c($$0);
      return tu.a.a;
   }

   @Override
   public tu.a a(tz<?> $$0) {
      return tu.a.a;
   }

   @Override
   public tu.a a(tz<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return tu.a.a;
   }

   private void c(tz<?> $$0) {
      if ($$0 == tg.a) {
         tg $$1 = new tg();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == ta.b) {
         ta $$2 = new ta();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public tu.b b() {
      this.c.removeLast();
      return tu.b.a;
   }

   @Override
   public tu.b b(tz<?> $$0) {
      if ($$0 == tg.a) {
         tg $$1 = new tg();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == ta.b) {
         ta $$2 = new ta();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return tu.b.a;
   }
}
