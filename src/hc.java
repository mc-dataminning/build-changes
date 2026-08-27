import java.util.List;

public class hc<T, P> implements gt<T> {
   private final hc.a<T, P> a;
   private final List<P> b;
   private final gq<T> c;
   private int d;

   private hc(hc.a<T, P> $$0, List<P> $$1, gw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = new gq<>($$2, this);
   }

   @Override
   public void execute(gu<T> $$0, gw $$1) {
      P $$2 = this.b.get(this.d);
      $$0.a(this.a.create($$1, $$2));
      if (++this.d < this.b.size()) {
         $$0.a(this.c);
      }
   }

   public static <T, P> void a(gu<T> $$0, gw $$1, List<P> $$2, hc.a<T, P> $$3) {
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
            $$0.a((new hc<>($$3, $$2, $$1)).c);
      }
   }

   @FunctionalInterface
   public interface a<T, P> {
      gq<T> create(gw var1, P var2);
   }
}
