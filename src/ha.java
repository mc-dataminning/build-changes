import java.util.List;

public class ha<T, P> implements gr<T> {
   private final ha.a<T, P> a;
   private final List<P> b;
   private final go<T> c;
   private int d;

   private ha(ha.a<T, P> $$0, List<P> $$1, gu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = new go<>($$2, this);
   }

   @Override
   public void execute(gs<T> $$0, gu $$1) {
      P $$2 = this.b.get(this.d);
      $$0.a(this.a.create($$1, $$2));
      if (++this.d < this.b.size()) {
         $$0.a(this.c);
      }
   }

   public static <T, P> void a(gs<T> $$0, gu $$1, List<P> $$2, ha.a<T, P> $$3) {
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
            $$0.a((new ha<>($$3, $$2, $$1)).c);
      }
   }

   @FunctionalInterface
   public interface a<T, P> {
      go<T> create(gu var1, P var2);
   }
}
