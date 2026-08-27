import java.util.List;

public class gae<T extends ccq, M extends fjo<T>> extends fzs<T, M> {
   private final agg a;
   private final gae.a<T> b;
   private final gae.b<T, M> c;

   public gae(fxf<T, M> $$0, agg $$1, gae.a<T> $$2, gae.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(enk $$0, fqh $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         this.a();
         eno $$10 = $$1.getBuffer(fqp.j(this.a));
         this.c().a($$0, $$10, $$2, fwl.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fkb> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends ccq> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends ccq, M extends fhc<T>> {
      List<fkb> getPartsToDraw(M var1);
   }
}
