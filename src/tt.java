import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class tt implements ti {
   private String a = "";
   @Nullable
   private tl b;
   private final Deque<Consumer<tl>> c = new ArrayDeque<>();

   @Nullable
   public tl d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(tl $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public ti.b a() {
      this.a(sq.b);
      return ti.b.a;
   }

   @Override
   public ti.b a(String $$0) {
      this.a(tj.a($$0));
      return ti.b.a;
   }

   @Override
   public ti.b a(byte $$0) {
      this.a(sm.a($$0));
      return ti.b.a;
   }

   @Override
   public ti.b a(short $$0) {
      this.a(tg.a($$0));
      return ti.b.a;
   }

   @Override
   public ti.b a(int $$0) {
      this.a(st.a($$0));
      return ti.b.a;
   }

   @Override
   public ti.b a(long $$0) {
      this.a(sw.a($$0));
      return ti.b.a;
   }

   @Override
   public ti.b a(float $$0) {
      this.a(sr.a($$0));
      return ti.b.a;
   }

   @Override
   public ti.b a(double $$0) {
      this.a(sp.a($$0));
      return ti.b.a;
   }

   @Override
   public ti.b a(byte[] $$0) {
      this.a(new sl($$0));
      return ti.b.a;
   }

   @Override
   public ti.b a(int[] $$0) {
      this.a(new ss($$0));
      return ti.b.a;
   }

   @Override
   public ti.b a(long[] $$0) {
      this.a(new sv($$0));
      return ti.b.a;
   }

   @Override
   public ti.b a(tn<?> $$0, int $$1) {
      return ti.b.a;
   }

   @Override
   public ti.a b(tn<?> $$0, int $$1) {
      this.c($$0);
      return ti.a.a;
   }

   @Override
   public ti.a a(tn<?> $$0) {
      return ti.a.a;
   }

   @Override
   public ti.a a(tn<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return ti.a.a;
   }

   private void c(tn<?> $$0) {
      if ($$0 == su.a) {
         su $$1 = new su();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == so.b) {
         so $$2 = new so();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public ti.b b() {
      this.c.removeLast();
      return ti.b.a;
   }

   @Override
   public ti.b b(tn<?> $$0) {
      if ($$0 == su.a) {
         su $$1 = new su();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == so.b) {
         so $$2 = new so();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return ti.b.a;
   }
}
