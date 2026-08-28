import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vx implements vm {
   private String a = "";
   @Nullable
   private vp b;
   private final Deque<Consumer<vp>> c = new ArrayDeque<>();

   @Nullable
   public vp d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(vp $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public vm.b a() {
      this.a(uu.b);
      return vm.b.a;
   }

   @Override
   public vm.b a(String $$0) {
      this.a(vn.a($$0));
      return vm.b.a;
   }

   @Override
   public vm.b a(byte $$0) {
      this.a(uq.a($$0));
      return vm.b.a;
   }

   @Override
   public vm.b a(short $$0) {
      this.a(vk.a($$0));
      return vm.b.a;
   }

   @Override
   public vm.b a(int $$0) {
      this.a(ux.a($$0));
      return vm.b.a;
   }

   @Override
   public vm.b a(long $$0) {
      this.a(va.a($$0));
      return vm.b.a;
   }

   @Override
   public vm.b a(float $$0) {
      this.a(uv.a($$0));
      return vm.b.a;
   }

   @Override
   public vm.b a(double $$0) {
      this.a(ut.a($$0));
      return vm.b.a;
   }

   @Override
   public vm.b a(byte[] $$0) {
      this.a(new up($$0));
      return vm.b.a;
   }

   @Override
   public vm.b a(int[] $$0) {
      this.a(new uw($$0));
      return vm.b.a;
   }

   @Override
   public vm.b a(long[] $$0) {
      this.a(new uz($$0));
      return vm.b.a;
   }

   @Override
   public vm.b a(vr<?> $$0, int $$1) {
      return vm.b.a;
   }

   @Override
   public vm.a b(vr<?> $$0, int $$1) {
      this.c($$0);
      return vm.a.a;
   }

   @Override
   public vm.a a(vr<?> $$0) {
      return vm.a.a;
   }

   @Override
   public vm.a a(vr<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return vm.a.a;
   }

   private void c(vr<?> $$0) {
      if ($$0 == uy.a) {
         uy $$1 = new uy();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == us.b) {
         us $$2 = new us();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public vm.b b() {
      this.c.removeLast();
      return vm.b.a;
   }

   @Override
   public vm.b b(vr<?> $$0) {
      if ($$0 == uy.a) {
         uy $$1 = new uy();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == us.b) {
         us $$2 = new us();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return vm.b.a;
   }
}
