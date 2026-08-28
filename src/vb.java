import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vb implements uq {
   private String a = "";
   @Nullable
   private ut b;
   private final Deque<Consumer<ut>> c = new ArrayDeque<>();

   @Nullable
   public ut d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(ut $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public uq.b a() {
      this.a(ty.b);
      return uq.b.a;
   }

   @Override
   public uq.b a(String $$0) {
      this.a(ur.a($$0));
      return uq.b.a;
   }

   @Override
   public uq.b a(byte $$0) {
      this.a(tu.a($$0));
      return uq.b.a;
   }

   @Override
   public uq.b a(short $$0) {
      this.a(uo.a($$0));
      return uq.b.a;
   }

   @Override
   public uq.b a(int $$0) {
      this.a(ub.a($$0));
      return uq.b.a;
   }

   @Override
   public uq.b a(long $$0) {
      this.a(ue.a($$0));
      return uq.b.a;
   }

   @Override
   public uq.b a(float $$0) {
      this.a(tz.a($$0));
      return uq.b.a;
   }

   @Override
   public uq.b a(double $$0) {
      this.a(tx.a($$0));
      return uq.b.a;
   }

   @Override
   public uq.b a(byte[] $$0) {
      this.a(new tt($$0));
      return uq.b.a;
   }

   @Override
   public uq.b a(int[] $$0) {
      this.a(new ua($$0));
      return uq.b.a;
   }

   @Override
   public uq.b a(long[] $$0) {
      this.a(new ud($$0));
      return uq.b.a;
   }

   @Override
   public uq.b a(uv<?> $$0, int $$1) {
      return uq.b.a;
   }

   @Override
   public uq.a b(uv<?> $$0, int $$1) {
      this.c($$0);
      return uq.a.a;
   }

   @Override
   public uq.a a(uv<?> $$0) {
      return uq.a.a;
   }

   @Override
   public uq.a a(uv<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return uq.a.a;
   }

   private void c(uv<?> $$0) {
      if ($$0 == uc.a) {
         uc $$1 = new uc();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == tw.b) {
         tw $$2 = new tw();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public uq.b b() {
      this.c.removeLast();
      return uq.b.a;
   }

   @Override
   public uq.b b(uv<?> $$0) {
      if ($$0 == uc.a) {
         uc $$1 = new uc();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == tw.b) {
         tw $$2 = new tw();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return uq.b.a;
   }
}
