import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ut implements ui {
   private String a = "";
   @Nullable
   private ul b;
   private final Deque<Consumer<ul>> c = new ArrayDeque<>();

   @Nullable
   public ul d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(ul $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public ui.b a() {
      this.a(tq.b);
      return ui.b.a;
   }

   @Override
   public ui.b a(String $$0) {
      this.a(uj.a($$0));
      return ui.b.a;
   }

   @Override
   public ui.b a(byte $$0) {
      this.a(tm.a($$0));
      return ui.b.a;
   }

   @Override
   public ui.b a(short $$0) {
      this.a(ug.a($$0));
      return ui.b.a;
   }

   @Override
   public ui.b a(int $$0) {
      this.a(tt.a($$0));
      return ui.b.a;
   }

   @Override
   public ui.b a(long $$0) {
      this.a(tw.a($$0));
      return ui.b.a;
   }

   @Override
   public ui.b a(float $$0) {
      this.a(tr.a($$0));
      return ui.b.a;
   }

   @Override
   public ui.b a(double $$0) {
      this.a(tp.a($$0));
      return ui.b.a;
   }

   @Override
   public ui.b a(byte[] $$0) {
      this.a(new tl($$0));
      return ui.b.a;
   }

   @Override
   public ui.b a(int[] $$0) {
      this.a(new ts($$0));
      return ui.b.a;
   }

   @Override
   public ui.b a(long[] $$0) {
      this.a(new tv($$0));
      return ui.b.a;
   }

   @Override
   public ui.b a(un<?> $$0, int $$1) {
      return ui.b.a;
   }

   @Override
   public ui.a b(un<?> $$0, int $$1) {
      this.c($$0);
      return ui.a.a;
   }

   @Override
   public ui.a a(un<?> $$0) {
      return ui.a.a;
   }

   @Override
   public ui.a a(un<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return ui.a.a;
   }

   private void c(un<?> $$0) {
      if ($$0 == tu.a) {
         tu $$1 = new tu();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == to.b) {
         to $$2 = new to();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public ui.b b() {
      this.c.removeLast();
      return ui.b.a;
   }

   @Override
   public ui.b b(un<?> $$0) {
      if ($$0 == tu.a) {
         tu $$1 = new tu();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == to.b) {
         to $$2 = new to();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return ui.b.a;
   }
}
