import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vi implements ux {
   private String a = "";
   @Nullable
   private va b;
   private final Deque<Consumer<va>> c = new ArrayDeque<>();

   @Nullable
   public va d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(va $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public ux.b a() {
      this.a(uf.b);
      return ux.b.a;
   }

   @Override
   public ux.b a(String $$0) {
      this.a(uy.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(byte $$0) {
      this.a(ub.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(short $$0) {
      this.a(uv.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(int $$0) {
      this.a(ui.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(long $$0) {
      this.a(ul.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(float $$0) {
      this.a(ug.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(double $$0) {
      this.a(ue.a($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(byte[] $$0) {
      this.a(new ua($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(int[] $$0) {
      this.a(new uh($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(long[] $$0) {
      this.a(new uk($$0));
      return ux.b.a;
   }

   @Override
   public ux.b a(vc<?> $$0, int $$1) {
      return ux.b.a;
   }

   @Override
   public ux.a b(vc<?> $$0, int $$1) {
      this.c($$0);
      return ux.a.a;
   }

   @Override
   public ux.a a(vc<?> $$0) {
      return ux.a.a;
   }

   @Override
   public ux.a a(vc<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return ux.a.a;
   }

   private void c(vc<?> $$0) {
      if ($$0 == uj.a) {
         uj $$1 = new uj();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == ud.b) {
         ud $$2 = new ud();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public ux.b b() {
      this.c.removeLast();
      return ux.b.a;
   }

   @Override
   public ux.b b(vc<?> $$0) {
      if ($$0 == uj.a) {
         uj $$1 = new uj();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == ud.b) {
         ud $$2 = new ud();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return ux.b.a;
   }
}
