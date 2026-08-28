import java.util.List;

public class id<T, P> implements hu<T> {
   private final id.a<T, P> a;
   private final List<P> b;
   private final hr<T> c;
   private int d;

   private id(id.a<T, P> $$0, List<P> $$1, hx $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = new hr<>($$2, this);
   }

   @Override
   public void execute(hv<T> $$0, hx $$1) {
      P $$2 = this.b.get(this.d);
      $$0.a(this.a.create($$1, $$2));
      if (++this.d < this.b.size()) {
         $$0.a(this.c);
      }
   }

   public static <T, P> void a(hv<T> $$0, hx $$1, List<P> $$2, id.a<T, P> $$3) {
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
            $$0.a((new id<>($$3, $$2, $$1)).c);
      }
   }

   @FunctionalInterface
   public interface a<T, P> {
      hr<T> create(hx var1, P var2);
   }
}
