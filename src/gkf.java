import java.util.List;

public class gkf<T extends cix, M extends fsy<T>> extends gjt<T, M> {
   private final ajt a;
   private final gkf.a<T> b;
   private final gkf.b<T, M> c;

   public gkf(ghd<T, M> $$0, ajt $$1, gkf.a<T> $$2, gkf.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(ewi $$0, fzz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         this.a();
         ewm $$10 = $$1.getBuffer(gah.j(this.a));
         this.c().a($$0, $$10, $$2, ggj.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<ftm> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cix> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cix, M extends fqm<T>> {
      List<ftm> getPartsToDraw(M var1);
   }
}
