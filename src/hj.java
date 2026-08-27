import java.util.List;

public class hj<T extends ef<T>> implements hg<T> {
   private final hr<T> a;
   private final ea b;
   private final boolean c;

   public hj(hr<T> $$0, ea $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hc<T> $$1, he $$2) {
      $$1.e();
      List<hg<T>> $$3 = this.a.b();
      hf $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      he.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      he $$7 = new he($$5, this.b, $$6);
      hk.a($$1, $$7, $$3, ($$1x, $$2x) -> new gy<>($$1x, $$2x.bind($$0)));
   }
}
