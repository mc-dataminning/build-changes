import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vs implements vh {
   private String a = "";
   @Nullable
   private vk b;
   private final Deque<Consumer<vk>> c = new ArrayDeque<>();

   @Nullable
   public vk d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(vk $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public vh.b a() {
      this.a(up.b);
      return vh.b.a;
   }

   @Override
   public vh.b a(String $$0) {
      this.a(vi.a($$0));
      return vh.b.a;
   }

   @Override
   public vh.b a(byte $$0) {
      this.a(ul.a($$0));
      return vh.b.a;
   }

   @Override
   public vh.b a(short $$0) {
      this.a(vf.a($$0));
      return vh.b.a;
   }

   @Override
   public vh.b a(int $$0) {
      this.a(us.a($$0));
      return vh.b.a;
   }

   @Override
   public vh.b a(long $$0) {
      this.a(uv.a($$0));
      return vh.b.a;
   }

   @Override
   public vh.b a(float $$0) {
      this.a(uq.a($$0));
      return vh.b.a;
   }

   @Override
   public vh.b a(double $$0) {
      this.a(uo.a($$0));
      return vh.b.a;
   }

   @Override
   public vh.b a(byte[] $$0) {
      this.a(new uk($$0));
      return vh.b.a;
   }

   @Override
   public vh.b a(int[] $$0) {
      this.a(new ur($$0));
      return vh.b.a;
   }

   @Override
   public vh.b a(long[] $$0) {
      this.a(new uu($$0));
      return vh.b.a;
   }

   @Override
   public vh.b a(vm<?> $$0, int $$1) {
      return vh.b.a;
   }

   @Override
   public vh.a b(vm<?> $$0, int $$1) {
      this.c($$0);
      return vh.a.a;
   }

   @Override
   public vh.a a(vm<?> $$0) {
      return vh.a.a;
   }

   @Override
   public vh.a a(vm<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return vh.a.a;
   }

   private void c(vm<?> $$0) {
      if ($$0 == ut.a) {
         ut $$1 = new ut();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == un.b) {
         un $$2 = new un();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public vh.b b() {
      this.c.removeLast();
      return vh.b.a;
   }

   @Override
   public vh.b b(vm<?> $$0) {
      if ($$0 == ut.a) {
         ut $$1 = new ut();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == un.b) {
         un $$2 = new un();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return vh.b.a;
   }
}
