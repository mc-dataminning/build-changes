import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class tq implements tf {
   private String a = "";
   @Nullable
   private ti b;
   private final Deque<Consumer<ti>> c = new ArrayDeque<>();

   @Nullable
   public ti d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(ti $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public tf.b a() {
      this.a(sn.b);
      return tf.b.a;
   }

   @Override
   public tf.b a(String $$0) {
      this.a(tg.a($$0));
      return tf.b.a;
   }

   @Override
   public tf.b a(byte $$0) {
      this.a(sj.a($$0));
      return tf.b.a;
   }

   @Override
   public tf.b a(short $$0) {
      this.a(td.a($$0));
      return tf.b.a;
   }

   @Override
   public tf.b a(int $$0) {
      this.a(sq.a($$0));
      return tf.b.a;
   }

   @Override
   public tf.b a(long $$0) {
      this.a(st.a($$0));
      return tf.b.a;
   }

   @Override
   public tf.b a(float $$0) {
      this.a(so.a($$0));
      return tf.b.a;
   }

   @Override
   public tf.b a(double $$0) {
      this.a(sm.a($$0));
      return tf.b.a;
   }

   @Override
   public tf.b a(byte[] $$0) {
      this.a(new si($$0));
      return tf.b.a;
   }

   @Override
   public tf.b a(int[] $$0) {
      this.a(new sp($$0));
      return tf.b.a;
   }

   @Override
   public tf.b a(long[] $$0) {
      this.a(new ss($$0));
      return tf.b.a;
   }

   @Override
   public tf.b a(tk<?> $$0, int $$1) {
      return tf.b.a;
   }

   @Override
   public tf.a b(tk<?> $$0, int $$1) {
      this.c($$0);
      return tf.a.a;
   }

   @Override
   public tf.a a(tk<?> $$0) {
      return tf.a.a;
   }

   @Override
   public tf.a a(tk<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return tf.a.a;
   }

   private void c(tk<?> $$0) {
      if ($$0 == sr.a) {
         sr $$1 = new sr();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == sl.b) {
         sl $$2 = new sl();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public tf.b b() {
      this.c.removeLast();
      return tf.b.a;
   }

   @Override
   public tf.b b(tk<?> $$0) {
      if ($$0 == sr.a) {
         sr $$1 = new sr();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == sl.b) {
         sl $$2 = new sl();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return tf.b.a;
   }
}
