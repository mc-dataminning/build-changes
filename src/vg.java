import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vg implements uv {
   private String a = "";
   @Nullable
   private uy b;
   private final Deque<Consumer<uy>> c = new ArrayDeque<>();

   @Nullable
   public uy d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(uy $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public uv.b a() {
      this.a(ud.b);
      return uv.b.a;
   }

   @Override
   public uv.b a(String $$0) {
      this.a(uw.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(byte $$0) {
      this.a(tz.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(short $$0) {
      this.a(ut.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(int $$0) {
      this.a(ug.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(long $$0) {
      this.a(uj.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(float $$0) {
      this.a(ue.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(double $$0) {
      this.a(uc.a($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(byte[] $$0) {
      this.a(new ty($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(int[] $$0) {
      this.a(new uf($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(long[] $$0) {
      this.a(new ui($$0));
      return uv.b.a;
   }

   @Override
   public uv.b a(va<?> $$0, int $$1) {
      return uv.b.a;
   }

   @Override
   public uv.a b(va<?> $$0, int $$1) {
      this.c($$0);
      return uv.a.a;
   }

   @Override
   public uv.a a(va<?> $$0) {
      return uv.a.a;
   }

   @Override
   public uv.a a(va<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return uv.a.a;
   }

   private void c(va<?> $$0) {
      if ($$0 == uh.a) {
         uh $$1 = new uh();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == ub.b) {
         ub $$2 = new ub();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public uv.b b() {
      this.c.removeLast();
      return uv.b.a;
   }

   @Override
   public uv.b b(va<?> $$0) {
      if ($$0 == uh.a) {
         uh $$1 = new uh();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == ub.b) {
         ub $$2 = new ub();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return uv.b.a;
   }
}
