import java.util.List;

public class gw<T, P> implements gn<T> {
   private final gw.a<T, P> a;
   private final List<P> b;
   private final gk<T> c;
   private int d;

   private gw(gw.a<T, P> $$0, List<P> $$1, gq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = new gk<>($$2, this);
   }

   @Override
   public void execute(go<T> $$0, gq $$1) {
      P $$2 = this.b.get(this.d);
      $$0.a(this.a.create($$1, $$2));
      if (++this.d < this.b.size()) {
         $$0.a(this.c);
      }
   }

   public static <T, P> void a(go<T> $$0, gq $$1, List<P> $$2, gw.a<T, P> $$3) {
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
            $$0.a((new gw<>($$3, $$2, $$1)).c);
      }
   }

   @FunctionalInterface
   public interface a<T, P> {
      gk<T> create(gq var1, P var2);
   }
}
