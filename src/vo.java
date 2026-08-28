import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vo implements vd {
   private String a = "";
   @Nullable
   private vg b;
   private final Deque<Consumer<vg>> c = new ArrayDeque<>();

   @Nullable
   public vg d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(vg $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public vd.b a() {
      this.a(ul.b);
      return vd.b.a;
   }

   @Override
   public vd.b a(String $$0) {
      this.a(ve.a($$0));
      return vd.b.a;
   }

   @Override
   public vd.b a(byte $$0) {
      this.a(uh.a($$0));
      return vd.b.a;
   }

   @Override
   public vd.b a(short $$0) {
      this.a(vb.a($$0));
      return vd.b.a;
   }

   @Override
   public vd.b a(int $$0) {
      this.a(uo.a($$0));
      return vd.b.a;
   }

   @Override
   public vd.b a(long $$0) {
      this.a(ur.a($$0));
      return vd.b.a;
   }

   @Override
   public vd.b a(float $$0) {
      this.a(um.a($$0));
      return vd.b.a;
   }

   @Override
   public vd.b a(double $$0) {
      this.a(uk.a($$0));
      return vd.b.a;
   }

   @Override
   public vd.b a(byte[] $$0) {
      this.a(new ug($$0));
      return vd.b.a;
   }

   @Override
   public vd.b a(int[] $$0) {
      this.a(new un($$0));
      return vd.b.a;
   }

   @Override
   public vd.b a(long[] $$0) {
      this.a(new uq($$0));
      return vd.b.a;
   }

   @Override
   public vd.b a(vi<?> $$0, int $$1) {
      return vd.b.a;
   }

   @Override
   public vd.a b(vi<?> $$0, int $$1) {
      this.c($$0);
      return vd.a.a;
   }

   @Override
   public vd.a a(vi<?> $$0) {
      return vd.a.a;
   }

   @Override
   public vd.a a(vi<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return vd.a.a;
   }

   private void c(vi<?> $$0) {
      if ($$0 == up.a) {
         up $$1 = new up();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == uj.b) {
         uj $$2 = new uj();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public vd.b b() {
      this.c.removeLast();
      return vd.b.a;
   }

   @Override
   public vd.b b(vi<?> $$0) {
      if ($$0 == up.a) {
         up $$1 = new up();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == uj.b) {
         uj $$2 = new uj();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return vd.b.a;
   }
}
