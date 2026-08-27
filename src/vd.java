import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vd implements us {
   private String a = "";
   @Nullable
   private uv b;
   private final Deque<Consumer<uv>> c = new ArrayDeque<>();

   @Nullable
   public uv d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(uv $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public us.b a() {
      this.a(ua.b);
      return us.b.a;
   }

   @Override
   public us.b a(String $$0) {
      this.a(ut.a($$0));
      return us.b.a;
   }

   @Override
   public us.b a(byte $$0) {
      this.a(tw.a($$0));
      return us.b.a;
   }

   @Override
   public us.b a(short $$0) {
      this.a(uq.a($$0));
      return us.b.a;
   }

   @Override
   public us.b a(int $$0) {
      this.a(ud.a($$0));
      return us.b.a;
   }

   @Override
   public us.b a(long $$0) {
      this.a(ug.a($$0));
      return us.b.a;
   }

   @Override
   public us.b a(float $$0) {
      this.a(ub.a($$0));
      return us.b.a;
   }

   @Override
   public us.b a(double $$0) {
      this.a(tz.a($$0));
      return us.b.a;
   }

   @Override
   public us.b a(byte[] $$0) {
      this.a(new tv($$0));
      return us.b.a;
   }

   @Override
   public us.b a(int[] $$0) {
      this.a(new uc($$0));
      return us.b.a;
   }

   @Override
   public us.b a(long[] $$0) {
      this.a(new uf($$0));
      return us.b.a;
   }

   @Override
   public us.b a(ux<?> $$0, int $$1) {
      return us.b.a;
   }

   @Override
   public us.a b(ux<?> $$0, int $$1) {
      this.c($$0);
      return us.a.a;
   }

   @Override
   public us.a a(ux<?> $$0) {
      return us.a.a;
   }

   @Override
   public us.a a(ux<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return us.a.a;
   }

   private void c(ux<?> $$0) {
      if ($$0 == ue.a) {
         ue $$1 = new ue();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == ty.b) {
         ty $$2 = new ty();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public us.b b() {
      this.c.removeLast();
      return us.b.a;
   }

   @Override
   public us.b b(ux<?> $$0) {
      if ($$0 == ue.a) {
         ue $$1 = new ue();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == ty.b) {
         ty $$2 = new ty();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return us.b.a;
   }
}
