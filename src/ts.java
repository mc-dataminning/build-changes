import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ts implements th {
   private String a = "";
   @Nullable
   private tk b;
   private final Deque<Consumer<tk>> c = new ArrayDeque<>();

   @Nullable
   public tk d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(tk $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public th.b a() {
      this.a(sp.b);
      return th.b.a;
   }

   @Override
   public th.b a(String $$0) {
      this.a(ti.a($$0));
      return th.b.a;
   }

   @Override
   public th.b a(byte $$0) {
      this.a(sl.a($$0));
      return th.b.a;
   }

   @Override
   public th.b a(short $$0) {
      this.a(tf.a($$0));
      return th.b.a;
   }

   @Override
   public th.b a(int $$0) {
      this.a(ss.a($$0));
      return th.b.a;
   }

   @Override
   public th.b a(long $$0) {
      this.a(sv.a($$0));
      return th.b.a;
   }

   @Override
   public th.b a(float $$0) {
      this.a(sq.a($$0));
      return th.b.a;
   }

   @Override
   public th.b a(double $$0) {
      this.a(so.a($$0));
      return th.b.a;
   }

   @Override
   public th.b a(byte[] $$0) {
      this.a(new sk($$0));
      return th.b.a;
   }

   @Override
   public th.b a(int[] $$0) {
      this.a(new sr($$0));
      return th.b.a;
   }

   @Override
   public th.b a(long[] $$0) {
      this.a(new su($$0));
      return th.b.a;
   }

   @Override
   public th.b a(tm<?> $$0, int $$1) {
      return th.b.a;
   }

   @Override
   public th.a b(tm<?> $$0, int $$1) {
      this.c($$0);
      return th.a.a;
   }

   @Override
   public th.a a(tm<?> $$0) {
      return th.a.a;
   }

   @Override
   public th.a a(tm<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return th.a.a;
   }

   private void c(tm<?> $$0) {
      if ($$0 == st.a) {
         st $$1 = new st();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == sn.b) {
         sn $$2 = new sn();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public th.b b() {
      this.c.removeLast();
      return th.b.a;
   }

   @Override
   public th.b b(tm<?> $$0) {
      if ($$0 == st.a) {
         st $$1 = new st();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == sn.b) {
         sn $$2 = new sn();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return th.b.a;
   }
}
