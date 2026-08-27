import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ti implements sx {
   private String a = "";
   @Nullable
   private ta b;
   private final Deque<Consumer<ta>> c = new ArrayDeque<>();

   @Nullable
   public ta d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(ta $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public sx.b a() {
      this.a(sf.b);
      return sx.b.a;
   }

   @Override
   public sx.b a(String $$0) {
      this.a(sy.a($$0));
      return sx.b.a;
   }

   @Override
   public sx.b a(byte $$0) {
      this.a(sb.a($$0));
      return sx.b.a;
   }

   @Override
   public sx.b a(short $$0) {
      this.a(sv.a($$0));
      return sx.b.a;
   }

   @Override
   public sx.b a(int $$0) {
      this.a(si.a($$0));
      return sx.b.a;
   }

   @Override
   public sx.b a(long $$0) {
      this.a(sl.a($$0));
      return sx.b.a;
   }

   @Override
   public sx.b a(float $$0) {
      this.a(sg.a($$0));
      return sx.b.a;
   }

   @Override
   public sx.b a(double $$0) {
      this.a(se.a($$0));
      return sx.b.a;
   }

   @Override
   public sx.b a(byte[] $$0) {
      this.a(new sa($$0));
      return sx.b.a;
   }

   @Override
   public sx.b a(int[] $$0) {
      this.a(new sh($$0));
      return sx.b.a;
   }

   @Override
   public sx.b a(long[] $$0) {
      this.a(new sk($$0));
      return sx.b.a;
   }

   @Override
   public sx.b a(tc<?> $$0, int $$1) {
      return sx.b.a;
   }

   @Override
   public sx.a b(tc<?> $$0, int $$1) {
      this.c($$0);
      return sx.a.a;
   }

   @Override
   public sx.a a(tc<?> $$0) {
      return sx.a.a;
   }

   @Override
   public sx.a a(tc<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return sx.a.a;
   }

   private void c(tc<?> $$0) {
      if ($$0 == sj.a) {
         sj $$1 = new sj();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == sd.b) {
         sd $$2 = new sd();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public sx.b b() {
      this.c.removeLast();
      return sx.b.a;
   }

   @Override
   public sx.b b(tc<?> $$0) {
      if ($$0 == sj.a) {
         sj $$1 = new sj();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == sd.b) {
         sd $$2 = new sd();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return sx.b.a;
   }
}
