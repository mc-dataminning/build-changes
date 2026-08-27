import java.util.List;

public class gdc<T extends cef, M extends fmb<T>> extends gcq<T, M> {
   private final ahd a;
   private final gdc.a<T> b;
   private final gdc.b<T, M> c;

   public gdc(gaa<T, M> $$0, ahd $$1, gdc.a<T> $$2, gdc.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(ept $$0, fsz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         this.a();
         epx $$10 = $$1.getBuffer(fth.j(this.a));
         this.c().a($$0, $$10, $$2, fzg.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fmp> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cef> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cef, M extends fjp<T>> {
      List<fmp> getPartsToDraw(M var1);
   }
}
