import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class sv implements sk {
   private String a = "";
   @Nullable
   private sn b;
   private final Deque<Consumer<sn>> c = new ArrayDeque<>();

   @Nullable
   public sn d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(sn $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public sk.b a() {
      this.a(rv.b);
      return sk.b.a;
   }

   @Override
   public sk.b a(String $$0) {
      this.a(sl.a($$0));
      return sk.b.a;
   }

   @Override
   public sk.b a(byte $$0) {
      this.a(rr.a($$0));
      return sk.b.a;
   }

   @Override
   public sk.b a(short $$0) {
      this.a(si.a($$0));
      return sk.b.a;
   }

   @Override
   public sk.b a(int $$0) {
      this.a(ry.a($$0));
      return sk.b.a;
   }

   @Override
   public sk.b a(long $$0) {
      this.a(sb.a($$0));
      return sk.b.a;
   }

   @Override
   public sk.b a(float $$0) {
      this.a(rw.a($$0));
      return sk.b.a;
   }

   @Override
   public sk.b a(double $$0) {
      this.a(ru.a($$0));
      return sk.b.a;
   }

   @Override
   public sk.b a(byte[] $$0) {
      this.a(new rq($$0));
      return sk.b.a;
   }

   @Override
   public sk.b a(int[] $$0) {
      this.a(new rx($$0));
      return sk.b.a;
   }

   @Override
   public sk.b a(long[] $$0) {
      this.a(new sa($$0));
      return sk.b.a;
   }

   @Override
   public sk.b a(sp<?> $$0, int $$1) {
      return sk.b.a;
   }

   @Override
   public sk.a b(sp<?> $$0, int $$1) {
      this.c($$0);
      return sk.a.a;
   }

   @Override
   public sk.a a(sp<?> $$0) {
      return sk.a.a;
   }

   @Override
   public sk.a a(sp<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return sk.a.a;
   }

   private void c(sp<?> $$0) {
      if ($$0 == rz.a) {
         rz $$1 = new rz();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == rt.b) {
         rt $$2 = new rt();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public sk.b b() {
      this.c.removeLast();
      return sk.b.a;
   }

   @Override
   public sk.b b(sp<?> $$0) {
      if ($$0 == rz.a) {
         rz $$1 = new rz();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == rt.b) {
         rt $$2 = new rt();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return sk.b.a;
   }
}
