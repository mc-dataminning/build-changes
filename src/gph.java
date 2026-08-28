import java.util.List;

public class gph<T extends cmb, M extends fxw<T>> extends gov<T, M> {
   private final akr a;
   private final gph.a<T> b;
   private final gph.b<T, M> c;

   public gph(gmf<T, M> $$0, akr $$1, gph.a<T> $$2, gph.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(fbi $$0, gez $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ci()) {
         this.a();
         fbm $$10 = $$1.getBuffer(gfh.j(this.a));
         float $$11 = this.b.apply($$3, $$6, $$7);
         int $$12 = axy.b.a(ayo.d($$11 * 255.0F), 255, 255, 255);
         this.c().a($$0, $$10, $$2, glk.c($$3, 0.0F), $$12);
         this.b();
      }
   }

   private void a() {
      List<fyk> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cmb> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cmb, M extends fvk<T>> {
      List<fyk> getPartsToDraw(M var1);
   }
}
