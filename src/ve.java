import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ve implements ut {
   private String a = "";
   @Nullable
   private uw b;
   private final Deque<Consumer<uw>> c = new ArrayDeque<>();

   @Nullable
   public uw d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(uw $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public ut.b a() {
      this.a(ub.b);
      return ut.b.a;
   }

   @Override
   public ut.b a(String $$0) {
      this.a(uu.a($$0));
      return ut.b.a;
   }

   @Override
   public ut.b a(byte $$0) {
      this.a(tx.a($$0));
      return ut.b.a;
   }

   @Override
   public ut.b a(short $$0) {
      this.a(ur.a($$0));
      return ut.b.a;
   }

   @Override
   public ut.b a(int $$0) {
      this.a(ue.a($$0));
      return ut.b.a;
   }

   @Override
   public ut.b a(long $$0) {
      this.a(uh.a($$0));
      return ut.b.a;
   }

   @Override
   public ut.b a(float $$0) {
      this.a(uc.a($$0));
      return ut.b.a;
   }

   @Override
   public ut.b a(double $$0) {
      this.a(ua.a($$0));
      return ut.b.a;
   }

   @Override
   public ut.b a(byte[] $$0) {
      this.a(new tw($$0));
      return ut.b.a;
   }

   @Override
   public ut.b a(int[] $$0) {
      this.a(new ud($$0));
      return ut.b.a;
   }

   @Override
   public ut.b a(long[] $$0) {
      this.a(new ug($$0));
      return ut.b.a;
   }

   @Override
   public ut.b a(uy<?> $$0, int $$1) {
      return ut.b.a;
   }

   @Override
   public ut.a b(uy<?> $$0, int $$1) {
      this.c($$0);
      return ut.a.a;
   }

   @Override
   public ut.a a(uy<?> $$0) {
      return ut.a.a;
   }

   @Override
   public ut.a a(uy<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return ut.a.a;
   }

   private void c(uy<?> $$0) {
      if ($$0 == uf.a) {
         uf $$1 = new uf();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == tz.b) {
         tz $$2 = new tz();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public ut.b b() {
      this.c.removeLast();
      return ut.b.a;
   }

   @Override
   public ut.b b(uy<?> $$0) {
      if ($$0 == uf.a) {
         uf $$1 = new uf();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == tz.b) {
         tz $$2 = new tz();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return ut.b.a;
   }
}
