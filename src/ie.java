import java.util.List;

public class ie<T extends ez<T>> implements ib<T> {
   private final in<T> a;
   private final eu b;
   private final boolean c;

   public ie(in<T> $$0, eu $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hx<T> $$1, hz $$2) {
      $$1.e();
      List<ib<T>> $$3 = this.a.b();
      ia $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hz.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hz $$7 = new hz($$5, this.b, $$6);
      ig.a($$1, $$7, $$3, ($$1x, $$2x) -> new ht<>($$1x, $$2x.bind($$0)));
   }
}
