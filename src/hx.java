import java.util.List;

public class hx<T, P> implements ho<T> {
   private final hx.a<T, P> a;
   private final List<P> b;
   private final hl<T> c;
   private int d;

   private hx(hx.a<T, P> $$0, List<P> $$1, hr $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = new hl<>($$2, this);
   }

   @Override
   public void execute(hp<T> $$0, hr $$1) {
      P $$2 = this.b.get(this.d);
      $$0.a(this.a.create($$1, $$2));
      if (++this.d < this.b.size()) {
         $$0.a(this.c);
      }
   }

   public static <T, P> void a(hp<T> $$0, hr $$1, List<P> $$2, hx.a<T, P> $$3) {
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
            $$0.a((new hx<>($$3, $$2, $$1)).c);
      }
   }

   @FunctionalInterface
   public interface a<T, P> {
      hl<T> create(hr var1, P var2);
   }
}
