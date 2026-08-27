import java.util.List;

public class gar<T extends ccy, M extends fkb<T>> extends gaf<T, M> {
   private final agi a;
   private final gar.a<T> b;
   private final gar.b<T, M> c;

   public gar(fxs<T, M> $$0, agi $$1, gar.a<T> $$2, gar.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(enw $$0, fqu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         this.a();
         eoa $$10 = $$1.getBuffer(frc.j(this.a));
         this.c().a($$0, $$10, $$2, fwy.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fko> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends ccy> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends ccy, M extends fhp<T>> {
      List<fko> getPartsToDraw(M var1);
   }
}
