import java.util.List;

public class ib<T, P> implements hs<T> {
   private final ib.a<T, P> a;
   private final List<P> b;
   private final hp<T> c;
   private int d;

   private ib(ib.a<T, P> $$0, List<P> $$1, hv $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = new hp<>($$2, this);
   }

   @Override
   public void execute(ht<T> $$0, hv $$1) {
      P $$2 = this.b.get(this.d);
      $$0.a(this.a.create($$1, $$2));
      if (++this.d < this.b.size()) {
         $$0.a(this.c);
      }
   }

   public static <T, P> void a(ht<T> $$0, hv $$1, List<P> $$2, ib.a<T, P> $$3) {
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
            $$0.a((new ib<>($$3, $$2, $$1)).c);
      }
   }

   @FunctionalInterface
   public interface a<T, P> {
      hp<T> create(hv var1, P var2);
   }
}
