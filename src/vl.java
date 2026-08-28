import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vl implements va {
   private String a = "";
   @Nullable
   private vd b;
   private final Deque<Consumer<vd>> c = new ArrayDeque<>();

   @Nullable
   public vd d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(vd $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public va.b a() {
      this.a(ui.b);
      return va.b.a;
   }

   @Override
   public va.b a(String $$0) {
      this.a(vb.a($$0));
      return va.b.a;
   }

   @Override
   public va.b a(byte $$0) {
      this.a(ue.a($$0));
      return va.b.a;
   }

   @Override
   public va.b a(short $$0) {
      this.a(uy.a($$0));
      return va.b.a;
   }

   @Override
   public va.b a(int $$0) {
      this.a(ul.a($$0));
      return va.b.a;
   }

   @Override
   public va.b a(long $$0) {
      this.a(uo.a($$0));
      return va.b.a;
   }

   @Override
   public va.b a(float $$0) {
      this.a(uj.a($$0));
      return va.b.a;
   }

   @Override
   public va.b a(double $$0) {
      this.a(uh.a($$0));
      return va.b.a;
   }

   @Override
   public va.b a(byte[] $$0) {
      this.a(new ud($$0));
      return va.b.a;
   }

   @Override
   public va.b a(int[] $$0) {
      this.a(new uk($$0));
      return va.b.a;
   }

   @Override
   public va.b a(long[] $$0) {
      this.a(new un($$0));
      return va.b.a;
   }

   @Override
   public va.b a(vf<?> $$0, int $$1) {
      return va.b.a;
   }

   @Override
   public va.a b(vf<?> $$0, int $$1) {
      this.c($$0);
      return va.a.a;
   }

   @Override
   public va.a a(vf<?> $$0) {
      return va.a.a;
   }

   @Override
   public va.a a(vf<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return va.a.a;
   }

   private void c(vf<?> $$0) {
      if ($$0 == um.a) {
         um $$1 = new um();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == ug.b) {
         ug $$2 = new ug();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public va.b b() {
      this.c.removeLast();
      return va.b.a;
   }

   @Override
   public va.b b(vf<?> $$0) {
      if ($$0 == um.a) {
         um $$1 = new um();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == ug.b) {
         ug $$2 = new ug();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return va.b.a;
   }
}
