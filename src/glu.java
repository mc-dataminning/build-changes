import java.util.List;

public class glu<T extends ckl, M extends fun<T>> extends gli<T, M> {
   private final akh a;
   private final glu.a<T> b;
   private final glu.b<T, M> c;

   public glu(gis<T, M> $$0, akh $$1, glu.a<T> $$2, glu.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(exx $$0, gbo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cf()) {
         this.a();
         eyb $$10 = $$1.getBuffer(gbw.j(this.a));
         this.c().a($$0, $$10, $$2, ghy.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fvb> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends ckl> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends ckl, M extends fsb<T>> {
      List<fvb> getPartsToDraw(M var1);
   }
}
