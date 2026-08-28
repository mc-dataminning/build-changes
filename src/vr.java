import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vr implements vg {
   private String a = "";
   @Nullable
   private vj b;
   private final Deque<Consumer<vj>> c = new ArrayDeque<>();

   @Nullable
   public vj d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(vj $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public vg.b a() {
      this.a(uo.b);
      return vg.b.a;
   }

   @Override
   public vg.b a(String $$0) {
      this.a(vh.a($$0));
      return vg.b.a;
   }

   @Override
   public vg.b a(byte $$0) {
      this.a(uk.a($$0));
      return vg.b.a;
   }

   @Override
   public vg.b a(short $$0) {
      this.a(ve.a($$0));
      return vg.b.a;
   }

   @Override
   public vg.b a(int $$0) {
      this.a(ur.a($$0));
      return vg.b.a;
   }

   @Override
   public vg.b a(long $$0) {
      this.a(uu.a($$0));
      return vg.b.a;
   }

   @Override
   public vg.b a(float $$0) {
      this.a(up.a($$0));
      return vg.b.a;
   }

   @Override
   public vg.b a(double $$0) {
      this.a(un.a($$0));
      return vg.b.a;
   }

   @Override
   public vg.b a(byte[] $$0) {
      this.a(new uj($$0));
      return vg.b.a;
   }

   @Override
   public vg.b a(int[] $$0) {
      this.a(new uq($$0));
      return vg.b.a;
   }

   @Override
   public vg.b a(long[] $$0) {
      this.a(new ut($$0));
      return vg.b.a;
   }

   @Override
   public vg.b a(vl<?> $$0, int $$1) {
      return vg.b.a;
   }

   @Override
   public vg.a b(vl<?> $$0, int $$1) {
      this.c($$0);
      return vg.a.a;
   }

   @Override
   public vg.a a(vl<?> $$0) {
      return vg.a.a;
   }

   @Override
   public vg.a a(vl<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return vg.a.a;
   }

   private void c(vl<?> $$0) {
      if ($$0 == us.a) {
         us $$1 = new us();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == um.b) {
         um $$2 = new um();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public vg.b b() {
      this.c.removeLast();
      return vg.b.a;
   }

   @Override
   public vg.b b(vl<?> $$0) {
      if ($$0 == us.a) {
         us $$1 = new us();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == um.b) {
         um $$2 = new um();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return vg.b.a;
   }
}
