import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vq implements vf {
   private String a = "";
   @Nullable
   private vi b;
   private final Deque<Consumer<vi>> c = new ArrayDeque<>();

   @Nullable
   public vi d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(vi $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public vf.b a() {
      this.a(un.b);
      return vf.b.a;
   }

   @Override
   public vf.b a(String $$0) {
      this.a(vg.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(byte $$0) {
      this.a(uj.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(short $$0) {
      this.a(vd.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(int $$0) {
      this.a(uq.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(long $$0) {
      this.a(ut.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(float $$0) {
      this.a(uo.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(double $$0) {
      this.a(um.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(byte[] $$0) {
      this.a(new ui($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(int[] $$0) {
      this.a(new up($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(long[] $$0) {
      this.a(new us($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(vk<?> $$0, int $$1) {
      return vf.b.a;
   }

   @Override
   public vf.a b(vk<?> $$0, int $$1) {
      this.c($$0);
      return vf.a.a;
   }

   @Override
   public vf.a a(vk<?> $$0) {
      return vf.a.a;
   }

   @Override
   public vf.a a(vk<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return vf.a.a;
   }

   private void c(vk<?> $$0) {
      if ($$0 == ur.a) {
         ur $$1 = new ur();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == ul.b) {
         ul $$2 = new ul();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public vf.b b() {
      this.c.removeLast();
      return vf.b.a;
   }

   @Override
   public vf.b b(vk<?> $$0) {
      if ($$0 == ur.a) {
         ur $$1 = new ur();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == ul.b) {
         ul $$2 = new ul();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return vf.b.a;
   }
}
