import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vf implements uu {
   private String a = "";
   @Nullable
   private ux b;
   private final Deque<Consumer<ux>> c = new ArrayDeque<>();

   @Nullable
   public ux d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(ux $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public uu.b a() {
      this.a(uc.b);
      return uu.b.a;
   }

   @Override
   public uu.b a(String $$0) {
      this.a(uv.a($$0));
      return uu.b.a;
   }

   @Override
   public uu.b a(byte $$0) {
      this.a(ty.a($$0));
      return uu.b.a;
   }

   @Override
   public uu.b a(short $$0) {
      this.a(us.a($$0));
      return uu.b.a;
   }

   @Override
   public uu.b a(int $$0) {
      this.a(uf.a($$0));
      return uu.b.a;
   }

   @Override
   public uu.b a(long $$0) {
      this.a(ui.a($$0));
      return uu.b.a;
   }

   @Override
   public uu.b a(float $$0) {
      this.a(ud.a($$0));
      return uu.b.a;
   }

   @Override
   public uu.b a(double $$0) {
      this.a(ub.a($$0));
      return uu.b.a;
   }

   @Override
   public uu.b a(byte[] $$0) {
      this.a(new tx($$0));
      return uu.b.a;
   }

   @Override
   public uu.b a(int[] $$0) {
      this.a(new ue($$0));
      return uu.b.a;
   }

   @Override
   public uu.b a(long[] $$0) {
      this.a(new uh($$0));
      return uu.b.a;
   }

   @Override
   public uu.b a(uz<?> $$0, int $$1) {
      return uu.b.a;
   }

   @Override
   public uu.a b(uz<?> $$0, int $$1) {
      this.c($$0);
      return uu.a.a;
   }

   @Override
   public uu.a a(uz<?> $$0) {
      return uu.a.a;
   }

   @Override
   public uu.a a(uz<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return uu.a.a;
   }

   private void c(uz<?> $$0) {
      if ($$0 == ug.a) {
         ug $$1 = new ug();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == ua.b) {
         ua $$2 = new ua();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public uu.b b() {
      this.c.removeLast();
      return uu.b.a;
   }

   @Override
   public uu.b b(uz<?> $$0) {
      if ($$0 == ug.a) {
         ug $$1 = new ug();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == ua.b) {
         ua $$2 = new ua();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return uu.b.a;
   }
}
