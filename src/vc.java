import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vc implements ur {
   private String a = "";
   @Nullable
   private uu b;
   private final Deque<Consumer<uu>> c = new ArrayDeque<>();

   @Nullable
   public uu d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(uu $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public ur.b a() {
      this.a(tz.b);
      return ur.b.a;
   }

   @Override
   public ur.b a(String $$0) {
      this.a(us.a($$0));
      return ur.b.a;
   }

   @Override
   public ur.b a(byte $$0) {
      this.a(tv.a($$0));
      return ur.b.a;
   }

   @Override
   public ur.b a(short $$0) {
      this.a(up.a($$0));
      return ur.b.a;
   }

   @Override
   public ur.b a(int $$0) {
      this.a(uc.a($$0));
      return ur.b.a;
   }

   @Override
   public ur.b a(long $$0) {
      this.a(uf.a($$0));
      return ur.b.a;
   }

   @Override
   public ur.b a(float $$0) {
      this.a(ua.a($$0));
      return ur.b.a;
   }

   @Override
   public ur.b a(double $$0) {
      this.a(ty.a($$0));
      return ur.b.a;
   }

   @Override
   public ur.b a(byte[] $$0) {
      this.a(new tu($$0));
      return ur.b.a;
   }

   @Override
   public ur.b a(int[] $$0) {
      this.a(new ub($$0));
      return ur.b.a;
   }

   @Override
   public ur.b a(long[] $$0) {
      this.a(new ue($$0));
      return ur.b.a;
   }

   @Override
   public ur.b a(uw<?> $$0, int $$1) {
      return ur.b.a;
   }

   @Override
   public ur.a b(uw<?> $$0, int $$1) {
      this.c($$0);
      return ur.a.a;
   }

   @Override
   public ur.a a(uw<?> $$0) {
      return ur.a.a;
   }

   @Override
   public ur.a a(uw<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return ur.a.a;
   }

   private void c(uw<?> $$0) {
      if ($$0 == ud.a) {
         ud $$1 = new ud();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == tx.b) {
         tx $$2 = new tx();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public ur.b b() {
      this.c.removeLast();
      return ur.b.a;
   }

   @Override
   public ur.b b(uw<?> $$0) {
      if ($$0 == ud.a) {
         ud $$1 = new ud();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == tx.b) {
         tx $$2 = new tx();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return ur.b.a;
   }
}
