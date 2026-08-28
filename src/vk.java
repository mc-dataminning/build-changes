import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class vk implements uz {
   private String a = "";
   @Nullable
   private vc b;
   private final Deque<Consumer<vc>> c = new ArrayDeque<>();

   @Nullable
   public vc d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(vc $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public uz.b a() {
      this.a(uh.b);
      return uz.b.a;
   }

   @Override
   public uz.b a(String $$0) {
      this.a(va.a($$0));
      return uz.b.a;
   }

   @Override
   public uz.b a(byte $$0) {
      this.a(ud.a($$0));
      return uz.b.a;
   }

   @Override
   public uz.b a(short $$0) {
      this.a(ux.a($$0));
      return uz.b.a;
   }

   @Override
   public uz.b a(int $$0) {
      this.a(uk.a($$0));
      return uz.b.a;
   }

   @Override
   public uz.b a(long $$0) {
      this.a(un.a($$0));
      return uz.b.a;
   }

   @Override
   public uz.b a(float $$0) {
      this.a(ui.a($$0));
      return uz.b.a;
   }

   @Override
   public uz.b a(double $$0) {
      this.a(ug.a($$0));
      return uz.b.a;
   }

   @Override
   public uz.b a(byte[] $$0) {
      this.a(new uc($$0));
      return uz.b.a;
   }

   @Override
   public uz.b a(int[] $$0) {
      this.a(new uj($$0));
      return uz.b.a;
   }

   @Override
   public uz.b a(long[] $$0) {
      this.a(new um($$0));
      return uz.b.a;
   }

   @Override
   public uz.b a(ve<?> $$0, int $$1) {
      return uz.b.a;
   }

   @Override
   public uz.a b(ve<?> $$0, int $$1) {
      this.c($$0);
      return uz.a.a;
   }

   @Override
   public uz.a a(ve<?> $$0) {
      return uz.a.a;
   }

   @Override
   public uz.a a(ve<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return uz.a.a;
   }

   private void c(ve<?> $$0) {
      if ($$0 == ul.a) {
         ul $$1 = new ul();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == uf.b) {
         uf $$2 = new uf();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public uz.b b() {
      this.c.removeLast();
      return uz.b.a;
   }

   @Override
   public uz.b b(ve<?> $$0) {
      if ($$0 == ul.a) {
         ul $$1 = new ul();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == uf.b) {
         uf $$2 = new uf();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return uz.b.a;
   }
}
