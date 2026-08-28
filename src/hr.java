import java.util.List;

public class hr<T extends el<T>> implements ho<T> {
   private final hz<T> a;
   private final eg b;
   private final boolean c;

   public hr(hz<T> $$0, eg $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hk<T> $$1, hm $$2) {
      $$1.e();
      List<ho<T>> $$3 = this.a.b();
      hn $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hm.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hm $$7 = new hm($$5, this.b, $$6);
      hs.a($$1, $$7, $$3, ($$1x, $$2x) -> new hg<>($$1x, $$2x.bind($$0)));
   }
}
