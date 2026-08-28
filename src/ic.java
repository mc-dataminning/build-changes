import java.util.List;

public class ic<T, P> implements ht<T> {
   private final ic.a<T, P> a;
   private final List<P> b;
   private final hq<T> c;
   private int d;

   private ic(ic.a<T, P> $$0, List<P> $$1, hw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = new hq<>($$2, this);
   }

   @Override
   public void execute(hu<T> $$0, hw $$1) {
      P $$2 = this.b.get(this.d);
      $$0.a(this.a.create($$1, $$2));
      if (++this.d < this.b.size()) {
         $$0.a(this.c);
      }
   }

   public static <T, P> void a(hu<T> $$0, hw $$1, List<P> $$2, ic.a<T, P> $$3) {
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
            $$0.a((new ic<>($$3, $$2, $$1)).c);
      }
   }

   @FunctionalInterface
   public interface a<T, P> {
      hq<T> create(hw var1, P var2);
   }
}
