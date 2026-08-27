import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ur implements ug {
   private String a = "";
   @Nullable
   private uj b;
   private final Deque<Consumer<uj>> c = new ArrayDeque<>();

   @Nullable
   public uj d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(uj $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public ug.b a() {
      this.a(to.b);
      return ug.b.a;
   }

   @Override
   public ug.b a(String $$0) {
      this.a(uh.a($$0));
      return ug.b.a;
   }

   @Override
   public ug.b a(byte $$0) {
      this.a(tk.a($$0));
      return ug.b.a;
   }

   @Override
   public ug.b a(short $$0) {
      this.a(ue.a($$0));
      return ug.b.a;
   }

   @Override
   public ug.b a(int $$0) {
      this.a(tr.a($$0));
      return ug.b.a;
   }

   @Override
   public ug.b a(long $$0) {
      this.a(tu.a($$0));
      return ug.b.a;
   }

   @Override
   public ug.b a(float $$0) {
      this.a(tp.a($$0));
      return ug.b.a;
   }

   @Override
   public ug.b a(double $$0) {
      this.a(tn.a($$0));
      return ug.b.a;
   }

   @Override
   public ug.b a(byte[] $$0) {
      this.a(new tj($$0));
      return ug.b.a;
   }

   @Override
   public ug.b a(int[] $$0) {
      this.a(new tq($$0));
      return ug.b.a;
   }

   @Override
   public ug.b a(long[] $$0) {
      this.a(new tt($$0));
      return ug.b.a;
   }

   @Override
   public ug.b a(ul<?> $$0, int $$1) {
      return ug.b.a;
   }

   @Override
   public ug.a b(ul<?> $$0, int $$1) {
      this.c($$0);
      return ug.a.a;
   }

   @Override
   public ug.a a(ul<?> $$0) {
      return ug.a.a;
   }

   @Override
   public ug.a a(ul<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return ug.a.a;
   }

   private void c(ul<?> $$0) {
      if ($$0 == ts.a) {
         ts $$1 = new ts();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == tm.b) {
         tm $$2 = new tm();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public ug.b b() {
      this.c.removeLast();
      return ug.b.a;
   }

   @Override
   public ug.b b(ul<?> $$0) {
      if ($$0 == ts.a) {
         ts $$1 = new ts();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == tm.b) {
         tm $$2 = new tm();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return ug.b.a;
   }
}
