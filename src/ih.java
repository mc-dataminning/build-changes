import java.util.List;

public class ih<T, P> implements hx<T> {
   private final ih.a<T, P> a;
   private final List<P> b;
   private final hu<T> c;
   private int d;

   private ih(ih.a<T, P> $$0, List<P> $$1, ia $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = new hu<>($$2, this);
   }

   @Override
   public void execute(hy<T> $$0, ia $$1) {
      P $$2 = this.b.get(this.d);
      $$0.a(this.a.create($$1, $$2));
      if (++this.d < this.b.size()) {
         $$0.a(this.c);
      }
   }

   public static <T, P> void a(hy<T> $$0, ia $$1, List<P> $$2, ih.a<T, P> $$3) {
      int $$4 = $$2.size();
      switch ($$4) {
         case 0:
            break;
         case 1:
            $$0.a($$3.create($$1, $$2.get(0)));
            break;
         case 2:
            $$0.a($$3.create($$1, $$2.get(0)));
            $$0.a($$3.create($$1, $$2.get(1)));
            break;
         default:
            $$0.a((new ih<>($$3, $$2, $$1)).c);
      }
   }

   @FunctionalInterface
   public interface a<T, P> {
      hu<T> create(ia var1, P var2);
   }
}
