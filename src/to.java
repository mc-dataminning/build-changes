import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class to implements td {
   private String a = "";
   @Nullable
   private tg b;
   private final Deque<Consumer<tg>> c = new ArrayDeque<>();

   @Nullable
   public tg d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(tg $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public td.b a() {
      this.a(sl.b);
      return td.b.a;
   }

   @Override
   public td.b a(String $$0) {
      this.a(te.a($$0));
      return td.b.a;
   }

   @Override
   public td.b a(byte $$0) {
      this.a(sh.a($$0));
      return td.b.a;
   }

   @Override
   public td.b a(short $$0) {
      this.a(tb.a($$0));
      return td.b.a;
   }

   @Override
   public td.b a(int $$0) {
      this.a(so.a($$0));
      return td.b.a;
   }

   @Override
   public td.b a(long $$0) {
      this.a(sr.a($$0));
      return td.b.a;
   }

   @Override
   public td.b a(float $$0) {
      this.a(sm.a($$0));
      return td.b.a;
   }

   @Override
   public td.b a(double $$0) {
      this.a(sk.a($$0));
      return td.b.a;
   }

   @Override
   public td.b a(byte[] $$0) {
      this.a(new sg($$0));
      return td.b.a;
   }

   @Override
   public td.b a(int[] $$0) {
      this.a(new sn($$0));
      return td.b.a;
   }

   @Override
   public td.b a(long[] $$0) {
      this.a(new sq($$0));
      return td.b.a;
   }

   @Override
   public td.b a(ti<?> $$0, int $$1) {
      return td.b.a;
   }

   @Override
   public td.a b(ti<?> $$0, int $$1) {
      this.c($$0);
      return td.a.a;
   }

   @Override
   public td.a a(ti<?> $$0) {
      return td.a.a;
   }

   @Override
   public td.a a(ti<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return td.a.a;
   }

   private void c(ti<?> $$0) {
      if ($$0 == sp.a) {
         sp $$1 = new sp();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == sj.b) {
         sj $$2 = new sj();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public td.b b() {
      this.c.removeLast();
      return td.b.a;
   }

   @Override
   public td.b b(ti<?> $$0) {
      if ($$0 == sp.a) {
         sp $$1 = new sp();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == sj.b) {
         sj $$2 = new sj();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return td.b.a;
   }
}
