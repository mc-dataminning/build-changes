import java.util.List;

public class hq<T extends ek<T>> implements hn<T> {
   private final hy<T> a;
   private final ef b;
   private final boolean c;

   public hq(hy<T> $$0, ef $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hj<T> $$1, hl $$2) {
      $$1.e();
      List<hn<T>> $$3 = this.a.b();
      hm $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hl.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hl $$7 = new hl($$5, this.b, $$6);
      hr.a($$1, $$7, $$3, ($$1x, $$2x) -> new hf<>($$1x, $$2x.bind($$0)));
   }
}
