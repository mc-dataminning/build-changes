import java.util.List;

public class ht<T, P> implements hk<T> {
   private final ht.a<T, P> a;
   private final List<P> b;
   private final hh<T> c;
   private int d;

   private ht(ht.a<T, P> $$0, List<P> $$1, hn $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = new hh<>($$2, this);
   }

   @Override
   public void execute(hl<T> $$0, hn $$1) {
      P $$2 = this.b.get(this.d);
      $$0.a(this.a.create($$1, $$2));
      if (++this.d < this.b.size()) {
         $$0.a(this.c);
      }
   }

   public static <T, P> void a(hl<T> $$0, hn $$1, List<P> $$2, ht.a<T, P> $$3) {
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
            $$0.a((new ht<>($$3, $$2, $$1)).c);
      }
   }

   @FunctionalInterface
   public interface a<T, P> {
      hh<T> create(hn var1, P var2);
   }
}
