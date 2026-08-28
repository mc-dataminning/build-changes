import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vw implements vl {
   private String a = "";
   @Nullable
   private vo b;
   private final Deque<Consumer<vo>> c = new ArrayDeque<>();

   @Nullable
   public vo d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(vo $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public vl.b a() {
      this.a(ut.b);
      return vl.b.a;
   }

   @Override
   public vl.b a(String $$0) {
      this.a(vm.a($$0));
      return vl.b.a;
   }

   @Override
   public vl.b a(byte $$0) {
      this.a(up.a($$0));
      return vl.b.a;
   }

   @Override
   public vl.b a(short $$0) {
      this.a(vj.a($$0));
      return vl.b.a;
   }

   @Override
   public vl.b a(int $$0) {
      this.a(uw.a($$0));
      return vl.b.a;
   }

   @Override
   public vl.b a(long $$0) {
      this.a(uz.a($$0));
      return vl.b.a;
   }

   @Override
   public vl.b a(float $$0) {
      this.a(uu.a($$0));
      return vl.b.a;
   }

   @Override
   public vl.b a(double $$0) {
      this.a(us.a($$0));
      return vl.b.a;
   }

   @Override
   public vl.b a(byte[] $$0) {
      this.a(new uo($$0));
      return vl.b.a;
   }

   @Override
   public vl.b a(int[] $$0) {
      this.a(new uv($$0));
      return vl.b.a;
   }

   @Override
   public vl.b a(long[] $$0) {
      this.a(new uy($$0));
      return vl.b.a;
   }

   @Override
   public vl.b a(vq<?> $$0, int $$1) {
      return vl.b.a;
   }

   @Override
   public vl.a b(vq<?> $$0, int $$1) {
      this.c($$0);
      return vl.a.a;
   }

   @Override
   public vl.a a(vq<?> $$0) {
      return vl.a.a;
   }

   @Override
   public vl.a a(vq<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return vl.a.a;
   }

   private void c(vq<?> $$0) {
      if ($$0 == ux.a) {
         ux $$1 = new ux();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == ur.b) {
         ur $$2 = new ur();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public vl.b b() {
      this.c.removeLast();
      return vl.b.a;
   }

   @Override
   public vl.b b(vq<?> $$0) {
      if ($$0 == ux.a) {
         ux $$1 = new ux();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == ur.b) {
         ur $$2 = new ur();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return vl.b.a;
   }
}
