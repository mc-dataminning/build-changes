import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class rt implements ri {
   private String a = "";
   @Nullable
   private rl b;
   private final Deque<Consumer<rl>> c = new ArrayDeque<>();

   @Nullable
   public rl d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(rl $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public ri.b a() {
      this.a(qu.b);
      return ri.b.a;
   }

   @Override
   public ri.b a(String $$0) {
      this.a(rj.a($$0));
      return ri.b.a;
   }

   @Override
   public ri.b a(byte $$0) {
      this.a(qq.a($$0));
      return ri.b.a;
   }

   @Override
   public ri.b a(short $$0) {
      this.a(rg.a($$0));
      return ri.b.a;
   }

   @Override
   public ri.b a(int $$0) {
      this.a(qx.a($$0));
      return ri.b.a;
   }

   @Override
   public ri.b a(long $$0) {
      this.a(ra.a($$0));
      return ri.b.a;
   }

   @Override
   public ri.b a(float $$0) {
      this.a(qv.a($$0));
      return ri.b.a;
   }

   @Override
   public ri.b a(double $$0) {
      this.a(qt.a($$0));
      return ri.b.a;
   }

   @Override
   public ri.b a(byte[] $$0) {
      this.a(new qp($$0));
      return ri.b.a;
   }

   @Override
   public ri.b a(int[] $$0) {
      this.a(new qw($$0));
      return ri.b.a;
   }

   @Override
   public ri.b a(long[] $$0) {
      this.a(new qz($$0));
      return ri.b.a;
   }

   @Override
   public ri.b a(rn<?> $$0, int $$1) {
      return ri.b.a;
   }

   @Override
   public ri.a b(rn<?> $$0, int $$1) {
      this.c($$0);
      return ri.a.a;
   }

   @Override
   public ri.a a(rn<?> $$0) {
      return ri.a.a;
   }

   @Override
   public ri.a a(rn<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return ri.a.a;
   }

   private void c(rn<?> $$0) {
      if ($$0 == qy.a) {
         qy $$1 = new qy();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == qs.b) {
         qs $$2 = new qs();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public ri.b b() {
      this.c.removeLast();
      return ri.b.a;
   }

   @Override
   public ri.b b(rn<?> $$0) {
      if ($$0 == qy.a) {
         qy $$1 = new qy();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == qs.b) {
         qs $$2 = new qs();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return ri.b.a;
   }
}
