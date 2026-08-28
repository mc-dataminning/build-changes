import java.util.List;

public class hw<T, P> implements hn<T> {
   private final hw.a<T, P> a;
   private final List<P> b;
   private final hk<T> c;
   private int d;

   private hw(hw.a<T, P> $$0, List<P> $$1, hq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = new hk<>($$2, this);
   }

   @Override
   public void execute(ho<T> $$0, hq $$1) {
      P $$2 = this.b.get(this.d);
      $$0.a(this.a.create($$1, $$2));
      if (++this.d < this.b.size()) {
         $$0.a(this.c);
      }
   }

   public static <T, P> void a(ho<T> $$0, hq $$1, List<P> $$2, hw.a<T, P> $$3) {
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
            $$0.a((new hw<>($$3, $$2, $$1)).c);
      }
   }

   @FunctionalInterface
   public interface a<T, P> {
      hk<T> create(hq var1, P var2);
   }
}
