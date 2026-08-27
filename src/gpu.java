import java.util.List;

public class gpu<T extends clc, M extends fye<T>> extends gpi<T, M> {
   private final akt a;
   private final gpu.a<T> b;
   private final gpu.b<T, M> c;

   public gpu(gmp<T, M> $$0, akt $$1, gpu.a<T> $$2, gpu.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(fbc $$0, gfg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cm()) {
         this.a();
         fbg $$10 = $$1.getBuffer(gfo.j(this.a));
         this.c().a($$0, $$10, $$2, glt.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fys> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends clc> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends clc, M extends fvq<T>> {
      List<fys> getPartsToDraw(M var1);
   }
}
