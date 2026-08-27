import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vp implements ve {
   private String a = "";
   @Nullable
   private vh b;
   private final Deque<Consumer<vh>> c = new ArrayDeque<>();

   @Nullable
   public vh d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(vh $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public ve.b a() {
      this.a(um.b);
      return ve.b.a;
   }

   @Override
   public ve.b a(String $$0) {
      this.a(vf.a($$0));
      return ve.b.a;
   }

   @Override
   public ve.b a(byte $$0) {
      this.a(ui.a($$0));
      return ve.b.a;
   }

   @Override
   public ve.b a(short $$0) {
      this.a(vc.a($$0));
      return ve.b.a;
   }

   @Override
   public ve.b a(int $$0) {
      this.a(up.a($$0));
      return ve.b.a;
   }

   @Override
   public ve.b a(long $$0) {
      this.a(us.a($$0));
      return ve.b.a;
   }

   @Override
   public ve.b a(float $$0) {
      this.a(un.a($$0));
      return ve.b.a;
   }

   @Override
   public ve.b a(double $$0) {
      this.a(ul.a($$0));
      return ve.b.a;
   }

   @Override
   public ve.b a(byte[] $$0) {
      this.a(new uh($$0));
      return ve.b.a;
   }

   @Override
   public ve.b a(int[] $$0) {
      this.a(new uo($$0));
      return ve.b.a;
   }

   @Override
   public ve.b a(long[] $$0) {
      this.a(new ur($$0));
      return ve.b.a;
   }

   @Override
   public ve.b a(vj<?> $$0, int $$1) {
      return ve.b.a;
   }

   @Override
   public ve.a b(vj<?> $$0, int $$1) {
      this.c($$0);
      return ve.a.a;
   }

   @Override
   public ve.a a(vj<?> $$0) {
      return ve.a.a;
   }

   @Override
   public ve.a a(vj<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return ve.a.a;
   }

   private void c(vj<?> $$0) {
      if ($$0 == uq.a) {
         uq $$1 = new uq();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == uk.b) {
         uk $$2 = new uk();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public ve.b b() {
      this.c.removeLast();
      return ve.b.a;
   }

   @Override
   public ve.b b(vj<?> $$0) {
      if ($$0 == uq.a) {
         uq $$1 = new uq();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == uk.b) {
         uk $$2 = new uk();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return ve.b.a;
   }
}
