import java.util.List;

public class gnw<T extends cmc, M extends fwn<T>> extends gnk<T, M> {
   private final alf a;
   private final gnw.a<T> b;
   private final gnw.b<T, M> c;

   public gnw(gku<T, M> $$0, alf $$1, gnw.a<T> $$2, gnw.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(ezz $$0, gdp $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         this.a();
         fad $$10 = $$1.getBuffer(gdx.j(this.a));
         this.c().a($$0, $$10, $$2, gjz.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fxb> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cmc> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cmc, M extends fub<T>> {
      List<fxb> getPartsToDraw(M var1);
   }
}
