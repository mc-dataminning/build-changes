import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class te implements st {
   private String a = "";
   @Nullable
   private sw b;
   private final Deque<Consumer<sw>> c = new ArrayDeque<>();

   @Nullable
   public sw d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(sw $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public st.b a() {
      this.a(sb.b);
      return st.b.a;
   }

   @Override
   public st.b a(String $$0) {
      this.a(su.a($$0));
      return st.b.a;
   }

   @Override
   public st.b a(byte $$0) {
      this.a(rx.a($$0));
      return st.b.a;
   }

   @Override
   public st.b a(short $$0) {
      this.a(sr.a($$0));
      return st.b.a;
   }

   @Override
   public st.b a(int $$0) {
      this.a(se.a($$0));
      return st.b.a;
   }

   @Override
   public st.b a(long $$0) {
      this.a(sh.a($$0));
      return st.b.a;
   }

   @Override
   public st.b a(float $$0) {
      this.a(sc.a($$0));
      return st.b.a;
   }

   @Override
   public st.b a(double $$0) {
      this.a(sa.a($$0));
      return st.b.a;
   }

   @Override
   public st.b a(byte[] $$0) {
      this.a(new rw($$0));
      return st.b.a;
   }

   @Override
   public st.b a(int[] $$0) {
      this.a(new sd($$0));
      return st.b.a;
   }

   @Override
   public st.b a(long[] $$0) {
      this.a(new sg($$0));
      return st.b.a;
   }

   @Override
   public st.b a(sy<?> $$0, int $$1) {
      return st.b.a;
   }

   @Override
   public st.a b(sy<?> $$0, int $$1) {
      this.c($$0);
      return st.a.a;
   }

   @Override
   public st.a a(sy<?> $$0) {
      return st.a.a;
   }

   @Override
   public st.a a(sy<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return st.a.a;
   }

   private void c(sy<?> $$0) {
      if ($$0 == sf.a) {
         sf $$1 = new sf();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == rz.b) {
         rz $$2 = new rz();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public st.b b() {
      this.c.removeLast();
      return st.b.a;
   }

   @Override
   public st.b b(sy<?> $$0) {
      if ($$0 == sf.a) {
         sf $$1 = new sf();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == rz.b) {
         rz $$2 = new rz();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return st.b.a;
   }
}
