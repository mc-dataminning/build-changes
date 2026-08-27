import java.util.List;

public class hl<T, P> implements hc<T> {
   private final hl.a<T, P> a;
   private final List<P> b;
   private final gz<T> c;
   private int d;

   private hl(hl.a<T, P> $$0, List<P> $$1, hf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = new gz<>($$2, this);
   }

   @Override
   public void execute(hd<T> $$0, hf $$1) {
      P $$2 = this.b.get(this.d);
      $$0.a(this.a.create($$1, $$2));
      if (++this.d < this.b.size()) {
         $$0.a(this.c);
      }
   }

   public static <T, P> void a(hd<T> $$0, hf $$1, List<P> $$2, hl.a<T, P> $$3) {
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
            $$0.a((new hl<>($$3, $$2, $$1)).c);
      }
   }

   @FunctionalInterface
   public interface a<T, P> {
      gz<T> create(hf var1, P var2);
   }
}
