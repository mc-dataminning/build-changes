import java.util.List;

public class gv<T extends dw<T>> implements gs<T> {
   private final hd<T> a;
   private final dq b;
   private final boolean c;

   public gv(hd<T> $$0, dq $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, go<T> $$1, gq $$2) {
      $$1.e();
      List<gs<T>> $$3 = this.a.b();
      gr $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      gq.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      gq $$7 = new gq($$5, this.b, $$6);
      gw.a($$1, $$7, $$3, ($$1x, $$2x) -> new gk<>($$1x, $$2x.bind($$0)));
   }
}
